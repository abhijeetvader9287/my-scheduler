package com.abhijeet.myapplication.activities;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.v4.view.GravityCompat;
import android.support.v7.app.ActionBarDrawerToggle;
import android.view.MenuItem;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;

import com.abhijeet.myapplication.R;
import com.abhijeet.myapplication.fragments.EmailContactListFragment;
import com.abhijeet.myapplication.fragments.EmailTemplateListFragment;
import com.abhijeet.myapplication.fragments.Email_Scheduler;
import com.abhijeet.myapplication.fragments.Email_Template;
import com.abhijeet.myapplication.fragments.ImportEmailCsv;
import com.abhijeet.myapplication.fragments.ImportSMSCsv;
import com.abhijeet.myapplication.fragments.SMSContactListFragment;
import com.abhijeet.myapplication.fragments.SMSTemplateListFragment;
import com.abhijeet.myapplication.fragments.SMS_Scheduler;
import com.abhijeet.myapplication.fragments.SMS_Template;
public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();
        if (id == R.id.menu_email_template) {
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.contentFramelayout, new Email_Template(), "fragmentTag")
                    .disallowAddToBackStack()
                    .commit();
        } else if (id == R.id.menu_schedule_email) {
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.contentFramelayout, new Email_Scheduler(), "fragmentTag")
                    .disallowAddToBackStack()
                    .commit();
        } else if (id == R.id.menu_email_contact_list) {
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.contentFramelayout, new EmailContactListFragment(), "fragmentTag")
                    .disallowAddToBackStack()
                    .commit();
        } else if (id == R.id.menu_email_template_list) {
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.contentFramelayout, new EmailTemplateListFragment(), "fragmentTag")
                    .disallowAddToBackStack()
                    .commit();
        }
        else if (id == R.id.menu_import_email_contacts) {
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.contentFramelayout, new ImportEmailCsv(), "fragmentTag")
                    .disallowAddToBackStack()
                    .commit();
        }
        else if (id == R.id.menu_import_sms_contacts) {
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.contentFramelayout, new ImportSMSCsv(), "fragmentTag")
                    .disallowAddToBackStack()
                    .commit();
        }
        else if (id == R.id.menu_schedule_sms) {
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.contentFramelayout, new SMS_Scheduler(), "fragmentTag")
                    .disallowAddToBackStack()
                    .commit();
        }
        else if (id == R.id.menu_sms_template) {
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.contentFramelayout, new SMS_Template(), "fragmentTag")
                    .disallowAddToBackStack()
                    .commit();
        }
        else if (id == R.id.menu_sms_contact_list) {
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.contentFramelayout, new SMSContactListFragment(), "fragmentTag")
                    .disallowAddToBackStack()
                    .commit();
        }
        else if (id == R.id.menu_sms_template_list) {
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.contentFramelayout, new SMSTemplateListFragment(), "fragmentTag")
                    .disallowAddToBackStack()
                    .commit();
        }
        else if (id == R.id.menu_email_template_list) {
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.contentFramelayout, new EmailTemplateListFragment(), "fragmentTag")
                    .disallowAddToBackStack()
                    .commit();
        }
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
