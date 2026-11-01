package l;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.URL;
import java.nio.file.NoSuchFileException;
import java.security.CodeSource;
import java.security.DigestInputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.bouncycastle.pqc.crypto.xmss.XMSSKeyParameters;

/* JADX INFO: renamed from: l.ۛ᩺۟, reason: contains not printable characters */
/* JADX INFO: compiled from: V6B4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6365 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public PrintWriter f21435;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC13464 f21436;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public PrintWriter f21437;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C20414 f21438;

    public C6365(PrintWriter printWriter) {
        this.f21437 = printWriter;
        this.f21435 = printWriter;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m17472(C5909 c5909) {
        String strM46170 = this.f21438.m46170((AbstractC16493) c5909);
        String strM46171 = this.f21438.m46170((AbstractC16493) C23879.f77336);
        if (!strM46170.startsWith(strM46171)) {
            strM46170 = C15489.m37076(strM46171, strM46170);
        }
        this.f21438.m46173(strM46170);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final EnumC17654 m17470(String[] strArr) {
        EnumC17654 enumC17654;
        boolean z;
        C12343 c12343 = new C12343();
        int i = C14315.f46886;
        c12343.m30658(InterfaceC13464.class, (InterfaceC0347) new C17841());
        c12343.m30659(C20414.f66163, this.f21435);
        c12343.m30659(C20414.f66164, this.f21437);
        C20414 c20414M46161 = C20414.m46161(c12343);
        this.f21438 = c20414M46161;
        if (strArr.length == 0) {
            try {
                EnumC19730.f63379.mo2367(new C12716(c20414M46161), "-help");
            } catch (C21846 unused) {
            }
            enumC17654 = EnumC17654.CMDERR;
        } else {
            try {
                ArrayList arrayListM43831 = C19066.m43831(C21825.m48586((Object[]) strArr));
                C15539 c15539 = (C15539) c12343.m30656(C15539.f50575);
                if (c15539 == null) {
                    c15539 = new C15539(c12343);
                }
                c15539.m37170(arrayListM43831);
                if (this.f21438.f66177 > 0) {
                    enumC17654 = EnumC17654.CMDERR;
                } else {
                    C14770 c14770M35395 = C14770.m35395(c12343);
                    if (c14770M35395.m35407("stdout")) {
                        this.f21438.m46182();
                        this.f21438.m46172(new PrintWriter((OutputStream) System.out, true));
                    }
                    if (c14770M35395.m35404("nonBatchMode") && System.getProperty("nonBatchMode") == null) {
                        c12343.m30658(C21369.class, (InterfaceC0347) new C6552());
                    }
                    InterfaceC13464 interfaceC13464M44967 = (InterfaceC13464) c12343.m30655(InterfaceC13464.class);
                    this.f21436 = interfaceC13464M44967;
                    if (interfaceC13464M44967 instanceof C19772) {
                        interfaceC13464M44967 = ((C19772) interfaceC13464M44967).m44967();
                    }
                    if (interfaceC13464M44967 instanceof AbstractC3729) {
                        AbstractC3729 abstractC3729 = (AbstractC3729) interfaceC13464M44967;
                        abstractC3729.mo10917(c12343);
                        boolean zMo10919 = true;
                        for (Map.Entry entry : c15539.m37175().entrySet()) {
                            try {
                                zMo10919 &= abstractC3729.mo10919((EnumC19730) entry.getKey(), (String) entry.getValue());
                            } catch (IllegalArgumentException e) {
                                C20414 c20414 = abstractC3729.f13549;
                                String strM44880 = ((EnumC19730) entry.getKey()).m44880();
                                String message = e.getMessage();
                                C5909 c5909 = C23879.f77204;
                                c20414.m48197(new C5909("compiler", "illegal.argument.for.option", strM44880, message));
                                zMo10919 = false;
                            }
                        }
                        z = zMo10919;
                    } else {
                        z = true;
                    }
                    String strM35397 = c14770M35395.m35397("showClass");
                    if (strM35397 != null) {
                        if (strM35397.equals("showClass")) {
                            strM35397 = "com.sun.tools.javac.Main";
                        }
                        PrintWriter printWriterM46169 = this.f21438.m46169(EnumC16181.NOTICE);
                        printWriterM46169.println("javac: show class: ".concat(strM35397));
                        URL resource = C6365.class.getResource("/" + strM35397.replace('.', '/') + ".class");
                        if (resource != null) {
                            printWriterM46169.println(EnumC19730.f63352 + resource);
                        }
                        try {
                            InputStream resourceAsStream = C6365.class.getResourceAsStream("/" + strM35397.replace('.', '/') + ".class");
                            try {
                                MessageDigest messageDigest = MessageDigest.getInstance(XMSSKeyParameters.SHA_256);
                                DigestInputStream digestInputStream = new DigestInputStream(resourceAsStream, messageDigest);
                                try {
                                    while (digestInputStream.read(new byte[8192]) > 0) {
                                    }
                                    byte[] bArrDigest = messageDigest.digest();
                                    digestInputStream.close();
                                    StringBuilder sb = new StringBuilder();
                                    for (byte b : bArrDigest) {
                                        sb.append(String.format("%02x", Byte.valueOf(b)));
                                    }
                                    printWriterM46169.println("  SHA-256 checksum: " + ((Object) sb));
                                    if (resourceAsStream != null) {
                                        resourceAsStream.close();
                                    }
                                } catch (Throwable th) {
                                    try {
                                        digestInputStream.close();
                                        throw th;
                                    } catch (Throwable th2) {
                                        th.addSuppressed(th2);
                                        throw th;
                                    }
                                }
                            } catch (Throwable th3) {
                                if (resourceAsStream == null) {
                                    throw th3;
                                }
                                try {
                                    resourceAsStream.close();
                                    throw th3;
                                } catch (Throwable th4) {
                                    th3.addSuppressed(th4);
                                    throw th3;
                                }
                            }
                        } catch (IOException | NoSuchAlgorithmException e2) {
                            printWriterM46169.println("  cannot compute digest: " + e2);
                        }
                    }
                    if (!(c15539.m37167() & z) || this.f21438.f66177 > 0) {
                        enumC17654 = EnumC17654.CMDERR;
                    } else if (c15539.m37176()) {
                        enumC17654 = EnumC17654.OK;
                    } else {
                        if (c14770M35395.m35407("debug.completionDeps")) {
                            C11554.m28860(c12343);
                        }
                        C21143 c21143 = (C21143) C21143.m47577(c12343);
                        c21143.m47578(c15539.m37173());
                        InterfaceC13464 interfaceC13464 = this.f21436;
                        EnumC19730 enumC19730 = EnumC19730.f63338;
                        if (interfaceC13464.mo10912(enumC19730.f63414) == 1) {
                            this.f21436.mo10918(C21825.of((Object) EnumC14128.m34159(c12343).m34168()).iterator(), enumC19730.f63414);
                        }
                        C16949 c16949M39706 = C16949.m39706(c12343);
                        C21825 c21825M37174 = c15539.m37174();
                        if (!c21825M37174.isEmpty()) {
                            c21143.m47579(c21825M37174);
                        }
                        if (c14770M35395.m35398(EnumC19730.f63384) != null) {
                            c16949M39706.f54241 = c16949M39706.f54241.m48597(this.f21438.m46169(EnumC16181.NOTICE));
                        }
                        c14770M35395.m35407("printArgsToFile");
                        try {
                            try {
                                try {
                                    try {
                                        try {
                                            try {
                                                c16949M39706.m39723(c15539.m37168(), c15539.m37169(), C21825.m48588());
                                                HashSet hashSet = this.f21438.f66175;
                                                if (hashSet != null) {
                                                    if (hashSet.isEmpty()) {
                                                        this.f21438.m46173("all expected diagnostics found");
                                                        enumC17654 = EnumC17654.OK;
                                                    } else {
                                                        this.f21438.m46173("expected diagnostic keys not found: " + this.f21438.f66175);
                                                        enumC17654 = EnumC17654.ERROR;
                                                    }
                                                } else {
                                                    enumC17654 = c16949M39706.m39731() == 0 ? EnumC17654.OK : EnumC17654.ERROR;
                                                }
                                            } catch (Throwable th5) {
                                                c16949M39706.m39720();
                                                throw th5;
                                            }
                                        } catch (Throwable th6) {
                                            if (c16949M39706.m39731() == 0 || c14770M35395.m35407("dev")) {
                                                m17471(th6);
                                            }
                                            enumC17654 = EnumC17654.ABNORMAL;
                                        }
                                    } catch (C0969 e3) {
                                        this.f21438.m46173(e3.getMessage());
                                        if (e3.getCause() != null && c14770M35395.m35407("dev")) {
                                            e3.getCause().printStackTrace(this.f21438.m46169(EnumC16181.NOTICE));
                                        }
                                        enumC17654 = EnumC17654.SYSERR;
                                    }
                                } catch (C11802 e4) {
                                    throw e4.getCause();
                                }
                            } catch (C14002 e5) {
                                this.f21438.m46188(EnumC21119.JAVAC, "msg.proc.annotation.uncaught.exception", new Object[0]);
                                e5.getCause().printStackTrace(this.f21438.m46169(EnumC16181.NOTICE));
                                enumC17654 = EnumC17654.SYSERR;
                            }
                        } catch (IllegalAccessError e6) {
                            if (m17469(e6)) {
                                m17471((Throwable) e6);
                            }
                            enumC17654 = EnumC17654.ABNORMAL;
                        } catch (OutOfMemoryError e7) {
                            e = e7;
                            this.f21438.m46188(EnumC21119.JAVAC, "msg.resource", new Object[0]);
                            e.printStackTrace(this.f21438.m46169(EnumC16181.NOTICE));
                            enumC17654 = EnumC17654.SYSERR;
                        } catch (StackOverflowError e8) {
                            e = e8;
                            this.f21438.m46188(EnumC21119.JAVAC, "msg.resource", new Object[0]);
                            e.printStackTrace(this.f21438.m46169(EnumC16181.NOTICE));
                            enumC17654 = EnumC17654.SYSERR;
                        }
                        c16949M39706.m39720();
                    }
                }
            } catch (FileNotFoundException e9) {
                e = e9;
                String message2 = e.getMessage();
                C5909 c59010 = C23879.f77204;
                m17472(new C5909("compiler", "file.not.found", message2));
                enumC17654 = EnumC17654.SYSERR;
            } catch (NoSuchFileException e10) {
                e = e10;
                String message3 = e.getMessage();
                C5909 c59011 = C23879.f77204;
                m17472(new C5909("compiler", "file.not.found", message3));
                enumC17654 = EnumC17654.SYSERR;
            } catch (IOException e11) {
                this.f21438.m46188(EnumC21119.JAVAC, "msg.io", new Object[0]);
                e11.printStackTrace(this.f21438.m46169(EnumC16181.NOTICE));
                enumC17654 = EnumC17654.SYSERR;
            } catch (C18360 e12) {
                C5909 c59012 = C23879.f77204;
                m17472(new C5909("compiler", "unmatched.quote", e12.f58567));
                this.f21438.m46188(EnumC21119.JAVAC, "msg.usage", "javac");
                enumC17654 = EnumC17654.CMDERR;
            }
        }
        EnumC17654 enumC17655 = enumC17654;
        try {
            InterfaceC13464 interfaceC13465 = this.f21436;
            if (interfaceC13465 != null) {
                interfaceC13465.close();
            }
        } catch (IOException e13) {
            m17471(e13);
        }
        return enumC17655;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m17469(IllegalAccessError illegalAccessError) {
        Matcher matcher = Pattern.compile("(?i)(?<=tried to access class )([a-z_$][a-z\\d_$]*\\.)*[a-z_$][a-z\\d_$]*").matcher(illegalAccessError.getMessage());
        if (matcher.find()) {
            try {
                Class<?> cls = Class.forName(matcher.group(0));
                if (C6365.class.getClassLoader() != cls.getClassLoader()) {
                    CodeSource codeSource = cls.getProtectionDomain().getCodeSource();
                    CodeSource codeSource2 = C6365.class.getProtectionDomain().getCodeSource();
                    if (codeSource != null && codeSource2 != null) {
                        C20414 c20414 = this.f21438;
                        URL location = codeSource.getLocation();
                        URL location2 = codeSource2.getLocation();
                        C5909 c5909 = C23879.f77204;
                        c20414.m46187(new C5909("compiler", "two.class.loaders.2", location, location2));
                    } else {
                        this.f21438.m46187(C23879.f77282);
                    }
                    return true;
                }
            } catch (Throwable unused) {
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m17471(Throwable th) {
        this.f21438.m46188(EnumC21119.JAVAC, "msg.bug", C16949.m39709());
        th.printStackTrace(this.f21438.m46169(EnumC16181.NOTICE));
    }
}
