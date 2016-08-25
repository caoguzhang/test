package com.example.sam.myapplication.view;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.sam.myapplication.BR;
import com.example.sam.myapplication.R;
import com.example.sam.myapplication.adapter.ClickHandler;
import com.example.sam.myapplication.adapter.LongClickHandler;
import com.example.sam.myapplication.adapter.binder.CompositeItemBinder;
import com.example.sam.myapplication.adapter.binder.ItemBinder;
import com.example.sam.myapplication.binder.SuperUserBinder;
import com.example.sam.myapplication.binder.UserBinder;
import com.example.sam.myapplication.databinding.UsersViewBinding;
import com.example.sam.myapplication.model.User;
import com.example.sam.myapplication.viewmodel.SuperUserViewModel;
import com.example.sam.myapplication.viewmodel.UserViewModel;
import com.example.sam.myapplication.viewmodel.UsersViewModel;

public class UsersView extends AppCompatActivity
{
    private UsersViewModel usersViewModel;
    private UsersViewBinding binding;

    @Nullable
    private static String getStringFromEditText(EditText editText)
    {
        Editable editable = editText.getText();
        return editable == null ? null : editable.toString();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        usersViewModel = new UsersViewModel();
        usersViewModel.users.add(new SuperUserViewModel(new User("Android", "Dev")));

        binding = DataBindingUtil.setContentView(this, R.layout.users_view);
        binding.setUsersViewModel(usersViewModel);
        binding.setView(this);
        binding.activityUsersRecycler.setLayoutManager(new LinearLayoutManager(this));
    }

    public View.OnClickListener onButtonClick()
    {
        return new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                usersViewModel.addUser(getStringFromEditText(binding.usersViewFirstname), getStringFromEditText(binding.usersViewLastname));
            }
        };
    }

    public ClickHandler<UserViewModel> clickHandler()
    {
        return new ClickHandler<UserViewModel>()
        {
            @Override
            public void onClick(UserViewModel user)
            {
                Toast.makeText(UsersView.this, user.getFirstName() + " " + user.getLastName(), Toast.LENGTH_SHORT).show();
            }
        };
    }

    public LongClickHandler<UserViewModel> longClickHandler()
    {
        return new LongClickHandler<UserViewModel>()
        {
            @Override
            public void onLongClick(UserViewModel user)
            {
                Toast.makeText(UsersView.this, "LONG CLICK: " + user.getFirstName() + " " + user.getLastName(), Toast.LENGTH_SHORT).show();
            }
        };
    }

    public ItemBinder<UserViewModel> itemViewBinder()
    {
        return new CompositeItemBinder<UserViewModel>(
                new SuperUserBinder(BR.user, R.layout.item_super_user),
                new UserBinder(BR.user, R.layout.item_user)
        );
    }
}
