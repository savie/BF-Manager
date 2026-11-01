package l;

import java.io.DataInputStream;
import java.io.IOException;
import java.util.HashSet;

/* JADX INFO: renamed from: l.ܿۖۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: R7CK */
/* JADX INFO: loaded from: classes5.dex */
public final class C17056 extends AbstractC14504 {

    /* JADX INFO: renamed from: ۘܰ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f54462 = 0;

    /* JADX INFO: renamed from: ֨ܰ, reason: not valid java name and contains not printable characters */
    public C12118 f54463;

    /* JADX INFO: renamed from: ۬ܰ, reason: not valid java name and contains not printable characters */
    public final boolean f54464;

    public C17056(C3980 c3980) {
        super(c3980);
        this.f54464 = C13612.m33285(EnumC4438.CP_INDEX);
    }

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final String m39836() {
        C12118 c12118 = this.f54463;
        return c12118 == null ? "N/A" : c12118.m30161();
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String m39835() {
        C12118 c12118 = this.f54463;
        if (c12118 == null) {
            return null;
        }
        return c12118.f40577.m38522();
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final String m39833(String str) {
        StringBuilder sb = new StringBuilder(25);
        C12118 c12118 = this.f54463;
        boolean z = this.f54464;
        String str2 = " */";
        if (c12118 == null) {
            sb.append(EnumC20934.f68193.m47084());
            sb.append(' ');
            if (z) {
                sb.append("#?? /* " + m39836() + " */");
            } else {
                sb.append(m39836());
            }
            if (str.length() > 0) {
                sb.append(' ');
                sb.append(str);
            }
        } else {
            sb.append(EnumC23839.m52517(c12118.f40577.m25267(), EnumC0554.MODULE));
            sb.append(EnumC20934.f68193.m47084());
            sb.append(' ');
            if (z) {
                Integer numValueOf = Integer.valueOf(this.f54463.f40577.m25242());
                String strM30161 = this.f54463.m30161();
                if (this.f54463.f40577.m38522() != null) {
                    str2 = "@" + this.f54463.f40577.m38522() + " */";
                }
                sb.append(String.format("#%d /* %s%s%s", numValueOf, strM30161, str2, str.length() > 0 ? " ".concat(str) : ""));
            } else {
                sb.append(this.f54463.m30161());
                if (str.length() > 0) {
                    sb.append(' ');
                    sb.append(str);
                }
                if (this.f54463.f40577.m38522() != null) {
                    sb.append("// @");
                    sb.append(this.f54463.f40577.m38522());
                }
            }
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m39834(DataInputStream dataInputStream) {
        boolean z = this.f22711;
        try {
            int unsignedShort = dataInputStream.readUnsignedShort();
            int i = 7;
            C7884 c7884 = new C7884(this.f47512.m27827(unsignedShort), unsignedShort, dataInputStream.readUnsignedShort(), this.f47512.m27826(dataInputStream.readUnsignedShort(), new C21051(i)));
            try {
                int unsignedShort2 = dataInputStream.readUnsignedShort();
                for (int i2 = 0; i2 < unsignedShort2; i2++) {
                    int unsignedShort3 = dataInputStream.readUnsignedShort();
                    c7884.f25920.add(new C19173(this.f47512.m27827(unsignedShort3), unsignedShort3, dataInputStream.readUnsignedShort(), this.f47512.m27826(dataInputStream.readUnsignedShort(), new C21051(i))));
                }
            } catch (IOException unused) {
                if (z) {
                    this.f47519.m2163().mo24457("Invalid requires table", new Object[0]);
                } else {
                    throw new C16639(this.f47519.m2163(), "Invalid requires table", new Object[0]);
                }
            }
            try {
                int unsignedShort4 = dataInputStream.readUnsignedShort();
                if (unsignedShort4 > 0) {
                    for (int i3 = 0; i3 < unsignedShort4; i3++) {
                        int unsignedShort5 = dataInputStream.readUnsignedShort();
                        String strM27828 = this.f47512.m27828(unsignedShort5);
                        int unsignedShort6 = dataInputStream.readUnsignedShort();
                        int unsignedShort7 = dataInputStream.readUnsignedShort();
                        if (unsignedShort7 > 0) {
                            HashSet hashSet = new HashSet(unsignedShort7);
                            for (int i4 = 0; i4 < unsignedShort7; i4++) {
                                int unsignedShort8 = dataInputStream.readUnsignedShort();
                                EnumC6098 enumC6098 = EnumC6098.CONSTANT_NULL;
                                hashSet.add(new C19879(unsignedShort8, this.f47512.m27827(unsignedShort8)));
                            }
                            c7884.m20796(unsignedShort5, unsignedShort6, strM27828, hashSet);
                        } else {
                            c7884.m20795(unsignedShort5, unsignedShort6, strM27828);
                        }
                    }
                }
            } catch (IOException unused2) {
                if (z) {
                    this.f47519.m2163().mo24457("Invalid exports table", new Object[0]);
                } else {
                    throw new C16639(this.f47519.m2163(), "Invalid exports table", new Object[0]);
                }
            }
            try {
                int unsignedShort9 = dataInputStream.readUnsignedShort();
                if (unsignedShort9 > 0) {
                    for (int i5 = 0; i5 < unsignedShort9; i5++) {
                        int unsignedShort10 = dataInputStream.readUnsignedShort();
                        String strM27829 = this.f47512.m27828(unsignedShort10);
                        int unsignedShort11 = dataInputStream.readUnsignedShort();
                        int unsignedShort12 = dataInputStream.readUnsignedShort();
                        if (unsignedShort12 > 0) {
                            HashSet hashSet2 = new HashSet(unsignedShort12);
                            for (int i6 = 0; i6 < unsignedShort12; i6++) {
                                int unsignedShort13 = dataInputStream.readUnsignedShort();
                                EnumC6098 enumC6099 = EnumC6098.CONSTANT_NULL;
                                hashSet2.add(new C19879(unsignedShort13, this.f47512.m27827(unsignedShort13)));
                            }
                            c7884.m20806(unsignedShort10, unsignedShort11, strM27829, hashSet2);
                        } else {
                            c7884.m20805(unsignedShort10, unsignedShort11, strM27829);
                        }
                    }
                }
            } catch (IOException unused3) {
                if (z) {
                    this.f47519.m2163().mo24457("Invalid opens table", new Object[0]);
                } else {
                    throw new C16639(this.f47519.m2163(), "Invalid opens table", new Object[0]);
                }
            }
            try {
                int unsignedShort14 = dataInputStream.readUnsignedShort();
                if (unsignedShort14 > 0) {
                    for (int i7 = 0; i7 < unsignedShort14; i7++) {
                        int unsignedShort15 = dataInputStream.readUnsignedShort();
                        c7884.f25923.add(new C0122(unsignedShort15, this.f47512.m27822(unsignedShort15)));
                    }
                }
            } catch (IOException unused4) {
                if (z) {
                    this.f47519.m2163().mo24457("Invalid uses table", new Object[0]);
                } else {
                    throw new C16639(this.f47519.m2163(), "Invalid uses table", new Object[0]);
                }
            }
            try {
                int unsignedShort16 = dataInputStream.readUnsignedShort();
                if (unsignedShort16 > 0) {
                    for (int i8 = 0; i8 < unsignedShort16; i8++) {
                        int unsignedShort17 = dataInputStream.readUnsignedShort();
                        String strM27822 = this.f47512.m27822(unsignedShort17);
                        int unsignedShort18 = dataInputStream.readUnsignedShort();
                        HashSet hashSet3 = new HashSet(unsignedShort18);
                        for (int i9 = 0; i9 < unsignedShort18; i9++) {
                            int unsignedShort19 = dataInputStream.readUnsignedShort();
                            EnumC6098 enumC60910 = EnumC6098.CONSTANT_NULL;
                            hashSet3.add(new C19879(unsignedShort19, this.f47512.m27822(unsignedShort19)));
                        }
                        c7884.m20797(unsignedShort17, strM27822, hashSet3);
                    }
                }
            } catch (IOException unused5) {
                if (z) {
                    this.f47519.m2163().mo24457("Invalid provides table", new Object[0]);
                } else {
                    throw new C16639(this.f47519.m2163(), "Invalid provides table", new Object[0]);
                }
            }
            this.f54463 = c7884.m20793();
        } catch (IOException unused6) {
            if (z) {
                this.f47519.m2163().mo24457("Invalid Module attributes table", new Object[0]);
                return;
            }
            throw new C16639(this.f47519.m2163(), "Invalid Module attributes table", new Object[0]);
        }
    }

    @Override // l.AbstractC6741, l.InterfaceC5144
    /* JADX INFO: renamed from: ܰ */
    public final void mo3628() {
        C12118 c12118 = this.f54463;
        if (c12118 != null) {
            String string = c12118.toString();
            if (string.isEmpty()) {
                return;
            }
            m18219(string);
        }
    }
}
