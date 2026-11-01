package l;

import java.util.RandomAccess;

/* JADX INFO: renamed from: l.۫᩺ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: PCGG */
/* JADX INFO: loaded from: classes4.dex */
public final class C12725 extends C16958 implements RandomAccess {
    public static final long serialVersionUID = 0;

    @Override // l.C16958, l.InterfaceC10609, java.util.List
    public final InterfaceC10609 subList(int i, int i2) {
        return new C12725(this.f54251.subList(i, i2));
    }
}
