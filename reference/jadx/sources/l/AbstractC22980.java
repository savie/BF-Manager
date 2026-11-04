package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.᩸ᩳۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: N5NV */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC22980 extends AbstractRunnableC15257 {
    public AbstractC22980(C5563 c5563, String str) {
        super(c5563);
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
    public final void m51865(String str, boolean z) {
        String string;
        C5563 c5563 = this.f49894;
        AbstractC22044 abstractC22044M36607 = AbstractRunnableC15257.m36607(c5563, str);
        C13961 c13961 = null;
        c13961 = null;
        c13961 = null;
        c13961 = null;
        c13961 = null;
        String str2 = null;
        if (m36609(abstractC22044M36607)) {
            string = "550 Invalid name or chroot violation\r\n";
        } else if (abstractC22044M36607.mo4281()) {
            string = "451 Can't overwrite a directory\r\n";
        } else if (c5563.f19317 >= 0 && z) {
            string = "555 Append can not be used after a REST command\r\n";
        } else if (c5563.m16499()) {
            c5563.m16486("150 Data socket ready\r\n");
            try {
                C13961 c13961M49855 = abstractC22044M36607.m49855("rw");
                try {
                    if (z) {
                        c13961M49855.seek(c13961M49855.length());
                    } else {
                        long j = c5563.f19317;
                        if (j >= 0) {
                            c13961M49855.seek(j);
                            c5563.f19317 = -1L;
                            c5563.f19314 = -1L;
                        } else {
                            c13961M49855.setLength(0L);
                        }
                    }
                    byte[] bArr = new byte[65536];
                    while (true) {
                        int iM16476 = c5563.m16476(bArr);
                        if (iM16476 == -2) {
                            str2 = "425 Could not connect data socket\r\n";
                            break;
                        }
                        if (iM16476 != -1) {
                            if (iM16476 == 0) {
                                str2 = "426 Couldn't receive data\r\n";
                                break;
                            }
                            try {
                                int i = 0;
                                if (c5563.m16491()) {
                                    c13961M49855.write(bArr, 0, iM16476);
                                } else {
                                    int i2 = 0;
                                    while (i < iM16476) {
                                        if (bArr[i] == 13) {
                                            c13961M49855.write(bArr, i2, i - i2);
                                            i2 = i + 1;
                                        }
                                        i++;
                                    }
                                    if (i2 < iM16476) {
                                        c13961M49855.write(bArr, i2, i - i2);
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
                c13961 = c13961M49855;
                string = str3;
            } catch (IOException unused3) {
                StringBuilder sbM51387 = C22783.m51387("451 Couldn't open file \"", str, "\" aka \"");
                sbM51387.append(abstractC22044M36607.mo4294());
                sbM51387.append("\" for writing\r\n");
                string = sbM51387.toString();
            }
        } else {
            string = "425 Couldn't open data socket\r\n";
        }
        if (c13961 != null) {
            try {
                c13961.close();
            } catch (IOException unused4) {
            }
        }
        if (string != null) {
            c5563.m16486(string);
        } else {
            c5563.m16486("226 Transmission complete\r\n");
            C20108.m46234(abstractC22044M36607);
        }
        c5563.m16477();
    }
}
