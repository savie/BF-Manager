package l;

import android.view.View;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.۟ܿܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 715M */
/* JADX INFO: loaded from: classes3.dex */
public final class C8044 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C19452 f26669;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C25227 f26670;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int f26671;

    public C8044(C16468 c16468, int i) {
        this.f26671 = i;
        C25227 c25227 = (C25227) c16468.f53390.m40395(R.layout.MT_Protector);
        this.f26670 = c25227;
        C19452 c19452 = new C19452(c16468, c25227, this);
        this.f26669 = c19452;
        c25227.setVerticalScrollBarEnabled(false);
        c25227.setAdapter(c19452);
        c25227.setOnClickListener(new View.OnClickListener() { // from class: l.֡ܿܳ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C8044.m21916(this.f2352);
            }
        });
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m21916(C8044 c8044) {
        C19452 c19452 = c8044.f26669;
        if (c19452.f62827) {
            c19452.m44956();
        }
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static void m21918(C8044 c8044) {
        c8044.f26670.getAdapter().notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static C5061 m21919(C8044 c8044) {
        return C22961.m51812(c8044.f26671);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m21922() {
        try {
            return C22961.m51812(this.f26671).m15315();
        } catch (RuntimeException unused) {
            return 0;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m21923(C9622 c9622) {
        return C22961.m51812(this.f26671).m15307(c9622);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m21924(int i) {
        C22961.m51812(this.f26671).m15309(i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m21925(int i, int i2) {
        try {
            C22961.m51812(this.f26671).m15310(i, i2);
            return true;
        } catch (RuntimeException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean m21926() {
        return C22961.m51812(this.f26671).m15316();
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean m21927(int i) {
        try {
            C22961.m51812(this.f26671).m15310(i, 0);
            return true;
        } catch (RuntimeException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void m21928() {
        C22961.m51812(this.f26671).m15306();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String m21929() {
        return C22961.m51812(this.f26671).m15318();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C9622 m21930(int i) {
        return C22961.m51812(this.f26671).m15320(i);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean m21931() {
        return C22961.m51812(this.f26671).m15314();
    }
}
