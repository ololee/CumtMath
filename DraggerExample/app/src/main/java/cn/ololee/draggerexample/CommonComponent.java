package cn.ololee.draggerexample;

import dagger.Component;

@ActivityScope
@Component(modules = CommonModule.class)
public interface CommonComponent {
    void inject(MainActivity activity);
}
