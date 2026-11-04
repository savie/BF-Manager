package l;

import java.util.RandomAccess;

/* JADX INFO: renamed from: l.ۤ۟᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: PCGG */
/* JADX INFO: loaded from: classes4.dex */
public final class C10728 extends C21917 implements RandomAccess {
    public static final long serialVersionUID = 0;

    @Override // l.C21917, l.InterfaceC9018, java.util.List
    public final InterfaceC9018 subList(int i, int i2) {
        return new C10728(this.f70781.subList(i, i2));
    }
}
