package l;

import java.io.IOException;
import java.io.Writer;

/* JADX INFO: renamed from: l.ܺܶۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: X4UI */
/* JADX INFO: loaded from: classes4.dex */
public final class C16922 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m39905(InterfaceC16791 interfaceC16791) {
        int iMo5414 = interfaceC16791.mo5414();
        if (iMo5414 != 0) {
            if (iMo5414 != 6) {
                if (iMo5414 != 2) {
                    if (iMo5414 != 3) {
                        if (iMo5414 != 4) {
                            if (iMo5414 != 16) {
                                if (iMo5414 != 17) {
                                    if (iMo5414 != 30) {
                                        if (iMo5414 != 31) {
                                            return false;
                                        }
                                        return !((InterfaceC5605) interfaceC16791).getValue();
                                    }
                                } else if (((InterfaceC24997) interfaceC16791).getValue() != 0.0d) {
                                    return false;
                                }
                            } else if (((InterfaceC23505) interfaceC16791).getValue() != 0.0f) {
                                return false;
                            }
                        } else if (((InterfaceC3367) interfaceC16791).getValue() != 0) {
                            return false;
                        }
                    } else if (((InterfaceC11570) interfaceC16791).getValue() != 0) {
                        return false;
                    }
                } else if (((InterfaceC4113) interfaceC16791).getValue() != 0) {
                    return false;
                }
            } else if (((InterfaceC20521) interfaceC16791).getValue() != 0) {
                return false;
            }
        } else if (((InterfaceC1876) interfaceC16791).getValue() != 0) {
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m39904(Writer writer, InterfaceC16791 interfaceC16791) throws IOException {
        int iMo5414 = interfaceC16791.mo5414();
        if (iMo5414 == 0) {
            writer.write(Byte.toString(((InterfaceC1876) interfaceC16791).getValue()));
            return;
        }
        if (iMo5414 == 6) {
            writer.write(Long.toString(((InterfaceC20521) interfaceC16791).getValue()));
            return;
        }
        if (iMo5414 == 2) {
            writer.write(Short.toString(((InterfaceC4113) interfaceC16791).getValue()));
            return;
        }
        if (iMo5414 == 3) {
            writer.write(Integer.toString(((InterfaceC11570) interfaceC16791).getValue()));
            return;
        }
        if (iMo5414 == 4) {
            writer.write(Integer.toString(((InterfaceC3367) interfaceC16791).getValue()));
            return;
        }
        if (iMo5414 == 16) {
            writer.write(Float.toString(((InterfaceC23505) interfaceC16791).getValue()));
            return;
        }
        if (iMo5414 == 17) {
            writer.write(Double.toString(((InterfaceC24997) interfaceC16791).getValue()));
            return;
        }
        switch (iMo5414) {
            case 21:
                C14684.m35312(writer, ((InterfaceC24251) interfaceC16791).getValue());
                return;
            case 22:
                C14684.m35310(writer, ((InterfaceC6351) interfaceC16791).getValue());
                return;
            case 23:
                writer.write(34);
                C3652.m11836(writer, ((InterfaceC14553) interfaceC16791).getValue());
                writer.write(34);
                return;
            case 24:
                writer.write(((InterfaceC21267) interfaceC16791).getValue());
                return;
            case 25:
                C14684.m35311(writer, ((InterfaceC16045) interfaceC16791).getValue(), false);
                return;
            case 26:
                C14684.m35309(writer, ((InterfaceC12316) interfaceC16791).getValue(), false);
                return;
            case 27:
                C14684.m35311(writer, ((InterfaceC17537) interfaceC16791).getValue(), false);
                return;
            case 28:
                writer.write("Array[");
                boolean z = true;
                for (InterfaceC16791 interfaceC16792 : ((InterfaceC13062) interfaceC16791).getValue()) {
                    if (z) {
                        z = false;
                    } else {
                        writer.write(", ");
                    }
                    m39904(writer, interfaceC16792);
                }
                writer.write(93);
                return;
            case 29:
                InterfaceC15299 interfaceC15299 = (InterfaceC15299) interfaceC16791;
                writer.write("Annotation[");
                writer.write(interfaceC15299.getType());
                for (InterfaceC19073 interfaceC19073 : interfaceC15299.getElements()) {
                    writer.write(", ");
                    writer.write(interfaceC19073.getName());
                    writer.write(61);
                    m39904(writer, interfaceC19073.getValue());
                }
                writer.write(93);
                return;
            case 30:
                writer.write("null");
                return;
            case 31:
                writer.write(Boolean.toString(((InterfaceC5605) interfaceC16791).getValue()));
                return;
            default:
                throw new IllegalArgumentException("Unknown encoded value type");
        }
    }
}
