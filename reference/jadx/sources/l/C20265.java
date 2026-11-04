package l;

import android.view.animation.Interpolator;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.᩵ۖܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: A1X9 */
/* JADX INFO: loaded from: classes5.dex */
public class C20265 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC21931 f65071;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public ArrayList f65072;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public Interpolator f65073;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f65074;

    public final String toString() {
        String string = " ";
        for (int i = 0; i < this.f65074; i++) {
            StringBuilder sbM27333 = C10732.m27333(string);
            sbM27333.append(((AbstractC3111) this.f65072.get(i)).mo10182());
            sbM27333.append(EnumC7687.f25319);
            string = sbM27333.toString();
        }
        return string;
    }
}
