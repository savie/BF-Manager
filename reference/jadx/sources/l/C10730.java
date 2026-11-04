package l;

import android.content.Context;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۤ۟᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: G696 */
/* JADX INFO: loaded from: classes4.dex */
public class C10730 extends C11476 {

    /* JADX INFO: renamed from: ۫ۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC21919 f34076;

    /* JADX INFO: renamed from: ܳۙ, reason: not valid java name and contains not printable characters */
    public int f34077;

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public C22665 f34078;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m27324(int i) {
        this.f34077 = i;
        this.f34078.f73597.setColor(i);
    }

    public C10730(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f34077 = C3296.f10750;
        m27322();
    }

    public C10730(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f34077 = C3296.f10750;
        m27322();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m27325(InterfaceC21919 interfaceC21919) {
        this.f34076 = interfaceC21919;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m27326(boolean z) {
        this.f34078.m51076(z);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private void m27322() {
        if (isInEditMode()) {
            return;
        }
        C22665 c22665 = (C22665) LayoutInflater.from(getContext()).inflate(R.layout.MT_Protector, (ViewGroup) this, false);
        this.f34078 = c22665;
        c22665.f73597.setColor(this.f34077);
        float fApplyDimension = TypedValue.applyDimension(1, 80.0f, getResources().getDisplayMetrics());
        this.f34078.m51077((int) fApplyDimension);
        super.m28846(fApplyDimension);
        final C22665 c22666 = this.f34078;
        post(new Runnable() { // from class: l.۫۟᩻
            @Override // java.lang.Runnable
            public final void run() {
                this.f41579.f36087.addView(c22666);
            }
        });
        super.m28848(new C13495(this));
        super.m28847(new C4765(this));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m27321(C10730 c10730) {
        c10730.f34078.f73601 = false;
        InterfaceC21919 interfaceC21919 = c10730.f34076;
        if (interfaceC21919 != null) {
            interfaceC21919.mo18228(c10730);
        }
        super.m28849();
    }
}
