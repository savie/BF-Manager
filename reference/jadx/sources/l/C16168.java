package l;

import com.google.android.material.motion.MotionUtils;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import org.bouncycastle.asn1.bc.ExternalValue$$ExternalSyntheticOutline0;
import org.bouncycastle.crypto.engines.ThreefishEngine;

/* JADX INFO: renamed from: l.ܶܳ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: 64JA */
/* JADX INFO: loaded from: classes5.dex */
public final class C16168 extends C3622 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C21522 f52484;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C0202 f52488;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C0639 f52494;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C23760 f52495;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C17792 f52497;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C7439 f52498;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public C22824 f52499;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final ArrayList f52486 = new ArrayList();

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public C15291 f52487 = null;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C17355 f52490 = null;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public String f52496 = null;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public String f52489 = "";

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public ArrayList f52485 = null;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public ArrayList f52491 = null;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public ArrayList f52492 = null;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public boolean f52493 = false;

    public C16168(C1122 c1122, C22824 c22824) {
        this.f12426 = c1122;
        this.f12427 = new C7965(c1122);
        this.f12428 = this;
        C21522 c21522 = new C21522(this);
        this.f52484 = c21522;
        this.f52497 = new C17792(this);
        this.f52494 = new C0639(this, c21522);
        C23760 c23760 = new C23760();
        c23760.f12426 = this.f12426;
        c23760.f12427 = this.f12427;
        c23760.f12428 = this;
        this.f52495 = c23760;
        this.f52499 = C22824.m51461(c22824);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m38384() {
        this.f12427.getClass();
        this.f52484.getClass();
        this.f52497.getClass();
        this.f52494.getClass();
        this.f52495.getClass();
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    private C18941 m38372() {
        C7965 c7965 = this.f12427;
        if (c7965.f26465 == EnumC5202.f18163) {
            c7965.m21671();
            C7965 c7966 = this.f12427;
            EnumC5202 enumC5202 = c7966.f26465;
            EnumC5202 enumC5203 = EnumC5202.f18162;
            if (enumC5202 == enumC5203) {
                int i = c7966.f26459;
                c7966.m21671();
                C7965 c7967 = this.f12427;
                if (c7967.f26465 == EnumC5202.f18334) {
                    c7967.m21671();
                    C7965 c7968 = this.f12427;
                    if (c7968.f26465 == enumC5203) {
                        int i2 = c7968.f26459;
                        this.f52490.f56482.m51464(i, i2);
                        this.f12427.m21671();
                        "parseVersion: ".concat(this.f52490.f56482.m51462());
                        return new C18941(Integer.valueOf(i), Integer.valueOf(i2));
                    }
                }
            }
        }
        throw C10185.m26296(this.f12426, this.f12427.f26464, "class file version expected", new Object[0]);
    }

    /* JADX WARN: Code duplicated, block: B:48:0x0128  */
    /* JADX WARN: Code duplicated, block: B:50:0x012e A[LOOP:0: B:38:0x0112->B:50:0x012e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:69:0x0144 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:70:0x0134 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10, types: [l.᩺ۙ᩺] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m38390(EnumC22268 enumC22268) {
        char c;
        ArrayList arrayList;
        EnumC14545 enumC14545M37392;
        C15642 c15642;
        boolean z;
        C7965 c7965 = this.f12427;
        long j = c7965.f26464;
        if (c7965.f26465 != EnumC5202.f18162) {
            this.f12426.m4162(j, "A valid index into the local variable array of the current frame expected", new Object[0]);
            throw null;
        }
        final int i = c7965.f26459;
        C21259 c21259 = this.f52488.f1360;
        if (i >= 0) {
            if (i < c21259.f67820) {
                c7965.m21671();
                C7660 c7660M38395 = m38395();
                this.f12427.m21679(EnumC5202.f18334);
                long j2 = this.f12427.f26464;
                C7660 c7660M38396 = m38395();
                EnumC22268 enumC22269 = EnumC22268.f71959;
                if (enumC22268 == enumC22269) {
                    if (EnumC14545.m35092(((String) c7660M38396.f25232.f61224).charAt(0)) == null) {
                        this.f12426.m4162(j2, "Valid field descriptor of the local variable \"{0}\" expected instead of \"{1}\"", Integer.valueOf(i), c7660M38396.f25232.f61224.toString());
                        throw null;
                    }
                } else {
                    EnumC22268 enumC222610 = EnumC22268.f72102;
                    if (enumC22268 == enumC222610) {
                        try {
                            new C16958(c7660M38396.f25232.f61224.toString()).m39939((C1606) null).toString();
                        } catch (Exception unused) {
                            this.f12426.mo4166(j2, "Invalid field signature found for local variable in slot \"{0}\": \"{1}\"", Integer.valueOf(i), c7660M38396.f25232.f61224.toString());
                        }
                    } else {
                        this.f12426.m4162(j2, "Either \"{0}\" or \"{1}\" token is expected", enumC22269.m50326(), enumC222610.m50326());
                        throw null;
                    }
                }
                C0202 c0202 = this.f52488;
                C21259 c212510 = c0202.f1360;
                C11562 c11562 = c0202.f1356;
                C25340 c25340 = c0202.f1355;
                C1122 c1122 = c0202.f1357;
                C15642 c15643 = new C15642((short) i, (short) c0202.f1347, c7660M38395, c7660M38396);
                if (enumC22268 == EnumC22268.f71959) {
                    arrayList = c0202.f1354;
                    enumC14545M37392 = c15643.m37392();
                    if (c0202.f1359 == null) {
                        C23497 c23497 = new C23497(c25340.f20376, EnumC13127.f41957);
                        c0202.f1359 = c23497;
                        c11562.m29081(c23497);
                    }
                    c0202.f1359.m52689(c15643);
                } else {
                    arrayList = c0202.f1344;
                    C23497 c23498 = c0202.f1359;
                    enumC14545M37392 = (c23498 == 0 || (c15642 = (C15642) c23498.m52686((C24069) new Predicate() { // from class: l.᩺ۙ᩺
                        @Override // java.util.function.Predicate
                        public /* synthetic */ Predicate and(Predicate predicate) {
                            return C19025.$default$and(this, predicate);
                        }

                        @Override // java.util.function.Predicate
                        /* JADX INFO: renamed from: negate */
                        public /* synthetic */ Predicate mo7134negate() {
                            return C19025.$default$negate(this);
                        }

                        public /* synthetic */ Predicate or(Predicate predicate) {
                            return C19025.$default$or(this, predicate);
                        }

                        @Override // java.util.function.Predicate
                        public final boolean test(Object obj) {
                            return ((C15642) obj).m37394() == i;
                        }
                    }).orElse(null)) == null) ? null : c15642.m37392();
                    if (c0202.f1351 == null) {
                        C23497 c23499 = new C23497(c25340.f20376, EnumC13127.f41974);
                        c0202.f1351 = c23499;
                        c11562.m29081(c23499);
                    }
                    c0202.f1351.m52689(c15643);
                }
                if (enumC14545M37392 == null) {
                    c1122.m4162(j, "Field type isn't declared for the slot \"{0}\"", Integer.valueOf(i));
                    throw null;
                }
                c15643.f50795 = enumC14545M37392;
                for (int i2 = 0; i2 < enumC14545M37392.m35094(); i2++) {
                    int i3 = i + i2;
                    if (i3 >= 0) {
                        z = i3 < c212510.f67820;
                        if (z) {
                            c1122.m4162(j, "The index in the local variable array \"{0}\" is not in the range [0..{1}] [0..Code_attribute.max_locals-1]", Integer.valueOf(i3), Integer.valueOf(c212510.f67820 - 1));
                            throw null;
                        }
                        if (arrayList.get(i3) == null) {
                            c1122.m4162(j, "The slot \"{0}\" is occupied by another local variable", Integer.valueOf(i3));
                            throw null;
                        }
                        arrayList.set(i3, c15643);
                    } else {
                        c212510.getClass();
                    }
                    if (z) {
                        c1122.m4162(j, "The index in the local variable array \"{0}\" is not in the range [0..{1}] [0..Code_attribute.max_locals-1]", Integer.valueOf(i3), Integer.valueOf(c212510.f67820 - 1));
                        throw null;
                    }
                    if (arrayList.get(i3) == null) {
                        c1122.m4162(j, "The slot \"{0}\" is occupied by another local variable", Integer.valueOf(i3));
                        throw null;
                    }
                    arrayList.set(i3, c15643);
                }
                return;
            }
            c = 0;
        } else {
            c = 0;
            c21259.getClass();
        }
        C1122 c1123 = this.f12426;
        Integer numValueOf = Integer.valueOf(i);
        Integer numValueOf2 = Integer.valueOf(this.f52488.f1360.f67820 - 1);
        Object[] objArr = new Object[2];
        objArr[c] = numValueOf;
        objArr[1] = numValueOf2;
        c1123.m4162(j, "The index in the local variable array \"{0}\" is not in the range [0..{1}] [0..Code_attribute.max_locals-1]", objArr);
        throw null;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C21259 m38396() {
        C7965 c7965 = this.f12427;
        if (c7965.f26465 != EnumC5202.f18162) {
            throw C10185.m26296(this.f12426, c7965.f26464, "A valid index into the local variable array of the current frame expected", new Object[0]);
        }
        int i = c7965.f26459;
        c7965.m21671();
        return new C21259(i);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x002d  */
    /* JADX WARN: Code duplicated, block: B:15:0x0031  */
    /* JADX WARN: Code duplicated, block: B:16:0x0036  */
    /* JADX WARN: Code duplicated, block: B:19:0x0040  */
    /* JADX WARN: Code duplicated, block: B:21:0x0047  */
    /* JADX WARN: Code duplicated, block: B:25:0x004f  */
    /* JADX WARN: Code duplicated, block: B:26:0x0051  */
    /* JADX WARN: Code duplicated, block: B:28:0x0059  */
    /* JADX WARN: Code duplicated, block: B:37:0x007d  */
    /* JADX WARN: Code duplicated, block: B:45:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:47:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:52:0x0086 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:53:0x009d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:0x0094 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:0x0094 A[SYNTHETIC] */
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m38399(EnumC22268 enumC22268) {
        boolean z;
        EnumC22268 enumC22269;
        Object obj;
        C15642 c15642;
        int i;
        int iM35094;
        int i2;
        int i3;
        C7965 c7965 = this.f12427;
        long j = c7965.f26464;
        if (c7965.f26465 != EnumC5202.f18162) {
            throw C10185.m26296(this.f12426, j, "A valid index into the local variable array of the current frame expected", new Object[0]);
        }
        int i4 = c7965.f26459;
        C0202 c0202 = this.f52488;
        short s = (short) i4;
        ArrayList arrayList = c0202.f1344;
        ArrayList arrayList2 = c0202.f1354;
        C1122 c1122 = c0202.f1357;
        C21259 c21259 = c0202.f1360;
        if (s >= 0) {
            z = s < c21259.f67820;
            if (z) {
                c1122.m4162(j, "The index in the local variable array \"{0}\" is not in the range [0..{1}] [0..Code_attribute.max_locals-1]", Short.valueOf(s), Integer.valueOf(c21259.f67820 - 1));
                throw null;
            }
            enumC22269 = EnumC22268.f71959;
            if (enumC22268 == enumC22269) {
                obj = arrayList2.get(s);
            } else {
                obj = arrayList.get(s);
            }
            c15642 = (C15642) obj;
            if (c15642 != null) {
                c1122.m4162(j, "Local variable isn't declared for the slot \"{0}\"", Short.valueOf(s));
                throw null;
            }
            c15642.m37393(c0202.f1347);
            if (enumC22268 == enumC22269) {
                arrayList = arrayList2;
            }
            i = 0;
            while (true) {
                if (c15642.m37392() == null) {
                    iM35094 = 0;
                } else {
                    iM35094 = c15642.f50795.m35094();
                }
                if (i < iM35094) {
                    this.f12427.m21671();
                    return;
                }
                if (i <= 0 && ((i3 = s + i) < 0 || i3 >= c21259.f67820)) {
                    break;
                }
                if (i > 0) {
                    i2 = s + i;
                    if (arrayList.get(i2) != null) {
                        throw C10185.m26296(c1122, j, "Local variable isn't declared for the slot \"{0}\"", new Object[]{Integer.valueOf(i2)});
                    }
                }
                arrayList.set(s + i, null);
                i++;
            }
            throw C10185.m26296(c1122, j, "The index in the local variable array \"{0}\" is not in the range [0..{1}] [0..Code_attribute.max_locals-1]", new Object[]{Integer.valueOf(i3), Integer.valueOf(c21259.f67820 - 1)});
        }
        c21259.getClass();
        if (z) {
            c1122.m4162(j, "The index in the local variable array \"{0}\" is not in the range [0..{1}] [0..Code_attribute.max_locals-1]", Short.valueOf(s), Integer.valueOf(c21259.f67820 - 1));
            throw null;
        }
        enumC22269 = EnumC22268.f71959;
        if (enumC22268 == enumC22269) {
            obj = arrayList2.get(s);
        } else {
            obj = arrayList.get(s);
        }
        c15642 = (C15642) obj;
        if (c15642 != null) {
            c1122.m4162(j, "Local variable isn't declared for the slot \"{0}\"", Short.valueOf(s));
            throw null;
        }
        c15642.m37393(c0202.f1347);
        if (enumC22268 == enumC22269) {
            arrayList = arrayList2;
        }
        i = 0;
        while (true) {
            if (c15642.m37392() == null) {
                iM35094 = 0;
            } else {
                iM35094 = c15642.f50795.m35094();
            }
            if (i < iM35094) {
                this.f12427.m21671();
                return;
            }
            if (i <= 0) {
            }
            if (i > 0) {
                i2 = s + i;
                if (arrayList.get(i2) != null) {
                    throw C10185.m26296(c1122, j, "Local variable isn't declared for the slot \"{0}\"", new Object[]{Integer.valueOf(i2)});
                }
            }
            arrayList.set(s + i, null);
            i++;
        }
        throw C10185.m26296(c1122, j, "The index in the local variable array \"{0}\" is not in the range [0..{1}] [0..Code_attribute.max_locals-1]", new Object[]{Integer.valueOf(i3), Integer.valueOf(c21259.f67820 - 1)});
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m38398(C11562 c11562) {
        C7965 c7965 = this.f12427;
        if (c7965.f26465 == EnumC5202.f18285) {
            int i = c7965.f26459;
            C1868 c1868 = new C1868();
            c1868.f6293 = null;
            c1868.f6292 = i;
            c11562.m29081(c1868);
            this.f12427.m21671();
            return;
        }
        C7660 c7660M38395 = m38395();
        this.f12427.m21679(EnumC5202.f18334);
        C7660 c7660M36707 = this.f52487.m36707((AbstractC18847) new C7417(c7660M38395, m38395()));
        C1868 c1869 = new C1868();
        c1869.f6292 = -1;
        c1869.f6293 = c7660M36707;
        c11562.m29081(c1869);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m38389(C11562 c11562) {
        EnumC3185 enumC3185M30334;
        EnumC5202 enumC5202;
        EnumC23570 enumC23570M11195 = C3432.m11195(this.f12427.f26459, C15867.empty());
        C7965 c7965 = this.f12427;
        EnumC5202 enumC5203 = c7965.f26465;
        int i = c7965.f26459;
        String str = c7965.f26453;
        c7965.m21671();
        int i2 = C11693.f37858[enumC5203.ordinal()];
        C7660 c7660M36707 = null;
        if (i2 == 1) {
            enumC3185M30334 = null;
        } else if (i2 == 2) {
            enumC23570M11195 = EnumC23570.ITEM_Object;
            enumC3185M30334 = EnumC3185.f10346;
        } else if (i2 == 3) {
            enumC23570M11195 = EnumC23570.ITEM_Object;
            c7660M36707 = this.f52487.m36703(i);
            enumC3185M30334 = null;
        } else {
            if (i2 != 4) {
                enumC3185M30334 = null;
            } else {
                enumC23570M11195 = EnumC23570.m52765(str);
                enumC3185M30334 = C12134.m30334(str);
                if (enumC23570M11195 != null) {
                    if (enumC3185M30334 != null && (enumC5202 = this.f12427.f26465) != EnumC5202.f18144 && enumC5202 != EnumC5202.f18309) {
                        enumC23570M11195 = EnumC23570.ITEM_Object;
                    }
                } else if (enumC3185M30334 != null) {
                    enumC23570M11195 = EnumC23570.ITEM_Object;
                }
            }
            enumC23570M11195 = EnumC23570.ITEM_Bogus;
            this.f12426.mo4160("StackMap entry type expected instead of {0}", "<" + enumC5203.m15646() + ">");
        }
        int i3 = C11693.f37857[enumC23570M11195.ordinal()];
        if (i3 == 1) {
            if (c7660M36707 == null) {
                c7660M36707 = this.f52487.m36707(this.f52484.m48930(enumC3185M30334));
            }
            c11562.f36349.add(new C7219(enumC23570M11195, c7660M36707));
        } else {
            if (i3 == 2) {
                c11562.f36349.add(new C7219(enumC23570M11195, this.f52494.m2809()));
                return;
            }
            C8710 c8710 = new C8710();
            c8710.f28375 = enumC23570M11195;
            c11562.f36349.add(c8710);
        }
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C7660 m38395() {
        C7965 c7965 = this.f12427;
        EnumC5202 enumC5202 = c7965.f26465;
        if (enumC5202 == EnumC5202.f18285) {
            int i = c7965.f26459;
            c7965.m21671();
            return this.f52487.m36703(i);
        }
        if (enumC5202 == EnumC5202.f18252) {
            String str = c7965.f26453;
            c7965.m21671();
            return this.f52487.m36704(str);
        }
        if (enumC5202.m15645()) {
            C7965 c7966 = this.f12427;
            String str2 = c7966.f26454;
            c7966.m21671();
            return this.f52487.m36704(str2);
        }
        throw C10185.m26296(this.f12426, this.f12427.f26464, "Either name or Constant Pool index expected, got {0}", new Object[]{"\"" + this.f12427.f26465 + "\""});
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C7660 m38385(EnumC20339 enumC20339) {
        int i = C11693.f37859[enumC20339.ordinal()];
        C21522 c21522 = this.f52484;
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 4:
                return this.f52487.m36707(c21522.m48930(EnumC3185.f10352));
            case 5:
            case 6:
                c21522.m48933(true);
                EnumC3185 enumC3185 = EnumC3185.f10340;
                C7660 c7660M48929 = c21522.m48929(enumC3185, EnumC3185.f10369, false);
                c21522.m48933(false);
                m38355(this.f12426.m4164(), enumC3185, null);
                return c7660M48929;
            case 7:
            case 8:
                EnumC3185 enumC3186 = EnumC3185.f10340;
                EnumC3185 enumC3187 = EnumC3185.f10369;
                if (this.f52490.f56482.m51467() >= 52 && EnumC16856.m39788(this.f52490.f20372)) {
                    enumC3187 = enumC3186;
                    enumC3186 = enumC3187;
                }
                c21522.m48933(true);
                C7660 c7660M489210 = c21522.m48929(enumC3186, enumC3187, false);
                c21522.m48933(false);
                m38355(this.f12426.m4164(), enumC3186, enumC3187);
                return c7660M489210;
            case 9:
                c21522.m48933(true);
                EnumC3185 enumC3188 = EnumC3185.f10369;
                C7660 c7660M489211 = c21522.m48929(enumC3188, EnumC3185.f10340, false);
                c21522.m48933(false);
                m38355(this.f12426.m4164(), enumC3188, null);
                return c7660M489211;
            default:
                throw new C24866();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m38355(long j, EnumC3185 enumC3185, EnumC3185 enumC3186) {
        if (this.f12427.f26465.m15640(EnumC5202.f18334, EnumC5202.f18144, EnumC5202.f18309)) {
            return;
        }
        if (enumC3186 != null) {
            this.f12426.mo4159(j, "Wrong tag: Either {0} or {1} expected", enumC3185.m10400(), enumC3186.m10400());
        } else {
            this.f12426.mo4159(j, "Wrong tag: {0} expected", enumC3185.m10400());
        }
        C24866 c24866 = new C24866();
        c24866.m55392();
        throw c24866;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final EnumC20339 m38394() {
        EnumC20339 enumC20339M30329;
        int i = C11693.f37858[this.f12427.f26465.ordinal()];
        if (i != 1) {
            enumC20339M30329 = i != 4 ? null : C12134.m30331(this.f12427.f26453);
        } else {
            enumC20339M30329 = C12134.m30329(this.f12427.f26459);
        }
        if (enumC20339M30329 == null) {
            this.f12426.mo4160("Subtag expected", new Object[0]);
            throw new C24866();
        }
        this.f12427.m21671();
        return enumC20339M30329;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C7660 m38393() {
        C7965 c7965 = this.f12427;
        EnumC5202 enumC5202 = c7965.f26465;
        if (enumC5202 == EnumC5202.f18285) {
            int i = c7965.f26459;
            c7965.m21671();
            return this.f52487.m36703(i);
        }
        if (enumC5202 == EnumC5202.f18252 || enumC5202.m15645()) {
            C7965 c7966 = this.f12427;
            String str = c7966.f26453;
            c7966.m21671();
            C15291 c15291 = this.f52487;
            c15291.getClass();
            return c15291.m36707((AbstractC18847) new C6672(EnumC3185.f10333, c15291.m36704(str)));
        }
        m38356("Either package name or Constant Pool index expected, got {0}");
        throw null;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C7660 m38397() {
        C7965 c7965 = this.f12427;
        EnumC5202 enumC5202 = c7965.f26465;
        if (enumC5202 == EnumC5202.f18285) {
            int i = c7965.f26459;
            c7965.m21671();
            return this.f52487.m36703(i);
        }
        if (enumC5202 == EnumC5202.f18252 || enumC5202.m15642()) {
            C7965 c7966 = this.f12427;
            String str = c7966.f26453;
            c7966.m21671();
            C15291 c15291 = this.f52487;
            c15291.getClass();
            return c15291.m36707((AbstractC18847) new C6672(EnumC3185.f10366, c15291.m36704(str)));
        }
        m38356("Either a module name or Constant Pool index expected, got {0}");
        throw null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C7660 m38386(boolean z) {
        C7965 c7965 = this.f12427;
        EnumC5202 enumC5202 = c7965.f26465;
        if (enumC5202 == EnumC5202.f18285) {
            int i = c7965.f26459;
            c7965.m21671();
            return this.f52487.m36703(i);
        }
        if (enumC5202 != EnumC5202.f18252 && !enumC5202.m15645()) {
            m38356("Either a class name or Constant Pool index expected, got {0}");
            throw null;
        }
        C7965 c7966 = this.f12427;
        String strM23910 = c7966.f26453;
        c7966.m21671();
        if ((z || this.f12427.f26465 == EnumC5202.f18331) && !strM23910.contains("/") && !strM23910.contains("[")) {
            strM23910 = C8947.m23910(new StringBuilder(), this.f52489, strM23910);
        }
        return this.f52487.m36704(strM23910);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m38356(String str) {
        EnumC3185 enumC3185M30332 = C12134.m30332(this.f12427.f26465.m15643());
        this.f12426.m32315("Unrecognized token %s: %s", this.f12427.f26465.toString(), enumC3185M30332 == null ? "null" : enumC3185M30332.m10400());
        throw C10185.m26296(this.f12426, this.f12427.f26450, str, new Object[]{C7376.m20248(this.f12427.f26465, new StringBuilder("\""), "\"")});
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C21259 m38388(int i, String str) {
        C7965 c7965 = this.f12427;
        if (c7965.f26465 == EnumC5202.f18173) {
            c7965.m21671();
        }
        C7965 c7966 = this.f12427;
        if (c7966.f26465 != EnumC5202.f18162) {
            throw C10185.m26296(this.f12426, c7966.f26464, "Integer expected", new Object[0]);
        }
        int i2 = c7966.f26459 * c7966.f26455;
        if (i != 1) {
            if (i != 2) {
                throw new InternalError(C14442.m34864(i, "parseInt(", MotionUtils.EASING_TYPE_FORMAT_END));
            }
            if (i2 > 65535 || i2 < -32768) {
                throw C10185.m26296(this.f12426, c7966.f26464, "{0} value {1} does not fit in {2}", new Object[]{str, Integer.valueOf(i2), "2 bytes"});
            }
        } else if (i2 > 255 || i2 < -128) {
            throw C10185.m26296(this.f12426, c7966.f26464, "{0} value {1} does not fit in {2}", new Object[]{str, Integer.valueOf(i2), "1 byte"});
        }
        c7966.m21671();
        return new C21259(i2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C21259 m38387(int i) {
        C7965 c7965 = this.f12427;
        if (c7965.f26465 != EnumC5202.f18162) {
            throw C10185.m26296(this.f12426, c7965.f26464, "Integer expected", new Object[0]);
        }
        if (c7965.f26455 == -1) {
            throw C10185.m26296(this.f12426, c7965.f26464, "Negative integer is not allowed", new Object[0]);
        }
        int i2 = c7965.f26459;
        if (i != 1) {
            if (i != 2) {
                throw new InternalError(C14442.m34864(i, "parseUInt(", MotionUtils.EASING_TYPE_FORMAT_END));
            }
            if (i2 > 65535) {
                throw C10185.m26296(this.f12426, c7965.f26464, "{0} value {1} does not fit in {2}", new Object[]{"ushort", Integer.valueOf(i2), "2 bytes"});
            }
        } else if (i2 > 255) {
            throw C10185.m26296(this.f12426, c7965.f26464, "{0} value {1} does not fit in {2}", new Object[]{"ubyte", Integer.valueOf(i2), "1 byte"});
        }
        c7965.m21671();
        return new C21259(i2);
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    private void m38369() {
        while (true) {
            C7965 c7965 = this.f12427;
            if (c7965.f26465 == EnumC5202.f18285) {
                int i = c7965.f26459;
                c7965.m21671();
                this.f12427.m21679(EnumC5202.f18167);
                String.format("\ncpIndex: %d", Integer.valueOf(i));
                this.f52487.m36709(i, this.f52484.m48934());
                C7965 c7966 = this.f12427;
                if (c7966.f26465 != EnumC5202.f18309) {
                    c7966.m21679(EnumC5202.f18144);
                    return;
                }
                c7966.m21671();
            } else {
                this.f12426.mo4160("Constant declaration expected", new Object[0]);
                throw new C24866();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:41:0x00eb A[SYNTHETIC] */
    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int m38392() {
        int iM39816;
        int iM39817;
        int iM39818;
        int i = 0;
        while (true) {
            int i2 = C11693.f37858[this.f12427.f26465.ordinal()];
            if (i2 != 1) {
                switch (i2) {
                    case 5:
                        iM39816 = EnumC16856.f54367.m39816();
                        break;
                    case 6:
                        iM39816 = EnumC16856.f54378.m39816();
                        break;
                    case 7:
                        iM39816 = EnumC16856.f54371.m39816();
                        break;
                    case 8:
                        iM39816 = EnumC16856.f54351.m39816();
                        break;
                    case 9:
                        iM39816 = EnumC16856.f54345.m39816();
                        break;
                    case 10:
                        iM39816 = EnumC16856.f54373.m39816();
                        break;
                    case 11:
                        iM39816 = EnumC16856.f54387.m39816();
                        break;
                    case 12:
                        iM39817 = EnumC16856.f54357.m39816();
                        iM39818 = EnumC16856.f54364.m39816();
                        iM39816 = iM39817 | iM39818;
                        break;
                    case 13:
                        iM39817 = EnumC16856.f54347.m39816();
                        iM39818 = EnumC16856.f54364.m39816();
                        iM39816 = iM39817 | iM39818;
                        break;
                    case 14:
                        iM39816 = EnumC16856.f54366.m39816();
                        break;
                    case 15:
                        iM39816 = EnumC16856.f54342.m39816();
                        break;
                    case 16:
                        iM39816 = EnumC16856.f54372.m39816();
                        break;
                    case 17:
                        iM39816 = EnumC16856.f54379.m39816();
                        break;
                    case 18:
                        iM39816 = EnumC16856.f54381.m39816();
                        break;
                    case 19:
                        iM39816 = EnumC16856.f54353.m39816();
                        break;
                    case 20:
                        iM39816 = EnumC16856.f54376.m39816();
                        break;
                    case 21:
                        iM39816 = EnumC16856.f54365.m39816();
                        break;
                    case 22:
                        iM39816 = EnumC16856.f54359.m39816();
                        break;
                    case 23:
                        if (this.f52490.f56482.m51472()) {
                            iM39816 = EnumC16856.f54382.m39816();
                        } else {
                            iM39816 = EnumC16856.f54374.m39816();
                        }
                        break;
                    case 24:
                        iM39816 = EnumC16856.f54361.m39816();
                        break;
                    case 25:
                        iM39816 = EnumC16856.f54352.m39816();
                        break;
                    case 26:
                        iM39816 = EnumC16856.f54368.m39816();
                        break;
                    default:
                        iM39816 = 0;
                        break;
                }
                if (iM39816 == 0) {
                    return i;
                }
                i |= iM39816;
            } else {
                iM39816 = this.f12427.f26459;
            }
            C7965 c7965 = this.f12427;
            long j = c7965.f26464;
            c7965.m21671();
            if ((i & iM39816) != 0) {
                this.f12426.mo4166(j, "Ambiguous use of similar modifiers", new Object[0]);
            } else {
                if (iM39816 == 0) {
                    return i;
                }
                i |= iM39816;
            }
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private void m38363(int i) {
        C17355 c17355 = this.f52490;
        long j = this.f12427.f26450;
        C1122 c1122 = (C1122) c17355.m17326();
        int iM39802 = EnumC16856.m39802(i, EnumC16856.f54352, EnumC16856.f54382);
        if (EnumC16856.m39788(c17355.f20372)) {
            int i2 = EnumC16856.m39765(iM39802) ? (~EnumC16856.f54374.m39816()) & iM39802 : iM39802;
            if (EnumC16856.m39792(i2)) {
                i2 &= ~EnumC16856.f54365.m39816();
            }
            if (!EnumC16856.m39794(i2, EnumC16856.f54367, EnumC16856.f54351, EnumC16856.f54345)) {
                c1122.mo4166(j, "\"{0}\": Interface field must be ACC_PUBLIC, ACC_STATIC, and ACC_FINAL only and may have ACC_STRICT_INIT or ACC_SYNTHETIC flag set", EnumC16856.m39803(iM39802, EnumC19840.FIELD));
            }
            if (!EnumC16856.m39782(iM39802)) {
                c1122.mo4166(j, "\"{0}\": Interface field must be ACC_PUBLIC, ACC_STATIC, and ACC_FINAL only and may have ACC_STRICT_INIT or ACC_SYNTHETIC flag set", EnumC16856.m39803(iM39802, EnumC19840.FIELD));
            }
        } else {
            if (EnumC16856.m39795() == EnumC19840.VALUE_OBJECTS && !EnumC16856.m39767(c17355.f20372) && !EnumC16856.m39780(iM39802, EnumC16856.f54351, EnumC16856.f54365)) {
                c1122.mo4166(j, "\"{0}\": Each field of a value class must have at least one of its ACC_STATIC or ACC_STRICT_INIT flags set", EnumC16856.m39803(iM39802, EnumC19840.FIELD));
            }
            int iM39806 = EnumC16856.m39806(iM39802, EnumC16856.f54375);
            if (iM39806 != 0) {
                c1122.mo4166(j, "Invalid modifier(s) for a field {0}", EnumC16856.m39803(iM39806, EnumC19840.FIELD));
            }
            if (!EnumC16856.m39791(iM39802, EnumC16856.f54367, EnumC16856.f54378, EnumC16856.f54371)) {
                c1122.mo4166(j, "\"{0}\": Each field of a class may have at most one of its ACC_PUBLIC, ACC_PRIVATE, and ACC_PROTECTED flags set", EnumC16856.m39803(iM39802, EnumC19840.FIELD));
            }
            if (EnumC16856.m39779(iM39802, EnumC16856.f54345, EnumC16856.f54366)) {
                c1122.mo4166(j, "\"{0}\": Each field of a class must not have both its ACC_FINAL and ACC_VOLATILE flags set", EnumC16856.m39803(iM39802, EnumC19840.FIELD));
            }
        }
        while (true) {
            C7660 c7660M38395 = m38395();
            C7965 c7965 = this.f12427;
            EnumC5202 enumC5202 = EnumC5202.f18334;
            c7965.m21679(enumC5202);
            C7660 c7660M38396 = m38395();
            C17355 c17356 = this.f52490;
            c17356.getClass();
            C4105 c4105M40758 = c17356.m40758(i, new C21588(c7660M38395, c7660M38396));
            ArrayList arrayList = this.f52492;
            if (arrayList != null) {
                c4105M40758.m17323(arrayList);
            }
            C7965 c7966 = this.f12427;
            if (c7966.f26465 == enumC5202) {
                c7966.m21671();
                C7965 c7967 = this.f12427;
                if (c7967.f26465 == EnumC5202.f18151) {
                    c7967.m21671();
                }
                c4105M40758.m17324(m38395());
            }
            C7965 c7968 = this.f12427;
            if (c7968.f26465 == EnumC5202.f18167) {
                c7968.m21671();
                c4105M40758.m13202(this.f52484.m48929(null, null, false));
            }
            C7965 c7969 = this.f12427;
            if (c7969.f26465 == enumC5202) {
                c7969.m21671();
                EnumC13127 enumC13127 = EnumC13127.f41976;
                c4105M40758.getClass();
                if (C24243.f78518[enumC13127.ordinal()] != 1) {
                    throw new IllegalStateException(ExternalValue$$ExternalSyntheticOutline0.m("Unexpected attribute: ", enumC13127.m32610(), " in ", c4105M40758.f20380.name()));
                }
                if (c4105M40758.f20373 != null) {
                    this.f12426.mo4166(this.f12427.f26464, "Signature attribute repeated", new Object[0]);
                }
                C7965 c79610 = this.f12427;
                if (c79610.f26465 == EnumC5202.f18151) {
                    c79610.m21671();
                }
                c4105M40758.m17324(m38395());
            }
            C7965 c79611 = this.f12427;
            if (c79611.f26465 != EnumC5202.f18309) {
                c79611.m21679(EnumC5202.f18144);
                return;
            }
            c79611.m21671();
        }
    }

    /* JADX WARN: Code duplicated, block: B:41:0x0166  */
    /* JADX WARN: Code duplicated, block: B:43:0x016c  */
    /* JADX WARN: Code duplicated, block: B:45:0x0176  */
    /* JADX WARN: Code duplicated, block: B:52:0x018d  */
    /* JADX WARN: Code duplicated, block: B:85:0x0219  */
    /* JADX WARN: Code duplicated, block: B:87:0x021d  */
    /* JADX WARN: Code duplicated, block: B:88:0x021f  */
    /* JADX WARN: Code duplicated, block: B:95:0x0233 A[PHI: r5
      0x0233: PHI (r5v82 int) = (r5v80 int), (r5v86 int), (r5v80 int), (r5v80 int), (r5v80 int), (r5v80 int) binds: [B:67:0x01de, B:305:0x0233, B:73:0x01ea, B:75:0x01ee, B:79:0x01f6, B:82:0x01fc] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Failed to find 'out' block for switch in B:82:0x01fc. Please report as an issue. */
    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private void m38368(int i) {
        char c;
        EnumC16856[] enumC16856Arr;
        int i2;
        String str;
        C17792 c17792;
        EnumC5202 enumC5202;
        C21259 c21259M38387;
        int i3;
        C21259 c21259;
        TreeMap treeMap;
        ArrayList arrayList;
        C7660 c7660M38395;
        int i4;
        int i5;
        int i6;
        String str2;
        char c2;
        int i7;
        long j = this.f12427.f26450;
        C7660 c7660M38396 = m38395();
        String str3 = (String) ((C10816) c7660M38396.f25232).f61224;
        boolean zEquals = str3.equals("<clinit>");
        boolean z = str3.equals("<init>") && !EnumC16856.m39809(i);
        C17355 c17355 = this.f52490;
        C1122 c1122 = (C1122) c17355.m17326();
        C22824 c22824 = c17355.f56482;
        int iM51467 = c22824.m51467();
        int iM39802 = EnumC16856.m39802(i, EnumC16856.f54352, EnumC16856.f54382);
        EnumC16856[] enumC16856Arr2 = EnumC16856.f54362;
        if (!EnumC16856.m39794(iM39802, enumC16856Arr2)) {
            c1122.mo4166(j, "Invalid modifier(s) for a method {0}", EnumC16856.m39803((~EnumC16856.m39773(enumC16856Arr2)) & iM39802, EnumC19840.METHOD));
        }
        EnumC16856 enumC16856 = EnumC16856.f54367;
        EnumC16856 enumC16857 = EnumC16856.f54378;
        EnumC16856 enumC16858 = EnumC16856.f54371;
        if (EnumC16856.m39791(iM39802, enumC16856, enumC16857, enumC16858)) {
            c = 3;
        } else {
            c = 3;
            c1122.mo4166(j, "Each method of a class may have at most one of its ACC_PUBLIC, ACC_PRIVATE, and ACC_PROTECTED flags set {0}", EnumC16856.m39803(iM39802, EnumC19840.METHOD));
        }
        if (zEquals) {
            if (c22824.m51467() > 51 && !EnumC16856.m39809(iM39802)) {
                c1122.mo4166(j, "In a class file whose version number is 51.0 or above, a method whose name is <clinit> must have its ACC_STATIC flag set {0}", EnumC16856.m39803(iM39802, EnumC19840.METHOD));
            }
        } else if (EnumC16856.m39788(c17355.f20372)) {
            if (z) {
                c1122.mo4166(j, "<init> method cannot be an interface method", new Object[0]);
            } else {
                int iM51468 = c22824.m51467();
                C1122 c1123 = (C1122) c17355.m17326();
                EnumC16856[] enumC16856Arr3 = new EnumC16856[4];
                enumC16856Arr3[0] = enumC16858;
                enumC16856Arr3[1] = EnumC16856.f54345;
                enumC16856Arr3[2] = EnumC16856.f54373;
                enumC16856Arr3[c] = EnumC16856.f54381;
                if (EnumC16856.m39780(iM39802, enumC16856Arr3)) {
                    c1123.mo4166(j, "Methods of interfaces  must not have ACC_PROTECTED, ACC_FINAL, ACC_SYNCHRONIZED and ACC_NATIVE flags set {0}", EnumC16856.m39803(iM39802, EnumC19840.METHOD));
                }
                if (iM51468 < 52) {
                    if (!EnumC16856.m39779(iM39802, enumC16856, EnumC16856.f54376)) {
                        c1123.mo4166(j, "In a class file whose version number is less than 52.0, each method of interface must be abstract public only {0}", EnumC16856.m39803(iM39802, EnumC19840.METHOD));
                    } else if (!EnumC16856.m39791(iM39802, enumC16856, enumC16857)) {
                        c1123.mo4166(j, "In a class file whose version number is 52.0 or above, each method of an interface must have exactly one of its ACC_PUBLIC and ACC_PRIVATE flags set {0}", EnumC16856.m39803(iM39802, EnumC19840.METHOD));
                    }
                }
            }
        } else if (z) {
            EnumC16856[] enumC16856Arr4 = EnumC16856.f54341;
            if (((~EnumC16856.m39773(enumC16856Arr4)) & iM39802) != 0) {
                c1122.mo4166(j, "Invalid modifier(s) for <init> method {0}", EnumC16856.m39803((~EnumC16856.m39773(enumC16856Arr4)) & iM39802, EnumC19840.METHOD));
            } else if (EnumC16856.m39804(iM39802)) {
                enumC16856Arr = EnumC16856.f54370;
                if (((~EnumC16856.m39773(enumC16856Arr)) & iM39802) == 0) {
                    c1122.mo4166(j, "Invalid modifier(s) for abstract method {0}", EnumC16856.m39803((~EnumC16856.m39773(enumC16856Arr)) & iM39802, EnumC19840.METHOD));
                } else if (EnumC16856.m39792(iM39802) && iM51467 >= 46 && iM51467 <= 60) {
                    c1122.mo4166(j, "If a method of a class or interface (whose major version number is at least 46 and at most 60) has its ACC_ABSTRACT flag set, it must not have its ACC_STRICT flag set", new Object[0]);
                }
            }
        } else if (EnumC16856.m39804(iM39802)) {
            enumC16856Arr = EnumC16856.f54370;
            if (((~EnumC16856.m39773(enumC16856Arr)) & iM39802) == 0) {
                c1122.mo4166(j, "Invalid modifier(s) for abstract method {0}", EnumC16856.m39803((~EnumC16856.m39773(enumC16856Arr)) & iM39802, EnumC19840.METHOD));
            } else if (EnumC16856.m39792(iM39802)) {
                c1122.mo4166(j, "If a method of a class or interface (whose major version number is at least 46 and at most 60) has its ACC_ABSTRACT flag set, it must not have its ACC_STRICT flag set", new Object[0]);
            }
        }
        this.f12427.m21679(EnumC5202.f18334);
        C7660 c7660M38397 = m38395();
        try {
            String str4 = (String) ((C10816) c7660M38397.f25232).f61224;
            int length = str4.length();
            String str5 = "\"({JavaTypeSignature})Result\" is missing.";
            if (length <= 0) {
                i4 = 0;
                i5 = 0;
                i6 = i4;
                i2 = i5;
                str2 = str5;
                c2 = 1;
                C1122 c1124 = this.f12426;
                long j2 = this.f12427.f26450;
                Object[] objArr = new Object[2];
                objArr[0] = Integer.valueOf(i6 + 1);
                objArr[c2] = str2;
                c1124.mo4166(j2, "Malformed method signature at position {0}. {1}", objArr);
            } else if (str4.charAt(0) != '(') {
                str5 = "A \"(\" token is expected in \"({JavaTypeSignature})Result\"";
                i4 = 0;
                i5 = 0;
                i6 = i4;
                i2 = i5;
                str2 = str5;
                c2 = 1;
                C1122 c1125 = this.f12426;
                long j3 = this.f12427.f26450;
                Object[] objArr2 = new Object[2];
                objArr2[0] = Integer.valueOf(i6 + 1);
                objArr2[c2] = str2;
                c1125.mo4166(j3, "Malformed method signature at position {0}. {1}", objArr2);
            } else {
                i6 = 1;
                boolean z2 = false;
                i2 = 0;
                while (true) {
                    if (i6 < length) {
                        char cCharAt = str4.charAt(i6);
                        if (cCharAt != ')') {
                            if (cCharAt == 'F') {
                                i2++;
                                z2 = false;
                            } else if (cCharAt == 'L' || cCharAt == 'Q') {
                                while (true) {
                                    if (i6 >= length) {
                                        str5 = "ClassTypeSignature is not properly terminated: L{PackageSpecifier/}SimpleClassTypeSignature;";
                                    } else if (str4.charAt(i6) == ';') {
                                        i2++;
                                        z2 = false;
                                    } else {
                                        i6++;
                                    }
                                }
                            } else if (cCharAt == 'S' || cCharAt == 'I') {
                                i2++;
                                z2 = false;
                            } else if (cCharAt == 'J') {
                                i7 = i2 + 1;
                                if (z2) {
                                    i2 = i7;
                                    z2 = false;
                                } else {
                                    i2 += 2;
                                }
                            } else {
                                if (cCharAt != 'Z') {
                                    if (cCharAt != '[') {
                                        switch (cCharAt) {
                                            case 'B':
                                            case 'C':
                                                break;
                                            case 'D':
                                                i7 = i2 + 1;
                                                if (z2) {
                                                    i2 = i7;
                                                    z2 = false;
                                                } else {
                                                    i2 += 2;
                                                }
                                                break;
                                            default:
                                                str5 = "Unknown token \"" + str4.charAt(i6) + "\" in \"({JavaTypeSignature})Result\"";
                                                break;
                                        }
                                    } else {
                                        z2 = true;
                                    }
                                }
                                i2++;
                                z2 = false;
                            }
                            i6++;
                        } else {
                            c2 = 1;
                            if (z2) {
                                str2 = "An array type signature is expected: \"[JavaTypeSignature\"";
                                C1122 c1126 = this.f12426;
                                long j4 = this.f12427.f26450;
                                Object[] objArr3 = new Object[2];
                                objArr3[0] = Integer.valueOf(i6 + 1);
                                objArr3[c2] = str2;
                                c1126.mo4166(j4, "Malformed method signature at position {0}. {1}", objArr3);
                            }
                        }
                    }
                    i4 = i6;
                    i5 = i2;
                    i6 = i4;
                    i2 = i5;
                    str2 = str5;
                    c2 = 1;
                    C1122 c1127 = this.f12426;
                    long j5 = this.f12427.f26450;
                    Object[] objArr4 = new Object[2];
                    objArr4[0] = Integer.valueOf(i6 + 1);
                    objArr4[c2] = str2;
                    c1127.mo4166(j5, "Malformed method signature at position {0}. {1}", objArr4);
                }
            }
        } catch (ClassCastException | NullPointerException unused) {
            i2 = 0;
        }
        if (!EnumC16856.m39809(i) && !zEquals) {
            i2++;
        }
        if (i2 > 255) {
            this.f12426.mo4166(this.f12427.f26464, "Number of parameters too large ({0}>255)", Integer.toString(i2));
        }
        C25340 c25340M40760 = this.f52490.m40760(i, c7660M38396, c7660M38397);
        c25340M40760.m17323(this.f52492);
        C17355 c17356 = c25340M40760.f81813;
        C7965 c7965 = this.f12427;
        if (c7965.f26465 == EnumC5202.f18334) {
            c7965.m21671();
            if (!this.f12427.m21675(EnumC5202.f18285, EnumC5202.f18168, EnumC5202.f18252)) {
                throw C10185.m26296(this.f12426, this.f12427.f26464, "Either name or Constant Pool index expected, got {0}", new Object[]{C7376.m20248(this.f12427.f26465, new StringBuilder("\""), "\"")});
            }
            c25340M40760.m17324(m38395());
        }
        boolean z3 = this.f12427.f26465 == EnumC5202.f18144;
        boolean z4 = false;
        boolean z5 = true;
        do {
            int i8 = C11693.f37858[this.f12427.f26465.ordinal()];
            str = "\"{0}\" token is expected";
            c17792 = this.f52497;
            EnumC3185 enumC3185 = null;
            switch (i8) {
                case 27:
                    if (c25340M40760.f81816 != null) {
                        this.f12426.mo4166(this.f12427.f26464, "The {0} attribute repeated in the method_info structure", EnumC13127.f41949.m32610());
                    }
                    this.f12427.m21671();
                    ArrayList arrayList2 = new ArrayList();
                    while (true) {
                        arrayList2.add(this.f52484.m48929(EnumC3185.f10346, enumC3185, false));
                        C7965 c7966 = this.f12427;
                        EnumC5202 enumC5203 = c7966.f26465;
                        enumC5202 = EnumC5202.f18144;
                        if (enumC5203 != enumC5202 && enumC5203 == EnumC5202.f18309) {
                            enumC3185 = null;
                            c7966.m21671();
                        }
                    }
                    c25340M40760.getClass();
                    if (!arrayList2.isEmpty()) {
                        C23497 c23497 = c25340M40760.f81816;
                        if (c23497 == null) {
                            c25340M40760.f81816 = new C23497(c25340M40760.f81813.f20376, EnumC13127.f41949, arrayList2);
                        } else {
                            c23497.addAll(arrayList2);
                        }
                    }
                    C7965 c7967 = this.f12427;
                    if (c7967.f26465 != enumC5202) {
                        if (c7967.m21675(EnumC5202.f18202, EnumC5202.f18335, EnumC5202.f18213)) {
                        }
                        z4 = false;
                    } else {
                        c7967.m21671();
                    }
                    z5 = false;
                    z4 = false;
                    break;
                case 28:
                    if (c25340M40760.f81812 != null) {
                        this.f12426.m4162(this.f12427.f26464, "The {0} attribute repeated in the method_info structure", EnumC13127.f41968.m32610());
                        throw null;
                    }
                    c25340M40760.f81812 = c17792.m41647();
                    C7965 c7968 = this.f12427;
                    if (c7968.f26465 == EnumC5202.f18144) {
                        z3 = true;
                        z5 = false;
                    } else if (!c7968.m21675(EnumC5202.f18151, EnumC5202.f18313)) {
                    }
                    this.f12427.m21671();
                    break;
                    break;
                case 29:
                    this.f12427.m21671();
                    if (c25340M40760.f20373 != null) {
                        this.f12426.mo4166(this.f12427.f26464, "The {0} attribute repeated in the method_info structure", EnumC13127.f41976.m32610());
                    }
                    c25340M40760.m17324(m38395());
                    z4 = false;
                    break;
                case 30:
                    this.f12427.m21671();
                    z5 = false;
                    break;
                case 31:
                    this.f12427.m21671();
                    z4 = true;
                    break;
                default:
                    if (z4) {
                        ArrayList<EnumC5202> arrayList3 = new ArrayList();
                        if (c25340M40760.f81812 == null) {
                            arrayList3.add(EnumC5202.f18171);
                        }
                        if (c25340M40760.f81816 == null) {
                            arrayList3.add(EnumC5202.f18313);
                        }
                        if (c25340M40760.f20373 == null) {
                            arrayList3.add(EnumC5202.f18151);
                        }
                        if (arrayList3.size() == 1) {
                            this.f12426.m4162(this.f12427.f26450, "\"{0}\" token is expected", ((EnumC5202) arrayList3.get(0)).m15637());
                            throw null;
                        }
                        C1122 c1128 = this.f12426;
                        long j6 = this.f12427.f26450;
                        StringBuilder sb = new StringBuilder("");
                        for (EnumC5202 enumC5204 : arrayList3) {
                            if (sb.length() > 0) {
                                sb.append(", ");
                            }
                            sb.append('\'');
                            sb.append(enumC5204.m15637());
                            sb.append('\'');
                        }
                        c1128.m4162(j6, "One of {0} tokens is expected", sb.toString());
                        throw null;
                    }
                    z5 = false;
                    break;
            }
        } while (z5);
        if (!z3) {
            C21259 c212510 = null;
            C21259 c21259M38388 = null;
            while (true) {
                C7965 c7969 = this.f12427;
                if (c7969.f26465 == EnumC5202.f18202) {
                    c7969.m21671();
                    i3 = 2;
                    c21259M38387 = m38387(2);
                } else {
                    c21259M38387 = c212510;
                    i3 = 2;
                }
                C7965 c79610 = this.f12427;
                if (c79610.f26465 == EnumC5202.f18335) {
                    c79610.m21671();
                    c21259M38388 = m38387(i3);
                }
                if (this.f12427.f26465 == EnumC5202.f18162) {
                    c17792.f12427.m21672(C14442.m34864(i2, " - - - > [ParserAnnotation.parseParamAnnots]: Begin, totalParams =  ", " "));
                    TreeMap treeMap2 = new TreeMap();
                    while (true) {
                        C7965 c79611 = c17792.f12427;
                        if (c79611.f26465 == EnumC5202.f18162) {
                            int i9 = c79611.f26459;
                            Integer numValueOf = Integer.valueOf(i9);
                            if (i9 < 0 || i9 >= i2) {
                                c17792.f12426.mo4159(c17792.f12427.f26464, "Invalid Parameter Number: {0}", Integer.valueOf(i9));
                            }
                            if (treeMap2.get(numValueOf) != null) {
                                c17792.f12426.mo4159(c17792.f12427.f26464, "Duplicate Parameter Number: {0}", Integer.valueOf(i9));
                            }
                            c17792.f12427.m21671();
                            c17792.f12427.m21679(EnumC5202.f18334);
                            C7965 c79612 = c17792.f12427;
                            if (c79612.f26465 == EnumC5202.f18308) {
                                c79612.m21672(" - - - > [ParserAnnotation.scanParamName]: Begin ");
                                c17792.f12427.m21671();
                                c17792.f12427.m21679(EnumC5202.f18213);
                                EnumC5202 enumC5205 = c17792.f12427.f26465;
                                if (enumC5205 == EnumC5202.f18168 || enumC5205.m15644()) {
                                    c7660M38395 = c17792.f12428.m38395();
                                } else {
                                    C7965 c79613 = c17792.f12427;
                                    if (c79613.f26465 != EnumC5202.f18285) {
                                        throw C10185.m26296(c17792.f12426, c79613.f26464, "Incorrect ParamName, unrecognized token: \"{0}\"", new Object[]{c79613.f26453});
                                    }
                                    int i10 = c79613.f26459;
                                    c7660M38395 = c17792.f12428.f52487.m36703(i10);
                                    if (!(c7660M38395.f25232 instanceof C10816)) {
                                        throw C10185.m26296(c17792.f12426, c17792.f12427.f26464, "ParameterName CPX at {0} is not a ConstantString", new Object[]{Integer.valueOf(i10)});
                                    }
                                }
                                int iM38392 = c17792.f12428.m38392();
                                c17792.f12427.m21679(EnumC5202.f18314);
                                C1122 c1129 = (C1122) c25340M40760.m17326();
                                StringBuilder sbM12235 = C3769.m12235(i9, "addMethodParameter Param[", "] (name: ");
                                sbM12235.append(c7660M38395.toString());
                                sbM12235.append(", Flags (");
                                sbM12235.append(iM38392);
                                sbM12235.append(").");
                                int i11 = 0;
                                c1129.m32315(sbM12235.toString(), new Object[0]);
                                if (c25340M40760.f81809 == null) {
                                    c25340M40760.f81809 = new C23497(c17356.f20376, EnumC13127.f41963, 0);
                                    int i12 = 0;
                                    while (i12 < i2) {
                                        c25340M40760.f81809.m52689(new C11913(i11, null));
                                        i12++;
                                        i11 = 0;
                                        c21259M38388 = c21259M38388;
                                    }
                                }
                                c21259 = c21259M38388;
                                c25340M40760.f81809.m52687(i9, new C11913(iM38392, c7660M38395));
                                c17792.f12427.m21672(" - - - > [ParserAnnotation.scanParamName]: End ");
                            } else {
                                c21259 = c21259M38388;
                            }
                            if (c17792.f12427.f26465 == EnumC5202.f18198) {
                                ArrayList<C12381> arrayListM41646 = c17792.m41646();
                                treeMap2.put(numValueOf, arrayListM41646);
                                for (C12381 c12381 : arrayListM41646) {
                                    if (c12381.f39752) {
                                        if (c25340M40760.f81811 == null) {
                                            c25340M40760.f81811 = new C2219(c17356.f20376, EnumC13127.f41975, i2);
                                        }
                                        treeMap = c25340M40760.f81811.f7278;
                                        arrayList = (ArrayList) treeMap.get(Integer.valueOf(i9));
                                        if (arrayList == null) {
                                            arrayList = new ArrayList();
                                            treeMap.put(Integer.valueOf(i9), arrayList);
                                        }
                                    } else {
                                        if (c25340M40760.f81810 == null) {
                                            c25340M40760.f81810 = new C2219(c17356.f20376, EnumC13127.f41959, i2);
                                        }
                                        treeMap = c25340M40760.f81810.f7278;
                                        arrayList = (ArrayList) treeMap.get(Integer.valueOf(i9));
                                        if (arrayList == null) {
                                            arrayList = new ArrayList();
                                            treeMap.put(Integer.valueOf(i9), arrayList);
                                        }
                                    }
                                    arrayList.add(c12381);
                                }
                            }
                            str = str;
                            c21259M38388 = c21259;
                        }
                    }
                }
                C21259 c212511 = c21259M38388;
                String str6 = str;
                if (this.f12427.f26465.m15640(EnumC5202.f18202, EnumC5202.f18335, EnumC5202.f18162)) {
                    c21259M38388 = c212511;
                    c212510 = c21259M38387;
                    str = str6;
                } else if (this.f12427.f26465 == EnumC5202.f18144) {
                    if (c21259M38387 != null || c212511 != null) {
                        this.f12426.mo4160(str6, EnumC5202.f18213.m15637());
                    }
                    this.f12427.m21671();
                } else if (EnumC16856.m39804(i)) {
                    C7965 c79614 = this.f12427;
                    if (c79614.f26465 == EnumC5202.f18213) {
                        c79614.m21671();
                        C0202 c0202 = new C0202(c25340M40760, i2, c21259M38387, c212511);
                        c25340M40760.f81814 = c0202;
                        this.f52488 = c0202;
                        m38371();
                        this.f52488.m1602();
                        this.f12427.m21679(EnumC5202.f18314);
                    }
                } else {
                    this.f12427.m21679(EnumC5202.f18213);
                    C0202 c0203 = new C0202(c25340M40760, i2, c21259M38387, c212511);
                    c25340M40760.f81814 = c0203;
                    this.f52488 = c0203;
                    m38371();
                    this.f52488.m1602();
                    this.f12427.m21679(EnumC5202.f18314);
                }
            }
        }
        this.f52490.f56473 = null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:194:0x0480  */
    /* JADX WARN: Code duplicated, block: B:197:0x048f  */
    /* JADX WARN: Code duplicated, block: B:200:0x049e  */
    /* JADX WARN: Code duplicated, block: B:301:0x0753  */
    /* JADX WARN: Code duplicated, block: B:304:0x0762  */
    /* JADX WARN: Code duplicated, block: B:307:0x0771  */
    /* JADX WARN: Code duplicated, block: B:338:0x0849  */
    /* JADX WARN: Code duplicated, block: B:341:0x0858  */
    /* JADX WARN: Code duplicated, block: B:344:0x0867  */
    /* JADX WARN: Code duplicated, block: B:401:0x04c3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:414:0x0796 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:418:0x088c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:459:0x04da A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:460:0x0493 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:462:0x04d6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:463:0x04c0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:466:0x0487 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:467:0x0766 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:469:0x07ae A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:470:0x07b2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:471:0x0793 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:474:0x075a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:475:0x08a8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:476:0x085c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:478:0x08a4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:479:0x0889 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:482:0x0850 A[SYNTHETIC] */
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m38371() {
        EnumC5202 enumC5202;
        C7965 c7965;
        EnumC5202 enumC5203;
        C23760 c23760;
        char c;
        C7965 c7966;
        EnumC5202 enumC5204;
        EnumC5202 enumC5205;
        C7965 c7967;
        EnumC5202 enumC5206;
        C7965 c7968;
        EnumC5202 enumC5207;
        EnumC5202 enumC5208;
        C7965 c7969;
        EnumC5202 enumC5209;
        C7965 c79610;
        EnumC5202 enumC52010;
        EnumC5202 enumC52011;
        C7965 c79611;
        EnumC5202 enumC52012;
        while (true) {
            while (true) {
                EnumC5202 enumC52013 = this.f12427.f26465;
                if (enumC52013 == EnumC5202.f18303 || enumC52013 == (enumC5202 = EnumC5202.f18314)) {
                    return;
                }
                this.f52494.m2808();
                c7965 = this.f12427;
                enumC5203 = c7965.f26465;
                if (enumC5203 == enumC5202) {
                    return;
                }
                EnumC5202 enumC52014 = EnumC5202.f18329;
                c23760 = this.f52495;
                if (enumC5203 == enumC52014) {
                    C0202 c0202 = this.f52488;
                    c23760.getClass();
                    ArrayList arrayList = new ArrayList();
                    c23760.f12427.m21671();
                    C7965 c79612 = c23760.f12427;
                    if (c79612.f26465 == EnumC5202.f18334) {
                        c79612.m21671();
                    }
                    int i = -1;
                    boolean z = true;
                    boolean z2 = false;
                    while (true) {
                        EnumC5202 enumC52015 = c23760.f12427.f26465;
                        if (enumC52015 != EnumC5202.f18303 && enumC52015 != EnumC5202.f18314) {
                            int i2 = C16300.f52915[enumC52015.ordinal()];
                            if (i2 != 7) {
                                if (i2 == 20) {
                                    if (z) {
                                        c23760.f12426.m4162(c23760.f12427.f26464, "The LineNumberTable format is incorrect; \"{0}\" is expected", "line keyword");
                                        throw null;
                                    }
                                    if (i == -1) {
                                        c23760.f12426.m4162(c23760.f12427.f26464, "The LineNumberTable format is incorrect; \"{0}\" is expected", "line_number:");
                                        throw null;
                                    }
                                    if (z2) {
                                        c23760.f12426.m4162(c23760.f12427.f26464, "The LineNumberTable format is incorrect; \"{0}\" is expected", "start_pc");
                                        throw null;
                                    }
                                    z2 = true;
                                } else if (i2 == 21) {
                                    if (!z) {
                                        c23760.f12426.m4162(c23760.f12427.f26464, "The LineNumberTable format is incorrect; \"{0}\" is expected", "line  line_number:  start_pc");
                                        throw null;
                                    }
                                    z = false;
                                } else if (i != -1 || !z) {
                                    c23760.f12426.m4162(c23760.f12427.f26464, "The LineNumberTable format is incorrect; \"{0}\" is expected", "line  line_number:  start_pc");
                                    throw null;
                                }
                            } else if (i == -1) {
                                i = c23760.f12427.f26459;
                            } else {
                                arrayList.add(new C23102(c23760.f12427.f26459, i));
                                i = -1;
                                z = true;
                                z2 = false;
                            }
                            c23760.f12427.m21671();
                        }
                    }
                    C23497 c23497 = c0202.f1346;
                    if (c23497 != null) {
                        c23497.clear();
                    } else {
                        C23497 c23498 = new C23497(c0202.f1355.f20376, EnumC13127.f41946);
                        c0202.f1346 = c23498;
                        c0202.f1356.m29081(c23498);
                    }
                    c0202.f1346.addAll(arrayList);
                } else if (enumC5203 == EnumC5202.f18274) {
                    this.f52488.m1598(c23760.m53044(false), false);
                } else if (enumC5203 == EnumC5202.f18255) {
                    this.f52488.m1598(c23760.m53044(true), true);
                } else if (enumC5203 == EnumC5202.f18198) {
                    C0202 c0203 = this.f52488;
                    ArrayList<C12381> arrayListM41646 = this.f52497.m41646();
                    C25340 c25340 = c0203.f1355;
                    for (C12381 c12381 : arrayListM41646) {
                        boolean z3 = c12381.f39752;
                        if (c12381 instanceof C22817) {
                            C22817 c22817 = (C22817) c12381;
                            if (z3) {
                                if (c0203.f1341 == null) {
                                    c0203.f1341 = new C23497(c25340.f20376, EnumC13127.f41944);
                                }
                                c0203.f1341.m52689(c22817);
                            } else {
                                if (c0203.f1352 == null) {
                                    c0203.f1352 = new C23497(c25340.f20376, EnumC13127.f41948);
                                }
                                c0203.f1352.m52689(c22817);
                            }
                        }
                    }
                }
            }
            if (enumC5203 == EnumC5202.f18326) {
                C0202 c0204 = this.f52488;
                C7965 c79613 = c23760.f12427;
                if (c79613.f26465 == EnumC5202.f18334) {
                    c79613.m21671();
                }
                ArrayList arrayList2 = new ArrayList();
                EnumC16110 enumC16110 = EnumC16110.UNKNOWN_TYPE;
                C13930 c13930 = null;
                while (true) {
                    EnumC5202 enumC52016 = c23760.f12427.f26465;
                    if (enumC52016 != EnumC5202.f18303 && enumC52016 != EnumC5202.f18314) {
                        switch (C16300.f52915[enumC52016.ordinal()]) {
                            case 10:
                                c23760.f12427.m21671();
                                c23760.f12427.m21679(EnumC5202.f18167);
                                C7965 c79614 = c23760.f12427;
                                if (c79614.f26465 != EnumC5202.f18162) {
                                    c23760.f12426.m4162(c79614.f26464, "{0} is expected", "\"number of entries\"");
                                    throw null;
                                }
                                c23760.f12427.m21671();
                                break;
                            case 11:
                                if (c13930 != null) {
                                    arrayList2.add(c13930);
                                }
                                c23760.f12427.m21671();
                                c23760.f12427.m21679(EnumC5202.f18167);
                                C7965 c79615 = c23760.f12427;
                                if (c79615.f26465 != EnumC5202.f18162) {
                                    c23760.f12426.m4162(c79615.f26464, "{0} is expected", "The offset value");
                                    throw null;
                                }
                                c13930 = new C13930(c23760.f12426, false);
                                c13930.m33921(c23760.f12427.f26459);
                                c23760.f12427.m21671();
                                break;
                                break;
                            case 12:
                                if (c13930 == null) {
                                    c23760.f12426.m4162(c23760.f12427.f26464, "{0} is expected", C14442.m34865("\"", EnumC5202.f18148.m15637(), "\""));
                                    throw null;
                                }
                                C11562 c11562 = c13930.f44163;
                                if (c11562 != null && c11562.f36349.size() > 0) {
                                    c23760.f12426.mo4166(c23760.f12427.f26464, "The {0} overwrites an already declared one.", C14442.m34865("\"", EnumC5202.f18310.m15637(), "\""));
                                }
                                c23760.f12427.m21671();
                                c23760.f12427.m21679(EnumC5202.f18167);
                                C7965 c79616 = c23760.f12427;
                                if (c79616.f26465 == EnumC5202.f18168) {
                                    if (c79616.f26453.equals(EnumC5202.f18286.m15637() + EnumC5202.f18296.m15637())) {
                                        c13930.f44163 = new C11562();
                                        c23760.f12427.m21671();
                                    }
                                }
                                c23760.f12427.m21677(EnumC5202.f18286);
                                C11562 c11563 = new C11562();
                                c13930.f44163 = c11563;
                                while (true) {
                                    C7965 c79617 = c23760.f12427;
                                    EnumC5202 enumC52017 = c79617.f26465;
                                    if (enumC52017 == EnumC5202.f18303) {
                                    }
                                    EnumC5202 enumC52018 = EnumC5202.f18144;
                                    if (enumC52017 == enumC52018) {
                                        c79617.m21671();
                                        c23760.f12427.m21677(EnumC5202.f18296);
                                    }
                                    if (enumC52017 == EnumC5202.f18168 && c79617.f26453.equals(EnumC5202.f18296.m15637())) {
                                    }
                                    c23760.f12428.m38389(c11563);
                                    C7965 c79618 = c23760.f12427;
                                    EnumC5202 enumC52019 = c79618.f26465;
                                    if (enumC52019 == EnumC5202.f18309) {
                                        c79618.m21671();
                                    } else if (enumC52019 != enumC52018) {
                                        c23760.f12426.m4162(c79618.f26464, "\"{0}\" token is expected", C7376.m20248(enumC52018, new StringBuilder("\""), "\""));
                                        throw null;
                                    }
                                    break;
                                    break;
                                    break;
                                }
                                break;
                                break;
                            case 13:
                                if (c13930 == null) {
                                    c23760.f12426.m4162(c23760.f12427.f26464, "{0} is expected", C14442.m34865("\"", EnumC5202.f18148.m15637(), "\""));
                                    throw null;
                                }
                                C11562 c11564 = c13930.f44164;
                                if (c11564 == null || c11564.f36349.size() <= 0) {
                                    c = 0;
                                } else {
                                    c = 0;
                                    c23760.f12426.mo4166(c23760.f12427.f26464, "The {0} overwrites an already declared one.", C14442.m34865("\"", EnumC5202.f18260.m15637(), "\""));
                                }
                                c23760.f12427.m21671();
                                c23760.f12427.m21679(EnumC5202.f18167);
                                C7965 c79619 = c23760.f12427;
                                if (c79619.f26465 == EnumC5202.f18168) {
                                    if (c79619.f26453.equals(EnumC5202.f18286.m15637() + EnumC5202.f18296.m15637())) {
                                        c13930.f44164 = new C11562();
                                        c23760.f12427.m21671();
                                    }
                                }
                                c23760.f12427.m21677(EnumC5202.f18286);
                                C11562 c11565 = new C11562();
                                c13930.f44164 = c11565;
                                while (true) {
                                    C7965 c79620 = c23760.f12427;
                                    EnumC5202 enumC52020 = c79620.f26465;
                                    if (enumC52020 == EnumC5202.f18303) {
                                    }
                                    EnumC5202 enumC52021 = EnumC5202.f18144;
                                    if (enumC52020 == enumC52021) {
                                        c79620.m21671();
                                        c23760.f12427.m21677(EnumC5202.f18296);
                                    }
                                    if (enumC52020 == EnumC5202.f18168 && c79620.f26453.equals(EnumC5202.f18296.m15637())) {
                                    }
                                    c23760.f12428.m38389(c11565);
                                    C7965 c79621 = c23760.f12427;
                                    EnumC5202 enumC52022 = c79621.f26465;
                                    if (enumC52022 == EnumC5202.f18309) {
                                        c79621.m21671();
                                    } else if (enumC52022 != enumC52021) {
                                        C1122 c1122 = c23760.f12426;
                                        long j = c79621.f26464;
                                        Object[] objArr = new Object[1];
                                        objArr[c] = C7376.m20248(enumC52021, new StringBuilder("\""), "\"");
                                        c1122.m4162(j, "\"{0}\" token is expected", objArr);
                                        throw null;
                                    }
                                    break;
                                    break;
                                    break;
                                }
                                break;
                                break;
                            default:
                                c23760.f12427.m21671();
                                break;
                        }
                    }
                }
                if (c13930 != null) {
                    arrayList2.add(c13930);
                }
                c0204.m1597(arrayList2);
            } else if (enumC5203 == EnumC5202.f18182) {
                C0202 c0205 = this.f52488;
                c23760.getClass();
                ArrayList arrayList3 = new ArrayList();
                EnumC16110 enumC16111 = EnumC16110.UNKNOWN_TYPE;
                c23760.f12427.m21671();
                C7965 c79622 = c23760.f12427;
                if (c79622.f26465 == EnumC5202.f18334) {
                    c79622.m21671();
                }
                EnumC16110 enumC16110M38271 = enumC16111;
                C13930 c13931 = null;
                int i3 = -1;
                int i4 = 1;
                int i5 = 0;
                while (true) {
                    EnumC5202 enumC52023 = c23760.f12427.f26465;
                    if (enumC52023 != EnumC5202.f18303) {
                        switch (C16300.f52915[enumC52023.ordinal()]) {
                            case 10:
                                c23760.f12427.m21671();
                                c23760.f12427.m21679(EnumC5202.f18167);
                                C7965 c79623 = c23760.f12427;
                                if (c79623.f26465 != EnumC5202.f18162) {
                                    c23760.f12426.m4162(c79623.f26464, "{0} is expected", "\"number of entries\"");
                                    throw null;
                                }
                                c23760.f12427.m21671();
                                i4 = 1;
                                break;
                            case 11:
                            default:
                                c23760.f12427.m21671();
                                i4 = 1;
                                break;
                            case 12:
                                if (c13931 == null || c13931.m33920() == EnumC16110.SAME_FRAME) {
                                    if (i5 > 0) {
                                        c23760.f12426.m4162(c23760.f12427.f26464, "\"{0}\" token is expected", EnumC5202.f18314.m15637());
                                        throw null;
                                    }
                                    c23760.f12426.m4162(c23760.f12427.f26464, "{0} is expected", C14442.m34865("\"", EnumC5202.f18282.m15637(), "\""));
                                    throw null;
                                }
                                EnumC5202 enumC5202M33912 = c13931.m33912();
                                if (enumC5202M33912 != EnumC5202.f18310) {
                                    c23760.f12426.m4162(c23760.f12427.f26464, "{0} is expected", C14442.m34865("\"", enumC5202M33912.m15637(), "\""));
                                    throw null;
                                }
                                c23760.f12427.m21671();
                                c23760.f12427.m21679(EnumC5202.f18167);
                                c13931.f44163 = new C11562();
                                C7965 c79624 = c23760.f12427;
                                if (c79624.f26465 == EnumC5202.f18168) {
                                    if (c79624.f26453.equals(EnumC5202.f18286.m15637() + EnumC5202.f18296.m15637())) {
                                        c23760.f12427.m21671();
                                    } else {
                                        c23760.f12427.m21677(EnumC5202.f18286);
                                        while (true) {
                                            c7966 = c23760.f12427;
                                            enumC5204 = c7966.f26465;
                                            if (enumC5204 == EnumC5202.f18303) {
                                                enumC5205 = EnumC5202.f18144;
                                                if (enumC5204 == enumC5205) {
                                                    c7966.m21671();
                                                    c23760.f12427.m21677(EnumC5202.f18296);
                                                } else if (enumC5204 == EnumC5202.f18168 || !c7966.f26453.equals(EnumC5202.f18296.m15637())) {
                                                    c23760.f12428.m38389(c13931.f44163);
                                                    c7967 = c23760.f12427;
                                                    enumC5206 = c7967.f26465;
                                                    if (enumC5206 != EnumC5202.f18309) {
                                                        c7967.m21671();
                                                    } else if (enumC5206 == enumC5205) {
                                                        c23760.f12426.m4162(c7967.f26464, "\"{0}\" token is expected", C7376.m20248(enumC5205, new StringBuilder("\""), "\""));
                                                        throw null;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    c23760.f12427.m21677(EnumC5202.f18286);
                                    while (true) {
                                        c7966 = c23760.f12427;
                                        enumC5204 = c7966.f26465;
                                        if (enumC5204 == EnumC5202.f18303) {
                                            enumC5205 = EnumC5202.f18144;
                                            if (enumC5204 == enumC5205) {
                                                c7966.m21671();
                                                c23760.f12427.m21677(EnumC5202.f18296);
                                            } else {
                                                if (enumC5204 == EnumC5202.f18168) {
                                                }
                                                c23760.f12428.m38389(c13931.f44163);
                                                c7967 = c23760.f12427;
                                                enumC5206 = c7967.f26465;
                                                if (enumC5206 != EnumC5202.f18309) {
                                                    c7967.m21671();
                                                } else if (enumC5206 == enumC5205) {
                                                    c23760.f12426.m4162(c7967.f26464, "\"{0}\" token is expected", C7376.m20248(enumC5205, new StringBuilder("\""), "\""));
                                                    throw null;
                                                }
                                            }
                                        }
                                    }
                                }
                                if (c13931.m33912() == null) {
                                    arrayList3.add(c13931);
                                    i4 = 1;
                                    c13931 = null;
                                }
                                i4 = 1;
                                break;
                                break;
                            case 13:
                                if (c13931 == null || c13931.m33920() == EnumC16110.SAME_FRAME) {
                                    if (i5 > 0) {
                                        c23760.f12426.m4162(c23760.f12427.f26464, "\"{0}\" token is expected", EnumC5202.f18314.m15637());
                                        throw null;
                                    }
                                    c23760.f12426.m4162(c23760.f12427.f26464, "{0} is expected", C14442.m34865("\"", EnumC5202.f18282.m15637(), "\""));
                                    throw null;
                                }
                                EnumC5202 enumC5202M33913 = c13931.m33912();
                                if (enumC5202M33913 != EnumC5202.f18260 && (enumC5202M33913 != EnumC5202.f18310 || c13931.m33920() != EnumC16110.FULL_FRAME)) {
                                    c23760.f12426.m4162(c23760.f12427.f26464, "{0} is expected", C14442.m34865("\"", enumC5202M33913.m15637(), "\""));
                                    throw null;
                                }
                                c23760.f12427.m21671();
                                c23760.f12427.m21679(EnumC5202.f18167);
                                c13931.f44164 = new C11562();
                                C7965 c79625 = c23760.f12427;
                                if (c79625.f26465 == EnumC5202.f18168) {
                                    if (c79625.f26453.equals(EnumC5202.f18286.m15637() + EnumC5202.f18296.m15637())) {
                                        c23760.f12427.m21671();
                                    } else {
                                        c23760.f12427.m21677(EnumC5202.f18286);
                                        while (true) {
                                            c7968 = c23760.f12427;
                                            enumC5207 = c7968.f26465;
                                            if (enumC5207 == EnumC5202.f18303) {
                                                enumC5208 = EnumC5202.f18144;
                                                if (enumC5207 == enumC5208) {
                                                    c7968.m21671();
                                                    c23760.f12427.m21677(EnumC5202.f18296);
                                                } else if (enumC5207 == EnumC5202.f18168 || !c7968.f26453.equals(EnumC5202.f18296.m15637())) {
                                                    c23760.f12428.m38389(c13931.f44164);
                                                    c7969 = c23760.f12427;
                                                    enumC5209 = c7969.f26465;
                                                    if (enumC5209 != EnumC5202.f18309) {
                                                        c7969.m21671();
                                                    } else if (enumC5209 == enumC5208) {
                                                        c23760.f12426.m4162(c7969.f26464, "\"{0}\" token is expected", C7376.m20248(enumC5208, new StringBuilder("\""), "\""));
                                                        throw null;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    c23760.f12427.m21677(EnumC5202.f18286);
                                    while (true) {
                                        c7968 = c23760.f12427;
                                        enumC5207 = c7968.f26465;
                                        if (enumC5207 == EnumC5202.f18303) {
                                            enumC5208 = EnumC5202.f18144;
                                            if (enumC5207 == enumC5208) {
                                                c7968.m21671();
                                                c23760.f12427.m21677(EnumC5202.f18296);
                                            } else {
                                                if (enumC5207 == EnumC5202.f18168) {
                                                }
                                                c23760.f12428.m38389(c13931.f44164);
                                                c7969 = c23760.f12427;
                                                enumC5209 = c7969.f26465;
                                                if (enumC5209 != EnumC5202.f18309) {
                                                    c7969.m21671();
                                                } else if (enumC5209 == enumC5208) {
                                                    c23760.f12426.m4162(c7969.f26464, "\"{0}\" token is expected", C7376.m20248(enumC5208, new StringBuilder("\""), "\""));
                                                    throw null;
                                                }
                                            }
                                        }
                                    }
                                }
                                if (c13931.m33912() == null) {
                                    arrayList3.add(c13931);
                                    i4 = 1;
                                    c13931 = null;
                                }
                                i4 = 1;
                                break;
                                break;
                            case 14:
                                if (i5 == 0) {
                                    c23760.f12426.m4162(c23760.f12427.f26464, "early_larval_frame must be declared before the wrapped base_frame.", new Object[0]);
                                    throw null;
                                }
                                c23760.f12427.m21671();
                                i4 = 1;
                                break;
                            case 15:
                                if (i5 != 0) {
                                    i5--;
                                    c23760.f12427.m21671();
                                    i4 = 1;
                                }
                                break;
                            case 16:
                            case 17:
                                c23760.f12427.m21671();
                                c23760.f12427.m21679(EnumC5202.f18167);
                                C7965 c79626 = c23760.f12427;
                                if (c79626.f26465 == EnumC5202.f18162) {
                                    int i6 = c79626.f26459;
                                    i3 = i6;
                                    enumC16110M38271 = EnumC16110.m38271(i6);
                                }
                                if (enumC16110M38271 == EnumC16110.UNKNOWN_TYPE) {
                                    c23760.f12426.m4162(c23760.f12427.f26464, "{0} is expected", "An integer within the range of [0 to 255]");
                                    throw null;
                                }
                                if (enumC16110M38271 == EnumC16110.EARLY_LARVAL) {
                                    if (i5 > 2) {
                                        c23760.f12426.m4162(c23760.f12427.f26464, "base_frame is expected", new Object[0]);
                                        throw null;
                                    }
                                    i5++;
                                }
                                if (c13931 == null) {
                                    c13931 = new C13930(c23760.f12426, c23760.f12428.f52488.f1340.f56482.m51469());
                                } else {
                                    EnumC5202 enumC5202M33914 = c13931.m33912();
                                    if (enumC5202M33914 == null) {
                                        arrayList3.add(c13931);
                                        c13931 = new C13930(c23760.f12426, c23760.f12428.f52488.f1340.f56482.m51469());
                                    } else {
                                        if (enumC5202M33914 != EnumC5202.f18260 && c13931.m33920() != EnumC16110.FULL_FRAME) {
                                            c23760.f12426.m4162(c23760.f12427.f26464, "{0} is expected", C14442.m34865("\"", enumC5202M33914.m15637(), "\""));
                                            throw null;
                                        }
                                        c13931.f44164 = new C11562();
                                        arrayList3.add(c13931);
                                        c13931 = new C13930(c23760.f12426, c23760.f12428.f52488.f1340.f56482.m51469());
                                        c23760.f12426.mo4166(c23760.f12427.f26464, "{0} is expected", C14442.m34865("\"", enumC5202M33914.m15637(), "\""));
                                    }
                                }
                                c13931.m33917(i3);
                                if (c13931.m33912() == null) {
                                    arrayList3.add(c13931);
                                    c13931 = null;
                                }
                                i4 = 1;
                                break;
                                break;
                            case 18:
                                if (c13931 == null || c13931.m33920() == EnumC16110.SAME_FRAME) {
                                    if (i5 > 0) {
                                        c23760.f12426.m4162(c23760.f12427.f26464, "\"{0}\" token is expected", EnumC5202.f18314.m15637());
                                        throw null;
                                    }
                                    c23760.f12426.m4162(c23760.f12427.f26464, "{0} is expected", C14442.m34865("\"", EnumC5202.f18282.m15637(), "\""));
                                    throw null;
                                }
                                EnumC5202 enumC5202M33915 = c13931.m33912();
                                if (enumC5202M33915 != EnumC5202.f18262) {
                                    c23760.f12426.m4162(c23760.f12427.f26464, "{0} is expected", C14442.m34865("\"", enumC5202M33915.m15637(), "\""));
                                    throw null;
                                }
                                c23760.f12427.m21671();
                                c23760.f12427.m21679(EnumC5202.f18167);
                                C7965 c79627 = c23760.f12427;
                                if (c79627.f26465 != EnumC5202.f18162) {
                                    c23760.f12426.m4162(c79627.f26464, "{0} is expected", "The offset_delta value");
                                    throw null;
                                }
                                c13931.m33913(c79627.f26459);
                                if (c13931.m33912() == null) {
                                    arrayList3.add(c13931);
                                    c13931 = null;
                                }
                                c23760.f12427.m21671();
                                i4 = 1;
                                break;
                                break;
                            case 19:
                                if (c13931 == null || c13931.m33920() == EnumC16110.SAME_FRAME) {
                                    if (i5 > 0) {
                                        C1122 c1123 = c23760.f12426;
                                        long j2 = c23760.f12427.f26464;
                                        Object[] objArr2 = new Object[i4];
                                        objArr2[0] = EnumC5202.f18314.m15637();
                                        c1123.m4162(j2, "\"{0}\" token is expected", objArr2);
                                        throw null;
                                    }
                                    C1122 c1124 = c23760.f12426;
                                    long j3 = c23760.f12427.f26464;
                                    Object[] objArr3 = new Object[i4];
                                    objArr3[0] = C14442.m34865("\"", EnumC5202.f18282.m15637(), "\"");
                                    c1124.m4162(j3, "{0} is expected", objArr3);
                                    throw null;
                                }
                                EnumC5202 enumC5202M33916 = c13931.m33912();
                                if (enumC5202M33916 != EnumC5202.f18143) {
                                    c23760.f12426.m4162(c23760.f12427.f26464, "{0} is expected", C14442.m34865("\"", enumC5202M33916.m15637(), "\""));
                                    throw null;
                                }
                                c23760.f12427.m21671();
                                c23760.f12427.m21679(EnumC5202.f18167);
                                c13931.f44166 = new C11562();
                                C7965 c79628 = c23760.f12427;
                                if (c79628.f26465 == EnumC5202.f18168) {
                                    if (c79628.f26453.equals(EnumC5202.f18286.m15637() + EnumC5202.f18296.m15637())) {
                                        c23760.f12427.m21671();
                                    } else {
                                        c23760.f12427.m21677(EnumC5202.f18286);
                                        while (true) {
                                            c79610 = c23760.f12427;
                                            enumC52010 = c79610.f26465;
                                            if (enumC52010 == EnumC5202.f18303) {
                                                enumC52011 = EnumC5202.f18144;
                                                if (enumC52010 == enumC52011) {
                                                    c79610.m21671();
                                                    c23760.f12427.m21677(EnumC5202.f18296);
                                                } else if (enumC52010 == EnumC5202.f18168 || !c79610.f26453.equals(EnumC5202.f18296.m15637())) {
                                                    c23760.f12428.m38398(c13931.f44166);
                                                    c79611 = c23760.f12427;
                                                    enumC52012 = c79611.f26465;
                                                    if (enumC52012 != EnumC5202.f18309) {
                                                        c79611.m21671();
                                                    } else if (enumC52012 == enumC52011) {
                                                        c23760.f12426.m4162(c79611.f26464, "\"{0}\" token is expected", enumC52011.m15637());
                                                        throw null;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    c23760.f12427.m21677(EnumC5202.f18286);
                                    while (true) {
                                        c79610 = c23760.f12427;
                                        enumC52010 = c79610.f26465;
                                        if (enumC52010 == EnumC5202.f18303) {
                                            enumC52011 = EnumC5202.f18144;
                                            if (enumC52010 == enumC52011) {
                                                c79610.m21671();
                                                c23760.f12427.m21677(EnumC5202.f18296);
                                            } else {
                                                if (enumC52010 == EnumC5202.f18168) {
                                                }
                                                c23760.f12428.m38398(c13931.f44166);
                                                c79611 = c23760.f12427;
                                                enumC52012 = c79611.f26465;
                                                if (enumC52012 != EnumC5202.f18309) {
                                                    c79611.m21671();
                                                } else if (enumC52012 == enumC52011) {
                                                    c23760.f12426.m4162(c79611.f26464, "\"{0}\" token is expected", enumC52011.m15637());
                                                    throw null;
                                                }
                                            }
                                        }
                                    }
                                }
                                if (c13931.m33912() == null) {
                                    arrayList3.add(c13931);
                                    i4 = 1;
                                    c13931 = null;
                                } else {
                                    i4 = 1;
                                }
                                break;
                                break;
                        }
                    }
                }
                c0205.m1597(arrayList3);
            } else {
                c7965.m21679(EnumC5202.f18144);
            }
        }
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    private void m38370() throws Throwable {
        this.f12427.m21671();
        this.f12427.m21679(EnumC5202.f18213);
        int i = 1;
        Object[] objArr = {EnumC5202.f18162};
        ArrayList arrayList = new ArrayList(1);
        Object obj = objArr[0];
        List listM54899 = C24579.m54899(obj, arrayList, obj, arrayList);
        int i2 = 10;
        ArrayList arrayList2 = new ArrayList(10);
        Throwable th = null;
        C7660 c7660 = null;
        while (true) {
            int i3 = C11693.f37858[this.f12427.f26465.ordinal()];
            if (i3 != i) {
                if (i3 != 32) {
                    if (i3 != 33) {
                        String str = (String) C1170.stream(listM54899).map(new C18285(3)).collect(C2025.joining(", "));
                        C1122 c1122 = this.f12426;
                        long j = this.f12427.f26464;
                        String str2 = listM54899.size() != i ? "One of {0} tokens is expected" : "\"{0}\" token is expected";
                        Object[] objArr2 = new Object[i];
                        objArr2[0] = str;
                        c1122.m4162(j, str2, objArr2);
                        throw th;
                    }
                    if (listM54899.contains(this.f12427.f26465)) {
                        if (c7660 != null) {
                            this.f52490.m40767(new C21332(c7660, arrayList2));
                        }
                        this.f12427.m21671();
                        return;
                    } else {
                        C1122 c1123 = this.f12426;
                        long j2 = this.f12427.f26464;
                        Object[] objArr3 = new Object[i];
                        objArr3[0] = EnumC5202.f18314.m15637();
                        c1123.m4162(j2, "\"{0}\" token is expected", objArr3);
                        throw th;
                    }
                }
                if (!listM54899.contains(this.f12427.f26465)) {
                    Throwable th2 = th;
                    this.f12426.m4162(this.f12427.f26464, "\"{0}\" token is not expected", EnumC5202.f18179.m15637());
                    throw th2;
                }
                this.f12427.m21671();
                this.f12427.m21679(EnumC5202.f18334);
                C21522 c21522 = this.f52484;
                c21522.m48935();
                ArrayList arrayList3 = new ArrayList(i2);
                Object[] objArr4 = new Object[3];
                objArr4[0] = EnumC5202.f18285;
                objArr4[i] = EnumC5202.f18168;
                objArr4[2] = EnumC5202.f18328;
                ArrayList arrayList4 = new ArrayList(3);
                int iM9136 = 0;
                while (iM9136 < 3) {
                    Object obj2 = objArr4[iM9136];
                    iM9136 = C2764.m9136(obj2, arrayList4, obj2, iM9136, i);
                }
                List listUnmodifiableList = C4681.unmodifiableList(arrayList4);
                while (true) {
                    EnumC5202 enumC5202 = this.f12427.f26465;
                    EnumC5202 enumC5203 = EnumC5202.f18285;
                    EnumC5202 enumC5204 = EnumC5202.f18168;
                    if (!enumC5202.m15640(enumC5203, enumC5204, EnumC5202.f18328)) {
                        EnumC5202 enumC5205 = this.f12427.f26465;
                        EnumC5202 enumC5206 = EnumC5202.f18309;
                        if (enumC5205 != enumC5206) {
                            EnumC5202 enumC5207 = EnumC5202.f18144;
                            if (enumC5205 != enumC5207) {
                                if (arrayList3.isEmpty()) {
                                    this.f12426.m4162(this.f12427.f26464, "BootstrapMethod argument is expected", new Object[0]);
                                    throw null;
                                }
                                this.f12426.m4162(this.f12427.f26464, "One of {0} tokens is expected", (String) C1170.stream(listUnmodifiableList).map(new C18285(3)).collect(C2025.joining(", ")));
                                throw null;
                            }
                            if (!listUnmodifiableList.contains(enumC5205)) {
                                this.f12426.m4162(this.f12427.f26464, "\"{0}\" token is not expected", enumC5207.m15637());
                                throw null;
                            }
                            c21522.m48932();
                            this.f12427.m21671();
                            this.f52490.m40767(new C21332(c7660, arrayList3));
                            ArrayList arrayList5 = new ArrayList(10);
                            Object[] objArr5 = {EnumC5202.f18162, EnumC5202.f18314};
                            ArrayList arrayList6 = new ArrayList(2);
                            int iM9137 = 0;
                            while (iM9137 < 2) {
                                Object obj3 = objArr5[iM9137];
                                iM9137 = C2764.m9136(obj3, arrayList6, obj3, iM9137, 1);
                            }
                            listM54899 = C4681.unmodifiableList(arrayList6);
                            arrayList2 = arrayList5;
                            c7660 = null;
                            break;
                        }
                        if (!listUnmodifiableList.contains(enumC5205)) {
                            this.f12426.m4162(this.f12427.f26464, "\"{0}\" token is not expected", enumC5206.m15637());
                            throw null;
                        }
                        this.f12427.m21671();
                        Object[] objArr6 = {enumC5203, enumC5204};
                        ArrayList arrayList7 = new ArrayList(2);
                        int iM9138 = 0;
                        while (iM9138 < 2) {
                            Object obj4 = objArr6[iM9138];
                            iM9138 = C2764.m9136(obj4, arrayList7, obj4, iM9138, 1);
                        }
                        listUnmodifiableList = C4681.unmodifiableList(arrayList7);
                    } else {
                        if (!listUnmodifiableList.contains(this.f12427.f26465)) {
                            this.f12426.m4162(this.f12427.f26464, "BootstrapMethod argument is not expected", new Object[0]);
                            throw null;
                        }
                        arrayList3.add(c21522.m48929(null, null, false));
                        Object[] objArr7 = {EnumC5202.f18309, EnumC5202.f18144};
                        ArrayList arrayList8 = new ArrayList(2);
                        int iM9139 = 0;
                        while (iM9139 < 2) {
                            Object obj5 = objArr7[iM9139];
                            iM9139 = C2764.m9136(obj5, arrayList8, obj5, iM9139, 1);
                        }
                        listUnmodifiableList = C4681.unmodifiableList(arrayList8);
                    }
                }
            } else {
                if (!listM54899.contains(this.f12427.f26465)) {
                    this.f12426.m4162(this.f12427.f26464, "\"{0}\" token is expected", EnumC5202.f18162.m15637());
                    throw null;
                }
                if (c7660 != null) {
                    this.f52490.m40767(new C21332(c7660, arrayList2));
                }
                C7965 c7965 = this.f12427;
                EnumC5202 enumC5208 = EnumC5202.f18162;
                c7965.m21679(enumC5208);
                C7965 c7966 = this.f12427;
                int i4 = c7966.f26459;
                c7966.m21679(EnumC5202.f18334);
                C7660 c7660M38374 = m38374();
                C7965 c7967 = this.f12427;
                if (c7967.f26465 == EnumC5202.f18285) {
                    c7967.m21671();
                    this.f12427.m21679(EnumC5202.f18144);
                }
                Object[] objArr8 = {EnumC5202.f18179, enumC5208, EnumC5202.f18314};
                ArrayList arrayList9 = new ArrayList(3);
                int iM91310 = 0;
                while (iM91310 < 3) {
                    Object obj6 = objArr8[iM91310];
                    iM91310 = C2764.m9136(obj6, arrayList9, obj6, iM91310, 1);
                }
                listM54899 = C4681.unmodifiableList(arrayList9);
                c7660 = c7660M38374;
            }
            i = 1;
            i2 = 10;
            th = null;
        }
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    private void m38383() {
        ArrayList arrayList = new ArrayList(256);
        C7660 c7660M38374 = m38374();
        C7965 c7965 = this.f12427;
        EnumC5202 enumC5202 = c7965.f26465;
        EnumC5202 enumC5203 = EnumC5202.f18213;
        if (enumC5202 != enumC5203) {
            c7965.m21671();
        }
        C7965 c7966 = this.f12427;
        EnumC5202 enumC5204 = c7966.f26465;
        EnumC5202 enumC5205 = EnumC5202.f18144;
        C21522 c21522 = this.f52484;
        if (enumC5204 == enumC5205) {
            c7966.m21671();
            C7965 c7967 = this.f12427;
            if (c7967.f26465 == enumC5203) {
                c7967.m21671();
                c21522.m48935();
                if (this.f12427.f26465 == EnumC5202.f18314) {
                    this.f52490.m40767(new C21332(c7660M38374, Collections.EMPTY_LIST));
                    this.f12427.m21671();
                    return;
                }
                while (true) {
                    arrayList.add(c21522.m48929(null, null, false));
                    EnumC5202 enumC5206 = this.f12427.f26465;
                    EnumC5202 enumC5207 = EnumC5202.f18309;
                    EnumC5202 enumC5208 = EnumC5202.f18144;
                    if (!enumC5206.m15640(enumC5207, enumC5208)) {
                        C7965 c7968 = this.f12427;
                        EnumC5202 enumC5209 = c7968.f26465;
                        EnumC5202 enumC52010 = EnumC5202.f18314;
                        if (enumC5209 == enumC52010) {
                            c21522.m48932();
                            this.f12427.m21671();
                            break;
                        }
                        this.f12426.m4162(c7968.f26464, "One of {0} tokens is expected", enumC5207.m15646() + ", " + enumC5208.m15646() + ", or " + enumC52010.m15646());
                        throw null;
                    }
                    this.f12427.m21671();
                    if (this.f12427.f26465 == EnumC5202.f18314) {
                        c21522.m48932();
                        this.f12427.m21671();
                        break;
                    }
                }
            }
            this.f52490.m40767(new C21332(c7660M38374, arrayList));
        }
        C7965 c7969 = this.f12427;
        EnumC5202 enumC52011 = c7969.f26465;
        if (enumC52011 == EnumC5202.f18213) {
            c7969.m21671();
            c21522.m48935();
            if (this.f12427.f26465 == EnumC5202.f18314) {
                this.f52490.m40767(new C21332(c7660M38374, Collections.EMPTY_LIST));
                this.f12427.m21671();
                return;
            }
            do {
                arrayList.add(c21522.m48929(null, null, false));
                EnumC5202 enumC52012 = this.f12427.f26465;
                EnumC5202 enumC52013 = EnumC5202.f18309;
                EnumC5202 enumC52014 = EnumC5202.f18144;
                if (enumC52012.m15640(enumC52013, enumC52014)) {
                    this.f12427.m21671();
                } else {
                    C7965 c79610 = this.f12427;
                    EnumC5202 enumC52015 = c79610.f26465;
                    EnumC5202 enumC52016 = EnumC5202.f18314;
                    if (enumC52015 != enumC52016) {
                        this.f12426.m4162(c79610.f26464, "One of {0} tokens is expected", enumC52013.m15646() + ", " + enumC52014.m15646() + ", or " + enumC52016.m15646());
                        throw null;
                    }
                    c21522.m48932();
                    this.f12427.m21671();
                }
                this.f52490.m40767(new C21332(c7660M38374, arrayList));
                return;
            } while (this.f12427.f26465 != EnumC5202.f18314);
            c21522.m48932();
            this.f12427.m21671();
            this.f52490.m40767(new C21332(c7660M38374, arrayList));
            return;
        }
        if (enumC52011 != EnumC5202.f18285) {
            return;
        }
        arrayList.add(this.f52487.m36703(c7969.f26459));
        this.f12427.m21671();
        while (true) {
            C7965 c79611 = this.f12427;
            EnumC5202 enumC52017 = c79611.f26465;
            if (enumC52017 == EnumC5202.f18144) {
                this.f52490.m40767(new C21332(c7660M38374, arrayList));
                return;
            } else {
                if (enumC52017 != EnumC5202.f18285) {
                    this.f12426.m4162(c79611.f26464, "invalid.bootstrapmethod", new Object[0]);
                    throw null;
                }
                arrayList.add(this.f52487.m36703(c79611.f26459));
                this.f12427.m21671();
            }
        }
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    private C7660 m38374() {
        C7660 c7660M38385;
        C7965 c7965 = this.f12427;
        EnumC5202 enumC5202 = c7965.f26465;
        EnumC5202 enumC5203 = EnumC5202.f18285;
        if (enumC5202 == enumC5203) {
            return this.f52487.m36703(c7965.f26459);
        }
        EnumC20339 enumC20339M38394 = this.f12428.m38394();
        this.f12427.m21679(EnumC5202.f18334);
        C7965 c7966 = this.f12427;
        if (c7966.f26465 == enumC5203) {
            c7660M38385 = this.f52487.m36703(c7966.f26459);
            this.f12427.m21671();
        } else {
            c7660M38385 = this.f12428.m38385(enumC20339M38394);
        }
        this.f12427.m21679(EnumC5202.f18144);
        return c7660M38385;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m38358(Consumer consumer) {
        C7965 c7965 = this.f12427;
        if (c7965.f26465 == EnumC5202.f18334) {
            c7965.m21671();
        }
        consumer.n(this.f52484.m48929(EnumC3185.f10346, null, true));
    }

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    private void m38375() {
        C15291 c15291 = this.f52487;
        EnumC13127 enumC13127 = EnumC13127.f41962;
        c15291.m36704(enumC13127.m32610());
        C7660 c7660M36705 = this.f52487.m36705(new C1385(0, this.f12426.m32310()));
        String str = c7660M36705 != null ? (String) c7660M36705.f25232.f61224 : null;
        C7660 c7660M38395 = m38395();
        if (c7660M38395.f25232 == null && c7660M38395.f67820 != -1) {
            throw C10185.m26296(this.f12426, this.f12427.f26450, "SourceFile attribute incorrectly points to the ConstantPool", new Object[0]);
        }
        c7660M38395.toString();
        if (str != null && !str.equals(c7660M38395.f25232.f61224)) {
            this.f12426.mo4166(this.f12427.f26450, "The \"{0}\" attribute is already declared in the constant pool structure. A new value \"{1}\" is used.", enumC13127.m32610(), c7660M38395.f25232.f61224);
        }
        C17355 c17355 = this.f52490;
        c17355.f56477 = new C1195(c17355.f20376, enumC13127, c7660M38395);
    }

    /* JADX WARN: Code duplicated, block: B:52:0x013f A[Catch: IllegalArgumentException -> 0x015d, TRY_LEAVE, TryCatch #1 {IllegalArgumentException -> 0x015d, blocks: (B:50:0x0135, B:52:0x013f, B:55:0x0155, B:56:0x015c), top: B:61:0x0135 }] */
    /* JADX WARN: Code duplicated, block: B:61:0x0135 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:0x0155 A[SYNTHETIC] */
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private void m38367() {
        int i;
        C17355 c17355 = this.f52490;
        C10201 c10201 = new C10201(c17355.f20376, EnumC13127.f41945);
        c10201.f32629 = new StringBuilder();
        c10201.f32630 = new ArrayList();
        c10201.f32628 = EnumC19152.NONE;
        c17355.f56472 = c10201;
        this.f12427.m21679(EnumC5202.f18213);
        boolean zIsEmpty = true;
        boolean z = true;
        while (true) {
            int i2 = C11693.f37858[this.f12427.f26465.ordinal()];
            if (i2 == 1) {
                try {
                    i = this.f12427.f26459;
                    if (c10201.f32628 != EnumC19152.UTF8) {
                        throw new IllegalArgumentException("The byte representation of the string is expected.");
                    }
                    c10201.f32630.add(Byte.valueOf((byte) i));
                    c10201.f32628 = EnumC19152.BYTE;
                    z = false;
                } catch (IllegalArgumentException unused) {
                    throw C10185.m26296(this.f12426, this.f12427.f26464, "\"{0}\" token is expected", new Object[]{EnumC5202.f18252.m15637()});
                }
            } else if (i2 != 30) {
                switch (i2) {
                    case 33:
                        if (!z) {
                            throw C10185.m26296(this.f12426, this.f12427.f26464, "\"{0}\" token is expected", new Object[]{EnumC5202.f18144.m15637()});
                        }
                        int iOrdinal = c10201.f32628.ordinal();
                        if (iOrdinal != 0) {
                            if (iOrdinal != 1) {
                                if (iOrdinal != 2) {
                                    throw new IncompatibleClassChangeError();
                                }
                                zIsEmpty = c10201.f32630.isEmpty();
                            } else if (c10201.f32629.length() != 0) {
                                zIsEmpty = false;
                            }
                        }
                        if (zIsEmpty) {
                            this.f12426.mo4166(this.f12427.f26464, "The SourceDebugExtension attribute has the empty debug_extension structure.", new Object[0]);
                        }
                        this.f12427.m21671();
                        return;
                    case 34:
                    case 35:
                        i = this.f12427.f26459;
                        if (c10201.f32628 != EnumC19152.UTF8) {
                            throw new IllegalArgumentException("The byte representation of the string is expected.");
                        }
                        c10201.f32630.add(Byte.valueOf((byte) i));
                        c10201.f32628 = EnumC19152.BYTE;
                        break;
                        break;
                    case 36:
                        if (!z) {
                            throw C10185.m26296(this.f12426, this.f12427.f26464, "\"{0}\" token is expected", new Object[]{EnumC5202.f18144.m15637()});
                        }
                        try {
                            String str = this.f12427.f26453;
                            if (c10201.f32628 == EnumC19152.BYTE) {
                                throw new IllegalArgumentException("The valid modified UTF-8 string is expected.");
                            }
                            c10201.f32629.append(str);
                            c10201.f32628 = EnumC19152.UTF8;
                        } catch (IllegalArgumentException unused2) {
                            throw C10185.m26296(this.f12426, this.f12427.f26464, "\"{0}\" token is expected", new Object[]{EnumC5202.f18219.m15637()});
                        }
                        break;
                        break;
                    default:
                        if (z) {
                            this.f12426.mo4159(this.f12427.f26464, "Either \"{0}\" or \"{1}\" token is expected", EnumC5202.f18252.m15637(), EnumC5202.f18314.m15637());
                        } else {
                            this.f12426.mo4159(this.f12427.f26464, "\"{0}\" token is expected", EnumC5202.f18144.m15637());
                        }
                        throw new C24866();
                }
                z = false;
            } else {
                if (z) {
                    throw C10185.m26296(this.f12426, this.f12427.f26464, "\"{0}\" token is expected", new Object[]{(c10201.f32628 == EnumC19152.BYTE ? EnumC5202.f18219 : EnumC5202.f18252).m15637()});
                }
                z = true;
            }
            this.f12427.m21671();
        }
    }

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    private void m38361() {
        C7660 c7660M38386 = m38386(true);
        if (!c7660M38386.m20873().m10398(EnumC3185.f10335, EnumC3185.f10346)) {
            m38356("Either a class name or Constant Pool index expected, got {0}");
            throw null;
        }
        this.f52490.m40774(c7660M38386);
        c7660M38386.toString();
        this.f12427.m21679(EnumC5202.f18144);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m38379(Consumer consumer) {
        ArrayList arrayList = new ArrayList();
        while (true) {
            C7660 c7660M38386 = m38386(true);
            if (!c7660M38386.m20873().m10398(EnumC3185.f10335, EnumC3185.f10346)) {
                m38356("Either a class name or Constant Pool index expected, got {0}");
                throw null;
            }
            arrayList.add(c7660M38386);
            c7660M38386.toString();
            C7965 c7965 = this.f12427;
            if (c7965.f26465 != EnumC5202.f18309) {
                c7965.m21679(EnumC5202.f18144);
                consumer.n(arrayList);
                return;
            }
            c7965.m21671();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m38360(C5728 c5728) {
        ArrayList arrayList = new ArrayList();
        while (true) {
            C7660 c7660M38395 = m38395();
            if (!c7660M38395.m20873().m10397(EnumC3185.f10335)) {
                m38356("Either a field descriptor or Constant Pool index expected, got {0}");
                throw null;
            }
            arrayList.add(c7660M38395);
            c7660M38395.toString();
            C7965 c7965 = this.f12427;
            if (c7965.f26465 != EnumC5202.f18309) {
                c7965.m21679(EnumC5202.f18144);
                c5728.n(arrayList);
                return;
            }
            c7965.m21671();
        }
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    private void m38381() {
        C7660 c7660M36707;
        EnumC3185 enumC3185 = EnumC3185.f10346;
        C21522 c21522 = this.f52484;
        C7660 c7660M48929 = c21522.m48929(enumC3185, null, true);
        C7965 c7965 = this.f12427;
        if (c7965.f26465 == EnumC5202.f18144) {
            this.f52490.m40763(c7660M48929, (C7660) null);
            return;
        }
        c7965.m21679(EnumC5202.f18334);
        if (this.f12427.f26465.m15640(EnumC5202.f18285, EnumC5202.f18162)) {
            int i = this.f12427.f26459;
            c7660M36707 = i != 0 ? this.f52487.m36703(i) : null;
            this.f12427.m21671();
        } else {
            c7660M36707 = this.f52487.m36707(c21522.m48930(EnumC3185.f10361));
        }
        this.f52490.m40763(c7660M48929, c7660M36707);
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    private void m38382() {
        C7660 c7660M38395;
        this.f12427.m21679(EnumC5202.f18213);
        C12439 c12439M40759 = this.f52490.m40759(this.f12427.f26464);
        while (true) {
            EnumC5202 enumC5202 = this.f12427.f26465;
            if (enumC5202 == EnumC5202.f18314) {
                if (c12439M40759.isEmpty()) {
                    this.f12426.mo4166(this.f12427.f26464, "Record should have at least one component", new Object[0]);
                    this.f52490.m40775();
                }
                this.f12427.m21671();
                return;
            }
            ArrayList arrayListM41646 = enumC5202 == EnumC5202.f18198 ? this.f52497.m41646() : null;
            this.f12427.m21679(EnumC5202.f18254);
            C7660 c7660M38396 = m38395();
            this.f12427.m21679(EnumC5202.f18334);
            C7660 c7660M38397 = m38395();
            int i = C11693.f37858[this.f12427.f26465.ordinal()];
            if (i == 30 || i == 31) {
                this.f12427.m21671();
                C7965 c7965 = this.f12427;
                if (c7965.f26465 == EnumC5202.f18151) {
                    c7965.m21671();
                    c7660M38395 = m38395();
                } else {
                    c12439M40759.m30912(c7660M38396, c7660M38397, null, arrayListM41646);
                }
            } else if (i != 37) {
                c7660M38395 = null;
            } else {
                this.f12427.m21671();
                C7965 c7966 = this.f12427;
                if (c7966.f26465 == EnumC5202.f18151) {
                    c7966.m21671();
                }
                c7660M38395 = m38395();
            }
            c12439M40759.m30912(c7660M38396, c7660M38397, c7660M38395, arrayListM41646);
            EnumC5202 enumC5203 = this.f12427.f26465;
            EnumC5202 enumC5204 = EnumC5202.f18309;
            EnumC5202 enumC5205 = EnumC5202.f18144;
            if (!enumC5203.m15640(enumC5204, enumC5205)) {
                this.f12426.m4162(this.f12427.f26464, "Either \"{0}\" or \"{1}\" token is expected", "<" + enumC5205.m15646() + ">", "<" + enumC5204.m15646() + ">");
                throw null;
            }
            this.f12427.m21671();
        }
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    private void m38373(int i) {
        if (i != 0) {
            this.f12426.mo4166(this.f12427.f26464, "Modifier(s) are ignored as they cannot be applied to a group of inner classes", new Object[0]);
        }
        this.f12427.m21679(EnumC5202.f18213);
        while (true) {
            C7965 c7965 = this.f12427;
            if (c7965.f26465 == EnumC5202.f18314) {
                if (this.f52490.f56474 == null) {
                    this.f12426.mo4166(c7965.f26464, "InnerClasses group should have at least one inner class", new Object[0]);
                }
                this.f12427.m21671();
                return;
            }
            m38380(0);
            EnumC5202 enumC5202 = this.f12427.f26465;
            EnumC5202 enumC5203 = EnumC5202.f18309;
            EnumC5202 enumC5204 = EnumC5202.f18144;
            if (!enumC5202.m15640(enumC5203, enumC5204)) {
                this.f12426.m4162(this.f12427.f26464, "Either \"{0}\" or \"{1}\" token is expected", "<" + enumC5204.m15646() + ">", "<" + enumC5203.m15646() + ">");
                throw null;
            }
            this.f12427.m21671();
        }
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    private void m38380(int i) {
        C17355 c17355 = this.f52490;
        long j = this.f12427.f26464;
        C1122 c1122 = (C1122) c17355.m17326();
        int iM39802 = EnumC16856.m39802(i, EnumC16856.f54352, EnumC16856.f54382);
        EnumC16856[] enumC16856Arr = EnumC16856.f54354;
        if (((~EnumC16856.m39773(enumC16856Arr)) & iM39802) != 0) {
            c1122.mo4166(j, "Invalid modifier(s) for an inner class {0}", EnumC16856.m39803(iM39802 & (~EnumC16856.m39773(enumC16856Arr)), EnumC19840.INNER_CLASS));
        }
        int iM38392 = m38392();
        if (i != 0 && iM38392 != 0) {
            C1122 c1123 = this.f12426;
            long j2 = this.f12427.f26464;
            String strM39774 = EnumC16856.m39774(i | iM38392, EnumC19840.INNER_CLASS);
            int length = strM39774.length();
            int iCharCount = 0;
            while (iCharCount < length) {
                int iCodePointAt = strM39774.codePointAt(iCharCount);
                if (!Character.isWhitespace(iCodePointAt)) {
                    break;
                } else {
                    iCharCount += Character.charCount(iCodePointAt);
                }
            }
            while (length > iCharCount) {
                int iCodePointBefore = Character.codePointBefore(strM39774, length);
                if (!Character.isWhitespace(iCodePointBefore)) {
                    break;
                } else {
                    length -= Character.charCount(iCodePointBefore);
                }
            }
            c1123.mo4166(j2, "Combined \"{0}\" modifiers apply to the InnerClass", strM39774.substring(iCharCount, length));
        }
        int i2 = i | iM38392;
        EnumC5202 enumC5202 = this.f12427.f26465;
        if (enumC5202 == EnumC5202.f18328) {
            m38378(i2, this.f52487.m36703(0));
            return;
        }
        if (enumC5202 == EnumC5202.f18168 && enumC5202.m15644()) {
            m38353(i2, m38395());
            return;
        }
        C7965 c7965 = this.f12427;
        EnumC5202 enumC5203 = c7965.f26465;
        if (enumC5203 == EnumC5202.f18285) {
            C7660 c7660M36703 = this.f52487.m36703(c7965.f26459);
            if (!(c7660M36703.f25232 instanceof C10816)) {
                m38378(i2, this.f52487.m36703(0));
                return;
            } else {
                this.f12427.m21671();
                m38353(i2, c7660M36703);
                return;
            }
        }
        if (!enumC5203.m15644()) {
            m38348();
            throw null;
        }
        C7660 c7660M36704 = this.f52487.m36704(this.f12427.f26465.m15637());
        this.f12427.m21671();
        m38353(i2, c7660M36704);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m38353(int i, C7660 c7660) {
        C7965 c7965 = this.f12427;
        if (c7965.f26465 == EnumC5202.f18167) {
            c7965.m21671();
            m38378(i, c7660);
        } else {
            m38348();
            throw null;
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m38378(int i, C7660 c7660) {
        C7660 c7660M48929;
        EnumC5202 enumC5202 = this.f12427.f26465;
        EnumC5202 enumC5203 = EnumC5202.f18285;
        if (enumC5202 == enumC5203 || enumC5202 == EnumC5202.f18328) {
            C21522 c21522 = this.f52484;
            C7660 c7660M489210 = enumC5202 == enumC5203 ? c21522.m48929(EnumC3185.f10346, null, false) : null;
            C7965 c7965 = this.f12427;
            EnumC5202 enumC5204 = c7965.f26465;
            EnumC5202 enumC5205 = EnumC5202.f18328;
            if (enumC5204 == enumC5205) {
                c7965.m21671();
                c7660M489210 = c21522.m48929(EnumC3185.f10346, null, true);
            }
            C7965 c7966 = this.f12427;
            EnumC5202 enumC5206 = c7966.f26465;
            EnumC5202 enumC5207 = EnumC5202.f18144;
            if (enumC5206 == enumC5207) {
                C7660 c7660M36703 = this.f52487.m36703(0);
                m38354(i, c7660, c7660M489210, c7660M36703);
                this.f52490.m40761(i, c7660, c7660M489210, c7660M36703);
                return;
            }
            if (enumC5206 != EnumC5202.f18204) {
                m38348();
                throw null;
            }
            c7966.m21671();
            C7965 c7967 = this.f12427;
            EnumC5202 enumC5208 = c7967.f26465;
            if (enumC5208 == enumC5205 || enumC5208 == enumC5203) {
                if (enumC5208 == enumC5205) {
                    c7967.m21671();
                    c7660M48929 = c21522.m48929(EnumC3185.f10346, null, true);
                } else {
                    c7660M48929 = null;
                }
                if (this.f12427.f26465 == enumC5203) {
                    c7660M48929 = c21522.m48929(EnumC3185.f10346, null, false);
                }
                if (this.f12427.f26465 == enumC5207) {
                    m38354(i, c7660, c7660M489210, c7660M48929);
                    this.f52490.m40761(i, c7660, c7660M489210, c7660M48929);
                    return;
                } else {
                    m38348();
                    throw null;
                }
            }
            m38348();
            throw null;
        }
        m38348();
        throw null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m38354(int i, C7660 c7660, C7660 c7661, C7660 c7662) {
        AbstractC18847 abstractC18847;
        this.f12426.m32304("[" + EnumC16856.m39803(i, EnumC19840.INNER_CLASS) + "], ", new Object[0]);
        if (c7660 != this.f52487.m36703(0) && (abstractC18847 = c7660.f25232) != null) {
            this.f12426.m32304(abstractC18847 + " =\n\t\t", new Object[0]);
        }
        C7660 c7663 = (C7660) ((C6672) c7661.f25232).f61224;
        AbstractC18847 abstractC18848 = c7663.f25232;
        if (abstractC18848 == null) {
            this.f12426.m32304("<#cpx-unresolved> ", new Object[0]);
        } else if (abstractC18848.f61224 == null) {
            this.f12426.m32304("<#cpx-0> ", new Object[0]);
        } else {
            this.f12426.m32304(c7663.f25232.f61224 + " ", new Object[0]);
        }
        if (c7662 != this.f52487.m36703(0) && c7662.f67820 != 0) {
            AbstractC18847 abstractC18849 = ((C7660) ((C6672) c7662.f25232).f61224).f25232;
            if (abstractC18849 == null) {
                this.f12426.m32304("\n\t\tof <#cpx-unresolved>  ", new Object[0]);
            } else {
                C10816 c10816 = (C10816) abstractC18849;
                if (c10816.f61224 == null) {
                    this.f12426.m32304("\n\t\tof <#cpx-0>  ", new Object[0]);
                } else {
                    this.f12426.m32304("\n\t\tof " + ((String) c10816.f61224), new Object[0]);
                }
            }
        }
        this.f12426.m32304("\n", new Object[0]);
    }

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    private void m38348() {
        throw C10185.m26296(this.f12426, this.f12427.f26464, "Invalid declaration of Inner Class", new Object[0]);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m38359(EnumC5202 enumC5202, EnumC5202 enumC5203) {
        int i = 1;
        while (true) {
            this.f12427.m21671();
            C7965 c7965 = this.f12427;
            EnumC5202 enumC5204 = c7965.f26465;
            if (enumC5204 == enumC5202) {
                i++;
            } else if (enumC5204 == enumC5203) {
                i--;
                if (i == 0) {
                    return;
                }
            } else if (enumC5204 == EnumC5202.f18303) {
                this.f12426.mo4159(c7965.f26464, "Unbalanced parentheses", new Object[0]);
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m38377(int i) throws Throwable {
        char c;
        C7660 c7660M48929;
        String str;
        int iM39816 = i;
        C7965 c7965 = this.f12427;
        long j = c7965.f26464;
        if (EnumC16856.m39766(i)) {
            EnumC16856.m39777(EnumC19840.VALUE_OBJECTS);
        }
        int iM39802 = EnumC16856.m39802(iM39816, EnumC16856.f54352, EnumC16856.f54382, EnumC16856.f54364);
        if (EnumC16856.m39800(iM39802, EnumC16856.f54367, EnumC16856.f54371, EnumC16856.f54378)) {
            c7965.f12426.mo4166(c7965.f26464, "Ambiguous use of similar modifiers", new Object[0]);
        }
        EnumC5202 enumC5202 = c7965.f26465;
        EnumC5202 enumC5203 = EnumC5202.f18328;
        if (enumC5202 == enumC5203 || EnumC16856.m39788(iM39802)) {
            c = 0;
        } else {
            c = 0;
            c7965.f12426.mo4166(c7965.f26464, "Expected \"{0}\" or \"{1}\" token; interpreted as \"{2}\"", enumC5203.m15637(), EnumC5202.f18220.m15637(), enumC5203.m15637());
        }
        if (EnumC16856.m39788(iM39802)) {
            if (!EnumC16856.m39804(iM39802)) {
                C1122 c1122 = c7965.f12426;
                long j2 = c7965.f26464;
                Object[] objArr = new Object[1];
                objArr[c] = EnumC16856.m39803(iM39802, EnumC19840.CLASS);
                c1122.mo4166(j2, "\"{0}\": If the ACC_INTERFACE flag is set, the ACC_ABSTRACT flag must also be set", objArr);
            }
            EnumC16856[] enumC16856Arr = new EnumC16856[4];
            enumC16856Arr[c] = EnumC16856.f54345;
            enumC16856Arr[1] = EnumC16856.f54359;
            enumC16856Arr[2] = EnumC16856.f54357;
            enumC16856Arr[3] = EnumC16856.f54349;
            if (EnumC16856.m39780(iM39802, enumC16856Arr)) {
                if (EnumC16856.m39795() == EnumC19840.VALUE_OBJECTS) {
                    C1122 c1123 = c7965.f12426;
                    long j3 = c7965.f26464;
                    Object[] objArr2 = new Object[1];
                    objArr2[c] = EnumC16856.m39803(iM39802, EnumC19840.CLASS);
                    c1123.mo4166(j3, "\"{0}\": If the ACC_INTERFACE flag is set, the ACC_FINAL, ACC_IDENTITY, ACC_ENUM, and ACC_MODULE flags must not be set.", objArr2);
                } else {
                    C1122 c1124 = c7965.f12426;
                    long j4 = c7965.f26464;
                    Object[] objArr3 = new Object[1];
                    objArr3[c] = EnumC16856.m39803(iM39802, EnumC19840.CLASS);
                    c1124.mo4166(j4, "\"{0}\": If the ACC_INTERFACE flag is set, the ACC_FINAL, ACC_SUPER, ACC_ENUM, and ACC_MODULE flags must not be set.", objArr3);
                }
            }
        } else {
            EnumC16856[] enumC16856Arr2 = new EnumC16856[2];
            enumC16856Arr2[c] = EnumC16856.f54361;
            enumC16856Arr2[1] = EnumC16856.f54349;
            if (EnumC16856.m39780(iM39802, enumC16856Arr2)) {
                C1122 c1125 = c7965.f12426;
                long j5 = c7965.f26464;
                Object[] objArr4 = new Object[1];
                objArr4[c] = EnumC16856.m39803(iM39802, EnumC19840.CLASS);
                c1125.mo4166(j5, "\"{0}\": If the ACC_INTERFACE flag is not set ACC_ANNOTATION, and ACC_MODULE flags must not be set.", objArr4);
            }
            if (EnumC16856.m39795() == EnumC19840.VALUE_OBJECTS) {
                EnumC16856[] enumC16856Arr3 = new EnumC16856[3];
                enumC16856Arr3[c] = EnumC16856.f54345;
                enumC16856Arr3[1] = EnumC16856.f54357;
                enumC16856Arr3[2] = EnumC16856.f54376;
                if (!EnumC16856.m39780(iM39802, enumC16856Arr3)) {
                    String strM39803 = EnumC16856.m39803(iM39802, EnumC19840.CLASS);
                    String strConcat = strM39803.isEmpty() ? "ACC_VALUE" : "ACC_VALUE, ".concat(strM39803);
                    C1122 c1126 = c7965.f12426;
                    long j6 = c7965.f26464;
                    Object[] objArr5 = new Object[1];
                    objArr5[c] = strConcat;
                    c1126.mo4166(j6, "\"{0}\": If the ACC_INTERFACE flag is not set a value class must have at least one of its ACC_FINAL, ACC_IDENTITY, or ACC_ABSTRACT flags set", objArr5);
                }
            }
            EnumC16856[] enumC16856Arr4 = EnumC16856.f54380;
            if (!EnumC16856.m39794(iM39802, enumC16856Arr4)) {
                C1122 c1127 = c7965.f12426;
                long j7 = c7965.f26464;
                Object[] objArr6 = new Object[1];
                objArr6[c] = EnumC16856.m39803((~EnumC16856.m39773(enumC16856Arr4)) & iM39802, EnumC19840.CLASS);
                c1127.mo4166(j7, "Invalid modifier(s) for a class: \"{0}\"", objArr6);
            }
        }
        if (EnumC16856.m39779(iM39802, EnumC16856.f54376, EnumC16856.f54345)) {
            C1122 c1128 = c7965.f12426;
            long j8 = c7965.f26464;
            String strM39804 = EnumC16856.m39803(iM39802, EnumC19840.CLASS);
            Object[] objArr7 = new Object[1];
            objArr7[c] = strM39804;
            c1128.mo4166(j8, "\"{0}\": Class cannot be both abstract and final", objArr7);
        }
        ArrayList arrayList = this.f52491;
        if (arrayList != null) {
            this.f52490.m17323(arrayList);
        }
        C7965 c7966 = this.f12427;
        EnumC5202 enumC5204 = c7966.f26465;
        if (enumC5204 == enumC5203) {
            c7966.m21671();
        } else {
            EnumC5202 enumC5205 = EnumC5202.f18198;
            if (enumC5204 == enumC5205) {
                c7966.m21671();
                C7965 c7967 = this.f12427;
                EnumC5202 enumC5206 = c7967.f26465;
                EnumC5202 enumC5207 = EnumC5202.f18220;
                if (enumC5206 != enumC5207) {
                    C1122 c1129 = this.f12426;
                    long j9 = c7967.f26450;
                    String strM15637 = enumC5205.m15637();
                    String strM15638 = enumC5207.m15637();
                    Object[] objArr8 = new Object[2];
                    objArr8[c] = strM15637;
                    objArr8[1] = strM15638;
                    throw C10185.m26296(c1129, j9, "Either \"{0}\" or \"{1}\" token is expected", objArr8);
                }
                iM39816 |= EnumC16856.f54361.m39816() | EnumC16856.f54353.m39816();
                this.f12427.m21671();
            }
        }
        EnumC3185 enumC3185 = EnumC3185.f10346;
        C21522 c21522 = this.f52484;
        C7660 c7660M489210 = c21522.m48929(enumC3185, null, true);
        C7965 c7968 = this.f12427;
        EnumC5202 enumC5208 = c7968.f26465;
        if (enumC5208 == EnumC5202.f18331) {
            c7968.m21671();
            int i2 = C11693.f37858[this.f12427.f26465.ordinal()];
            if (i2 == 2) {
                str = this.f12427.f26453;
            } else if (i2 != 4) {
                if (i2 != 36) {
                    C1122 c11210 = this.f12426;
                    long j10 = this.f12427.f26464;
                    Object[] objArr9 = new Object[1];
                    objArr9[c] = C7376.m20248(this.f12427.f26465, new StringBuilder("\""), "\"");
                    throw C10185.m26296(c11210, j10, "Either name or Constant Pool index expected, got {0}", objArr9);
                }
                str = this.f12427.f26453;
            } else {
                str = this.f12427.f26454;
            }
            this.f12427.m21671();
            this.f52490.f56490 = C25272.m56409(".", str);
        } else {
            if (enumC5208 == EnumC5202.f18316) {
                throw C10185.m26296(this.f12426, c7968.f26450, "\"{0}\" token is expected", new Object[]{C7376.m20248(EnumC5202.f18183, new StringBuilder("\""), "\"")});
            }
            if (enumC5208 == EnumC5202.f18144) {
                c7968.m21671();
            } else if (enumC5208 == EnumC5202.f18334) {
                c7968.m21671();
                C7660 c7660M38395 = m38395();
                c7660M38395.toString();
                this.f52490.m17324(c7660M38395);
            }
        }
        C7965 c7969 = this.f12427;
        if (c7969.f26465 == EnumC5202.f18324) {
            c7969.m21671();
            c7660M48929 = c21522.m48929(enumC3185, null, true);
            while (true) {
                C7965 c79610 = this.f12427;
                if (c79610.f26465 != EnumC5202.f18309) {
                    break;
                }
                c79610.m21671();
                this.f12426.mo4166(j, "Multiple inheritance is not supported", new Object[0]);
                c7660M48929 = c21522.m48929(EnumC3185.f10346, null, true);
            }
        } else {
            c7660M48929 = null;
        }
        ArrayList arrayList2 = new ArrayList();
        if (this.f12427.f26465 == EnumC5202.f18193) {
            do {
                this.f12427.m21671();
                C7660 c7660M489211 = c21522.m48929(EnumC3185.f10346, null, true);
                if (arrayList2.contains(c7660M489211)) {
                    this.f12426.mo4166(j, "Interface {0} repeated", c7660M489211);
                } else {
                    arrayList2.add(c7660M489211);
                }
            } while (this.f12427.f26465 == EnumC5202.f18309);
        }
        EnumC5202 enumC5209 = this.f12427.f26465;
        EnumC5202 enumC52010 = EnumC5202.f18213;
        if (enumC5209 != enumC52010) {
            if (this.f52490.f56482.m51466()) {
                this.f52490.f56482.getClass();
            }
            m38372();
            if (EnumC16856.m39795() == EnumC19840.VALUE_OBJECTS && !this.f52490.f56482.m51468()) {
                this.f12426.mo4166(this.f12427.f26450, "Class file version {0} does not conform to the new kind of objects; expected version {1}", this.f52490.f56482.m51462(), C22824.m51460().m51462());
            }
        } else if (!this.f52490.f56482.m51466()) {
            this.f52490.f56482.getClass();
            this.f52490.f56482.m51470();
            this.f12426.mo4166(this.f12427.f26450, "Class file version not specified in file or by -cv parameter. Defaulting to version \"{0}\"", this.f52490.f56482.m51462());
        }
        this.f12427.m21679(enumC52010);
        C17355 c17355 = this.f52490;
        C16609 c16609 = c17355.f56489;
        c17355.f20372 = iM39816;
        if (EnumC16856.m39778(iM39816)) {
            c17355.m17322();
        }
        EnumC24815 enumC24815 = EnumC24815.HEADER;
        c16609.getClass();
        C18941 c18941 = c16609.f53716;
        C18941 c18942 = c16609.f53715;
        EnumC24815 enumC24816 = EnumC24815.CLASSFILE;
        if (enumC24815 == enumC24816) {
            c18942.f61428 = c7660M489210;
        } else {
            c18941.f61428 = c7660M489210;
        }
        if (enumC24815 == enumC24816) {
            c18942.f61429 = c7660M48929;
        } else {
            c18941.f61429 = c7660M48929;
        }
        c17355.f56481 = arrayList2;
        c17355.f56482.m51470();
        while (true) {
            C7965 c79611 = this.f12427;
            EnumC5202 enumC52011 = c79611.f26465;
            if (enumC52011 == EnumC5202.f18303 || enumC52011 == EnumC5202.f18314) {
                c79611.m21679(EnumC5202.f18314);
                m38364();
                return;
            }
            int[] iArr = C11693.f37858;
            int i3 = iArr[enumC52011.ordinal()];
            if (i3 == 30) {
                this.f12427.m21671();
            } else if (i3 != 44) {
                if (this.f12427.f26465 == EnumC5202.f18198) {
                    this.f52492 = this.f52497.m41646();
                }
                int iM38392 = m38392();
                try {
                    int i4 = iArr[this.f12427.f26465.ordinal()];
                    if (i4 != 29) {
                        switch (i4) {
                            case 53:
                                this.f12427.m21671();
                                m38363(iM38392);
                                break;
                            case ThreefishEngine.Threefish512Cipher.ROTATION_3_2 /* 54 */:
                                this.f12427.m21671();
                                m38368(iM38392);
                                break;
                            case ThreefishEngine.Threefish1024Cipher.ROTATION_1_3 /* 55 */:
                                this.f12427.m21671();
                                if (!this.f12427.f26453.equals(EnumC5202.f18206.m15638())) {
                                    m38380(iM38392);
                                } else {
                                    m38373(iM38392);
                                }
                                break;
                            case 56:
                                if (!this.f12427.f26453.equals(EnumC5202.f18141.m15638())) {
                                    this.f12427.m21671();
                                    m38383();
                                } else {
                                    m38370();
                                }
                                break;
                            case 57:
                                this.f12427.m21671();
                                m38358(new Consumer() { // from class: l.᩸ܳ᩺
                                    public /* synthetic */ Consumer andThen(Consumer consumer) {
                                        return C12312.$default$andThen(this, consumer);
                                    }

                                    @Override // java.util.function.Consumer
                                    /* JADX INFO: renamed from: accept */
                                    public final void n(Object obj) {
                                        C16609 c166010 = this.f74347.f52490.f56489;
                                        EnumC24815 enumC24817 = EnumC24815.HEADER;
                                        c166010.getClass();
                                        c166010.f53715.f61428 = (C7660) obj;
                                    }
                                });
                                this.f12427.m21679(EnumC5202.f18144);
                                break;
                            case ThreefishEngine.Threefish256Cipher.ROTATION_6_0 /* 58 */:
                                this.f12427.m21671();
                                m38358(new Consumer() { // from class: l.ᩴܳ᩺
                                    public /* synthetic */ Consumer andThen(Consumer consumer) {
                                        return C12312.$default$andThen(this, consumer);
                                    }

                                    @Override // java.util.function.Consumer
                                    /* JADX INFO: renamed from: accept */
                                    public final void n(Object obj) {
                                        C16609 c166010 = this.f64053.f52490.f56489;
                                        EnumC24815 enumC24817 = EnumC24815.HEADER;
                                        c166010.getClass();
                                        c166010.f53715.f61429 = (C7660) obj;
                                    }
                                });
                                this.f12427.m21679(EnumC5202.f18144);
                                break;
                            case ThreefishEngine.Threefish1024Cipher.ROTATION_2_6 /* 59 */:
                                this.f52490.m40765(EnumC13127.f41962, this.f12427.f26464);
                                this.f12427.m21671();
                                m38375();
                                this.f12427.m21679(EnumC5202.f18144);
                                break;
                            case 60:
                                this.f52490.m40765(EnumC13127.f41945, this.f12427.f26464);
                                this.f12427.m21671();
                                m38367();
                                break;
                            case 61:
                                C17355 c17356 = this.f52490;
                                c17356.m40765(EnumC13127.f41958, this.f12427.f26464);
                                if (c17356.m40768(EnumC13127.f41977)) {
                                    this.f12426.mo4166(this.f12427.f26464, "The attribute table of a ClassFile structure must not contain both a NestMembers attribute and a NestHost attribute", new Object[0]);
                                }
                                this.f12427.m21671();
                                m38361();
                                break;
                            case 62:
                                C17355 c17357 = this.f52490;
                                c17357.m40765(EnumC13127.f41977, this.f12427.f26464);
                                if (c17357.m40768(EnumC13127.f41958)) {
                                    this.f12426.mo4166(this.f12427.f26464, "The attribute table of a ClassFile structure must not contain both a NestMembers attribute and a NestHost attribute", new Object[0]);
                                }
                                this.f12427.m21671();
                                m38379(new Consumer() { // from class: l.ܳܳ᩺
                                    public /* synthetic */ Consumer andThen(Consumer consumer) {
                                        return C12312.$default$andThen(this, consumer);
                                    }

                                    @Override // java.util.function.Consumer
                                    /* JADX INFO: renamed from: accept */
                                    public final void n(Object obj) {
                                        this.f50261.f52490.m40770((ArrayList) obj);
                                    }
                                });
                                break;
                            case 63:
                                this.f52490.m40765(EnumC13127.f41965, this.f12427.f26464);
                                this.f12427.m21671();
                                m38379(new Consumer() { // from class: l.۫ܳ᩺
                                    public /* synthetic */ Consumer andThen(Consumer consumer) {
                                        return C12312.$default$andThen(this, consumer);
                                    }

                                    @Override // java.util.function.Consumer
                                    /* JADX INFO: renamed from: accept */
                                    public final void n(Object obj) {
                                        this.f42114.f52490.m40776((ArrayList) obj);
                                    }
                                });
                                break;
                            case 64:
                                this.f52490.m40765(EnumC13127.f41966, this.f12427.f26464);
                                this.f12427.m21671();
                                m38382();
                                break;
                            case 65:
                                this.f52490.m40765(EnumC13127.f41973, this.f12427.f26464);
                                this.f12427.m21671();
                                m38360(new C5728(this));
                                break;
                            case 66:
                                this.f52490.m40765(EnumC13127.f41952, this.f12427.f26464);
                                this.f12427.m21671();
                                m38381();
                                break;
                            default:
                                this.f12426.mo4159(this.f12427.f26464, "Class member declaration expected", new Object[0]);
                                C24866 c24866 = new C24866();
                                c24866.m55392();
                                throw c24866;
                        }
                    } else {
                        this.f12427.m21671();
                        this.f52490.m17325(m38395(), this.f12427.f26464);
                        this.f12427.m21679(EnumC5202.f18144);
                    }
                } catch (C24866 e) {
                    if (e.m55391()) {
                        C24866 c24867 = new C24866();
                        c24867.m55392();
                        throw c24867;
                    }
                    while (true) {
                        int i5 = C11693.f37858[this.f12427.f26465.ordinal()];
                        if (i5 != 2) {
                            if (i5 != 14 && i5 != 16 && i5 != 24) {
                                if (i5 != 33) {
                                    switch (i5) {
                                        case 5:
                                        case 6:
                                        case 7:
                                        case 8:
                                        case 9:
                                        case 10:
                                            break;
                                        default:
                                            switch (i5) {
                                                case 18:
                                                case 20:
                                                    break;
                                                case 19:
                                                    break;
                                                default:
                                                    switch (i5) {
                                                        case 38:
                                                            break;
                                                        case 39:
                                                            m38359(EnumC5202.f18213, EnumC5202.f18314);
                                                            this.f12427.m21671();
                                                            break;
                                                        case 40:
                                                            m38359(EnumC5202.f18243, EnumC5202.f18266);
                                                            this.f12427.m21671();
                                                            break;
                                                        case 41:
                                                            m38359(EnumC5202.f18286, EnumC5202.f18296);
                                                            this.f12427.m21671();
                                                            break;
                                                        case 42:
                                                        case 43:
                                                            break;
                                                        default:
                                                            this.f12427.m21671();
                                                            break;
                                                    }
                                                    break;
                                            }
                                            break;
                                    }
                                }
                            }
                        }
                        m38364();
                        String.format("scanner position %d", Long.valueOf(this.f12427.f26464));
                        C24866 c24868 = new C24866();
                        c24868.m55392();
                        throw c24868;
                    }
                }
                this.f52492 = null;
            } else {
                this.f12427.m21671();
                m38369();
                this.f52493 = true;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public C14150 m38365() {
        C14150 c14150 = new C14150();
        C7965 c7965 = this.f12427;
        EnumC5202 enumC5202 = c7965.f26465;
        if (enumC5202 != EnumC5202.f18168) {
            if (enumC5202 != EnumC5202.f18285) {
                throw C14087.m34250(this.f12426, c7965.f26464, "Either a module name or Constant Pool index expected, got {0}", new Object[]{C7376.m20248(this.f12427.f26465, new StringBuilder("\""), "\"")});
            }
            c14150.f61428 = Integer.valueOf(c7965.f26459);
            this.f12427.m21671();
            return c14150;
        }
        String string = "";
        while (this.f12427.f26465.m15642()) {
            c14150.f61429 = ((String) c14150.f61429) + string + this.f12427.f26454;
            this.f12427.m21678();
            EnumC5202 enumC5203 = this.f12427.f26465;
            if (enumC5203 != EnumC5202.f18331) {
                return c14150;
            }
            string = Character.toString((char) enumC5203.m15643());
            this.f12427.m21678();
        }
        throw C14087.m34250(this.f12426, this.f12427.f26464, "Either a module name or Constant Pool index expected, got {0}", new Object[]{C7376.m20248(this.f12427.f26465, new StringBuilder("\""), "\"")});
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    private void m38366(int i) {
        C7965 c7965;
        int iM39816;
        if (i != 0) {
            this.f12426.mo4166(this.f12427.f26464, "The class access modifier(s) {0} ignored", EnumC16856.m39803(i, EnumC19840.MODULE));
        }
        ArrayList arrayList = this.f52491;
        if (arrayList != null) {
            this.f52490.m17323(arrayList);
        }
        C7439 c7439 = new C7439(this.f52490);
        this.f52498 = c7439;
        if (this.f12427.f26465 == EnumC5202.f18183) {
            c7439.m20390();
            this.f12427.m21671();
        }
        C7965 c7966 = this.f12427;
        EnumC5202 enumC5202 = c7966.f26465;
        EnumC5202 enumC5203 = EnumC5202.f18316;
        if (enumC5202 != enumC5203) {
            throw C14087.m34250(this.f12426, c7966.f26464, "\"{0}\" token is expected", new Object[]{enumC5203.m15637()});
        }
        c7966.m21678();
        C14150 c14150M38365 = m38365();
        if (c14150M38365.m34371()) {
            throw C14087.m34250(this.f12426, this.f12427.f26464, "Either name or Constant Pool index expected, got {0}", new Object[]{"\"" + this.f12427.f26465 + "\""});
        }
        if (c14150M38365.m34370() != 0) {
            this.f52498.m20388(c14150M38365.m34370());
        } else {
            this.f52498.m20389((String) c14150M38365.f61429);
        }
        EnumC5202 enumC5204 = this.f12427.f26465;
        EnumC5202 enumC5205 = EnumC5202.f18213;
        if (enumC5204 == enumC5205) {
            C22824 c22824 = this.f52490.f56482;
            if (!c22824.m51466()) {
                c22824.m51464(53, 0);
            }
            this.f12426.mo4166(this.f12427.f26464, "Class file version not specified in file or by -cv parameter. Defaulting to version \"{0}\"", this.f52490.f56482.m51462());
        } else {
            m38372();
        }
        this.f12427.m21679(enumC5205);
        C17355 c17355 = this.f52490;
        c17355.getClass();
        c17355.f20372 = EnumC16856.f54349.m39816();
        C16609 c16609 = c17355.f56489;
        EnumC24815 enumC24815 = EnumC24815.HEADER;
        C7660 c7660 = new C7660(0, null);
        c16609.getClass();
        if (enumC24815 == EnumC24815.CLASSFILE) {
            c16609.f53715.f61429 = c7660;
        } else {
            c16609.f53716.f61429 = c7660;
        }
        C22824 c22825 = c17355.f56482;
        if (!c22825.m51466()) {
            c22825.m51464(53, 0);
        }
        while (true) {
            c7965 = this.f12427;
            EnumC5202 enumC5206 = c7965.f26465;
            if (enumC5206 != EnumC5202.f18303 && enumC5206 != EnumC5202.f18314) {
                int i2 = C11693.f37858[enumC5206.ordinal()];
                if (i2 != 30) {
                    switch (i2) {
                        case 44:
                            this.f12427.m21671();
                            m38369();
                            this.f52493 = true;
                            break;
                        case WXMediaMessage.IMediaObject.TYPE_BUSINESS_CARD /* 45 */:
                            C17134 c17134 = this.f52498.f24485;
                            C14150 c14150 = new C14150();
                            this.f12427.m21678();
                            int i3 = 0;
                            while (true) {
                                EnumC5202 enumC5207 = this.f12427.f26465;
                                if (enumC5207 == EnumC5202.f18144) {
                                    if (!c14150.m34371()) {
                                        c17134.n(new C19043((String) c14150.f61429, c14150.m34370(), i3, null));
                                        this.f12427.m21678();
                                        break;
                                    }
                                    throw C14087.m34250(this.f12426, this.f12427.f26464, "Module statement \"requires [transitive | static | mandated | synthetic] ModuleName;\" expected", new Object[0]);
                                }
                                int i4 = C11693.f37858[enumC5207.ordinal()];
                                if (i4 != 3 && i4 != 4) {
                                    if (i4 != 8) {
                                        if (i4 != 23) {
                                            if (i4 != 26) {
                                                if (i4 != 50) {
                                                    throw C14087.m34250(this.f12426, this.f12427.f26464, "Module statement \"requires [transitive | static | mandated | synthetic] ModuleName;\" expected", new Object[0]);
                                                }
                                                if (EnumC16856.m39785(i3) || !c14150.m34371()) {
                                                    throw C14087.m34250(this.f12426, this.f12427.f26464, "Module statement \"requires [transitive | static | mandated | synthetic] ModuleName;\" expected", new Object[0]);
                                                }
                                                iM39816 = EnumC16856.f54385.m39816();
                                            } else {
                                                if (EnumC16856.m39810(i3) || !c14150.m34371()) {
                                                    throw C14087.m34250(this.f12426, this.f12427.f26464, "Module statement \"requires [transitive | static | mandated | synthetic] ModuleName;\" expected", new Object[0]);
                                                }
                                                iM39816 = EnumC16856.f54368.m39816();
                                            }
                                        } else {
                                            if (EnumC16856.m39765(i3) || !c14150.m34371()) {
                                                throw C14087.m34250(this.f12426, this.f12427.f26464, "Module statement \"requires [transitive | static | mandated | synthetic] ModuleName;\" expected", new Object[0]);
                                            }
                                            iM39816 = EnumC16856.f54374.m39816();
                                        }
                                    } else {
                                        if (EnumC16856.m39770(i3) || !c14150.m34371()) {
                                            throw C14087.m34250(this.f12426, this.f12427.f26464, "Module statement \"requires [transitive | static | mandated | synthetic] ModuleName;\" expected", new Object[0]);
                                        }
                                        iM39816 = EnumC16856.f54344.m39816();
                                    }
                                    i3 |= iM39816;
                                    this.f12427.m21678();
                                } else {
                                    if (!c14150.m34371()) {
                                        throw C14087.m34250(this.f12426, this.f12427.f26464, "Module statement \"requires [transitive | static | mandated | synthetic] ModuleName;\" expected", new Object[0]);
                                    }
                                    c14150 = m38365();
                                }
                            }
                            break;
                        case 46:
                            m38357(this.f52498.f24480, new InterfaceC17660() { // from class: l.۟ᩴ᩺
                                @Override // l.InterfaceC17660
                                public final C14150 get() {
                                    C16168 c16168 = this.f26759;
                                    C7965 c7967 = c16168.f12427;
                                    EnumC5202 enumC5208 = c7967.f26465;
                                    String string = "";
                                    int i5 = 0;
                                    if (enumC5208 == EnumC5202.f18168) {
                                        String str = "";
                                        while (c16168.f12427.f26465.m15645()) {
                                            StringBuilder sbM10405 = C3188.m10405(string, str);
                                            sbM10405.append(c16168.f12427.f26454);
                                            string = sbM10405.toString();
                                            c16168.f12427.m21671();
                                            C7965 c7968 = c16168.f12427;
                                            if (c7968.f26465 == EnumC5202.f18331) {
                                                c16168.f12426.mo4166(c7968.f26464, "Forward slash \"/\" expected instead of dot \".\". The dot is replaced by \"/\"", new Object[0]);
                                                c16168.f12427.m21671();
                                                str = "/";
                                            }
                                        }
                                        throw C10185.m26296(c16168.f12426, c16168.f12427.f26464, "Either name or Constant Pool index expected, got {0}", new Object[]{C7376.m20248(c16168.f12427.f26465, new StringBuilder("\""), "\"")});
                                    }
                                    if (enumC5208 == EnumC5202.f18285) {
                                        i5 = c7967.f26459;
                                        c7967.m21671();
                                    }
                                    return new C14150(Integer.valueOf(i5), string);
                                }
                            }, new InterfaceC17660() { // from class: l.ۙܳ᩺
                                @Override // l.InterfaceC17660
                                public final C14150 get() {
                                    return this.f17327.m38365();
                                }
                            }, EnumC5202.f18246, true, "Module statement \"exports [mandated | synthetic] PackageName [to ModuleName(1)[,ModuleName(2)[...]]];\" expected");
                            break;
                        case 47:
                            m38357(this.f52498.f24486, new InterfaceC17660() { // from class: l.۟ᩴ᩺
                                @Override // l.InterfaceC17660
                                public final C14150 get() {
                                    C16168 c16168 = this.f26759;
                                    C7965 c7967 = c16168.f12427;
                                    EnumC5202 enumC5208 = c7967.f26465;
                                    String string = "";
                                    int i5 = 0;
                                    if (enumC5208 == EnumC5202.f18168) {
                                        String str = "";
                                        while (c16168.f12427.f26465.m15645()) {
                                            StringBuilder sbM10405 = C3188.m10405(string, str);
                                            sbM10405.append(c16168.f12427.f26454);
                                            string = sbM10405.toString();
                                            c16168.f12427.m21671();
                                            C7965 c7968 = c16168.f12427;
                                            if (c7968.f26465 == EnumC5202.f18331) {
                                                c16168.f12426.mo4166(c7968.f26464, "Forward slash \"/\" expected instead of dot \".\". The dot is replaced by \"/\"", new Object[0]);
                                                c16168.f12427.m21671();
                                                str = "/";
                                            }
                                        }
                                        throw C10185.m26296(c16168.f12426, c16168.f12427.f26464, "Either name or Constant Pool index expected, got {0}", new Object[]{C7376.m20248(c16168.f12427.f26465, new StringBuilder("\""), "\"")});
                                    }
                                    if (enumC5208 == EnumC5202.f18285) {
                                        i5 = c7967.f26459;
                                        c7967.m21671();
                                    }
                                    return new C14150(Integer.valueOf(i5), string);
                                }
                            }, new InterfaceC17660() { // from class: l.ۙܳ᩺
                                @Override // l.InterfaceC17660
                                public final C14150 get() {
                                    return this.f17327.m38365();
                                }
                            }, EnumC5202.f18246, true, "Module statement \"opens [mandated | synthetic] PackageName [to ModuleName(1)[,ModuleName(2)[...]]];\" expected");
                            break;
                        case 48:
                            m38357(this.f52498.f24482, new InterfaceC17660() { // from class: l.۟ᩴ᩺
                                @Override // l.InterfaceC17660
                                public final C14150 get() {
                                    C16168 c16168 = this.f26759;
                                    C7965 c7967 = c16168.f12427;
                                    EnumC5202 enumC5208 = c7967.f26465;
                                    String string = "";
                                    int i5 = 0;
                                    if (enumC5208 == EnumC5202.f18168) {
                                        String str = "";
                                        while (c16168.f12427.f26465.m15645()) {
                                            StringBuilder sbM10405 = C3188.m10405(string, str);
                                            sbM10405.append(c16168.f12427.f26454);
                                            string = sbM10405.toString();
                                            c16168.f12427.m21671();
                                            C7965 c7968 = c16168.f12427;
                                            if (c7968.f26465 == EnumC5202.f18331) {
                                                c16168.f12426.mo4166(c7968.f26464, "Forward slash \"/\" expected instead of dot \".\". The dot is replaced by \"/\"", new Object[0]);
                                                c16168.f12427.m21671();
                                                str = "/";
                                            }
                                        }
                                        throw C10185.m26296(c16168.f12426, c16168.f12427.f26464, "Either name or Constant Pool index expected, got {0}", new Object[]{C7376.m20248(c16168.f12427.f26465, new StringBuilder("\""), "\"")});
                                    }
                                    if (enumC5208 == EnumC5202.f18285) {
                                        i5 = c7967.f26459;
                                        c7967.m21671();
                                    }
                                    return new C14150(Integer.valueOf(i5), string);
                                }
                            }, new InterfaceC17660() { // from class: l.۟ᩴ᩺
                                @Override // l.InterfaceC17660
                                public final C14150 get() {
                                    C16168 c16168 = this.f26759;
                                    C7965 c7967 = c16168.f12427;
                                    EnumC5202 enumC5208 = c7967.f26465;
                                    String string = "";
                                    int i5 = 0;
                                    if (enumC5208 == EnumC5202.f18168) {
                                        String str = "";
                                        while (c16168.f12427.f26465.m15645()) {
                                            StringBuilder sbM10405 = C3188.m10405(string, str);
                                            sbM10405.append(c16168.f12427.f26454);
                                            string = sbM10405.toString();
                                            c16168.f12427.m21671();
                                            C7965 c7968 = c16168.f12427;
                                            if (c7968.f26465 == EnumC5202.f18331) {
                                                c16168.f12426.mo4166(c7968.f26464, "Forward slash \"/\" expected instead of dot \".\". The dot is replaced by \"/\"", new Object[0]);
                                                c16168.f12427.m21671();
                                                str = "/";
                                            }
                                        }
                                        throw C10185.m26296(c16168.f12426, c16168.f12427.f26464, "Either name or Constant Pool index expected, got {0}", new Object[]{C7376.m20248(c16168.f12427.f26465, new StringBuilder("\""), "\"")});
                                    }
                                    if (enumC5208 == EnumC5202.f18285) {
                                        i5 = c7967.f26459;
                                        c7967.m21671();
                                    }
                                    return new C14150(Integer.valueOf(i5), string);
                                }
                            }, EnumC5202.f18325, false, "Module statement \"provides ClassName with ClassName(1)[,ClassName(2)[...]]];\" expected");
                            break;
                        case 49:
                            final C3710 c3710 = this.f52498.f24483;
                            HashSet hashSetM38351 = m38351(new InterfaceC16914() { // from class: l.ᩳᩴ᩺
                                @Override // l.InterfaceC16914
                                public final void call() {
                                    this.f62340.f12427.m21671();
                                }
                            }, new InterfaceC17660() { // from class: l.۟ᩴ᩺
                                @Override // l.InterfaceC17660
                                public final C14150 get() {
                                    C16168 c16168 = this.f26759;
                                    C7965 c7967 = c16168.f12427;
                                    EnumC5202 enumC5208 = c7967.f26465;
                                    String string = "";
                                    int i5 = 0;
                                    if (enumC5208 == EnumC5202.f18168) {
                                        String str = "";
                                        while (c16168.f12427.f26465.m15645()) {
                                            StringBuilder sbM10405 = C3188.m10405(string, str);
                                            sbM10405.append(c16168.f12427.f26454);
                                            string = sbM10405.toString();
                                            c16168.f12427.m21671();
                                            C7965 c7968 = c16168.f12427;
                                            if (c7968.f26465 == EnumC5202.f18331) {
                                                c16168.f12426.mo4166(c7968.f26464, "Forward slash \"/\" expected instead of dot \".\". The dot is replaced by \"/\"", new Object[0]);
                                                c16168.f12427.m21671();
                                                str = "/";
                                            }
                                        }
                                        throw C10185.m26296(c16168.f12426, c16168.f12427.f26464, "Either name or Constant Pool index expected, got {0}", new Object[]{C7376.m20248(c16168.f12427.f26465, new StringBuilder("\""), "\"")});
                                    }
                                    if (enumC5208 == EnumC5202.f18285) {
                                        i5 = c7967.f26459;
                                        c7967.m21671();
                                    }
                                    return new C14150(Integer.valueOf(i5), string);
                                }
                            }, "Module statement \"uses ClassName;\" expected", true);
                            if (hashSetM38351.size() != 1) {
                                throw C14087.m34250(this.f12426, this.f12427.f26464, "Module statement \"uses ClassName;\" expected", new Object[0]);
                            }
                            C4937.forEach(hashSetM38351, new Consumer() { // from class: l.ۢᩴ᩺
                                public /* synthetic */ Consumer andThen(Consumer consumer) {
                                    return C12312.$default$andThen(this, consumer);
                                }

                                @Override // java.util.function.Consumer
                                /* JADX INFO: renamed from: accept */
                                public final void n(Object obj) {
                                    C14150 c14151 = (C14150) obj;
                                    EnumC5335 enumC5335 = EnumC5335.CONSTANT_NULL;
                                    c3710.n(new C7110(c14151.m34370(), (String) c14151.f61429));
                                }
                            });
                            this.f12427.m21671();
                            break;
                            break;
                        default:
                            throw C14087.m34250(this.f12426, this.f12427.f26464, "Module statement expected", new Object[0]);
                    }
                } else {
                    this.f12427.m21671();
                }
            }
        }
        c7965.m21679(EnumC5202.f18314);
        if (this.f52493) {
            this.f52487.m36726();
            if (this.f52490.f56477 == null) {
                String strM32314 = this.f12426.m32314();
                C17355 c17356 = this.f52490;
                C1253 c1253 = new C1253(c17356.f20376, strM32314);
                c1253.m4535(this.f52490.f20376, new C13105(7));
                c17356.f56477 = c1253;
            }
        } else {
            C17355 c17357 = this.f52490;
            if (c17357.f56477 == null) {
                C15291 c15291 = this.f52487;
                c17357.f56477 = new C1195(c15291, EnumC13127.f41962, c15291.m36704(this.f12426.m32314()));
            }
        }
        this.f52490.m40762(this.f52498);
        this.f52486.add(this.f52490);
        this.f52490 = null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m38357(BiConsumer biConsumer, InterfaceC17660 interfaceC17660, InterfaceC17660 interfaceC17661, EnumC5202 enumC5202, boolean z, String str) {
        int iM39816;
        int i = 0;
        boolean z2 = enumC5202 == EnumC5202.f18325;
        C14150 c14150 = new C14150();
        HashSet hashSet = new HashSet();
        this.f12427.m21671();
        int i2 = 0;
        while (true) {
            EnumC5202 enumC5203 = this.f12427.f26465;
            if (enumC5203 == EnumC5202.f18144) {
                if (c14150.m34371() || (hashSet.isEmpty() && !z)) {
                    throw C14087.m34250(this.f12426, this.f12427.f26464, str, new Object[0]);
                }
                if (z2) {
                    Set set = (Set) C1170.stream(hashSet).map(new C7351(i)).collect(C2025.toSet());
                    EnumC5335 enumC5335 = EnumC5335.CONSTANT_NULL;
                    biConsumer.accept(new C1144(c14150.m34370(), (String) c14150.f61429, i2, EnumC19840.MODULE), set);
                } else {
                    Set set2 = (Set) C1170.stream(hashSet).map(new C14062(0)).collect(C2025.toSet());
                    EnumC5335 enumC5336 = EnumC5335.CONSTANT_NULL;
                    biConsumer.accept(new C1144(c14150.m34370(), (String) c14150.f61429, i2, EnumC19840.MODULE), set2);
                }
                this.f12427.m21671();
                return;
            }
            int i3 = C11693.f37858[enumC5203.ordinal()];
            if (i3 != 3 && i3 != 4) {
                if (i3 != 23) {
                    if (i3 != 26) {
                        if (i3 != 51 && i3 != 52) {
                            throw C14087.m34250(this.f12426, this.f12427.f26464, str, new Object[0]);
                        }
                        hashSet = m38351(z2 ? new InterfaceC16914() { // from class: l.ۖᩴ᩺
                            @Override // l.InterfaceC16914
                            public final void call() {
                                this.f9461.f12427.m21671();
                            }
                        } : new InterfaceC16914() { // from class: l.۠ᩴ᩺
                            @Override // l.InterfaceC16914
                            public final void call() {
                                this.f28910.f12427.m21678();
                            }
                        }, interfaceC17661, str, false);
                    } else {
                        if (EnumC16856.m39810(i2) || !c14150.m34371() || z2) {
                            throw C14087.m34250(this.f12426, this.f12427.f26464, str, new Object[0]);
                        }
                        iM39816 = EnumC16856.f54368.m39816();
                    }
                } else {
                    if (EnumC16856.m39765(i2) || !c14150.m34371() || z2) {
                        throw C14087.m34250(this.f12426, this.f12427.f26464, str, new Object[0]);
                    }
                    iM39816 = EnumC16856.f54374.m39816();
                }
                i2 |= iM39816;
                if (z2) {
                    this.f12427.m21671();
                } else {
                    this.f12427.m21678();
                }
            } else {
                if (!c14150.m34371()) {
                    throw C14087.m34250(this.f12426, this.f12427.f26464, str, new Object[0]);
                }
                c14150 = interfaceC17660.get();
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private HashSet m38351(InterfaceC16914 interfaceC16914, InterfaceC17660 interfaceC17660, String str, boolean z) {
        HashSet hashSet = new HashSet();
        interfaceC16914.call();
        boolean z2 = false;
        boolean z3 = true;
        while (true) {
            EnumC5202 enumC5202 = this.f12427.f26465;
            if (enumC5202 == EnumC5202.f18144) {
                if (hashSet.isEmpty() || z2) {
                    throw C14087.m34250(this.f12426, this.f12427.f26464, str, new Object[0]);
                }
                return hashSet;
            }
            int i = C11693.f37858[enumC5202.ordinal()];
            if (i == 3 || i == 4) {
                if (!z3 && !z2) {
                    throw C14087.m34250(this.f12426, this.f12427.f26464, str, new Object[0]);
                }
                hashSet.add(interfaceC17660.get());
                z2 = false;
                z3 = false;
            } else {
                if (i != 31) {
                    throw C14087.m34250(this.f12426, this.f12427.f26464, str, new Object[0]);
                }
                if (z2 || z3 || z) {
                    throw C14087.m34250(this.f12426, this.f12427.f26464, str, new Object[0]);
                }
                this.f12427.m21671();
                z2 = true;
            }
        }
    }

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    private void m38362() {
        while (true) {
            this.f12426.m32299(new Supplier() { // from class: l.ۤܳ᩺
                @Override // java.util.function.Supplier
                public final Object get() {
                    return "recoverFile: scanner.token=" + this.f34614.f12427.f26465;
                }
            });
            int i = C11693.f37858[this.f12427.f26465.ordinal()];
            if (i != 2 && i != 19) {
                switch (i) {
                    case 38:
                        return;
                    case 39:
                        m38359(EnumC5202.f18213, EnumC5202.f18314);
                        this.f12427.m21671();
                        break;
                    case 40:
                        m38359(EnumC5202.f18243, EnumC5202.f18266);
                        this.f12427.m21671();
                        break;
                    case 41:
                        m38359(EnumC5202.f18286, EnumC5202.f18296);
                        this.f12427.m21671();
                        break;
                    default:
                        this.f12427.m21671();
                        break;
                }
            } else {
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m38364() {
        if (this.f52493) {
            this.f52487.m36726();
            this.f52490.m40771();
            if (this.f52490.f56477 == null) {
                String strM32314 = this.f12426.m32314();
                final String strM32310 = this.f12426.m32310();
                C17355 c17355 = this.f52490;
                C1253 c1253 = new C1253(c17355.f20376, strM32314);
                c1253.m4535(this.f52490.f20376, new Function() { // from class: l.֫ܳ᩺
                    @Override // java.util.function.Function
                    /* JADX INFO: renamed from: andThen */
                    public /* synthetic */ Function mo10608andThen(Function function) {
                        return C24247.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public /* synthetic */ Function compose(Function function) {
                        return C24247.$default$compose(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        Boolean bool;
                        String str = (String) obj;
                        boolean z = false;
                        if (str.contains(strM32310)) {
                            Object[] objArr = {".java", ".jcod", ".jasm", ".class"};
                            ArrayList arrayList = new ArrayList(4);
                            int iM9136 = 0;
                            while (iM9136 < 4) {
                                Object obj2 = objArr[iM9136];
                                iM9136 = C2764.m9136(obj2, arrayList, obj2, iM9136, 1);
                            }
                            Iterator it = C4681.unmodifiableList(arrayList).iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    bool = Boolean.FALSE;
                                    break;
                                }
                                if (str.contains((String) it.next())) {
                                    bool = Boolean.TRUE;
                                    break;
                                }
                            }
                            if (bool.booleanValue()) {
                                z = true;
                            }
                        }
                        return Boolean.valueOf(z);
                    }
                });
                c17355.f56477 = c1253;
            }
        } else {
            C17355 c17356 = this.f52490;
            if (c17356.f56477 == null) {
                C15291 c15291 = this.f52487;
                c17356.f56477 = new C1195(c15291, EnumC13127.f41962, c15291.m36704(this.f12426.m32314()));
            }
        }
        this.f52490.m40769();
        this.f52486.add(this.f52490);
        C17355 c17357 = new C17355(this.f12426, C22824.m51461(this.f52499));
        this.f52490 = c17357;
        this.f52487 = c17357.f20376;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C17355[] m38391() {
        return (C17355[]) this.f52486.toArray(new C17355[0]);
    }

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    private void m38349() {
        EnumC5202 enumC5202;
        ArrayList arrayList;
        int i = 0;
        if (this.f12427.f26465.m15640(EnumC5202.f18158, EnumC5202.f18198, EnumC5202.f18333)) {
            boolean z = true;
            while (true) {
                try {
                    EnumC5202 enumC5203 = this.f12427.f26465;
                    if (enumC5203 == EnumC5202.f18303 || !z) {
                        break;
                    }
                    int i2 = C11693.f37858[enumC5203.ordinal()];
                    if (i2 == 30) {
                        this.f12427.m21671();
                    } else if (i2 != 67) {
                        if (i2 == 43) {
                            this.f12427.m21671();
                            C7965 c7965 = this.f12427;
                            long j = c7965.f26464;
                            String str = c7965.f26454;
                            c7965.m21679(EnumC5202.f18168);
                            EnumC5202 enumC5204 = this.f12427.f26465;
                            EnumC5202 enumC5205 = EnumC5202.f18144;
                            if (enumC5204 != enumC5205) {
                                m38372();
                                this.f12427.m21679(enumC5205);
                            }
                            if (this.f52496 == null) {
                                this.f52496 = str;
                                this.f52489 = str + "/";
                            } else {
                                this.f12426.mo4159(j, "Package statement repeated", new Object[0]);
                            }
                        } else if (i2 == 44) {
                            this.f12427.m21671();
                            m38369();
                            this.f52493 = true;
                        }
                        z = false;
                    } else {
                        this.f52485 = this.f52497.m41646();
                    }
                } catch (C24866 unused) {
                    m38362();
                }
            }
            while (true) {
                C7965 c7966 = this.f12427;
                enumC5202 = c7966.f26465;
                if (enumC5202 != EnumC5202.f18144) {
                    break;
                } else {
                    c7966.m21671();
                }
            }
            if (enumC5202 != EnumC5202.f18303) {
                if (this.f52496 != null || (arrayList = this.f52485) == null) {
                    return;
                }
                this.f52491 = arrayList;
                this.f52485 = null;
                return;
            }
            this.f12426.m32315("Scanner:  EOF", new Object[0]);
            if (this.f12426.m32314().contains("package-info")) {
                this.f12426.m32299(new Supplier() { // from class: l.᩷ܳ᩺
                    @Override // java.util.function.Supplier
                    public final Object get() {
                        return C16168.m38376(this.f71313);
                    }
                });
                int iM39816 = EnumC16856.f54353.m39816() | EnumC16856.f54376.m39816();
                if (this.f52490.f56482.m51467() > 49) {
                    iM39816 |= EnumC16856.f54382.m39816();
                }
                C17355 c17355 = this.f52490;
                String strM23910 = C8947.m23910(new StringBuilder(), this.f52489, "package-info");
                c17355.f20372 = iM39816;
                c17355.f56476 = strM23910;
                c17355.f56482.m51470();
                ArrayList arrayList2 = this.f52485;
                if (arrayList2 != null) {
                    this.f52490.m17323(arrayList2);
                }
                if (this.f52493) {
                    this.f52487.m36726();
                    if (this.f52490.f56477 == null) {
                        String strM32314 = this.f12426.m32314();
                        C17355 c17356 = this.f52490;
                        C1253 c1253 = new C1253(c17356.f20376, strM32314);
                        c1253.m4535(this.f52490.f20376, new C9587(i));
                        c17356.f56477 = c1253;
                    }
                } else {
                    C17355 c17357 = this.f52490;
                    if (c17357.f56477 == null) {
                        C15291 c15291 = this.f52487;
                        c17357.f56477 = new C1195(c15291, EnumC13127.f41962, c15291.m36704(this.f12426.m32314()));
                    }
                }
                C17355 c17358 = this.f52490;
                C16609 c16609 = c17358.f56489;
                C15291 c15292 = c17358.f20376;
                String str2 = c17358.f56476;
                c15292.getClass();
                EnumC3185 enumC3185 = EnumC3185.f10346;
                c16609.m39295(c15292.m36707((AbstractC18847) new C6672(enumC3185, c15292.m36704(str2))));
                C18941 c18941 = c16609.f53716;
                C18941 c18942 = c16609.f53715;
                C7660 c7660M36707 = c15292.m36707((AbstractC18847) new C6672(enumC3185, c15292.m36704("java/lang/Object")));
                if (c18942.f61429 != null) {
                    c18942.f61429 = c7660M36707;
                } else {
                    c18941.f61429 = c7660M36707;
                }
                c15292.m36716();
                C7660 c7660M36713 = c15292.m36713(c16609.m39298());
                if (c18942.f61429 != null) {
                    c18942.f61429 = c7660M36713;
                } else {
                    c18941.f61429 = c7660M36713;
                }
                c16609.m39295(c15292.m36713(c16609.m39297()));
                c15292.m36721();
                this.f52486.add(this.f52490);
                this.f52490 = null;
            }
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ String m38376(C16168 c16168) {
        return "Creating \"package-info.jasm\": package: " + c16168.f52496 + " " + c16168.f52490.f56482.m51462();
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    private String m38350() {
        if (!this.f12427.f26465.m15640(EnumC5202.f18270, EnumC5202.f18236)) {
            return null;
        }
        boolean z = false;
        String string = null;
        while (true) {
            EnumC5202 enumC5202 = this.f12427.f26465;
            if (enumC5202 == EnumC5202.f18303) {
                return string;
            }
            int i = C11693.f37858[enumC5202.ordinal()];
            if (i != 2 && i != 4) {
                if (i == 30) {
                    if (string == null) {
                        this.f12426.m4162(this.f12427.f26464, "\"{0}\" token is expected", z ? "CLASSNAME" : "FILENAME");
                        throw null;
                    }
                    this.f12427.m21671();
                    return string.concat(z ? ".class" : "");
                }
                switch (i) {
                    case 70:
                        if (string != null) {
                            this.f12426.m4162(this.f12427.f26464, "\"{0}\" token is expected", EnumC5202.f18144.m15637());
                            throw null;
                        }
                        break;
                        break;
                    case 71:
                        if (string != null) {
                            this.f12426.m4162(this.f12427.f26464, "\"{0}\" token is expected", EnumC5202.f18144.m15646());
                            throw null;
                        }
                        z = true;
                        break;
                        break;
                    case 72:
                        string = string != null ? string.concat(".") : ".";
                        break;
                    default:
                        if (string == null) {
                            this.f12426.m4162(this.f12427.f26464, "\"{0}\" token is expected", z ? "CLASSNAME" : "FILENAME");
                            throw null;
                        }
                        this.f12426.m4162(this.f12427.f26464, "\"{0}\" token is expected", EnumC5202.f18144.m15646());
                        throw null;
                }
            } else if (string == null) {
                string = this.f12427.f26453;
            } else {
                StringBuilder sbM27333 = C10732.m27333(string);
                sbM27333.append(this.f12427.f26453);
                string = sbM27333.toString();
            }
            this.f12427.m21671();
        }
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m38400() throws Throwable {
        try {
            C17355 c17355 = new C17355(this.f12426, C22824.m51461(this.f52499));
            this.f52490 = c17355;
            this.f52487 = c17355.f20376;
            String strM38350 = m38350();
            if (strM38350 != null) {
                InterfaceC13676 interfaceC13676M32306 = this.f12426.m32306();
                if (interfaceC13676M32306 instanceof AbstractC9201) {
                    ((AbstractC9201) interfaceC13676M32306).m24357(strM38350);
                }
            }
            m38349();
            while (true) {
                EnumC5202 enumC5202 = this.f12427.f26465;
                if (enumC5202 == EnumC5202.f18303) {
                    return;
                }
                try {
                    if (enumC5202 == EnumC5202.f18198) {
                        this.f52491 = this.f52497.m41646();
                    }
                    int iM38392 = m38392();
                    if (iM38392 == 0) {
                        int i = C11693.f37858[this.f12427.f26465.ordinal()];
                        if (i != 2 && i != 3 && i != 4 && i != 19) {
                            if (i == 30) {
                                this.f12427.m21671();
                            } else if (i != 36 && i != 68 && i != 69) {
                                this.f12426.mo4159(this.f12427.f26464, "Class, module or interface declaration expected", new Object[0]);
                                throw new C24866();
                            }
                        }
                    } else if (EnumC16856.m39788(iM38392) && this.f12427.f26465 != EnumC5202.f18328) {
                        iM38392 |= EnumC16856.f54376.m39816();
                    }
                    EnumC5202 enumC5203 = this.f12427.f26465;
                    if (enumC5203 == EnumC5202.f18316 || enumC5203 == EnumC5202.f18183) {
                        m38366(iM38392);
                    } else {
                        m38377(iM38392);
                    }
                    this.f52491 = null;
                } catch (C24866 e) {
                    this.f12426.m32315("^^^^^^^ Syntax Error ^^^^^^^^^^^^", new Object[0]);
                    this.f12427.f12426.getClass();
                    if (e.m55391()) {
                        return;
                    }
                    m38362();
                    return;
                }
            }
        } catch (IOException unused) {
            C1122 c1122 = this.f12426;
            c1122.mo4159(this.f12427.f26464, "I/O error in {0}", c1122.m32314());
        } catch (Error unused2) {
        }
    }
}
