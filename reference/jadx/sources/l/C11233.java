package l;

import java.io.DataInputStream;
import java.io.IOException;
import java.util.HashSet;

/* JADX INFO: renamed from: l.ۤ᩻᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: R7CK */
/* JADX INFO: loaded from: classes4.dex */
public final class C11233 extends AbstractC1890 {

    /* JADX INFO: renamed from: ֫᩷, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f35424 = 0;

    /* JADX INFO: renamed from: ۚ᩷, reason: not valid java name and contains not printable characters */
    public final boolean f35425;

    /* JADX INFO: renamed from: ۫᩷, reason: not valid java name and contains not printable characters */
    public C22422 f35426;

    public C11233(C0224 c0224) {
        super(c0224);
        this.f35425 = C25406.m56769(EnumC11979.CP_INDEX);
    }

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final String m28296() {
        C22422 c22422 = this.f35426;
        return c22422 == null ? "N/A" : c22422.m50567();
    }

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final String m28294() {
        C22422 c22422 = this.f35426;
        if (c22422 == null) {
            return null;
        }
        return c22422.f72615.m15858();
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final String m28295(String str) {
        StringBuilder sb = new StringBuilder(25);
        C22422 c22422 = this.f35426;
        boolean z = this.f35425;
        String str2 = " */";
        if (c22422 == null) {
            sb.append(EnumC5202.f18316.m15637());
            sb.append(' ');
            if (z) {
                sb.append("#?? /* " + m28296() + " */");
            } else {
                sb.append(m28296());
            }
            if (str.length() > 0) {
                sb.append(' ');
                sb.append(str);
            }
        } else {
            sb.append(EnumC16856.m39774(c22422.f72615.m4217(), EnumC19840.MODULE));
            sb.append(EnumC5202.f18316.m15637());
            sb.append(' ');
            if (z) {
                Integer numValueOf = Integer.valueOf(this.f35426.f72615.m34370());
                String strM50567 = this.f35426.m50567();
                if (this.f35426.f72615.m15858() != null) {
                    str2 = "@" + this.f35426.f72615.m15858() + " */";
                }
                sb.append(String.format("#%d /* %s%s%s", numValueOf, strM50567, str2, str.length() > 0 ? " ".concat(str) : ""));
            } else {
                sb.append(this.f35426.m50567());
                if (str.length() > 0) {
                    sb.append(' ');
                    sb.append(str);
                }
                if (this.f35426.f72615.m15858() != null) {
                    sb.append("// @");
                    sb.append(this.f35426.f72615.m15858());
                }
            }
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m28297(DataInputStream dataInputStream) {
        boolean z = this.f67152;
        try {
            int unsignedShort = dataInputStream.readUnsignedShort();
            C7856 c7856 = new C7856(this.f6371.m5635(unsignedShort), unsignedShort, dataInputStream.readUnsignedShort(), this.f6371.m5640(dataInputStream.readUnsignedShort(), new C7873(9)));
            try {
                int unsignedShort2 = dataInputStream.readUnsignedShort();
                for (int i = 0; i < unsignedShort2; i++) {
                    int unsignedShort3 = dataInputStream.readUnsignedShort();
                    c7856.f26168.add(new C19043(this.f6371.m5635(unsignedShort3), unsignedShort3, dataInputStream.readUnsignedShort(), this.f6371.m5640(dataInputStream.readUnsignedShort(), new C7873(9))));
                }
            } catch (IOException unused) {
                if (z) {
                    this.f6369.m32312().mo10582("Invalid requires table", new Object[0]);
                } else {
                    throw new C5474(this.f6369.m32312(), "Invalid requires table", new Object[0]);
                }
            }
            try {
                int unsignedShort4 = dataInputStream.readUnsignedShort();
                if (unsignedShort4 > 0) {
                    for (int i2 = 0; i2 < unsignedShort4; i2++) {
                        int unsignedShort5 = dataInputStream.readUnsignedShort();
                        String strM5639 = this.f6371.m5639(unsignedShort5);
                        int unsignedShort6 = dataInputStream.readUnsignedShort();
                        int unsignedShort7 = dataInputStream.readUnsignedShort();
                        if (unsignedShort7 > 0) {
                            HashSet hashSet = new HashSet(unsignedShort7);
                            for (int i3 = 0; i3 < unsignedShort7; i3++) {
                                int unsignedShort8 = dataInputStream.readUnsignedShort();
                                EnumC5335 enumC5335 = EnumC5335.CONSTANT_NULL;
                                hashSet.add(new C7110(unsignedShort8, this.f6371.m5635(unsignedShort8)));
                            }
                            c7856.m21384(unsignedShort5, strM5639, unsignedShort6, hashSet);
                        } else {
                            c7856.m21383(unsignedShort5, unsignedShort6, strM5639);
                        }
                    }
                }
            } catch (IOException unused2) {
                if (z) {
                    this.f6369.m32312().mo10582("Invalid exports table", new Object[0]);
                } else {
                    throw new C5474(this.f6369.m32312(), "Invalid exports table", new Object[0]);
                }
            }
            try {
                int unsignedShort9 = dataInputStream.readUnsignedShort();
                if (unsignedShort9 > 0) {
                    for (int i4 = 0; i4 < unsignedShort9; i4++) {
                        int unsignedShort10 = dataInputStream.readUnsignedShort();
                        String strM56310 = this.f6371.m5639(unsignedShort10);
                        int unsignedShort11 = dataInputStream.readUnsignedShort();
                        int unsignedShort12 = dataInputStream.readUnsignedShort();
                        if (unsignedShort12 > 0) {
                            HashSet hashSet2 = new HashSet(unsignedShort12);
                            for (int i5 = 0; i5 < unsignedShort12; i5++) {
                                int unsignedShort13 = dataInputStream.readUnsignedShort();
                                EnumC5335 enumC5336 = EnumC5335.CONSTANT_NULL;
                                hashSet2.add(new C7110(unsignedShort13, this.f6371.m5635(unsignedShort13)));
                            }
                            c7856.m21394(unsignedShort10, strM56310, unsignedShort11, hashSet2);
                        } else {
                            c7856.m21393(unsignedShort10, unsignedShort11, strM56310);
                        }
                    }
                }
            } catch (IOException unused3) {
                if (z) {
                    this.f6369.m32312().mo10582("Invalid opens table", new Object[0]);
                } else {
                    throw new C5474(this.f6369.m32312(), "Invalid opens table", new Object[0]);
                }
            }
            try {
                int unsignedShort14 = dataInputStream.readUnsignedShort();
                if (unsignedShort14 > 0) {
                    for (int i6 = 0; i6 < unsignedShort14; i6++) {
                        int unsignedShort15 = dataInputStream.readUnsignedShort();
                        c7856.f26172.add(new C13821(unsignedShort15, this.f6371.m5633(unsignedShort15)));
                    }
                }
            } catch (IOException unused4) {
                if (z) {
                    this.f6369.m32312().mo10582("Invalid uses table", new Object[0]);
                } else {
                    throw new C5474(this.f6369.m32312(), "Invalid uses table", new Object[0]);
                }
            }
            try {
                int unsignedShort16 = dataInputStream.readUnsignedShort();
                if (unsignedShort16 > 0) {
                    for (int i7 = 0; i7 < unsignedShort16; i7++) {
                        int unsignedShort17 = dataInputStream.readUnsignedShort();
                        String strM5633 = this.f6371.m5633(unsignedShort17);
                        int unsignedShort18 = dataInputStream.readUnsignedShort();
                        HashSet hashSet3 = new HashSet(unsignedShort18);
                        for (int i8 = 0; i8 < unsignedShort18; i8++) {
                            int unsignedShort19 = dataInputStream.readUnsignedShort();
                            EnumC5335 enumC5337 = EnumC5335.CONSTANT_NULL;
                            hashSet3.add(new C7110(unsignedShort19, this.f6371.m5633(unsignedShort19)));
                        }
                        c7856.m21385(unsignedShort17, strM5633, hashSet3);
                    }
                }
            } catch (IOException unused5) {
                if (z) {
                    this.f6369.m32312().mo10582("Invalid provides table", new Object[0]);
                } else {
                    throw new C5474(this.f6369.m32312(), "Invalid provides table", new Object[0]);
                }
            }
            this.f35426 = c7856.m21381();
        } catch (IOException unused6) {
            if (z) {
                this.f6369.m32312().mo10582("Invalid Module attributes table", new Object[0]);
                return;
            }
            throw new C5474(this.f6369.m32312(), "Invalid Module attributes table", new Object[0]);
        }
    }

    @Override // l.AbstractC20997, l.InterfaceC16454
    /* JADX INFO: renamed from: ᩷ */
    public final void mo1688() {
        C22422 c22422 = this.f35426;
        if (c22422 != null) {
            String string = c22422.toString();
            if (string.isEmpty()) {
                return;
            }
            m48006(string);
        }
    }
}
