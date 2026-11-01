package l;

import java.util.AbstractList;

/* JADX INFO: renamed from: l.᩹᩻᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: M605 */
/* JADX INFO: loaded from: classes.dex */
public final class C22624 extends AbstractList {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f73717;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C7807 f73718;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f73719;

    public C22624(C7807 c7807, int i, int i2) {
        this.f73718 = c7807;
        this.f73719 = i;
        this.f73717 = i2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        C17684 c17684 = this.f73718.f25683;
        return c17684.m41204(c17684.m41166().m42183((i * 2) + this.f73719 + 4));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f73717;
    }
}
