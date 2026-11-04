package l;

import com.google.android.material.slider.BasicLabelFormatter;
import java.util.HashMap;

/* JADX INFO: renamed from: l.᩻ܿ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: I6UD */
/* JADX INFO: loaded from: classes.dex */
public final class C25206 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f81445;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final long f81447;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final Object f81448 = new Object();

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final HashMap f81444 = new HashMap();

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final HashMap f81446 = new HashMap();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f81443 = BasicLabelFormatter.MILLION;

    public C25206(long j) {
        this.f81447 = j;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m56187() throws C19481 {
        int i = this.f81445 + 1;
        this.f81445 = i;
        if (i > this.f81443) {
            throw new C19481("Recovery graph node limit exceeded");
        }
    }
}
