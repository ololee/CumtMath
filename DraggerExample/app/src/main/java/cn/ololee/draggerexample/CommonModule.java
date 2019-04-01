package cn.ololee.draggerexample;

import dagger.Module;
import dagger.Provides;

@Module
public class CommonModule {
    private ICommonView iCommonView;

    public CommonModule(ICommonView iCommonView) {
        this.iCommonView = iCommonView;
    }

    @Provides
    @ActivityScope
    public ICommonView provideICommonView()
    {
        return this.iCommonView;
    }
}
