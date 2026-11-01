package l;

import android.view.View;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.֫ᩴ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 715M */
/* JADX INFO: loaded from: classes2.dex */
public final class C2017 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C22876 f7529;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C17492 f7530;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f7531;

    public C2017(C8765 c8765, int i) {
        this.f7531 = i;
        C17492 c17492 = (C17492) c8765.f30135.m30995(R.layout.MT_Protector);
        this.f7530 = c17492;
        C22876 c22876 = new C22876(c8765, c17492, this);
        this.f7529 = c22876;
        c17492.setVerticalScrollBarEnabled(false);
        c17492.setAdapter(c22876);
        c17492.setOnClickListener(new View.OnClickListener() { // from class: l.ܳᩴ᩹
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C2017.m6486(this.f48136);
            }
        });
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m6486(C2017 c2017) {
        C22876 c22876 = c2017.f7529;
        if (c22876.f74405) {
            c22876.m50639();
        }
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static void m6490(C2017 c2017) {
        c2017.f7530.getAdapter().notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static C13308 m6487(C2017 c2017) {
        return C23186.m51197(c2017.f7531);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final boolean m6491() {
        return C23186.m51197(this.f7531).m32809();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m6492() {
        try {
            return C23186.m51197(this.f7531).m32808();
        } catch (RuntimeException unused) {
            return 0;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m6493(C11897 c11897) {
        return C23186.m51197(this.f7531).m32800(c11897);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m6494(int i) {
        C23186.m51197(this.f7531).m32802(i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m6495(int i, int i2) {
        try {
            C23186.m51197(this.f7531).m32803(i, i2);
            return true;
        } catch (RuntimeException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m6496() {
        C23186.m51197(this.f7531).m32799();
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean m6497() {
        return C23186.m51197(this.f7531).m32797();
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean m6498(int i) {
        try {
            C23186.m51197(this.f7531).m32803(i, 0);
            return true;
        } catch (RuntimeException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String m6499() {
        return C23186.m51197(this.f7531).m32807();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C11897 m6500(int i) {
        return C23186.m51197(this.f7531).m32811(i);
    }
}
