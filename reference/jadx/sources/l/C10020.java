package l;

/* JADX INFO: renamed from: l.ۢۡܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: N9OB */
/* JADX INFO: loaded from: classes3.dex */
public class C10020 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public AbstractC17084 f32139;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public volatile AbstractC17084 f32140;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C24215 f32141;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public volatile InterfaceC18775 f32142;

    static {
        C24215.m54206();
    }

    public C10020(AbstractC17084 abstractC17084, C24215 c24215) {
        if (c24215 == null) {
            throw new NullPointerException("found null ExtensionRegistry");
        }
        if (abstractC17084 != null) {
            this.f32141 = c24215;
            this.f32139 = abstractC17084;
            return;
        }
        throw new NullPointerException("found null ByteString");
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final InterfaceC18775 m25872(InterfaceC18775 interfaceC18775) {
        InterfaceC18775 interfaceC18776 = this.f32142;
        this.f32139 = null;
        this.f32140 = null;
        this.f32142 = interfaceC18775;
        return interfaceC18776;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m25869() {
        if (this.f32140 != null) {
            return this.f32140.size();
        }
        AbstractC17084 abstractC17084 = this.f32139;
        if (abstractC17084 != null) {
            return abstractC17084.size();
        }
        if (this.f32142 != null) {
            return this.f32142.getSerializedSize();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final AbstractC17084 m25871() {
        if (this.f32140 != null) {
            return this.f32140;
        }
        AbstractC17084 abstractC17084 = this.f32139;
        if (abstractC17084 != null) {
            return abstractC17084;
        }
        synchronized (this) {
            if (this.f32140 != null) {
                return this.f32140;
            }
            if (this.f32142 == null) {
                this.f32140 = AbstractC17084.f55772;
            } else {
                this.f32140 = this.f32142.toByteString();
            }
            return this.f32140;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC18775 m25870(InterfaceC18775 interfaceC18775) {
        if (this.f32142 == null) {
            synchronized (this) {
                if (this.f32142 == null) {
                    try {
                        if (this.f32139 != null) {
                            this.f32142 = (InterfaceC18775) interfaceC18775.getParserForType().parseFrom(this.f32139, this.f32141);
                            this.f32140 = this.f32139;
                        } else {
                            this.f32142 = interfaceC18775;
                            this.f32140 = AbstractC17084.f55772;
                        }
                    } catch (C20463 unused) {
                        this.f32142 = interfaceC18775;
                        this.f32140 = AbstractC17084.f55772;
                    }
                }
            }
        }
        return this.f32142;
    }
}
