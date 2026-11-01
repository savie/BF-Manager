package l;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.۠ܺ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: H528 */
/* JADX INFO: loaded from: classes4.dex */
public final class C8285 extends C21460 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public C2639 f28773;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public List[] f28774;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f28775;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C3097 f28776;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public ArrayList f28777;

    @Override // l.InterfaceC18993
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C13930 mo21702(String str, EnumC11959 enumC11959) {
        if (this.f28777 == null) {
            this.f28777 = new ArrayList(5);
        }
        C13930 c13930 = new C13930(str, enumC11959);
        this.f28777.add(c13930);
        return c13930;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC18993 m21703(int i) {
        C3097 c3097 = this.f28776;
        if (this.f28774 == null) {
            this.f28774 = new List[c3097.m9291().length];
        }
        if (i >= this.f28774.length) {
            System.err.println("WARN: parameter out-of-range in " + c3097);
            return null;
        }
        return new C18868(this, i);
    }
}
