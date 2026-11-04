package l;

import java.io.IOException;
import java.io.Writer;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ܰܶۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: 54MI */
/* JADX INFO: loaded from: classes4.dex */
public final class C14684 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m35306(InterfaceC4859 interfaceC4859, boolean z) {
        StringBuilder sb = new StringBuilder(256);
        if (!z) {
            sb.append(interfaceC4859.mo6804());
            sb.append("->");
        }
        sb.append(interfaceC4859.getName());
        sb.append('(');
        Iterator it = interfaceC4859.mo6805().iterator();
        while (it.hasNext()) {
            sb.append((CharSequence) it.next());
        }
        sb.append(')');
        sb.append(interfaceC4859.mo6802());
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m35312(Writer writer, InterfaceC13524 interfaceC13524) throws IOException {
        if (interfaceC13524 instanceof C13171) {
            C13171 c13171 = (C13171) interfaceC13524;
            writer.write(40);
            c13171.m32689(writer);
            writer.write(41);
            c13171.m32690(writer);
            return;
        }
        writer.write(40);
        Iterator it = interfaceC13524.mo7393().iterator();
        while (it.hasNext()) {
            writer.write(((CharSequence) it.next()).toString());
        }
        writer.write(41);
        writer.write(interfaceC13524.mo7392());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m35309(Writer writer, InterfaceC4859 interfaceC4859, boolean z) throws IOException {
        if (interfaceC4859 instanceof C1985) {
            C1985 c1985 = (C1985) interfaceC4859;
            if (!z) {
                c1985.m6801(writer);
                writer.write("->");
            }
            c1985.m6807(writer);
            writer.write(40);
            c1985.m6803(writer);
            writer.write(41);
            c1985.m6808(writer);
            return;
        }
        if (interfaceC4859 instanceof C4091) {
            C4091 c4091 = (C4091) interfaceC4859;
            if (!z) {
                c4091.f13949.m51265(writer);
                writer.write("->");
            }
            c4091.m13179(writer);
            writer.write(40);
            c4091.m13185(writer);
            writer.write(41);
            c4091.m13182(writer);
            return;
        }
        if (!z) {
            writer.write(interfaceC4859.mo6804());
            writer.write("->");
        }
        writer.write(interfaceC4859.getName());
        writer.write(40);
        Iterator it = interfaceC4859.mo6805().iterator();
        while (it.hasNext()) {
            writer.write(((CharSequence) it.next()).toString());
        }
        writer.write(41);
        writer.write(interfaceC4859.mo6802());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m35308(InterfaceC8304 interfaceC8304, boolean z) {
        String name = interfaceC8304.getName();
        String type = interfaceC8304.getType();
        if (!z) {
            String strMo4500 = interfaceC8304.mo4500();
            StringBuilder sb = new StringBuilder(strMo4500.length() + type.length() + name.length() + 3);
            sb.append(strMo4500);
            sb.append("->");
            sb.append(name);
            sb.append(':');
            sb.append(type);
            return sb.toString();
        }
        StringBuilder sb2 = new StringBuilder(type.length() + name.length() + 1);
        sb2.append(name);
        sb2.append(':');
        sb2.append(type);
        return sb2.toString();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m35307(InterfaceC8304 interfaceC8304) {
        String name = interfaceC8304.getName();
        String type = interfaceC8304.getType();
        StringBuilder sb = new StringBuilder(type.length() + name.length() + 1);
        sb.append(name);
        sb.append(':');
        sb.append(type);
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m35311(Writer writer, InterfaceC8304 interfaceC8304, boolean z) throws IOException {
        if (interfaceC8304 instanceof C22868) {
            C22868 c22868 = (C22868) interfaceC8304;
            if (!z) {
                c22868.m51588(writer);
                writer.write("->");
            }
            c22868.m51590(writer);
            writer.write(58);
            c22868.m51589(writer);
            return;
        }
        if (!z) {
            writer.write(interfaceC8304.mo4500());
            writer.write("->");
        }
        writer.write(interfaceC8304.getName());
        writer.write(58);
        writer.write(interfaceC8304.getType());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m35310(Writer writer, InterfaceC6813 interfaceC6813) throws IOException {
        writer.write(C21885.m49574(interfaceC6813.mo17433()));
        writer.write(64);
        InterfaceC10824 interfaceC10824Mo17434 = interfaceC6813.mo17434();
        if (interfaceC10824Mo17434 instanceof InterfaceC4859) {
            m35309(writer, (InterfaceC4859) interfaceC10824Mo17434, false);
        } else {
            m35311(writer, (InterfaceC8304) interfaceC10824Mo17434, false);
        }
    }
}
