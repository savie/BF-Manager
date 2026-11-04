package l;

import com.google.android.material.search.SearchView;

/* JADX INFO: renamed from: l.ۙ۠ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z1XI */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC4773 implements Runnable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f16749;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f16750;

    public /* synthetic */ RunnableC4773(int i, Object obj) {
        this.f16749 = i;
        this.f16750 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f16749) {
            case 0:
                C22673.m51156((C22673) this.f16750);
                break;
            case 1:
                ((C12921) this.f16750).m32041();
                break;
            case 2:
                C24132.m53761((C24132) this.f16750);
                break;
            case 3:
                ((C25291) this.f16750).m56471();
                break;
            case 4:
                ServiceC10702.m27289((ServiceC10702) this.f16750);
                break;
            default:
                ((SearchView) this.f16750).lambda$clearFocusAndHideKeyboard$9();
                break;
        }
    }
}
