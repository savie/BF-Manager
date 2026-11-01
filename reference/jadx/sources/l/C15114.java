package l;

/* JADX INFO: renamed from: l.ܶ۠᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: N9OB */
/* JADX INFO: loaded from: classes4.dex */
public class C15114 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public volatile InterfaceC23206 f49362;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public AbstractC23725 f49363;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public volatile AbstractC23725 f49364;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C2701 f49365;

    static {
        C2701.m8236();
    }

    public C15114(AbstractC23725 abstractC23725, C2701 c2701) {
        if (c2701 == null) {
            throw new NullPointerException("found null ExtensionRegistry");
        }
        if (abstractC23725 != null) {
            this.f49365 = c2701;
            this.f49363 = abstractC23725;
            return;
        }
        throw new NullPointerException("found null ByteString");
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final InterfaceC23206 m36206(InterfaceC23206 interfaceC23206) {
        InterfaceC23206 interfaceC23207 = this.f49362;
        this.f49363 = null;
        this.f49364 = null;
        this.f49362 = interfaceC23206;
        return interfaceC23207;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m36204() {
        if (this.f49364 != null) {
            return this.f49364.size();
        }
        AbstractC23725 abstractC23725 = this.f49363;
        if (abstractC23725 != null) {
            return abstractC23725.size();
        }
        if (this.f49362 != null) {
            return this.f49362.getSerializedSize();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final AbstractC23725 m36207() {
        if (this.f49364 != null) {
            return this.f49364;
        }
        AbstractC23725 abstractC23725 = this.f49363;
        if (abstractC23725 != null) {
            return abstractC23725;
        }
        synchronized (this) {
            if (this.f49364 != null) {
                return this.f49364;
            }
            if (this.f49362 == null) {
                this.f49364 = AbstractC23725.f76778;
            } else {
                this.f49364 = this.f49362.toByteString();
            }
            return this.f49364;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC23206 m36205(InterfaceC23206 interfaceC23206) {
        if (this.f49362 == null) {
            synchronized (this) {
                if (this.f49362 == null) {
                    try {
                        if (this.f49363 != null) {
                            this.f49362 = (InterfaceC23206) interfaceC23206.getParserForType().parseFrom(this.f49363, this.f49365);
                            this.f49364 = this.f49363;
                        } else {
                            this.f49362 = interfaceC23206;
                            this.f49364 = AbstractC23725.f76778;
                        }
                    } catch (C4529 unused) {
                        this.f49362 = interfaceC23206;
                        this.f49364 = AbstractC23725.f76778;
                    }
                }
            }
        }
        return this.f49362;
    }
}
