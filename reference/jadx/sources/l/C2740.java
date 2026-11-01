package l;

import android.view.animation.Interpolator;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۖ᩵ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: A1X9 */
/* JADX INFO: loaded from: classes2.dex */
public class C2740 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f10532;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC20380 f10533;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public ArrayList f10534;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public Interpolator f10535;

    public final String toString() {
        String string = " ";
        for (int i = 0; i < this.f10532; i++) {
            StringBuilder sbM23356 = C9023.m23356(string);
            sbM23356.append(((AbstractC11914) this.f10534.get(i)).mo29723());
            sbM23356.append(EnumC19730.f63352);
            string = sbM23356.toString();
        }
        return string;
    }
}
