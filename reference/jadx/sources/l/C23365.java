package l;

import java.io.IOException;
import java.io.Writer;

/* JADX INFO: renamed from: l.᩻֨ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: X4UI */
/* JADX INFO: loaded from: classes.dex */
public final class C23365 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m51480(InterfaceC10975 interfaceC10975) {
        int iMo2656 = interfaceC10975.mo2656();
        if (iMo2656 != 0) {
            if (iMo2656 != 6) {
                if (iMo2656 != 2) {
                    if (iMo2656 != 3) {
                        if (iMo2656 != 4) {
                            if (iMo2656 != 16) {
                                if (iMo2656 != 17) {
                                    if (iMo2656 != 30) {
                                        if (iMo2656 != 31) {
                                            return false;
                                        }
                                        return !((InterfaceC16619) interfaceC10975).getValue();
                                    }
                                } else if (((InterfaceC6035) interfaceC10975).getValue() != 0.0d) {
                                    return false;
                                }
                            } else if (((InterfaceC1801) interfaceC10975).getValue() != 0.0f) {
                                return false;
                            }
                        } else if (((InterfaceC9564) interfaceC10975).getValue() != 0) {
                            return false;
                        }
                    } else if (((InterfaceC17324) interfaceC10975).getValue() != 0) {
                        return false;
                    }
                } else if (((InterfaceC2237) interfaceC10975).getValue() != 0) {
                    return false;
                }
            } else if (((InterfaceC3212) interfaceC10975).getValue() != 0) {
                return false;
            }
        } else if (((InterfaceC12386) interfaceC10975).getValue() != 0) {
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m51479(Writer writer, InterfaceC10975 interfaceC10975) throws IOException {
        int iMo2656 = interfaceC10975.mo2656();
        if (iMo2656 == 0) {
            writer.write(Byte.toString(((InterfaceC12386) interfaceC10975).getValue()));
            return;
        }
        if (iMo2656 == 6) {
            writer.write(Long.toString(((InterfaceC3212) interfaceC10975).getValue()));
            return;
        }
        if (iMo2656 == 2) {
            writer.write(Short.toString(((InterfaceC2237) interfaceC10975).getValue()));
            return;
        }
        if (iMo2656 == 3) {
            writer.write(Integer.toString(((InterfaceC17324) interfaceC10975).getValue()));
            return;
        }
        if (iMo2656 == 4) {
            writer.write(Integer.toString(((InterfaceC9564) interfaceC10975).getValue()));
            return;
        }
        if (iMo2656 == 16) {
            writer.write(Float.toString(((InterfaceC1801) interfaceC10975).getValue()));
            return;
        }
        if (iMo2656 == 17) {
            writer.write(Double.toString(((InterfaceC6035) interfaceC10975).getValue()));
            return;
        }
        switch (iMo2656) {
            case 21:
                C22304.m49471(writer, ((InterfaceC11411) interfaceC10975).getValue());
                return;
            case 22:
                C22304.m49468(writer, ((InterfaceC13528) interfaceC10975).getValue());
                return;
            case 23:
                writer.write(34);
                C9461.m24219(writer, ((InterfaceC5060) interfaceC10975).getValue());
                writer.write(34);
                return;
            case 24:
                writer.write(((InterfaceC21994) interfaceC10975).getValue());
                return;
            case 25:
                C22304.m49470(writer, ((InterfaceC14503) interfaceC10975).getValue(), false);
                return;
            case 26:
                C22304.m49469(writer, ((InterfaceC4354) interfaceC10975).getValue(), false);
                return;
            case 27:
                C22304.m49470(writer, ((InterfaceC23675) interfaceC10975).getValue(), false);
                return;
            case 28:
                writer.write("Array[");
                boolean z = true;
                for (InterfaceC10975 interfaceC10976 : ((InterfaceC0390) interfaceC10975).getValue()) {
                    if (z) {
                        z = false;
                    } else {
                        writer.write(", ");
                    }
                    m51479(writer, interfaceC10976);
                }
                writer.write(93);
                return;
            case 29:
                InterfaceC20147 interfaceC20147 = (InterfaceC20147) interfaceC10975;
                writer.write("Annotation[");
                writer.write(interfaceC20147.getType());
                for (InterfaceC6533 interfaceC6533 : interfaceC20147.getElements()) {
                    writer.write(", ");
                    writer.write(interfaceC6533.getName());
                    writer.write(61);
                    m51479(writer, interfaceC6533.getValue());
                }
                writer.write(93);
                return;
            case 30:
                writer.write("null");
                return;
            case 31:
                writer.write(Boolean.toString(((InterfaceC16619) interfaceC10975).getValue()));
                return;
            default:
                throw new IllegalArgumentException("Unknown encoded value type");
        }
    }
}
