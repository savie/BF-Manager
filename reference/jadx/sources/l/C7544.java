package l;

/* JADX INFO: renamed from: l.۟֨ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: X93U */
/* JADX INFO: loaded from: classes3.dex */
public final class C7544 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public String[] f24881;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final InterfaceC16493[] f24882;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final InterfaceC15747[] f24883;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C24478 f24884;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public volatile boolean f24885 = false;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static InterfaceC15747 m20618(C7544 c7544, C10788 c10788) {
        c7544.getClass();
        if (c10788.m27500() != c7544.f24884) {
            throw new IllegalArgumentException("OneofDescriptor does not match message type.");
        }
        return c7544.f24883[c10788.m27501()];
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static InterfaceC16493 m20619(C7544 c7544, C7323 c7323) {
        c7544.getClass();
        if (c7323.m20099() != c7544.f24884) {
            throw new IllegalArgumentException("FieldDescriptor does not match message type.");
        }
        if (c7323.m20083()) {
            throw new IllegalArgumentException("This type does not have extensions.");
        }
        return c7544.f24882[c7323.m20100()];
    }

    public C7544(C24478 c24478, String[] strArr) {
        this.f24884 = c24478;
        this.f24881 = strArr;
        this.f24882 = new InterfaceC16493[c24478.getFields().size()];
        this.f24883 = new InterfaceC15747[c24478.m54737().size()];
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m20621(Class cls, Class cls2) {
        if (this.f24885) {
            return;
        }
        synchronized (this) {
            if (this.f24885) {
                return;
            }
            int length = this.f24882.length;
            int i = 0;
            while (true) {
                String str = null;
                if (i >= length) {
                    break;
                }
                C7323 c7323 = (C7323) this.f24884.getFields().get(i);
                if (c7323.m20094() != null) {
                    int iM27501 = c7323.m20094().m27501() + length;
                    String[] strArr = this.f24881;
                    if (iM27501 < strArr.length) {
                        str = strArr[iM27501];
                    }
                }
                String str2 = str;
                if (c7323.mo8649()) {
                    if (c7323.m20086() == EnumC2848.MESSAGE) {
                        if (c7323.m20096()) {
                            this.f24882[i] = new C17239(c7323, cls);
                        } else {
                            this.f24882[i] = new C6053(cls, cls2, this.f24881[i]);
                        }
                    } else if (c7323.m20086() == EnumC2848.ENUM) {
                        this.f24882[i] = new C3069(c7323, this.f24881[i], cls, cls2);
                    } else {
                        this.f24882[i] = new C12018(cls, cls2, this.f24881[i]);
                    }
                } else if (c7323.m20086() == EnumC2848.MESSAGE) {
                    this.f24882[i] = new C20969(c7323, this.f24881[i], cls, cls2, str2);
                } else if (c7323.m20086() == EnumC2848.ENUM) {
                    this.f24882[i] = new C23953(c7323, this.f24881[i], cls, cls2, str2);
                } else if (c7323.m20086() == EnumC2848.STRING) {
                    this.f24882[i] = new C17985(c7323, this.f24881[i], cls, cls2, str2);
                } else {
                    this.f24882[i] = new C14255(c7323, this.f24881[i], cls, cls2, str2);
                }
                i++;
            }
            for (int i2 = 0; i2 < this.f24884.m54737().size(); i2++) {
                if (i2 < this.f24884.m54734().size()) {
                    this.f24883[i2] = new C23207(this.f24884, this.f24881[i2 + length], cls, cls2);
                } else {
                    this.f24883[i2] = new C0086(this.f24884, i2);
                }
            }
            this.f24885 = true;
            this.f24881 = null;
        }
    }
}
