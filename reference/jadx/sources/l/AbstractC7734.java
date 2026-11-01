package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.۟᩸ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: N5NV */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC7734 extends AbstractRunnableC16096 {
    public AbstractC7734(C0572 c0572, String str) {
        super(c0572);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m20384(String str, boolean z) {
        String string;
        C0572 c0572 = this.f52046;
        AbstractC20745 abstractC20745M38126 = AbstractRunnableC16096.m38126(c0572, str);
        C1388 c1388 = null;
        c1388 = null;
        c1388 = null;
        c1388 = null;
        c1388 = null;
        String str2 = null;
        if (m38128(abstractC20745M38126)) {
            string = "550 Invalid name or chroot violation\r\n";
        } else if (abstractC20745M38126.mo33974()) {
            string = "451 Can't overwrite a directory\r\n";
        } else if (c0572.f2371 >= 0 && z) {
            string = "555 Append can not be used after a REST command\r\n";
        } else if (c0572.m2716()) {
            c0572.m2708("150 Data socket ready\r\n");
            try {
                C1388 c1388M46710 = abstractC20745M38126.m46710("rw");
                try {
                    if (z) {
                        c1388M46710.seek(c1388M46710.length());
                    } else {
                        long j = c0572.f2371;
                        if (j >= 0) {
                            c1388M46710.seek(j);
                            c0572.f2371 = -1L;
                            c0572.f2372 = -1L;
                        } else {
                            c1388M46710.setLength(0L);
                        }
                    }
                    byte[] bArr = new byte[65536];
                    while (true) {
                        int iM2697 = c0572.m2697(bArr);
                        if (iM2697 == -2) {
                            str2 = "425 Could not connect data socket\r\n";
                            break;
                        }
                        if (iM2697 != -1) {
                            if (iM2697 == 0) {
                                str2 = "426 Couldn't receive data\r\n";
                                break;
                            }
                            try {
                                int i = 0;
                                if (c0572.m2714()) {
                                    c1388M46710.write(bArr, 0, iM2697);
                                } else {
                                    int i2 = 0;
                                    while (i < iM2697) {
                                        if (bArr[i] == 13) {
                                            c1388M46710.write(bArr, i2, i - i2);
                                            i2 = i + 1;
                                        }
                                        i++;
                                    }
                                    if (i2 < iM2697) {
                                        c1388M46710.write(bArr, i2, i - i2);
                                    }
                                }
                            } catch (IOException unused) {
                                str2 = "451 File IO problem\r\n";
                            }
                        } else {
                            break;
                        }
                    }
                } catch (IOException unused2) {
                    str2 = "451 Unable to seek in file to append\r\n";
                }
                String str3 = str2;
                c1388 = c1388M46710;
                string = str3;
            } catch (IOException unused3) {
                StringBuilder sbM30914 = C12441.m30914("451 Couldn't open file \"", str, "\" aka \"");
                sbM30914.append(abstractC20745M38126.mo33986());
                sbM30914.append("\" for writing\r\n");
                string = sbM30914.toString();
            }
        } else {
            string = "425 Couldn't open data socket\r\n";
        }
        if (c1388 != null) {
            try {
                c1388.close();
            } catch (IOException unused4) {
            }
        }
        if (string != null) {
            c0572.m2708(string);
        } else {
            c0572.m2708("226 Transmission complete\r\n");
            C22252.m49409(abstractC20745M38126);
        }
        c0572.m2698();
    }
}
