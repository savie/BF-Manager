package l;

import com.alipay.sdk.m.y.l;
import java.io.DataInputStream;
import java.util.function.Supplier;

/* JADX INFO: renamed from: l.ܳۙۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: T7EH */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC14297 extends AbstractC6741 {

    /* JADX INFO: renamed from: ֫ۙ, reason: not valid java name and contains not printable characters */
    public String f46833;

    /* JADX INFO: renamed from: ۗۙ, reason: not valid java name and contains not printable characters */
    public C11038 f46834;

    /* JADX INFO: renamed from: ۛۙ, reason: not valid java name and contains not printable characters */
    public C0184 f46835;

    /* JADX INFO: renamed from: ۢۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC23469 f46836;

    /* JADX INFO: renamed from: ۧۙ, reason: not valid java name and contains not printable characters */
    public C19941 f46837;

    /* JADX INFO: renamed from: ۫ۙ, reason: not valid java name and contains not printable characters */
    public int f46838;

    /* JADX INFO: renamed from: ܳۙ, reason: not valid java name and contains not printable characters */
    public int f46839;

    /* JADX INFO: renamed from: ܽۙ, reason: not valid java name and contains not printable characters */
    public int f46840;

    /* JADX INFO: renamed from: ܿۙ, reason: not valid java name and contains not printable characters */
    public Supplier f46841;

    /* JADX INFO: renamed from: ᩻ۙ, reason: not valid java name and contains not printable characters */
    public AbstractC9584 f46842;

    /* JADX INFO: renamed from: ۤ */
    public abstract String mo7640();

    public AbstractC14297(C3980 c3980, EnumC10020 enumC10020) {
        super(c3980.f22710);
        this.f46840 = 0;
        this.f46833 = null;
        this.f46839 = 0;
        this.f46837 = new C19941(this);
        this.f46835 = new C0184(this);
        this.f46834 = c3980.f47512;
        this.f46842 = ((C3980) c3980.f47511).f47519.m2163();
        this.f22696 = enumC10020;
        int i = C10769.f36718[enumC10020.ordinal()];
        if (i == 1) {
            this.f46840 = 2;
            this.f46841 = new C15729(this, 1);
            this.f46836 = new InterfaceC23469() { // from class: l.ܽۙۤ
                @Override // l.InterfaceC23469
                /* JADX INFO: renamed from: ܰ */
                public final void mo1386() {
                    AbstractC14297 abstractC14297 = this.f52793;
                    String str = abstractC14297.f46833;
                    if (str == null) {
                        str = "???";
                    }
                    abstractC14297.m18219("\"" + str + "\";");
                }
            };
        } else if (i == 2) {
            this.f46840 = 2;
            this.f46841 = new C19962(this, 1);
            this.f46836 = new InterfaceC23469() { // from class: l.۫ۙۤ
                @Override // l.InterfaceC23469
                /* JADX INFO: renamed from: ܰ */
                public final void mo1386() {
                    AbstractC14297 abstractC14297 = this.f40765;
                    String str = abstractC14297.f46833;
                    if (str == null) {
                        str = "\"???\"";
                    }
                    abstractC14297.m18219(str.concat(l.b));
                }
            };
        } else {
            if (i != 3) {
                throw new RuntimeException(C16523.m38890("Implementation of \"", this.f22696.m25297(), "\" is not supported"));
            }
            this.f46840 = 4;
            this.f46841 = new Supplier() { // from class: l.ܿۙۤ
                @Override // java.util.function.Supplier
                public final Object get() {
                    AbstractC14297 abstractC14297 = this.f54583;
                    return String.format("#%d:#%d;", Integer.valueOf(abstractC14297.f46838), Integer.valueOf(abstractC14297.f46839));
                }
            };
            this.f46836 = new InterfaceC23469() { // from class: l.ۛۙۤ
                @Override // l.InterfaceC23469
                /* JADX INFO: renamed from: ܰ */
                public final void mo1386() {
                    AbstractC14297 abstractC14297 = this.f19791;
                    abstractC14297.m18219(abstractC14297.f46833 + l.b);
                }
            };
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m34526(int i, DataInputStream dataInputStream) {
        if (i != this.f46840) {
            boolean z = this.f22711;
            AbstractC9584 abstractC9584 = this.f46842;
            if (z) {
                abstractC9584.mo24457("{0}: Invalid attribute length #{1}", this.f22696.m25299().m39430(), Integer.valueOf(i));
            } else {
                throw new C16639(abstractC9584, "{0}: Invalid attribute length #{1}", this.f22696.m25299().m39430(), Integer.valueOf(i));
            }
        }
        this.f46838 = dataInputStream.readUnsignedShort();
        if (this.f22696 == EnumC10020.ENCLOSING_METHOD) {
            this.f46839 = dataInputStream.readUnsignedShort();
        }
    }

    @Override // l.AbstractC6741
    /* JADX INFO: renamed from: ᩴ */
    public final void mo8969() {
        mo7640();
        m18223(m18222(mo14807(), this.f22696.m25301().m47084()));
        if (this.f22692) {
            if (this.f22704) {
                this.f46837.mo1386();
                return;
            } else {
                this.f46835.mo1386();
                return;
            }
        }
        this.f46836.mo1386();
    }

    @Override // l.AbstractC6741
    /* JADX INFO: renamed from: ۡ */
    public final void mo8967() {
        mo8969();
    }
}
