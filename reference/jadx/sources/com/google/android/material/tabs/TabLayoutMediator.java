package com.google.android.material.tabs;

import java.lang.ref.WeakReference;
import l.AbstractC0414;
import l.AbstractC11435;
import l.AbstractC12410;
import l.C21312;

/* JADX INFO: loaded from: classes.dex */
public final class TabLayoutMediator {
    public AbstractC0414 adapter;
    public boolean attached;
    public final boolean autoRefresh;
    public TabLayoutOnPageChangeCallback onPageChangeCallback;
    public TabLayout.OnTabSelectedListener onTabSelectedListener;
    public AbstractC12410 pagerAdapterObserver;
    public final boolean smoothScroll;
    public final TabConfigurationStrategy tabConfigurationStrategy;
    public final TabLayout tabLayout;
    public final C21312 viewPager;

    public interface TabConfigurationStrategy {
        void onConfigureTab(TabLayout.Tab tab, int i);
    }

    public TabLayoutMediator(TabLayout tabLayout, C21312 c21312, TabConfigurationStrategy tabConfigurationStrategy) {
        this(tabLayout, c21312, true, tabConfigurationStrategy);
    }

    public TabLayoutMediator(TabLayout tabLayout, C21312 c21312, boolean z, TabConfigurationStrategy tabConfigurationStrategy) {
        this(tabLayout, c21312, z, true, tabConfigurationStrategy);
    }

    public TabLayoutMediator(TabLayout tabLayout, C21312 c21312, boolean z, boolean z2, TabConfigurationStrategy tabConfigurationStrategy) {
        this.tabLayout = tabLayout;
        this.viewPager = c21312;
        this.autoRefresh = z;
        this.smoothScroll = z2;
        this.tabConfigurationStrategy = tabConfigurationStrategy;
    }

    public void attach() {
        if (this.attached) {
            throw new IllegalStateException("TabLayoutMediator is already attached");
        }
        AbstractC0414 abstractC0414M47797 = this.viewPager.m47797();
        this.adapter = abstractC0414M47797;
        if (abstractC0414M47797 == null) {
            throw new IllegalStateException("TabLayoutMediator attached before ViewPager2 has an adapter");
        }
        this.attached = true;
        TabLayoutOnPageChangeCallback tabLayoutOnPageChangeCallback = new TabLayoutOnPageChangeCallback(this.tabLayout);
        this.onPageChangeCallback = tabLayoutOnPageChangeCallback;
        this.viewPager.m47799(tabLayoutOnPageChangeCallback);
        ViewPagerOnTabSelectedListener viewPagerOnTabSelectedListener = new ViewPagerOnTabSelectedListener(this.viewPager, this.smoothScroll);
        this.onTabSelectedListener = viewPagerOnTabSelectedListener;
        this.tabLayout.addOnTabSelectedListener((TabLayout.OnTabSelectedListener) viewPagerOnTabSelectedListener);
        if (this.autoRefresh) {
            PagerAdapterObserver pagerAdapterObserver = new PagerAdapterObserver();
            this.pagerAdapterObserver = pagerAdapterObserver;
            this.adapter.registerAdapterDataObserver(pagerAdapterObserver);
        }
        populateTabsFromPagerAdapter();
        this.tabLayout.setScrollPosition(this.viewPager.m47802(), 0.0f, true);
    }

    public void detach() {
        AbstractC0414 abstractC0414;
        if (this.autoRefresh && (abstractC0414 = this.adapter) != null) {
            abstractC0414.unregisterAdapterDataObserver(this.pagerAdapterObserver);
            this.pagerAdapterObserver = null;
        }
        this.tabLayout.removeOnTabSelectedListener(this.onTabSelectedListener);
        this.viewPager.m47804(this.onPageChangeCallback);
        this.onTabSelectedListener = null;
        this.onPageChangeCallback = null;
        this.adapter = null;
        this.attached = false;
    }

    public boolean isAttached() {
        return this.attached;
    }

    public void populateTabsFromPagerAdapter() {
        this.tabLayout.removeAllTabs();
        AbstractC0414 abstractC0414 = this.adapter;
        if (abstractC0414 != null) {
            int itemCount = abstractC0414.getItemCount();
            for (int i = 0; i < itemCount; i++) {
                TabLayout.Tab tabNewTab = this.tabLayout.newTab();
                this.tabConfigurationStrategy.onConfigureTab(tabNewTab, i);
                this.tabLayout.addTab(tabNewTab, false);
            }
            if (itemCount > 0) {
                int iMin = Math.min(this.viewPager.m47802(), this.tabLayout.getTabCount() - 1);
                if (iMin != this.tabLayout.getSelectedTabPosition()) {
                    TabLayout tabLayout = this.tabLayout;
                    tabLayout.selectTab(tabLayout.getTabAt(iMin));
                }
            }
        }
    }

    public class TabLayoutOnPageChangeCallback extends AbstractC11435 {
        public int previousScrollState;
        public int scrollState;
        public final WeakReference tabLayoutRef;

        public TabLayoutOnPageChangeCallback(TabLayout tabLayout) {
            this.tabLayoutRef = new WeakReference(tabLayout);
            reset();
        }

        @Override // l.AbstractC11435
        public void onPageScrollStateChanged(int i) {
            this.previousScrollState = this.scrollState;
            this.scrollState = i;
            TabLayout tabLayout = (TabLayout) this.tabLayoutRef.get();
            if (tabLayout != null) {
                tabLayout.updateViewPagerScrollState(this.scrollState);
            }
        }

        @Override // l.AbstractC11435
        public void onPageScrolled(int i, float f, int i2) {
            TabLayout tabLayout = (TabLayout) this.tabLayoutRef.get();
            if (tabLayout != null) {
                int i3 = this.scrollState;
                tabLayout.setScrollPosition(i, f, i3 != 2 || this.previousScrollState == 1, (i3 == 2 && this.previousScrollState == 0) ? false : true, false);
            }
        }

        @Override // l.AbstractC11435
        public void onPageSelected(int i) {
            TabLayout tabLayout = (TabLayout) this.tabLayoutRef.get();
            if (tabLayout == null || tabLayout.getSelectedTabPosition() == i || i >= tabLayout.getTabCount()) {
                return;
            }
            int i2 = this.scrollState;
            tabLayout.selectTab(tabLayout.getTabAt(i), i2 == 0 || (i2 == 2 && this.previousScrollState == 0));
        }

        public void reset() {
            this.scrollState = 0;
            this.previousScrollState = 0;
        }
    }

    public class ViewPagerOnTabSelectedListener implements TabLayout.OnTabSelectedListener {
        public final boolean smoothScroll;
        public final C21312 viewPager;

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabReselected(TabLayout.Tab tab) {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabUnselected(TabLayout.Tab tab) {
        }

        public ViewPagerOnTabSelectedListener(C21312 c21312, boolean z) {
            this.viewPager = c21312;
            this.smoothScroll = z;
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabSelected(TabLayout.Tab tab) {
            this.viewPager.m47798(tab.getPosition(), this.smoothScroll);
        }
    }

    public class PagerAdapterObserver extends AbstractC12410 {
        public PagerAdapterObserver() {
        }

        @Override // l.AbstractC12410
        public void onChanged() {
            TabLayoutMediator.this.populateTabsFromPagerAdapter();
        }

        @Override // l.AbstractC12410
        public void onItemRangeChanged(int i, int i2) {
            TabLayoutMediator.this.populateTabsFromPagerAdapter();
        }

        @Override // l.AbstractC12410
        public void onItemRangeChanged(int i, int i2, Object obj) {
            TabLayoutMediator.this.populateTabsFromPagerAdapter();
        }

        @Override // l.AbstractC12410
        public void onItemRangeInserted(int i, int i2) {
            TabLayoutMediator.this.populateTabsFromPagerAdapter();
        }

        @Override // l.AbstractC12410
        public void onItemRangeRemoved(int i, int i2) {
            TabLayoutMediator.this.populateTabsFromPagerAdapter();
        }

        @Override // l.AbstractC12410
        public void onItemRangeMoved(int i, int i2, int i3) {
            TabLayoutMediator.this.populateTabsFromPagerAdapter();
        }
    }
}
