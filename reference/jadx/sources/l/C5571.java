package l;

import com.google.android.material.slider.BasicLabelFormatter;
import java.util.HashMap;

/* JADX INFO: renamed from: l.ۚ᩶ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: I6UD */
/* JADX INFO: loaded from: classes2.dex */
public final class C5571 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final long f19097;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f19098;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final Object f19093 = new Object();

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final HashMap f19096 = new HashMap();

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final HashMap f19095 = new HashMap();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f19094 = BasicLabelFormatter.MILLION;

    public C5571(long j) {
        this.f19097 = j;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m15387() throws C9722 {
        int i = this.f19098 + 1;
        this.f19098 = i;
        if (i > this.f19094) {
            throw new C9722("Recovery graph node limit exceeded");
        }
    }
}
