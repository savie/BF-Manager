package l;

import android.R;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;

/* JADX INFO: renamed from: l.۠ۘۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: C5S0 */
/* JADX INFO: loaded from: classes4.dex */
public class C7919 extends ComponentCallbacksC22654 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public ListView f26004;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public View f26005;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public boolean f26007;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public View f26008;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public View f26009;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final Handler f26011 = new Handler();

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final Runnable f26006 = new RunnableC17796(this);

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final AdapterView.OnItemClickListener f26010 = new C18502(this);

    @Override // l.ComponentCallbacksC22654
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Context contextRequireContext = requireContext();
        FrameLayout frameLayout = new FrameLayout(contextRequireContext);
        LinearLayout linearLayout = new LinearLayout(contextRequireContext);
        linearLayout.setId(16711682);
        linearLayout.setOrientation(1);
        linearLayout.setVisibility(8);
        linearLayout.setGravity(17);
        linearLayout.addView(new ProgressBar(contextRequireContext, null, R.attr.progressBarStyleLarge), new FrameLayout.LayoutParams(-2, -2));
        frameLayout.addView(linearLayout, new FrameLayout.LayoutParams(-1, -1));
        FrameLayout frameLayout2 = new FrameLayout(contextRequireContext);
        frameLayout2.setId(16711683);
        TextView textView = new TextView(contextRequireContext);
        textView.setId(16711681);
        textView.setGravity(17);
        frameLayout2.addView(textView, new FrameLayout.LayoutParams(-1, -1));
        ListView listView = new ListView(contextRequireContext);
        listView.setId(R.id.list);
        listView.setDrawSelectorOnTop(false);
        frameLayout2.addView(listView, new FrameLayout.LayoutParams(-1, -1));
        frameLayout.addView(frameLayout2, new FrameLayout.LayoutParams(-1, -1));
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        return frameLayout;
    }

    @Override // l.ComponentCallbacksC22654
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        m20924();
    }

    @Override // l.ComponentCallbacksC22654
    public final void onDestroyView() {
        this.f26011.removeCallbacks(this.f26006);
        this.f26004 = null;
        this.f26007 = false;
        this.f26009 = null;
        this.f26005 = null;
        this.f26008 = null;
        super.onDestroyView();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private void m20924() {
        if (this.f26004 != null) {
            return;
        }
        View view = getView();
        if (view == null) {
            throw new IllegalStateException("Content view not yet created");
        }
        if (view instanceof ListView) {
            this.f26004 = (ListView) view;
        } else {
            TextView textView = (TextView) view.findViewById(16711681);
            if (textView == null) {
                this.f26008 = view.findViewById(R.id.empty);
            } else {
                textView.setVisibility(8);
            }
            this.f26005 = view.findViewById(16711682);
            this.f26009 = view.findViewById(16711683);
            View viewFindViewById = view.findViewById(R.id.list);
            if (!(viewFindViewById instanceof ListView)) {
                if (viewFindViewById == null) {
                    throw new RuntimeException("Your content must have a ListView whose id attribute is 'android.R.id.list'");
                }
                throw new RuntimeException("Content has view with id attribute 'android.R.id.list' that is not a ListView class");
            }
            ListView listView = (ListView) viewFindViewById;
            this.f26004 = listView;
            View view2 = this.f26008;
            if (view2 != null) {
                listView.setEmptyView(view2);
            }
        }
        this.f26007 = true;
        this.f26004.setOnItemClickListener(this.f26010);
        if (this.f26005 != null) {
            m20924();
            View view3 = this.f26005;
            if (view3 == null) {
                throw new IllegalStateException("Can't be used with a custom content view");
            }
            if (this.f26007) {
                this.f26007 = false;
                view3.clearAnimation();
                this.f26009.clearAnimation();
                this.f26005.setVisibility(0);
                this.f26009.setVisibility(8);
            }
        }
        this.f26011.post(this.f26006);
    }
}
