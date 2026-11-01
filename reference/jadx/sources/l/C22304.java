package l;

import java.io.IOException;
import java.io.Writer;
import java.util.Iterator;

/* JADX INFO: renamed from: l.᩹۬ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 54MI */
/* JADX INFO: loaded from: classes.dex */
public final class C22304 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m49465(InterfaceC8858 interfaceC8858, boolean z) {
        StringBuilder sb = new StringBuilder(256);
        if (!z) {
            sb.append(interfaceC8858.mo9700());
            sb.append("->");
        }
        sb.append(interfaceC8858.getName());
        sb.append('(');
        Iterator it = interfaceC8858.mo9699().iterator();
        while (it.hasNext()) {
            sb.append((CharSequence) it.next());
        }
        sb.append(')');
        sb.append(interfaceC8858.mo9698());
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m49471(Writer writer, InterfaceC19441 interfaceC19441) throws IOException {
        if (interfaceC19441 instanceof C0336) {
            C0336 c0336 = (C0336) interfaceC19441;
            writer.write(40);
            c0336.m1996(writer);
            writer.write(41);
            c0336.m1998(writer);
            return;
        }
        writer.write(40);
        Iterator it = interfaceC19441.mo1999().iterator();
        while (it.hasNext()) {
            writer.write(((CharSequence) it.next()).toString());
        }
        writer.write(41);
        writer.write(interfaceC19441.mo1995());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m49469(Writer writer, InterfaceC8858 interfaceC8858, boolean z) throws IOException {
        if (interfaceC8858 instanceof C12332) {
            C12332 c12332 = (C12332) interfaceC8858;
            if (!z) {
                c12332.m30642(writer);
                writer.write("->");
            }
            c12332.m30644(writer);
            writer.write(40);
            c12332.m30643(writer);
            writer.write(41);
            c12332.m30641(writer);
            return;
        }
        if (interfaceC8858 instanceof C11770) {
            C11770 c11770 = (C11770) interfaceC8858;
            if (!z) {
                c11770.f39513.m20483(writer);
                writer.write("->");
            }
            c11770.m29395(writer);
            writer.write(40);
            c11770.m29399(writer);
            writer.write(41);
            c11770.m29398(writer);
            return;
        }
        if (!z) {
            writer.write(interfaceC8858.mo9700());
            writer.write("->");
        }
        writer.write(interfaceC8858.getName());
        writer.write(40);
        Iterator it = interfaceC8858.mo9699().iterator();
        while (it.hasNext()) {
            writer.write(((CharSequence) it.next()).toString());
        }
        writer.write(41);
        writer.write(interfaceC8858.mo9698());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m49467(InterfaceC18735 interfaceC18735, boolean z) {
        String name = interfaceC18735.getName();
        String type = interfaceC18735.getType();
        if (!z) {
            String strMo1183 = interfaceC18735.mo1183();
            StringBuilder sb = new StringBuilder(strMo1183.length() + type.length() + name.length() + 3);
            sb.append(strMo1183);
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
    public static String m49466(InterfaceC18735 interfaceC18735) {
        String name = interfaceC18735.getName();
        String type = interfaceC18735.getType();
        StringBuilder sb = new StringBuilder(type.length() + name.length() + 1);
        sb.append(name);
        sb.append(':');
        sb.append(type);
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m49470(Writer writer, InterfaceC18735 interfaceC18735, boolean z) throws IOException {
        if (interfaceC18735 instanceof C20798) {
            C20798 c20798 = (C20798) interfaceC18735;
            if (!z) {
                c20798.m46778(writer);
                writer.write("->");
            }
            c20798.m46780(writer);
            writer.write(58);
            c20798.m46779(writer);
            return;
        }
        if (!z) {
            writer.write(interfaceC18735.mo1183());
            writer.write("->");
        }
        writer.write(interfaceC18735.getName());
        writer.write(58);
        writer.write(interfaceC18735.getType());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m49468(Writer writer, InterfaceC8152 interfaceC8152) throws IOException {
        writer.write(C19469.m44527(interfaceC8152.mo20681()));
        writer.write(64);
        InterfaceC7446 interfaceC7446Mo20680 = interfaceC8152.mo20680();
        if (interfaceC7446Mo20680 instanceof InterfaceC8858) {
            m49469(writer, (InterfaceC8858) interfaceC7446Mo20680, false);
        } else {
            m49470(writer, (InterfaceC18735) interfaceC7446Mo20680, false);
        }
    }
}
