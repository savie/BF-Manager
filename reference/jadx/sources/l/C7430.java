package l;

import java.io.Serializable;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.۟ۧܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y2OD */
/* JADX INFO: loaded from: classes3.dex */
public final class C7430 implements InterfaceC23949, Serializable {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final int f24796;

    public C7430() {
        C20296.m45806(2, "expectedValuesPerKey");
        this.f24796 = 2;
    }

    @Override // l.InterfaceC23949
    public final Object get() {
        return new ArrayList(this.f24796);
    }
}
