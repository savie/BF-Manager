package l;

import java.io.Serializable;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۨ֫ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y2OD */
/* JADX INFO: loaded from: classes4.dex */
public final class C12040 implements InterfaceC6908, Serializable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f38804;

    public C12040() {
        C19278.m44623(2, "expectedValuesPerKey");
        this.f38804 = 2;
    }

    @Override // l.InterfaceC6908
    public final Object get() {
        return new ArrayList(this.f38804);
    }
}
