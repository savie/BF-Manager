package l;

import java.util.List;

/* JADX INFO: renamed from: l.۬֫᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: F64Z */
/* JADX INFO: loaded from: classes4.dex */
public final class C12809 extends AbstractC6686 implements InterfaceC23031 {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final EnumC10297 f42648 = EnumC10297.f35114;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final int f42649;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f42650;

    @Override // l.InterfaceC1594
    /* JADX INFO: renamed from: ۤ */
    public final String mo1142() {
        throw null;
    }

    public C12809(C17684 c17684, int i) {
        super(c17684, f42648, i);
        int iM42183 = c17684.m41166().m42183(i + 2);
        if (iM42183 == 0) {
            this.f42649 = 1;
            this.f42650 = 0;
            return;
        }
        int iMo5859 = c17684.m41166().mo5859(i + 4);
        if (((long) iM42183) * ((long) iMo5859) > 2147483647L) {
            throw new C20749(null, "Invalid array-payload instruction: element width*count overflows", new Object[0]);
        }
        this.f42649 = iM42183;
        this.f42650 = iMo5859;
    }

    @Override // l.InterfaceC23031
    /* JADX INFO: renamed from: ۘ */
    public final int mo16087() {
        return this.f42649;
    }

    @Override // l.InterfaceC23031
    /* JADX INFO: renamed from: ܿ */
    public final List mo16088() {
        int i = this.f22553 + 8;
        int i2 = this.f42649;
        if (i2 == 1) {
            return new C11398(this, i);
        }
        if (i2 == 2) {
            return new C5047(this, i);
        }
        if (i2 == 4) {
            return new C21981(this, i);
        }
        if (i2 == 8) {
            return new C0813(this, i);
        }
        throw new C20749(null, "Invalid element width: %d", Integer.valueOf(i2));
    }

    @Override // l.AbstractC6686, l.InterfaceC1594
    /* JADX INFO: renamed from: ۡ */
    public final int mo5436() {
        return (((this.f42649 * this.f42650) + 1) / 2) + 4;
    }
}
