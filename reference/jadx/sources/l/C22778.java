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

/* JADX INFO: renamed from: l.᩸ۨۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: V6B4 */
/* JADX INFO: loaded from: classes.dex */
public final class C22778 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC16722 f73890;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public PrintWriter f73891;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C7312 f73892;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public PrintWriter f73893;

    public C22778(PrintWriter printWriter) {
        this.f73891 = printWriter;
        this.f73893 = printWriter;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m51378(C11040 c11040) {
        String strM20033 = this.f73892.m20033((AbstractC13695) c11040);
        String strM20034 = this.f73892.m20033((AbstractC13695) C22843.f74152);
        if (!strM20033.startsWith(strM20034)) {
            strM20033 = C14483.m34972(strM20034, strM20033);
        }
        this.f73892.m20035(strM20033);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final EnumC10843 m51376(String[] strArr) {
        EnumC10843 enumC10843;
        boolean z;
        C4747 c4747 = new C4747();
        int i = C2026.f6742;
        c4747.m14645(InterfaceC16722.class, (InterfaceC6766) new C8234());
        c4747.m14646(C7312.f24066, this.f73893);
        c4747.m14646(C7312.f24068, this.f73891);
        C7312 c7312M20023 = C7312.m20023(c4747);
        this.f73892 = c7312M20023;
        if (strArr.length == 0) {
            try {
                EnumC7687.f25278.mo2207(new C22032(c7312M20023), "-help");
            } catch (C14398 unused) {
            }
            enumC10843 = EnumC10843.CMDERR;
        } else {
            try {
                ArrayList arrayListM21981 = C8102.m21981(C14769.m35542((Object[]) strArr));
                C21527 c21527 = (C21527) c4747.m14643(C21527.f68773);
                if (c21527 == null) {
                    c21527 = new C21527(c4747);
                }
                c21527.m48960(arrayListM21981);
                if (this.f73892.f24079 > 0) {
                    enumC10843 = EnumC10843.CMDERR;
                } else {
                    C13015 c13015M32421 = C13015.m32421(c4747);
                    if (c13015M32421.m32432("stdout")) {
                        this.f73892.m20043();
                        this.f73892.m20034(new PrintWriter((OutputStream) System.out, true));
                    }
                    if (c13015M32421.m32429("nonBatchMode") && System.getProperty("nonBatchMode") == null) {
                        c4747.m14645(C0776.class, (InterfaceC6766) new C4505());
                    }
                    InterfaceC16722 interfaceC16722M26604 = (InterfaceC16722) c4747.m14642(InterfaceC16722.class);
                    this.f73890 = interfaceC16722M26604;
                    if (interfaceC16722M26604 instanceof C10338) {
                        interfaceC16722M26604 = ((C10338) interfaceC16722M26604).m26604();
                    }
                    if (interfaceC16722M26604 instanceof AbstractC24643) {
                        AbstractC24643 abstractC24643 = (AbstractC24643) interfaceC16722M26604;
                        abstractC24643.mo6985(c4747);
                        boolean zMo6987 = true;
                        for (Map.Entry entry : c21527.m48967().entrySet()) {
                            try {
                                zMo6987 &= abstractC24643.mo6987((EnumC7687) entry.getKey(), (String) entry.getValue());
                            } catch (IllegalArgumentException e) {
                                C7312 c7312 = abstractC24643.f79776;
                                String strM20956 = ((EnumC7687) entry.getKey()).m20956();
                                String message = e.getMessage();
                                C11040 c11040 = C22843.f74058;
                                c7312.m34525(new C11040("compiler", "illegal.argument.for.option", strM20956, message));
                                zMo6987 = false;
                            }
                        }
                        z = zMo6987;
                    } else {
                        z = true;
                    }
                    String strM32422 = c13015M32421.m32422("showClass");
                    if (strM32422 != null) {
                        if (strM32422.equals("showClass")) {
                            strM32422 = "com.sun.tools.javac.Main";
                        }
                        PrintWriter printWriterM20031 = this.f73892.m20031(EnumC8803.NOTICE);
                        printWriterM20031.println("javac: show class: ".concat(strM32422));
                        URL resource = C22778.class.getResource("/" + strM32422.replace('.', '/') + ".class");
                        if (resource != null) {
                            printWriterM20031.println(EnumC7687.f25319 + resource);
                        }
                        try {
                            InputStream resourceAsStream = C22778.class.getResourceAsStream("/" + strM32422.replace('.', '/') + ".class");
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
                                    printWriterM20031.println("  SHA-256 checksum: " + ((Object) sb));
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
                            printWriterM20031.println("  cannot compute digest: " + e2);
                        }
                    }
                    if (!(c21527.m48964() & z) || this.f73892.f24079 > 0) {
                        enumC10843 = EnumC10843.CMDERR;
                    } else if (c21527.m48965()) {
                        enumC10843 = EnumC10843.OK;
                    } else {
                        if (c13015M32421.m32432("debug.completionDeps")) {
                            C16679.m39421(c4747);
                        }
                        C6958 c6958 = (C6958) C6958.m19258(c4747);
                        c6958.m19259(c21527.m48966());
                        InterfaceC16722 interfaceC16722 = this.f73890;
                        EnumC7687 enumC7687 = EnumC7687.f25294;
                        if (interfaceC16722.mo26603(enumC7687.f25368) == 1) {
                            this.f73890.mo26605(C14769.of((Object) EnumC16305.m38659(c4747).m38666()).iterator(), enumC7687.f25368);
                        }
                        C4878 c4878M14927 = C4878.m14927(c4747);
                        C14769 c14769M48963 = c21527.m48963();
                        if (!c14769M48963.isEmpty()) {
                            c6958.m19260(c14769M48963);
                        }
                        if (c13015M32421.m32423(EnumC7687.f25332) != null) {
                            c4878M14927.f17026 = c4878M14927.f17026.m35552(this.f73892.m20031(EnumC8803.NOTICE));
                        }
                        c13015M32421.m32432("printArgsToFile");
                        try {
                            try {
                                try {
                                    try {
                                        try {
                                            try {
                                                c4878M14927.m14946(c21527.m48968(), c21527.m48959(), C14769.m35543());
                                                HashSet hashSet = this.f73892.f24080;
                                                if (hashSet != null) {
                                                    if (hashSet.isEmpty()) {
                                                        this.f73892.m20035("all expected diagnostics found");
                                                        enumC10843 = EnumC10843.OK;
                                                    } else {
                                                        this.f73892.m20035("expected diagnostic keys not found: " + this.f73892.f24080);
                                                        enumC10843 = EnumC10843.ERROR;
                                                    }
                                                } else {
                                                    enumC10843 = c4878M14927.m14953() == 0 ? EnumC10843.OK : EnumC10843.ERROR;
                                                }
                                            } catch (Throwable th5) {
                                                c4878M14927.m14943();
                                                throw th5;
                                            }
                                        } catch (C3255 e3) {
                                            this.f73892.m20035(e3.getMessage());
                                            if (e3.getCause() != null && c13015M32421.m32432("dev")) {
                                                e3.getCause().printStackTrace(this.f73892.m20031(EnumC8803.NOTICE));
                                            }
                                            enumC10843 = EnumC10843.SYSERR;
                                        }
                                    } catch (C11349 e4) {
                                        this.f73892.m20048(EnumC2837.JAVAC, "msg.proc.annotation.uncaught.exception", new Object[0]);
                                        e4.getCause().printStackTrace(this.f73892.m20031(EnumC8803.NOTICE));
                                        enumC10843 = EnumC10843.SYSERR;
                                    }
                                } catch (Throwable th6) {
                                    if (c4878M14927.m14953() == 0 || c13015M32421.m32432("dev")) {
                                        m51377(th6);
                                    }
                                    enumC10843 = EnumC10843.ABNORMAL;
                                }
                            } catch (C17490 e5) {
                                throw e5.getCause();
                            }
                        } catch (IllegalAccessError e6) {
                            if (m51375(e6)) {
                                m51377((Throwable) e6);
                            }
                            enumC10843 = EnumC10843.ABNORMAL;
                        } catch (OutOfMemoryError e7) {
                            e = e7;
                            this.f73892.m20048(EnumC2837.JAVAC, "msg.resource", new Object[0]);
                            e.printStackTrace(this.f73892.m20031(EnumC8803.NOTICE));
                            enumC10843 = EnumC10843.SYSERR;
                        } catch (StackOverflowError e8) {
                            e = e8;
                            this.f73892.m20048(EnumC2837.JAVAC, "msg.resource", new Object[0]);
                            e.printStackTrace(this.f73892.m20031(EnumC8803.NOTICE));
                            enumC10843 = EnumC10843.SYSERR;
                        }
                        c4878M14927.m14943();
                    }
                }
            } catch (FileNotFoundException e9) {
                e = e9;
                String message2 = e.getMessage();
                C11040 c11041 = C22843.f74058;
                m51378(new C11040("compiler", "file.not.found", message2));
                enumC10843 = EnumC10843.SYSERR;
            } catch (NoSuchFileException e10) {
                e = e10;
                String message3 = e.getMessage();
                C11040 c11042 = C22843.f74058;
                m51378(new C11040("compiler", "file.not.found", message3));
                enumC10843 = EnumC10843.SYSERR;
            } catch (IOException e11) {
                this.f73892.m20048(EnumC2837.JAVAC, "msg.io", new Object[0]);
                e11.printStackTrace(this.f73892.m20031(EnumC8803.NOTICE));
                enumC10843 = EnumC10843.SYSERR;
            } catch (C0644 e12) {
                C11040 c11043 = C22843.f74058;
                m51378(new C11040("compiler", "unmatched.quote", e12.f2502));
                this.f73892.m20048(EnumC2837.JAVAC, "msg.usage", "javac");
                enumC10843 = EnumC10843.CMDERR;
            }
        }
        EnumC10843 enumC10844 = enumC10843;
        try {
            InterfaceC16722 interfaceC16723 = this.f73890;
            if (interfaceC16723 != null) {
                interfaceC16723.close();
            }
        } catch (IOException e13) {
            m51377(e13);
        }
        return enumC10844;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m51375(IllegalAccessError illegalAccessError) {
        Matcher matcher = Pattern.compile("(?i)(?<=tried to access class )([a-z_$][a-z\\d_$]*\\.)*[a-z_$][a-z\\d_$]*").matcher(illegalAccessError.getMessage());
        if (matcher.find()) {
            try {
                Class<?> cls = Class.forName(matcher.group(0));
                if (C22778.class.getClassLoader() != cls.getClassLoader()) {
                    CodeSource codeSource = cls.getProtectionDomain().getCodeSource();
                    CodeSource codeSource2 = C22778.class.getProtectionDomain().getCodeSource();
                    if (codeSource != null && codeSource2 != null) {
                        C7312 c7312 = this.f73892;
                        URL location = codeSource.getLocation();
                        URL location2 = codeSource2.getLocation();
                        C11040 c11040 = C22843.f74058;
                        c7312.m20049(new C11040("compiler", "two.class.loaders.2", location, location2));
                    } else {
                        this.f73892.m20049(C22843.f74046);
                    }
                    return true;
                }
            } catch (Throwable unused) {
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m51377(Throwable th) {
        this.f73892.m20048(EnumC2837.JAVAC, "msg.bug", C4878.m14932());
        th.printStackTrace(this.f73892.m20031(EnumC8803.NOTICE));
    }
}
