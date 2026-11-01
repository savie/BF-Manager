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
import org.bouncycastle.crypto.engines.ThreefishEngine;

/* JADX INFO: renamed from: l.ܳۢۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 64JA */
/* JADX INFO: loaded from: classes4.dex */
public final class C14441 extends C4561 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C1511 f47342;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final C1033 f47343;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C2922 f47344;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public C22948 f47345;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public C8568 f47352;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C3855 f47354;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public C20311 f47356;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final ArrayList f47349 = new ArrayList();

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C12738 f47348 = null;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public C9398 f47341 = null;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public String f47353 = null;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public String f47347 = "";

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public ArrayList f47346 = null;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public ArrayList f47355 = null;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public ArrayList f47351 = null;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public boolean f47350 = false;

    public C14441(C18111 c18111, C20311 c20311) {
        this.f16198 = c18111;
        this.f16199 = new C12842(c18111);
        this.f16200 = this;
        C1033 c1033 = new C1033(this);
        this.f47343 = c1033;
        this.f47342 = new C1511(this);
        this.f47354 = new C3855(this, c1033);
        C2922 c2922 = new C2922();
        c2922.f16198 = this.f16198;
        c2922.f16199 = this.f16199;
        c2922.f16200 = this;
        this.f47344 = c2922;
        this.f47356 = C20311.m45840(c20311);
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final void m34788() {
        this.f16199.getClass();
        this.f47343.getClass();
        this.f47342.getClass();
        this.f47354.getClass();
        this.f47344.getClass();
    }

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    private C13111 m34750() {
        C12842 c12842 = this.f16199;
        if (c12842.f42721 == EnumC20934.f68156) {
            c12842.m31840();
            C12842 c12843 = this.f16199;
            EnumC20934 enumC20934 = c12843.f42721;
            EnumC20934 enumC20935 = EnumC20934.f68154;
            if (enumC20934 == enumC20935) {
                int i = c12843.f42726;
                c12843.m31840();
                C12842 c12844 = this.f16199;
                if (c12844.f42721 == EnumC20934.f68046) {
                    c12844.m31840();
                    C12842 c12845 = this.f16199;
                    if (c12845.f42721 == enumC20935) {
                        int i2 = c12845.f42726;
                        this.f47341.f31849.m45845(i, i2);
                        this.f16199.m31840();
                        "parseVersion: ".concat(this.f47341.f31849.m45843());
                        return new C13111(Integer.valueOf(i), Integer.valueOf(i2));
                    }
                }
            }
        }
        throw C7997.m21056(this.f16198, this.f16199.f42728, "class file version expected", new Object[0]);
    }

    /* JADX WARN: Code duplicated, block: B:48:0x0128  */
    /* JADX WARN: Code duplicated, block: B:50:0x012e A[LOOP:0: B:38:0x0112->B:50:0x012e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:69:0x0144 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:70:0x0134 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10, types: [l.᩹ۧۡ] */
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
    public final void m34793(EnumC20562 enumC20562) {
        char c;
        ArrayList arrayList;
        EnumC1177 enumC1177M30972;
        C12468 c12468;
        boolean z;
        C12842 c12842 = this.f16199;
        long j = c12842.f42728;
        if (c12842.f42721 != EnumC20934.f68154) {
            this.f16198.m42172(j, "A valid index into the local variable array of the current frame expected", new Object[0]);
            throw null;
        }
        final int i = c12842.f42726;
        C13173 c13173 = this.f47345.f74585;
        if (i >= 0) {
            if (i < c13173.f43854) {
                c12842.m31840();
                C15187 c15187M34802 = m34802();
                this.f16199.m31848(EnumC20934.f68046);
                long j2 = this.f16199.f42728;
                C15187 c15187M34803 = m34802();
                EnumC20562 enumC20563 = EnumC20562.f66842;
                if (enumC20562 == enumC20563) {
                    if (EnumC1177.m4308(((String) c15187M34803.f49578.f69953).charAt(0)) == null) {
                        this.f16198.m42172(j2, "Valid field descriptor of the local variable \"{0}\" expected instead of \"{1}\"", Integer.valueOf(i), c15187M34803.f49578.f69953.toString());
                        throw null;
                    }
                } else {
                    EnumC20562 enumC20564 = EnumC20562.f66711;
                    if (enumC20562 == enumC20564) {
                        try {
                            new C14110(c15187M34803.f49578.f69953.toString()).m34151((C11038) null).toString();
                        } catch (Exception unused) {
                            this.f16198.mo2164(j2, "Invalid field signature found for local variable in slot \"{0}\": \"{1}\"", Integer.valueOf(i), c15187M34803.f49578.f69953.toString());
                        }
                    } else {
                        this.f16198.m42172(j2, "Either \"{0}\" or \"{1}\" token is expected", enumC20563.m46393(), enumC20564.m46393());
                        throw null;
                    }
                }
                C22948 c22948 = this.f47345;
                C13173 c13174 = c22948.f74585;
                C24027 c24027 = c22948.f74582;
                C14585 c14585 = c22948.f74601;
                C18111 c18111 = c22948.f74600;
                C12468 c12469 = new C12468((short) i, (short) c22948.f74595, c15187M34802, c15187M34803);
                if (enumC20562 == EnumC20562.f66842) {
                    arrayList = c22948.f74586;
                    enumC1177M30972 = c12469.m30972();
                    if (c22948.f74597 == null) {
                        C3564 c3564 = new C3564(c14585.f20884, EnumC16783.f53734);
                        c22948.f74597 = c3564;
                        c24027.m52871(c3564);
                    }
                    c22948.f74597.m10556(c12469);
                } else {
                    arrayList = c22948.f74588;
                    C3564 c3565 = c22948.f74597;
                    enumC1177M30972 = (c3565 == 0 || (c12468 = (C12468) c3565.m10553((C22242) new Predicate() { // from class: l.᩹ۧۡ
                        @Override // java.util.function.Predicate
                        public /* synthetic */ Predicate and(Predicate predicate) {
                            return C8512.$default$and(this, predicate);
                        }

                        @Override // java.util.function.Predicate
                        /* JADX INFO: renamed from: negate */
                        public /* synthetic */ Predicate mo9645negate() {
                            return C8512.$default$negate(this);
                        }

                        public /* synthetic */ Predicate or(Predicate predicate) {
                            return C8512.$default$or(this, predicate);
                        }

                        @Override // java.util.function.Predicate
                        public final boolean test(Object obj) {
                            return ((C12468) obj).m30974() == i;
                        }
                    }).orElse(null)) == null) ? null : c12468.m30972();
                    if (c22948.f74594 == null) {
                        C3564 c3566 = new C3564(c14585.f20884, EnumC16783.f53719);
                        c22948.f74594 = c3566;
                        c24027.m52871(c3566);
                    }
                    c22948.f74594.m10556(c12469);
                }
                if (enumC1177M30972 == null) {
                    c18111.m42172(j, "Field type isn't declared for the slot \"{0}\"", Integer.valueOf(i));
                    throw null;
                }
                c12469.f41581 = enumC1177M30972;
                for (int i2 = 0; i2 < enumC1177M30972.m4310(); i2++) {
                    int i3 = i + i2;
                    if (i3 >= 0) {
                        z = i3 < c13174.f43854;
                        if (z) {
                            c18111.m42172(j, "The index in the local variable array \"{0}\" is not in the range [0..{1}] [0..Code_attribute.max_locals-1]", Integer.valueOf(i3), Integer.valueOf(c13174.f43854 - 1));
                            throw null;
                        }
                        if (arrayList.get(i3) == null) {
                            c18111.m42172(j, "The slot \"{0}\" is occupied by another local variable", Integer.valueOf(i3));
                            throw null;
                        }
                        arrayList.set(i3, c12469);
                    } else {
                        c13174.getClass();
                    }
                    if (z) {
                        c18111.m42172(j, "The index in the local variable array \"{0}\" is not in the range [0..{1}] [0..Code_attribute.max_locals-1]", Integer.valueOf(i3), Integer.valueOf(c13174.f43854 - 1));
                        throw null;
                    }
                    if (arrayList.get(i3) == null) {
                        c18111.m42172(j, "The slot \"{0}\" is occupied by another local variable", Integer.valueOf(i3));
                        throw null;
                    }
                    arrayList.set(i3, c12469);
                }
                return;
            }
            c = 0;
        } else {
            c = 0;
            c13173.getClass();
        }
        C18111 c18112 = this.f16198;
        Integer numValueOf = Integer.valueOf(i);
        Integer numValueOf2 = Integer.valueOf(this.f47345.f74585.f43854 - 1);
        Object[] objArr = new Object[2];
        objArr[c] = numValueOf;
        objArr[1] = numValueOf2;
        c18112.m42172(j, "The index in the local variable array \"{0}\" is not in the range [0..{1}] [0..Code_attribute.max_locals-1]", objArr);
        throw null;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C13173 m34796() {
        C12842 c12842 = this.f16199;
        if (c12842.f42721 != EnumC20934.f68154) {
            throw C7997.m21056(this.f16198, c12842.f42728, "A valid index into the local variable array of the current frame expected", new Object[0]);
        }
        int i = c12842.f42726;
        c12842.m31840();
        return new C13173(i);
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
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m34800(EnumC20562 enumC20562) {
        boolean z;
        EnumC20562 enumC20563;
        Object obj;
        C12468 c12468;
        int i;
        int iM4310;
        int i2;
        int i3;
        C12842 c12842 = this.f16199;
        long j = c12842.f42728;
        if (c12842.f42721 != EnumC20934.f68154) {
            throw C7997.m21056(this.f16198, j, "A valid index into the local variable array of the current frame expected", new Object[0]);
        }
        int i4 = c12842.f42726;
        C22948 c22948 = this.f47345;
        short s = (short) i4;
        ArrayList arrayList = c22948.f74588;
        ArrayList arrayList2 = c22948.f74586;
        C18111 c18111 = c22948.f74600;
        C13173 c13173 = c22948.f74585;
        if (s >= 0) {
            z = s < c13173.f43854;
            if (z) {
                c18111.m42172(j, "The index in the local variable array \"{0}\" is not in the range [0..{1}] [0..Code_attribute.max_locals-1]", Short.valueOf(s), Integer.valueOf(c13173.f43854 - 1));
                throw null;
            }
            enumC20563 = EnumC20562.f66842;
            if (enumC20562 == enumC20563) {
                obj = arrayList2.get(s);
            } else {
                obj = arrayList.get(s);
            }
            c12468 = (C12468) obj;
            if (c12468 != null) {
                c18111.m42172(j, "Local variable isn't declared for the slot \"{0}\"", Short.valueOf(s));
                throw null;
            }
            c12468.m30973(c22948.f74595);
            if (enumC20562 == enumC20563) {
                arrayList = arrayList2;
            }
            i = 0;
            while (true) {
                if (c12468.m30972() == null) {
                    iM4310 = 0;
                } else {
                    iM4310 = c12468.f41581.m4310();
                }
                if (i < iM4310) {
                    this.f16199.m31840();
                    return;
                }
                if (i <= 0 && ((i3 = s + i) < 0 || i3 >= c13173.f43854)) {
                    break;
                }
                if (i > 0) {
                    i2 = s + i;
                    if (arrayList.get(i2) != null) {
                        throw C7997.m21056(c18111, j, "Local variable isn't declared for the slot \"{0}\"", new Object[]{Integer.valueOf(i2)});
                    }
                }
                arrayList.set(s + i, null);
                i++;
            }
            throw C7997.m21056(c18111, j, "The index in the local variable array \"{0}\" is not in the range [0..{1}] [0..Code_attribute.max_locals-1]", new Object[]{Integer.valueOf(i3), Integer.valueOf(c13173.f43854 - 1)});
        }
        c13173.getClass();
        if (z) {
            c18111.m42172(j, "The index in the local variable array \"{0}\" is not in the range [0..{1}] [0..Code_attribute.max_locals-1]", Short.valueOf(s), Integer.valueOf(c13173.f43854 - 1));
            throw null;
        }
        enumC20563 = EnumC20562.f66842;
        if (enumC20562 == enumC20563) {
            obj = arrayList2.get(s);
        } else {
            obj = arrayList.get(s);
        }
        c12468 = (C12468) obj;
        if (c12468 != null) {
            c18111.m42172(j, "Local variable isn't declared for the slot \"{0}\"", Short.valueOf(s));
            throw null;
        }
        c12468.m30973(c22948.f74595);
        if (enumC20562 == enumC20563) {
            arrayList = arrayList2;
        }
        i = 0;
        while (true) {
            if (c12468.m30972() == null) {
                iM4310 = 0;
            } else {
                iM4310 = c12468.f41581.m4310();
            }
            if (i < iM4310) {
                this.f16199.m31840();
                return;
            }
            if (i <= 0) {
            }
            if (i > 0) {
                i2 = s + i;
                if (arrayList.get(i2) != null) {
                    throw C7997.m21056(c18111, j, "Local variable isn't declared for the slot \"{0}\"", new Object[]{Integer.valueOf(i2)});
                }
            }
            arrayList.set(s + i, null);
            i++;
        }
        throw C7997.m21056(c18111, j, "The index in the local variable array \"{0}\" is not in the range [0..{1}] [0..Code_attribute.max_locals-1]", new Object[]{Integer.valueOf(i3), Integer.valueOf(c13173.f43854 - 1)});
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m34801(C24027 c24027) {
        C12842 c12842 = this.f16199;
        if (c12842.f42721 == EnumC20934.f68161) {
            int i = c12842.f42726;
            C11327 c11327 = new C11327();
            c11327.f38225 = null;
            c11327.f38224 = i;
            c24027.m52871(c11327);
            this.f16199.m31840();
            return;
        }
        C15187 c15187M34802 = m34802();
        this.f16199.m31848(EnumC20934.f68046);
        C15187 c15187M31658 = this.f47348.m31658((AbstractC21536) new C10622(c15187M34802, m34802()));
        C11327 c11328 = new C11327();
        c11328.f38224 = -1;
        c11328.f38225 = c15187M31658;
        c24027.m52871(c11328);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m34794(C24027 c24027) {
        EnumC13776 enumC13776M7615;
        EnumC20934 enumC20934;
        EnumC9728 enumC9728M10027 = C3376.m10027(this.f16199.f42726, C11521.empty());
        C12842 c12842 = this.f16199;
        EnumC20934 enumC20935 = c12842.f42721;
        int i = c12842.f42726;
        String str = c12842.f42724;
        c12842.m31840();
        int i2 = C17262.f55005[enumC20935.ordinal()];
        C15187 c15187M31658 = null;
        if (i2 == 1) {
            enumC13776M7615 = null;
        } else if (i2 == 2) {
            enumC9728M10027 = EnumC9728.ITEM_Object;
            enumC13776M7615 = EnumC13776.f45400;
        } else if (i2 == 3) {
            enumC9728M10027 = EnumC9728.ITEM_Object;
            c15187M31658 = this.f47348.m31654(i);
            enumC13776M7615 = null;
        } else {
            if (i2 != 4) {
                enumC13776M7615 = null;
            } else {
                enumC9728M10027 = EnumC9728.m24686(str);
                enumC13776M7615 = C2485.m7615(str);
                if (enumC9728M10027 != null) {
                    if (enumC13776M7615 != null && (enumC20934 = this.f16199.f42721) != EnumC20934.f68171 && enumC20934 != EnumC20934.f68072) {
                        enumC9728M10027 = EnumC9728.ITEM_Object;
                    }
                } else if (enumC13776M7615 != null) {
                    enumC9728M10027 = EnumC9728.ITEM_Object;
                }
            }
            enumC9728M10027 = EnumC9728.ITEM_Bogus;
            this.f16198.mo2150("StackMap entry type expected instead of {0}", "<" + enumC20935.m47092() + ">");
        }
        int i3 = C17262.f55004[enumC9728M10027.ordinal()];
        if (i3 == 1) {
            if (c15187M31658 == null) {
                c15187M31658 = this.f47348.m31658(this.f47343.m3882(enumC13776M7615));
            }
            c24027.f77846.add(new C18486(enumC9728M10027, c15187M31658));
        } else {
            if (i3 == 2) {
                c24027.f77846.add(new C18486(enumC9728M10027, this.f47354.m11178()));
                return;
            }
            C17780 c17780 = new C17780();
            c17780.f56382 = enumC9728M10027;
            c24027.f77846.add(c17780);
        }
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C15187 m34802() {
        C12842 c12842 = this.f16199;
        EnumC20934 enumC20934 = c12842.f42721;
        if (enumC20934 == EnumC20934.f68161) {
            int i = c12842.f42726;
            c12842.m31840();
            return this.f47348.m31654(i);
        }
        if (enumC20934 == EnumC20934.f68034) {
            String str = c12842.f42724;
            c12842.m31840();
            return this.f47348.m31655(str);
        }
        if (enumC20934.m47090()) {
            C12842 c12843 = this.f16199;
            String str2 = c12843.f42720;
            c12843.m31840();
            return this.f47348.m31655(str2);
        }
        throw C7997.m21056(this.f16198, this.f16199.f42728, "Either name or Constant Pool index expected, got {0}", new Object[]{"\"" + this.f16199.f42721 + "\""});
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C15187 m34791(EnumC11659 enumC11659) {
        int i = C17262.f55006[enumC11659.ordinal()];
        C1033 c1033 = this.f47343;
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 4:
                return this.f47348.m31658(c1033.m3882(EnumC13776.f45408));
            case 5:
            case 6:
                c1033.m3885(true);
                EnumC13776 enumC13776 = EnumC13776.f45431;
                C15187 c15187M3881 = c1033.m3881(enumC13776, EnumC13776.f45428, false);
                c1033.m3885(false);
                m34757(this.f16198.m42173(), enumC13776, null);
                return c15187M3881;
            case 7:
            case 8:
                EnumC13776 enumC13777 = EnumC13776.f45431;
                EnumC13776 enumC13778 = EnumC13776.f45428;
                if (this.f47341.f31849.m45841() >= 52 && EnumC23839.m52527(this.f47341.f20887)) {
                    enumC13778 = enumC13777;
                    enumC13777 = enumC13778;
                }
                c1033.m3885(true);
                C15187 c15187M3882 = c1033.m3881(enumC13777, enumC13778, false);
                c1033.m3885(false);
                m34757(this.f16198.m42173(), enumC13777, enumC13778);
                return c15187M3882;
            case 9:
                c1033.m3885(true);
                EnumC13776 enumC13779 = EnumC13776.f45428;
                C15187 c15187M3883 = c1033.m3881(enumC13779, EnumC13776.f45431, false);
                c1033.m3885(false);
                m34757(this.f16198.m42173(), enumC13779, null);
                return c15187M3883;
            default:
                throw new C6055();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m34757(long j, EnumC13776 enumC13776, EnumC13776 enumC13777) {
        if (this.f16199.f42721.m47087(EnumC20934.f68046, EnumC20934.f68171, EnumC20934.f68072)) {
            return;
        }
        if (enumC13777 != null) {
            this.f16198.mo2149(j, "Wrong tag: Either {0} or {1} expected", enumC13776.m33538(), enumC13777.m33538());
        } else {
            this.f16198.mo2149(j, "Wrong tag: {0} expected", enumC13776.m33538());
        }
        C6055 c6055 = new C6055();
        c6055.m16453();
        throw c6055;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final EnumC11659 m34786() {
        EnumC11659 enumC11659M7621;
        int i = C17262.f55005[this.f16199.f42721.ordinal()];
        if (i != 1) {
            enumC11659M7621 = i != 4 ? null : C2485.m7619(this.f16199.f42724);
        } else {
            enumC11659M7621 = C2485.m7621(this.f16199.f42726);
        }
        if (enumC11659M7621 == null) {
            this.f16198.mo2150("Subtag expected", new Object[0]);
            throw new C6055();
        }
        this.f16199.m31840();
        return enumC11659M7621;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C15187 m34797() {
        C12842 c12842 = this.f16199;
        EnumC20934 enumC20934 = c12842.f42721;
        if (enumC20934 == EnumC20934.f68161) {
            int i = c12842.f42726;
            c12842.m31840();
            return this.f47348.m31654(i);
        }
        if (enumC20934 == EnumC20934.f68034 || enumC20934.m47090()) {
            C12842 c12843 = this.f16199;
            String str = c12843.f42724;
            c12843.m31840();
            C12738 c12738 = this.f47348;
            c12738.getClass();
            return c12738.m31658((AbstractC21536) new C5682(EnumC13776.f45424, c12738.m31655(str)));
        }
        m34758("Either package name or Constant Pool index expected, got {0}");
        throw null;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C15187 m34799() {
        C12842 c12842 = this.f16199;
        EnumC20934 enumC20934 = c12842.f42721;
        if (enumC20934 == EnumC20934.f68161) {
            int i = c12842.f42726;
            c12842.m31840();
            return this.f47348.m31654(i);
        }
        if (enumC20934 == EnumC20934.f68034 || enumC20934.m47083()) {
            C12842 c12843 = this.f16199;
            String str = c12843.f42724;
            c12843.m31840();
            C12738 c12738 = this.f47348;
            c12738.getClass();
            return c12738.m31658((AbstractC21536) new C5682(EnumC13776.f45430, c12738.m31655(str)));
        }
        m34758("Either a module name or Constant Pool index expected, got {0}");
        throw null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C15187 m34792(boolean z) {
        C12842 c12842 = this.f16199;
        EnumC20934 enumC20934 = c12842.f42721;
        if (enumC20934 == EnumC20934.f68161) {
            int i = c12842.f42726;
            c12842.m31840();
            return this.f47348.m31654(i);
        }
        if (enumC20934 != EnumC20934.f68034 && !enumC20934.m47090()) {
            m34758("Either a class name or Constant Pool index expected, got {0}");
            throw null;
        }
        C12842 c12843 = this.f16199;
        String strM50267 = c12843.f42724;
        c12843.m31840();
        if ((z || this.f16199.f42721 == EnumC20934.f68045) && !strM50267.contains("/") && !strM50267.contains("[")) {
            strM50267 = C22697.m50267(new StringBuilder(), this.f47347, strM50267);
        }
        return this.f47348.m31655(strM50267);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m34758(String str) {
        EnumC13776 enumC13776M7622 = C2485.m7622(this.f16199.f42721.m47091());
        this.f16198.m2146("Unrecognized token %s: %s", this.f16199.f42721.toString(), enumC13776M7622 == null ? "null" : enumC13776M7622.m33538());
        throw C7997.m21056(this.f16198, this.f16199.f42722, str, new Object[]{C16236.m38348(this.f16199.f42721, new StringBuilder("\""), "\"")});
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C13173 m34790(int i, String str) {
        C12842 c12842 = this.f16199;
        if (c12842.f42721 == EnumC20934.f68206) {
            c12842.m31840();
        }
        C12842 c12843 = this.f16199;
        if (c12843.f42721 != EnumC20934.f68154) {
            throw C7997.m21056(this.f16198, c12843.f42728, "Integer expected", new Object[0]);
        }
        int i2 = c12843.f42726 * c12843.f42723;
        if (i != 1) {
            if (i != 2) {
                throw new InternalError(C2271.m6966(i, "parseInt(", MotionUtils.EASING_TYPE_FORMAT_END));
            }
            if (i2 > 65535 || i2 < -32768) {
                throw C7997.m21056(this.f16198, c12843.f42728, "{0} value {1} does not fit in {2}", new Object[]{str, Integer.valueOf(i2), "2 bytes"});
            }
        } else if (i2 > 255 || i2 < -128) {
            throw C7997.m21056(this.f16198, c12843.f42728, "{0} value {1} does not fit in {2}", new Object[]{str, Integer.valueOf(i2), "1 byte"});
        }
        c12843.m31840();
        return new C13173(i2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C13173 m34789(int i) {
        C12842 c12842 = this.f16199;
        if (c12842.f42721 != EnumC20934.f68154) {
            throw C7997.m21056(this.f16198, c12842.f42728, "Integer expected", new Object[0]);
        }
        if (c12842.f42723 == -1) {
            throw C7997.m21056(this.f16198, c12842.f42728, "Negative integer is not allowed", new Object[0]);
        }
        int i2 = c12842.f42726;
        if (i != 1) {
            if (i != 2) {
                throw new InternalError(C2271.m6966(i, "parseUInt(", MotionUtils.EASING_TYPE_FORMAT_END));
            }
            if (i2 > 65535) {
                throw C7997.m21056(this.f16198, c12842.f42728, "{0} value {1} does not fit in {2}", new Object[]{"ushort", Integer.valueOf(i2), "2 bytes"});
            }
        } else if (i2 > 255) {
            throw C7997.m21056(this.f16198, c12842.f42728, "{0} value {1} does not fit in {2}", new Object[]{"ubyte", Integer.valueOf(i2), "1 byte"});
        }
        c12842.m31840();
        return new C13173(i2);
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private void m34778() {
        while (true) {
            C12842 c12842 = this.f16199;
            if (c12842.f42721 == EnumC20934.f68161) {
                int i = c12842.f42726;
                c12842.m31840();
                this.f16199.m31848(EnumC20934.f68094);
                String.format("\ncpIndex: %d", Integer.valueOf(i));
                this.f47348.m31659(i, this.f47343.m3886());
                C12842 c12843 = this.f16199;
                if (c12843.f42721 != EnumC20934.f68072) {
                    c12843.m31848(EnumC20934.f68171);
                    return;
                }
                c12843.m31840();
            } else {
                this.f16198.mo2150("Constant declaration expected", new Object[0]);
                throw new C6055();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:41:0x00eb A[SYNTHETIC] */
    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final int m34798() {
        int iM52558;
        int iM52559;
        int iM525510;
        int i = 0;
        while (true) {
            int i2 = C17262.f55005[this.f16199.f42721.ordinal()];
            if (i2 != 1) {
                switch (i2) {
                    case 5:
                        iM52558 = EnumC23839.f77039.m52558();
                        break;
                    case 6:
                        iM52558 = EnumC23839.f77049.m52558();
                        break;
                    case 7:
                        iM52558 = EnumC23839.f77081.m52558();
                        break;
                    case 8:
                        iM52558 = EnumC23839.f77065.m52558();
                        break;
                    case 9:
                        iM52558 = EnumC23839.f77068.m52558();
                        break;
                    case 10:
                        iM52558 = EnumC23839.f77070.m52558();
                        break;
                    case 11:
                        iM52558 = EnumC23839.f77082.m52558();
                        break;
                    case 12:
                        iM52559 = EnumC23839.f77040.m52558();
                        iM525510 = EnumC23839.f77062.m52558();
                        iM52558 = iM52559 | iM525510;
                        break;
                    case 13:
                        iM52559 = EnumC23839.f77054.m52558();
                        iM525510 = EnumC23839.f77062.m52558();
                        iM52558 = iM52559 | iM525510;
                        break;
                    case 14:
                        iM52558 = EnumC23839.f77055.m52558();
                        break;
                    case 15:
                        iM52558 = EnumC23839.f77059.m52558();
                        break;
                    case 16:
                        iM52558 = EnumC23839.f77075.m52558();
                        break;
                    case 17:
                        iM52558 = EnumC23839.f77077.m52558();
                        break;
                    case 18:
                        iM52558 = EnumC23839.f77066.m52558();
                        break;
                    case 19:
                        iM52558 = EnumC23839.f77056.m52558();
                        break;
                    case 20:
                        iM52558 = EnumC23839.f77073.m52558();
                        break;
                    case 21:
                        iM52558 = EnumC23839.f77052.m52558();
                        break;
                    case 22:
                        iM52558 = EnumC23839.f77083.m52558();
                        break;
                    case 23:
                        if (this.f47341.f31849.m45842()) {
                            iM52558 = EnumC23839.f77067.m52558();
                        } else {
                            iM52558 = EnumC23839.f77080.m52558();
                        }
                        break;
                    case 24:
                        iM52558 = EnumC23839.f77050.m52558();
                        break;
                    case 25:
                        iM52558 = EnumC23839.f77058.m52558();
                        break;
                    case 26:
                        iM52558 = EnumC23839.f77044.m52558();
                        break;
                    default:
                        iM52558 = 0;
                        break;
                }
                if (iM52558 == 0) {
                    return i;
                }
                i |= iM52558;
            } else {
                iM52558 = this.f16199.f42726;
            }
            C12842 c12842 = this.f16199;
            long j = c12842.f42728;
            c12842.m31840();
            if ((i & iM52558) != 0) {
                this.f16198.mo2164(j, "Ambiguous use of similar modifiers", new Object[0]);
            } else {
                if (iM52558 == 0) {
                    return i;
                }
                i |= iM52558;
            }
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private void m34769(int i) {
        C9398 c9398 = this.f47341;
        long j = this.f16199.f42722;
        C18111 c18111 = (C18111) c9398.m17095();
        int iM52537 = EnumC23839.m52537(i, EnumC23839.f77058, EnumC23839.f77067);
        if (EnumC23839.m52527(c9398.f20887)) {
            int i2 = EnumC23839.m52544(iM52537) ? (~EnumC23839.f77080.m52558()) & iM52537 : iM52537;
            if (EnumC23839.m52543(i2)) {
                i2 &= ~EnumC23839.f77052.m52558();
            }
            if (!EnumC23839.m52551(i2, EnumC23839.f77039, EnumC23839.f77065, EnumC23839.f77068)) {
                c18111.mo2164(j, "\"{0}\": Interface field must be ACC_PUBLIC, ACC_STATIC, and ACC_FINAL only and may have ACC_STRICT_INIT or ACC_SYNTHETIC flag set", EnumC23839.m52538(iM52537, EnumC0554.FIELD));
            }
            if (!EnumC23839.m52531(iM52537)) {
                c18111.mo2164(j, "\"{0}\": Interface field must be ACC_PUBLIC, ACC_STATIC, and ACC_FINAL only and may have ACC_STRICT_INIT or ACC_SYNTHETIC flag set", EnumC23839.m52538(iM52537, EnumC0554.FIELD));
            }
        } else {
            if (EnumC23839.m52542() == EnumC0554.VALUE_OBJECTS && !EnumC23839.m52513(c9398.f20887) && !EnumC23839.m52523(iM52537, EnumC23839.f77065, EnumC23839.f77052)) {
                c18111.mo2164(j, "\"{0}\": Each field of a value class must have at least one of its ACC_STATIC or ACC_STRICT_INIT flags set", EnumC23839.m52538(iM52537, EnumC0554.FIELD));
            }
            int iM52511 = EnumC23839.m52511(iM52537, EnumC23839.f77038);
            if (iM52511 != 0) {
                c18111.mo2164(j, "Invalid modifier(s) for a field {0}", EnumC23839.m52538(iM52511, EnumC0554.FIELD));
            }
            if (!EnumC23839.m52510(iM52537, EnumC23839.f77039, EnumC23839.f77049, EnumC23839.f77081)) {
                c18111.mo2164(j, "\"{0}\": Each field of a class may have at most one of its ACC_PUBLIC, ACC_PRIVATE, and ACC_PROTECTED flags set", EnumC23839.m52538(iM52537, EnumC0554.FIELD));
            }
            if (EnumC23839.m52522(iM52537, EnumC23839.f77068, EnumC23839.f77055)) {
                c18111.mo2164(j, "\"{0}\": Each field of a class must not have both its ACC_FINAL and ACC_VOLATILE flags set", EnumC23839.m52538(iM52537, EnumC0554.FIELD));
            }
        }
        while (true) {
            C15187 c15187M34802 = m34802();
            C12842 c12842 = this.f16199;
            EnumC20934 enumC20934 = EnumC20934.f68046;
            c12842.m31848(enumC20934);
            C15187 c15187M34803 = m34802();
            C9398 c9399 = this.f47341;
            c9399.getClass();
            C22345 c22345M24122 = c9399.m24122(i, new C4270(c15187M34802, c15187M34803));
            ArrayList arrayList = this.f47351;
            if (arrayList != null) {
                c22345M24122.m17092(arrayList);
            }
            C12842 c12843 = this.f16199;
            if (c12843.f42721 == enumC20934) {
                c12843.m31840();
                C12842 c12844 = this.f16199;
                if (c12844.f42721 == EnumC20934.f68121) {
                    c12844.m31840();
                }
                c22345M24122.m17093(m34802());
            }
            C12842 c12845 = this.f16199;
            if (c12845.f42721 == EnumC20934.f68094) {
                c12845.m31840();
                c22345M24122.m49554(this.f47343.m3881(null, null, false));
            }
            C12842 c12846 = this.f16199;
            if (c12846.f42721 == enumC20934) {
                c12846.m31840();
                EnumC16783 enumC16783 = EnumC16783.f53727;
                c22345M24122.getClass();
                if (C5411.f18687[enumC16783.ordinal()] != 1) {
                    throw new IllegalStateException(C7997.m21055("Unexpected attribute: ", enumC16783.m39431(), " in ", c22345M24122.f20885.name()));
                }
                if (c22345M24122.f20891 != null) {
                    this.f16198.mo2164(this.f16199.f42728, "Signature attribute repeated", new Object[0]);
                }
                C12842 c12847 = this.f16199;
                if (c12847.f42721 == EnumC20934.f68121) {
                    c12847.m31840();
                }
                c22345M24122.m17093(m34802());
            }
            C12842 c12848 = this.f16199;
            if (c12848.f42721 != EnumC20934.f68072) {
                c12848.m31848(EnumC20934.f68171);
                return;
            }
            c12848.m31840();
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
    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    private void m34784(int i) {
        char c;
        EnumC23839[] enumC23839Arr;
        int i2;
        String str;
        C1511 c1511;
        EnumC20934 enumC20934;
        C13173 c13173M34789;
        int i3;
        C13173 c13173;
        TreeMap treeMap;
        ArrayList arrayList;
        C15187 c15187M34802;
        int i4;
        int i5;
        int i6;
        String str2;
        char c2;
        int i7;
        long j = this.f16199.f42722;
        C15187 c15187M34803 = m34802();
        String str3 = (String) ((C20499) c15187M34803.f49578).f69953;
        boolean zEquals = str3.equals("<clinit>");
        boolean z = str3.equals("<init>") && !EnumC23839.m52528(i);
        C9398 c9398 = this.f47341;
        C18111 c18111 = (C18111) c9398.m17095();
        C20311 c20311 = c9398.f31849;
        int iM45841 = c20311.m45841();
        int iM52537 = EnumC23839.m52537(i, EnumC23839.f77058, EnumC23839.f77067);
        EnumC23839[] enumC23839Arr2 = EnumC23839.f77051;
        if (!EnumC23839.m52551(iM52537, enumC23839Arr2)) {
            c18111.mo2164(j, "Invalid modifier(s) for a method {0}", EnumC23839.m52538((~EnumC23839.m52516(enumC23839Arr2)) & iM52537, EnumC0554.METHOD));
        }
        EnumC23839 enumC23839 = EnumC23839.f77039;
        EnumC23839 enumC238310 = EnumC23839.f77049;
        EnumC23839 enumC238311 = EnumC23839.f77081;
        if (EnumC23839.m52510(iM52537, enumC23839, enumC238310, enumC238311)) {
            c = 3;
        } else {
            c = 3;
            c18111.mo2164(j, "Each method of a class may have at most one of its ACC_PUBLIC, ACC_PRIVATE, and ACC_PROTECTED flags set {0}", EnumC23839.m52538(iM52537, EnumC0554.METHOD));
        }
        if (zEquals) {
            if (c20311.m45841() > 51 && !EnumC23839.m52528(iM52537)) {
                c18111.mo2164(j, "In a class file whose version number is 51.0 or above, a method whose name is <clinit> must have its ACC_STATIC flag set {0}", EnumC23839.m52538(iM52537, EnumC0554.METHOD));
            }
        } else if (EnumC23839.m52527(c9398.f20887)) {
            if (z) {
                c18111.mo2164(j, "<init> method cannot be an interface method", new Object[0]);
            } else {
                int iM45842 = c20311.m45841();
                C18111 c18112 = (C18111) c9398.m17095();
                EnumC23839[] enumC23839Arr3 = new EnumC23839[4];
                enumC23839Arr3[0] = enumC238311;
                enumC23839Arr3[1] = EnumC23839.f77068;
                enumC23839Arr3[2] = EnumC23839.f77070;
                enumC23839Arr3[c] = EnumC23839.f77066;
                if (EnumC23839.m52523(iM52537, enumC23839Arr3)) {
                    c18112.mo2164(j, "Methods of interfaces  must not have ACC_PROTECTED, ACC_FINAL, ACC_SYNCHRONIZED and ACC_NATIVE flags set {0}", EnumC23839.m52538(iM52537, EnumC0554.METHOD));
                }
                if (iM45842 < 52) {
                    if (!EnumC23839.m52522(iM52537, enumC23839, EnumC23839.f77073)) {
                        c18112.mo2164(j, "In a class file whose version number is less than 52.0, each method of interface must be abstract public only {0}", EnumC23839.m52538(iM52537, EnumC0554.METHOD));
                    } else if (!EnumC23839.m52510(iM52537, enumC23839, enumC238310)) {
                        c18112.mo2164(j, "In a class file whose version number is 52.0 or above, each method of an interface must have exactly one of its ACC_PUBLIC and ACC_PRIVATE flags set {0}", EnumC23839.m52538(iM52537, EnumC0554.METHOD));
                    }
                }
            }
        } else if (z) {
            EnumC23839[] enumC23839Arr4 = EnumC23839.f77072;
            if (((~EnumC23839.m52516(enumC23839Arr4)) & iM52537) != 0) {
                c18111.mo2164(j, "Invalid modifier(s) for <init> method {0}", EnumC23839.m52538((~EnumC23839.m52516(enumC23839Arr4)) & iM52537, EnumC0554.METHOD));
            } else if (EnumC23839.m52539(iM52537)) {
                enumC23839Arr = EnumC23839.f77071;
                if (((~EnumC23839.m52516(enumC23839Arr)) & iM52537) == 0) {
                    c18111.mo2164(j, "Invalid modifier(s) for abstract method {0}", EnumC23839.m52538((~EnumC23839.m52516(enumC23839Arr)) & iM52537, EnumC0554.METHOD));
                } else if (EnumC23839.m52543(iM52537) && iM45841 >= 46 && iM45841 <= 60) {
                    c18111.mo2164(j, "If a method of a class or interface (whose major version number is at least 46 and at most 60) has its ACC_ABSTRACT flag set, it must not have its ACC_STRICT flag set", new Object[0]);
                }
            }
        } else if (EnumC23839.m52539(iM52537)) {
            enumC23839Arr = EnumC23839.f77071;
            if (((~EnumC23839.m52516(enumC23839Arr)) & iM52537) == 0) {
                c18111.mo2164(j, "Invalid modifier(s) for abstract method {0}", EnumC23839.m52538((~EnumC23839.m52516(enumC23839Arr)) & iM52537, EnumC0554.METHOD));
            } else if (EnumC23839.m52543(iM52537)) {
                c18111.mo2164(j, "If a method of a class or interface (whose major version number is at least 46 and at most 60) has its ACC_ABSTRACT flag set, it must not have its ACC_STRICT flag set", new Object[0]);
            }
        }
        this.f16199.m31848(EnumC20934.f68046);
        C15187 c15187M34804 = m34802();
        try {
            String str4 = (String) ((C20499) c15187M34804.f49578).f69953;
            int length = str4.length();
            String str5 = "\"({JavaTypeSignature})Result\" is missing.";
            if (length <= 0) {
                i4 = 0;
                i5 = 0;
                i6 = i4;
                i2 = i5;
                str2 = str5;
                c2 = 1;
                C18111 c18113 = this.f16198;
                long j2 = this.f16199.f42722;
                Object[] objArr = new Object[2];
                objArr[0] = Integer.valueOf(i6 + 1);
                objArr[c2] = str2;
                c18113.mo2164(j2, "Malformed method signature at position {0}. {1}", objArr);
            } else if (str4.charAt(0) != '(') {
                str5 = "A \"(\" token is expected in \"({JavaTypeSignature})Result\"";
                i4 = 0;
                i5 = 0;
                i6 = i4;
                i2 = i5;
                str2 = str5;
                c2 = 1;
                C18111 c18114 = this.f16198;
                long j3 = this.f16199.f42722;
                Object[] objArr2 = new Object[2];
                objArr2[0] = Integer.valueOf(i6 + 1);
                objArr2[c2] = str2;
                c18114.mo2164(j3, "Malformed method signature at position {0}. {1}", objArr2);
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
                                C18111 c18115 = this.f16198;
                                long j4 = this.f16199.f42722;
                                Object[] objArr3 = new Object[2];
                                objArr3[0] = Integer.valueOf(i6 + 1);
                                objArr3[c2] = str2;
                                c18115.mo2164(j4, "Malformed method signature at position {0}. {1}", objArr3);
                            }
                        }
                    }
                    i4 = i6;
                    i5 = i2;
                    i6 = i4;
                    i2 = i5;
                    str2 = str5;
                    c2 = 1;
                    C18111 c18116 = this.f16198;
                    long j5 = this.f16199.f42722;
                    Object[] objArr4 = new Object[2];
                    objArr4[0] = Integer.valueOf(i6 + 1);
                    objArr4[c2] = str2;
                    c18116.mo2164(j5, "Malformed method signature at position {0}. {1}", objArr4);
                }
            }
        } catch (ClassCastException | NullPointerException unused) {
            i2 = 0;
        }
        if (!EnumC23839.m52528(i) && !zEquals) {
            i2++;
        }
        if (i2 > 255) {
            this.f16198.mo2164(this.f16199.f42728, "Number of parameters too large ({0}>255)", Integer.toString(i2));
        }
        C14585 c14585M24121 = this.f47341.m24121(i, c15187M34803, c15187M34804);
        c14585M24121.m17092(this.f47351);
        C9398 c9399 = c14585M24121.f47729;
        C12842 c12842 = this.f16199;
        if (c12842.f42721 == EnumC20934.f68046) {
            c12842.m31840();
            if (!this.f16199.m31844(EnumC20934.f68161, EnumC20934.f68096, EnumC20934.f68034)) {
                throw C7997.m21056(this.f16198, this.f16199.f42728, "Either name or Constant Pool index expected, got {0}", new Object[]{C16236.m38348(this.f16199.f42721, new StringBuilder("\""), "\"")});
            }
            c14585M24121.m17093(m34802());
        }
        boolean z3 = this.f16199.f42721 == EnumC20934.f68171;
        boolean z4 = false;
        boolean z5 = true;
        do {
            int i8 = C17262.f55005[this.f16199.f42721.ordinal()];
            str = "\"{0}\" token is expected";
            c1511 = this.f47342;
            EnumC13776 enumC13776 = null;
            switch (i8) {
                case 27:
                    if (c14585M24121.f47731 != null) {
                        this.f16198.mo2164(this.f16199.f42728, "The {0} attribute repeated in the method_info structure", EnumC16783.f53730.m39431());
                    }
                    this.f16199.m31840();
                    ArrayList arrayList2 = new ArrayList();
                    while (true) {
                        arrayList2.add(this.f47343.m3881(EnumC13776.f45400, enumC13776, false));
                        C12842 c12843 = this.f16199;
                        EnumC20934 enumC20935 = c12843.f42721;
                        enumC20934 = EnumC20934.f68171;
                        if (enumC20935 != enumC20934 && enumC20935 == EnumC20934.f68072) {
                            enumC13776 = null;
                            c12843.m31840();
                        }
                    }
                    c14585M24121.getClass();
                    if (!arrayList2.isEmpty()) {
                        C3564 c3564 = c14585M24121.f47731;
                        if (c3564 == null) {
                            c14585M24121.f47731 = new C3564(c14585M24121.f47729.f20884, EnumC16783.f53730, arrayList2);
                        } else {
                            c3564.addAll(arrayList2);
                        }
                    }
                    C12842 c12844 = this.f16199;
                    if (c12844.f42721 != enumC20934) {
                        if (c12844.m31844(EnumC20934.f68108, EnumC20934.f68042, EnumC20934.f68039)) {
                        }
                        z4 = false;
                    } else {
                        c12844.m31840();
                    }
                    z5 = false;
                    z4 = false;
                    break;
                case 28:
                    if (c14585M24121.f47730 != null) {
                        this.f16198.m42172(this.f16199.f42728, "The {0} attribute repeated in the method_info structure", EnumC16783.f53743.m39431());
                        throw null;
                    }
                    c14585M24121.f47730 = c1511.m5218();
                    C12842 c12845 = this.f16199;
                    if (c12845.f42721 == EnumC20934.f68171) {
                        z3 = true;
                        z5 = false;
                    } else if (!c12845.m31844(EnumC20934.f68121, EnumC20934.f68198)) {
                    }
                    this.f16199.m31840();
                    break;
                    break;
                case 29:
                    this.f16199.m31840();
                    if (c14585M24121.f20891 != null) {
                        this.f16198.mo2164(this.f16199.f42728, "The {0} attribute repeated in the method_info structure", EnumC16783.f53727.m39431());
                    }
                    c14585M24121.m17093(m34802());
                    z4 = false;
                    break;
                case 30:
                    this.f16199.m31840();
                    z5 = false;
                    break;
                case 31:
                    this.f16199.m31840();
                    z4 = true;
                    break;
                default:
                    if (z4) {
                        ArrayList<EnumC20934> arrayList3 = new ArrayList();
                        if (c14585M24121.f47730 == null) {
                            arrayList3.add(EnumC20934.f68097);
                        }
                        if (c14585M24121.f47731 == null) {
                            arrayList3.add(EnumC20934.f68198);
                        }
                        if (c14585M24121.f20891 == null) {
                            arrayList3.add(EnumC20934.f68121);
                        }
                        if (arrayList3.size() == 1) {
                            this.f16198.m42172(this.f16199.f42722, "\"{0}\" token is expected", ((EnumC20934) arrayList3.get(0)).m47084());
                            throw null;
                        }
                        C18111 c18117 = this.f16198;
                        long j6 = this.f16199.f42722;
                        StringBuilder sb = new StringBuilder("");
                        for (EnumC20934 enumC20936 : arrayList3) {
                            if (sb.length() > 0) {
                                sb.append(", ");
                            }
                            sb.append('\'');
                            sb.append(enumC20936.m47084());
                            sb.append('\'');
                        }
                        c18117.m42172(j6, "One of {0} tokens is expected", sb.toString());
                        throw null;
                    }
                    z5 = false;
                    break;
            }
        } while (z5);
        if (!z3) {
            C13173 c13174 = null;
            C13173 c13173M347810 = null;
            while (true) {
                C12842 c12846 = this.f16199;
                if (c12846.f42721 == EnumC20934.f68108) {
                    c12846.m31840();
                    i3 = 2;
                    c13173M34789 = m34789(2);
                } else {
                    c13173M34789 = c13174;
                    i3 = 2;
                }
                C12842 c12847 = this.f16199;
                if (c12847.f42721 == EnumC20934.f68042) {
                    c12847.m31840();
                    c13173M347810 = m34789(i3);
                }
                if (this.f16199.f42721 == EnumC20934.f68154) {
                    c1511.f16199.m31841(C2271.m6966(i2, " - - - > [ParserAnnotation.parseParamAnnots]: Begin, totalParams =  ", " "));
                    TreeMap treeMap2 = new TreeMap();
                    while (true) {
                        C12842 c12848 = c1511.f16199;
                        if (c12848.f42721 == EnumC20934.f68154) {
                            int i9 = c12848.f42726;
                            Integer numValueOf = Integer.valueOf(i9);
                            if (i9 < 0 || i9 >= i2) {
                                c1511.f16198.mo2149(c1511.f16199.f42728, "Invalid Parameter Number: {0}", Integer.valueOf(i9));
                            }
                            if (treeMap2.get(numValueOf) != null) {
                                c1511.f16198.mo2149(c1511.f16199.f42728, "Duplicate Parameter Number: {0}", Integer.valueOf(i9));
                            }
                            c1511.f16199.m31840();
                            c1511.f16199.m31848(EnumC20934.f68046);
                            C12842 c12849 = c1511.f16199;
                            if (c12849.f42721 == EnumC20934.f68070) {
                                c12849.m31841(" - - - > [ParserAnnotation.scanParamName]: Begin ");
                                c1511.f16199.m31840();
                                c1511.f16199.m31848(EnumC20934.f68039);
                                EnumC20934 enumC20937 = c1511.f16199.f42721;
                                if (enumC20937 == EnumC20934.f68096 || enumC20937.m47088()) {
                                    c15187M34802 = c1511.f16200.m34802();
                                } else {
                                    C12842 c128410 = c1511.f16199;
                                    if (c128410.f42721 != EnumC20934.f68161) {
                                        throw C7997.m21056(c1511.f16198, c128410.f42728, "Incorrect ParamName, unrecognized token: \"{0}\"", new Object[]{c128410.f42724});
                                    }
                                    int i10 = c128410.f42726;
                                    c15187M34802 = c1511.f16200.f47348.m31654(i10);
                                    if (!(c15187M34802.f49578 instanceof C20499)) {
                                        throw C7997.m21056(c1511.f16198, c1511.f16199.f42728, "ParameterName CPX at {0} is not a ConstantString", new Object[]{Integer.valueOf(i10)});
                                    }
                                }
                                int iM34798 = c1511.f16200.m34798();
                                c1511.f16199.m31848(EnumC20934.f68195);
                                C18111 c18118 = (C18111) c14585M24121.m17095();
                                StringBuilder sbM40153 = C17214.m40153(i9, "addMethodParameter Param[", "] (name: ");
                                sbM40153.append(c15187M34802.toString());
                                sbM40153.append(", Flags (");
                                sbM40153.append(iM34798);
                                sbM40153.append(").");
                                int i11 = 0;
                                c18118.m2146(sbM40153.toString(), new Object[0]);
                                if (c14585M24121.f47726 == null) {
                                    c14585M24121.f47726 = new C3564(c9399.f20884, EnumC16783.f53751, 0);
                                    int i12 = 0;
                                    while (i12 < i2) {
                                        c14585M24121.f47726.m10556(new C23757(i11, null));
                                        i12++;
                                        i11 = 0;
                                        c13173M347810 = c13173M347810;
                                    }
                                }
                                c13173 = c13173M347810;
                                c14585M24121.f47726.m10554(i9, new C23757(iM34798, c15187M34802));
                                c1511.f16199.m31841(" - - - > [ParserAnnotation.scanParamName]: End ");
                            } else {
                                c13173 = c13173M347810;
                            }
                            if (c1511.f16199.f42721 == EnumC20934.f68105) {
                                ArrayList<C11514> arrayListM5217 = c1511.m5217();
                                treeMap2.put(numValueOf, arrayListM5217);
                                for (C11514 c11514 : arrayListM5217) {
                                    if (c11514.f38708) {
                                        if (c14585M24121.f47727 == null) {
                                            c14585M24121.f47727 = new C11057(c9399.f20884, EnumC16783.f53746, i2);
                                        }
                                        treeMap = c14585M24121.f47727.f37542;
                                        arrayList = (ArrayList) treeMap.get(Integer.valueOf(i9));
                                        if (arrayList == null) {
                                            arrayList = new ArrayList();
                                            treeMap.put(Integer.valueOf(i9), arrayList);
                                        }
                                    } else {
                                        if (c14585M24121.f47728 == null) {
                                            c14585M24121.f47728 = new C11057(c9399.f20884, EnumC16783.f53729, i2);
                                        }
                                        treeMap = c14585M24121.f47728.f37542;
                                        arrayList = (ArrayList) treeMap.get(Integer.valueOf(i9));
                                        if (arrayList == null) {
                                            arrayList = new ArrayList();
                                            treeMap.put(Integer.valueOf(i9), arrayList);
                                        }
                                    }
                                    arrayList.add(c11514);
                                }
                            }
                            str = str;
                            c13173M347810 = c13173;
                        }
                    }
                }
                C13173 c13175 = c13173M347810;
                String str6 = str;
                if (this.f16199.f42721.m47087(EnumC20934.f68108, EnumC20934.f68042, EnumC20934.f68154)) {
                    c13173M347810 = c13175;
                    c13174 = c13173M34789;
                    str = str6;
                } else if (this.f16199.f42721 == EnumC20934.f68171) {
                    if (c13173M34789 != null || c13175 != null) {
                        this.f16198.mo2150(str6, EnumC20934.f68039.m47084());
                    }
                    this.f16199.m31840();
                } else if (EnumC23839.m52539(i)) {
                    C12842 c128411 = this.f16199;
                    if (c128411.f42721 == EnumC20934.f68039) {
                        c128411.m31840();
                        C22948 c22948 = new C22948(c14585M24121, i2, c13173M34789, c13175);
                        c14585M24121.f47733 = c22948;
                        this.f47345 = c22948;
                        m34783();
                        this.f47345.m50792();
                        this.f16199.m31848(EnumC20934.f68195);
                    }
                } else {
                    this.f16199.m31848(EnumC20934.f68039);
                    C22948 c22949 = new C22948(c14585M24121, i2, c13173M34789, c13175);
                    c14585M24121.f47733 = c22949;
                    this.f47345 = c22949;
                    m34783();
                    this.f47345.m50792();
                    this.f16199.m31848(EnumC20934.f68195);
                }
            }
        }
        this.f47341.f31839 = null;
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
    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    private void m34783() {
        EnumC20934 enumC20934;
        C12842 c12842;
        EnumC20934 enumC20935;
        C2922 c2922;
        char c;
        C12842 c12843;
        EnumC20934 enumC20936;
        EnumC20934 enumC20937;
        C12842 c12844;
        EnumC20934 enumC20938;
        C12842 c12845;
        EnumC20934 enumC20939;
        EnumC20934 enumC209310;
        C12842 c12846;
        EnumC20934 enumC209311;
        C12842 c12847;
        EnumC20934 enumC209312;
        EnumC20934 enumC209313;
        C12842 c12848;
        EnumC20934 enumC209314;
        while (true) {
            while (true) {
                EnumC20934 enumC209315 = this.f16199.f42721;
                if (enumC209315 == EnumC20934.f68179 || enumC209315 == (enumC20934 = EnumC20934.f68195)) {
                    return;
                }
                this.f47354.m11177();
                c12842 = this.f16199;
                enumC20935 = c12842.f42721;
                if (enumC20935 == enumC20934) {
                    return;
                }
                EnumC20934 enumC209316 = EnumC20934.f68144;
                c2922 = this.f47344;
                if (enumC20935 == enumC209316) {
                    C22948 c22948 = this.f47345;
                    c2922.getClass();
                    ArrayList arrayList = new ArrayList();
                    c2922.f16199.m31840();
                    C12842 c12849 = c2922.f16199;
                    if (c12849.f42721 == EnumC20934.f68046) {
                        c12849.m31840();
                    }
                    int i = -1;
                    boolean z = true;
                    boolean z2 = false;
                    while (true) {
                        EnumC20934 enumC209317 = c2922.f16199.f42721;
                        if (enumC209317 != EnumC20934.f68179 && enumC209317 != EnumC20934.f68195) {
                            int i2 = C9274.f31532[enumC209317.ordinal()];
                            if (i2 != 7) {
                                if (i2 == 20) {
                                    if (z) {
                                        c2922.f16198.m42172(c2922.f16199.f42728, "The LineNumberTable format is incorrect; \"{0}\" is expected", "line keyword");
                                        throw null;
                                    }
                                    if (i == -1) {
                                        c2922.f16198.m42172(c2922.f16199.f42728, "The LineNumberTable format is incorrect; \"{0}\" is expected", "line_number:");
                                        throw null;
                                    }
                                    if (z2) {
                                        c2922.f16198.m42172(c2922.f16199.f42728, "The LineNumberTable format is incorrect; \"{0}\" is expected", "start_pc");
                                        throw null;
                                    }
                                    z2 = true;
                                } else if (i2 == 21) {
                                    if (!z) {
                                        c2922.f16198.m42172(c2922.f16199.f42728, "The LineNumberTable format is incorrect; \"{0}\" is expected", "line  line_number:  start_pc");
                                        throw null;
                                    }
                                    z = false;
                                } else if (i != -1 || !z) {
                                    c2922.f16198.m42172(c2922.f16199.f42728, "The LineNumberTable format is incorrect; \"{0}\" is expected", "line  line_number:  start_pc");
                                    throw null;
                                }
                            } else if (i == -1) {
                                i = c2922.f16199.f42726;
                            } else {
                                arrayList.add(new C0472(c2922.f16199.f42726, i));
                                i = -1;
                                z = true;
                                z2 = false;
                            }
                            c2922.f16199.m31840();
                        }
                    }
                    C3564 c3564 = c22948.f74592;
                    if (c3564 != null) {
                        c3564.clear();
                    } else {
                        C3564 c3565 = new C3564(c22948.f74601.f20884, EnumC16783.f53722);
                        c22948.f74592 = c3565;
                        c22948.f74582.m52871(c3565);
                    }
                    c22948.f74592.addAll(arrayList);
                } else if (enumC20935 == EnumC20934.f68217) {
                    this.f47345.m50790(c2922.m8748(false), false);
                } else if (enumC20935 == EnumC20934.f68029) {
                    this.f47345.m50790(c2922.m8748(true), true);
                } else if (enumC20935 == EnumC20934.f68105) {
                    C22948 c22949 = this.f47345;
                    ArrayList<C11514> arrayListM5217 = this.f47342.m5217();
                    C14585 c14585 = c22949.f74601;
                    for (C11514 c11514 : arrayListM5217) {
                        boolean z3 = c11514.f38708;
                        if (c11514 instanceof C7197) {
                            C7197 c7197 = (C7197) c11514;
                            if (z3) {
                                if (c22949.f74593 == null) {
                                    c22949.f74593 = new C3564(c14585.f20884, EnumC16783.f53728);
                                }
                                c22949.f74593.m10556(c7197);
                            } else {
                                if (c22949.f74591 == null) {
                                    c22949.f74591 = new C3564(c14585.f20884, EnumC16783.f53731);
                                }
                                c22949.f74591.m10556(c7197);
                            }
                        }
                    }
                }
            }
            if (enumC20935 == EnumC20934.f68149) {
                C22948 c229410 = this.f47345;
                C12842 c128410 = c2922.f16199;
                if (c128410.f42721 == EnumC20934.f68046) {
                    c128410.m31840();
                }
                ArrayList arrayList2 = new ArrayList();
                EnumC1965 enumC1965 = EnumC1965.UNKNOWN_TYPE;
                C7903 c7903 = null;
                while (true) {
                    EnumC20934 enumC209318 = c2922.f16199.f42721;
                    if (enumC209318 != EnumC20934.f68179 && enumC209318 != EnumC20934.f68195) {
                        switch (C9274.f31532[enumC209318.ordinal()]) {
                            case 10:
                                c2922.f16199.m31840();
                                c2922.f16199.m31848(EnumC20934.f68094);
                                C12842 c128411 = c2922.f16199;
                                if (c128411.f42721 != EnumC20934.f68154) {
                                    c2922.f16198.m42172(c128411.f42728, "{0} is expected", "\"number of entries\"");
                                    throw null;
                                }
                                c2922.f16199.m31840();
                                break;
                            case 11:
                                if (c7903 != null) {
                                    arrayList2.add(c7903);
                                }
                                c2922.f16199.m31840();
                                c2922.f16199.m31848(EnumC20934.f68094);
                                C12842 c128412 = c2922.f16199;
                                if (c128412.f42721 != EnumC20934.f68154) {
                                    c2922.f16198.m42172(c128412.f42728, "{0} is expected", "The offset value");
                                    throw null;
                                }
                                c7903 = new C7903(c2922.f16198, false);
                                c7903.m20918(c2922.f16199.f42726);
                                c2922.f16199.m31840();
                                break;
                                break;
                            case 12:
                                if (c7903 == null) {
                                    c2922.f16198.m42172(c2922.f16199.f42728, "{0} is expected", C16523.m38890("\"", EnumC20934.f68120.m47084(), "\""));
                                    throw null;
                                }
                                C24027 c24027 = c7903.f25983;
                                if (c24027 != null && c24027.f77846.size() > 0) {
                                    c2922.f16198.mo2164(c2922.f16199.f42728, "The {0} overwrites an already declared one.", C16523.m38890("\"", EnumC20934.f68068.m47084(), "\""));
                                }
                                c2922.f16199.m31840();
                                c2922.f16199.m31848(EnumC20934.f68094);
                                C12842 c128413 = c2922.f16199;
                                if (c128413.f42721 == EnumC20934.f68096) {
                                    if (c128413.f42724.equals(EnumC20934.f68157.m47084() + EnumC20934.f68025.m47084())) {
                                        c7903.f25983 = new C24027();
                                        c2922.f16199.m31840();
                                    }
                                }
                                c2922.f16199.m31846(EnumC20934.f68157);
                                C24027 c24028 = new C24027();
                                c7903.f25983 = c24028;
                                while (true) {
                                    C12842 c128414 = c2922.f16199;
                                    EnumC20934 enumC209319 = c128414.f42721;
                                    if (enumC209319 == EnumC20934.f68179) {
                                    }
                                    EnumC20934 enumC209320 = EnumC20934.f68171;
                                    if (enumC209319 == enumC209320) {
                                        c128414.m31840();
                                        c2922.f16199.m31846(EnumC20934.f68025);
                                    }
                                    if (enumC209319 == EnumC20934.f68096 && c128414.f42724.equals(EnumC20934.f68025.m47084())) {
                                    }
                                    c2922.f16200.m34794(c24028);
                                    C12842 c128415 = c2922.f16199;
                                    EnumC20934 enumC209321 = c128415.f42721;
                                    if (enumC209321 == EnumC20934.f68072) {
                                        c128415.m31840();
                                    } else if (enumC209321 != enumC209320) {
                                        c2922.f16198.m42172(c128415.f42728, "\"{0}\" token is expected", C16236.m38348(enumC209320, new StringBuilder("\""), "\""));
                                        throw null;
                                    }
                                    break;
                                    break;
                                    break;
                                }
                                break;
                                break;
                            case 13:
                                if (c7903 == null) {
                                    c2922.f16198.m42172(c2922.f16199.f42728, "{0} is expected", C16523.m38890("\"", EnumC20934.f68120.m47084(), "\""));
                                    throw null;
                                }
                                C24027 c24029 = c7903.f25980;
                                if (c24029 == null || c24029.f77846.size() <= 0) {
                                    c = 0;
                                } else {
                                    c = 0;
                                    c2922.f16198.mo2164(c2922.f16199.f42728, "The {0} overwrites an already declared one.", C16523.m38890("\"", EnumC20934.f68051.m47084(), "\""));
                                }
                                c2922.f16199.m31840();
                                c2922.f16199.m31848(EnumC20934.f68094);
                                C12842 c128416 = c2922.f16199;
                                if (c128416.f42721 == EnumC20934.f68096) {
                                    if (c128416.f42724.equals(EnumC20934.f68157.m47084() + EnumC20934.f68025.m47084())) {
                                        c7903.f25980 = new C24027();
                                        c2922.f16199.m31840();
                                    }
                                }
                                c2922.f16199.m31846(EnumC20934.f68157);
                                C24027 c240210 = new C24027();
                                c7903.f25980 = c240210;
                                while (true) {
                                    C12842 c128417 = c2922.f16199;
                                    EnumC20934 enumC209322 = c128417.f42721;
                                    if (enumC209322 == EnumC20934.f68179) {
                                    }
                                    EnumC20934 enumC209323 = EnumC20934.f68171;
                                    if (enumC209322 == enumC209323) {
                                        c128417.m31840();
                                        c2922.f16199.m31846(EnumC20934.f68025);
                                    }
                                    if (enumC209322 == EnumC20934.f68096 && c128417.f42724.equals(EnumC20934.f68025.m47084())) {
                                    }
                                    c2922.f16200.m34794(c240210);
                                    C12842 c128418 = c2922.f16199;
                                    EnumC20934 enumC209324 = c128418.f42721;
                                    if (enumC209324 == EnumC20934.f68072) {
                                        c128418.m31840();
                                    } else if (enumC209324 != enumC209323) {
                                        C18111 c18111 = c2922.f16198;
                                        long j = c128418.f42728;
                                        Object[] objArr = new Object[1];
                                        objArr[c] = C16236.m38348(enumC209323, new StringBuilder("\""), "\"");
                                        c18111.m42172(j, "\"{0}\" token is expected", objArr);
                                        throw null;
                                    }
                                    break;
                                    break;
                                    break;
                                }
                                break;
                                break;
                            default:
                                c2922.f16199.m31840();
                                break;
                        }
                    }
                }
                if (c7903 != null) {
                    arrayList2.add(c7903);
                }
                c229410.m50789(arrayList2);
            } else if (enumC20935 == EnumC20934.f68067) {
                C22948 c229411 = this.f47345;
                c2922.getClass();
                ArrayList arrayList3 = new ArrayList();
                EnumC1965 enumC1966 = EnumC1965.UNKNOWN_TYPE;
                c2922.f16199.m31840();
                C12842 c128419 = c2922.f16199;
                if (c128419.f42721 == EnumC20934.f68046) {
                    c128419.m31840();
                }
                EnumC1965 enumC1965M6335 = enumC1966;
                C7903 c7904 = null;
                int i3 = -1;
                int i4 = 1;
                int i5 = 0;
                while (true) {
                    EnumC20934 enumC209325 = c2922.f16199.f42721;
                    if (enumC209325 != EnumC20934.f68179) {
                        switch (C9274.f31532[enumC209325.ordinal()]) {
                            case 10:
                                c2922.f16199.m31840();
                                c2922.f16199.m31848(EnumC20934.f68094);
                                C12842 c128420 = c2922.f16199;
                                if (c128420.f42721 != EnumC20934.f68154) {
                                    c2922.f16198.m42172(c128420.f42728, "{0} is expected", "\"number of entries\"");
                                    throw null;
                                }
                                c2922.f16199.m31840();
                                i4 = 1;
                                break;
                            case 11:
                            default:
                                c2922.f16199.m31840();
                                i4 = 1;
                                break;
                            case 12:
                                if (c7904 == null || c7904.m20916() == EnumC1965.SAME_FRAME) {
                                    if (i5 > 0) {
                                        c2922.f16198.m42172(c2922.f16199.f42728, "\"{0}\" token is expected", EnumC20934.f68195.m47084());
                                        throw null;
                                    }
                                    c2922.f16198.m42172(c2922.f16199.f42728, "{0} is expected", C16523.m38890("\"", EnumC20934.f68160.m47084(), "\""));
                                    throw null;
                                }
                                EnumC20934 enumC20934M20910 = c7904.m20910();
                                if (enumC20934M20910 != EnumC20934.f68068) {
                                    c2922.f16198.m42172(c2922.f16199.f42728, "{0} is expected", C16523.m38890("\"", enumC20934M20910.m47084(), "\""));
                                    throw null;
                                }
                                c2922.f16199.m31840();
                                c2922.f16199.m31848(EnumC20934.f68094);
                                c7904.f25983 = new C24027();
                                C12842 c128421 = c2922.f16199;
                                if (c128421.f42721 == EnumC20934.f68096) {
                                    if (c128421.f42724.equals(EnumC20934.f68157.m47084() + EnumC20934.f68025.m47084())) {
                                        c2922.f16199.m31840();
                                    } else {
                                        c2922.f16199.m31846(EnumC20934.f68157);
                                        while (true) {
                                            c12843 = c2922.f16199;
                                            enumC20936 = c12843.f42721;
                                            if (enumC20936 == EnumC20934.f68179) {
                                                enumC20937 = EnumC20934.f68171;
                                                if (enumC20936 == enumC20937) {
                                                    c12843.m31840();
                                                    c2922.f16199.m31846(EnumC20934.f68025);
                                                } else if (enumC20936 == EnumC20934.f68096 || !c12843.f42724.equals(EnumC20934.f68025.m47084())) {
                                                    c2922.f16200.m34794(c7904.f25983);
                                                    c12844 = c2922.f16199;
                                                    enumC20938 = c12844.f42721;
                                                    if (enumC20938 != EnumC20934.f68072) {
                                                        c12844.m31840();
                                                    } else if (enumC20938 == enumC20937) {
                                                        c2922.f16198.m42172(c12844.f42728, "\"{0}\" token is expected", C16236.m38348(enumC20937, new StringBuilder("\""), "\""));
                                                        throw null;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    c2922.f16199.m31846(EnumC20934.f68157);
                                    while (true) {
                                        c12843 = c2922.f16199;
                                        enumC20936 = c12843.f42721;
                                        if (enumC20936 == EnumC20934.f68179) {
                                            enumC20937 = EnumC20934.f68171;
                                            if (enumC20936 == enumC20937) {
                                                c12843.m31840();
                                                c2922.f16199.m31846(EnumC20934.f68025);
                                            } else {
                                                if (enumC20936 == EnumC20934.f68096) {
                                                }
                                                c2922.f16200.m34794(c7904.f25983);
                                                c12844 = c2922.f16199;
                                                enumC20938 = c12844.f42721;
                                                if (enumC20938 != EnumC20934.f68072) {
                                                    c12844.m31840();
                                                } else if (enumC20938 == enumC20937) {
                                                    c2922.f16198.m42172(c12844.f42728, "\"{0}\" token is expected", C16236.m38348(enumC20937, new StringBuilder("\""), "\""));
                                                    throw null;
                                                }
                                            }
                                        }
                                    }
                                }
                                if (c7904.m20910() == null) {
                                    arrayList3.add(c7904);
                                    i4 = 1;
                                    c7904 = null;
                                }
                                i4 = 1;
                                break;
                                break;
                            case 13:
                                if (c7904 == null || c7904.m20916() == EnumC1965.SAME_FRAME) {
                                    if (i5 > 0) {
                                        c2922.f16198.m42172(c2922.f16199.f42728, "\"{0}\" token is expected", EnumC20934.f68195.m47084());
                                        throw null;
                                    }
                                    c2922.f16198.m42172(c2922.f16199.f42728, "{0} is expected", C16523.m38890("\"", EnumC20934.f68160.m47084(), "\""));
                                    throw null;
                                }
                                EnumC20934 enumC20934M20911 = c7904.m20910();
                                if (enumC20934M20911 != EnumC20934.f68051 && (enumC20934M20911 != EnumC20934.f68068 || c7904.m20916() != EnumC1965.FULL_FRAME)) {
                                    c2922.f16198.m42172(c2922.f16199.f42728, "{0} is expected", C16523.m38890("\"", enumC20934M20911.m47084(), "\""));
                                    throw null;
                                }
                                c2922.f16199.m31840();
                                c2922.f16199.m31848(EnumC20934.f68094);
                                c7904.f25980 = new C24027();
                                C12842 c128422 = c2922.f16199;
                                if (c128422.f42721 == EnumC20934.f68096) {
                                    if (c128422.f42724.equals(EnumC20934.f68157.m47084() + EnumC20934.f68025.m47084())) {
                                        c2922.f16199.m31840();
                                    } else {
                                        c2922.f16199.m31846(EnumC20934.f68157);
                                        while (true) {
                                            c12845 = c2922.f16199;
                                            enumC20939 = c12845.f42721;
                                            if (enumC20939 == EnumC20934.f68179) {
                                                enumC209310 = EnumC20934.f68171;
                                                if (enumC20939 == enumC209310) {
                                                    c12845.m31840();
                                                    c2922.f16199.m31846(EnumC20934.f68025);
                                                } else if (enumC20939 == EnumC20934.f68096 || !c12845.f42724.equals(EnumC20934.f68025.m47084())) {
                                                    c2922.f16200.m34794(c7904.f25980);
                                                    c12846 = c2922.f16199;
                                                    enumC209311 = c12846.f42721;
                                                    if (enumC209311 != EnumC20934.f68072) {
                                                        c12846.m31840();
                                                    } else if (enumC209311 == enumC209310) {
                                                        c2922.f16198.m42172(c12846.f42728, "\"{0}\" token is expected", C16236.m38348(enumC209310, new StringBuilder("\""), "\""));
                                                        throw null;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    c2922.f16199.m31846(EnumC20934.f68157);
                                    while (true) {
                                        c12845 = c2922.f16199;
                                        enumC20939 = c12845.f42721;
                                        if (enumC20939 == EnumC20934.f68179) {
                                            enumC209310 = EnumC20934.f68171;
                                            if (enumC20939 == enumC209310) {
                                                c12845.m31840();
                                                c2922.f16199.m31846(EnumC20934.f68025);
                                            } else {
                                                if (enumC20939 == EnumC20934.f68096) {
                                                }
                                                c2922.f16200.m34794(c7904.f25980);
                                                c12846 = c2922.f16199;
                                                enumC209311 = c12846.f42721;
                                                if (enumC209311 != EnumC20934.f68072) {
                                                    c12846.m31840();
                                                } else if (enumC209311 == enumC209310) {
                                                    c2922.f16198.m42172(c12846.f42728, "\"{0}\" token is expected", C16236.m38348(enumC209310, new StringBuilder("\""), "\""));
                                                    throw null;
                                                }
                                            }
                                        }
                                    }
                                }
                                if (c7904.m20910() == null) {
                                    arrayList3.add(c7904);
                                    i4 = 1;
                                    c7904 = null;
                                }
                                i4 = 1;
                                break;
                                break;
                            case 14:
                                if (i5 == 0) {
                                    c2922.f16198.m42172(c2922.f16199.f42728, "early_larval_frame must be declared before the wrapped base_frame.", new Object[0]);
                                    throw null;
                                }
                                c2922.f16199.m31840();
                                i4 = 1;
                                break;
                            case 15:
                                if (i5 != 0) {
                                    i5--;
                                    c2922.f16199.m31840();
                                    i4 = 1;
                                }
                                break;
                            case 16:
                            case 17:
                                c2922.f16199.m31840();
                                c2922.f16199.m31848(EnumC20934.f68094);
                                C12842 c128423 = c2922.f16199;
                                if (c128423.f42721 == EnumC20934.f68154) {
                                    int i6 = c128423.f42726;
                                    i3 = i6;
                                    enumC1965M6335 = EnumC1965.m6335(i6);
                                }
                                if (enumC1965M6335 == EnumC1965.UNKNOWN_TYPE) {
                                    c2922.f16198.m42172(c2922.f16199.f42728, "{0} is expected", "An integer within the range of [0 to 255]");
                                    throw null;
                                }
                                if (enumC1965M6335 == EnumC1965.EARLY_LARVAL) {
                                    if (i5 > 2) {
                                        c2922.f16198.m42172(c2922.f16199.f42728, "base_frame is expected", new Object[0]);
                                        throw null;
                                    }
                                    i5++;
                                }
                                if (c7904 == null) {
                                    c7904 = new C7903(c2922.f16198, c2922.f16200.f47345.f74599.f31849.m45846());
                                } else {
                                    EnumC20934 enumC20934M20912 = c7904.m20910();
                                    if (enumC20934M20912 == null) {
                                        arrayList3.add(c7904);
                                        c7904 = new C7903(c2922.f16198, c2922.f16200.f47345.f74599.f31849.m45846());
                                    } else {
                                        if (enumC20934M20912 != EnumC20934.f68051 && c7904.m20916() != EnumC1965.FULL_FRAME) {
                                            c2922.f16198.m42172(c2922.f16199.f42728, "{0} is expected", C16523.m38890("\"", enumC20934M20912.m47084(), "\""));
                                            throw null;
                                        }
                                        c7904.f25980 = new C24027();
                                        arrayList3.add(c7904);
                                        c7904 = new C7903(c2922.f16198, c2922.f16200.f47345.f74599.f31849.m45846());
                                        c2922.f16198.mo2164(c2922.f16199.f42728, "{0} is expected", C16523.m38890("\"", enumC20934M20912.m47084(), "\""));
                                    }
                                }
                                c7904.m20917(i3);
                                if (c7904.m20910() == null) {
                                    arrayList3.add(c7904);
                                    c7904 = null;
                                }
                                i4 = 1;
                                break;
                                break;
                            case 18:
                                if (c7904 == null || c7904.m20916() == EnumC1965.SAME_FRAME) {
                                    if (i5 > 0) {
                                        c2922.f16198.m42172(c2922.f16199.f42728, "\"{0}\" token is expected", EnumC20934.f68195.m47084());
                                        throw null;
                                    }
                                    c2922.f16198.m42172(c2922.f16199.f42728, "{0} is expected", C16523.m38890("\"", EnumC20934.f68160.m47084(), "\""));
                                    throw null;
                                }
                                EnumC20934 enumC20934M20913 = c7904.m20910();
                                if (enumC20934M20913 != EnumC20934.f68049) {
                                    c2922.f16198.m42172(c2922.f16199.f42728, "{0} is expected", C16523.m38890("\"", enumC20934M20913.m47084(), "\""));
                                    throw null;
                                }
                                c2922.f16199.m31840();
                                c2922.f16199.m31848(EnumC20934.f68094);
                                C12842 c128424 = c2922.f16199;
                                if (c128424.f42721 != EnumC20934.f68154) {
                                    c2922.f16198.m42172(c128424.f42728, "{0} is expected", "The offset_delta value");
                                    throw null;
                                }
                                c7904.m20911(c128424.f42726);
                                if (c7904.m20910() == null) {
                                    arrayList3.add(c7904);
                                    c7904 = null;
                                }
                                c2922.f16199.m31840();
                                i4 = 1;
                                break;
                                break;
                            case 19:
                                if (c7904 == null || c7904.m20916() == EnumC1965.SAME_FRAME) {
                                    if (i5 > 0) {
                                        C18111 c18112 = c2922.f16198;
                                        long j2 = c2922.f16199.f42728;
                                        Object[] objArr2 = new Object[i4];
                                        objArr2[0] = EnumC20934.f68195.m47084();
                                        c18112.m42172(j2, "\"{0}\" token is expected", objArr2);
                                        throw null;
                                    }
                                    C18111 c18113 = c2922.f16198;
                                    long j3 = c2922.f16199.f42728;
                                    Object[] objArr3 = new Object[i4];
                                    objArr3[0] = C16523.m38890("\"", EnumC20934.f68160.m47084(), "\"");
                                    c18113.m42172(j3, "{0} is expected", objArr3);
                                    throw null;
                                }
                                EnumC20934 enumC20934M20914 = c7904.m20910();
                                if (enumC20934M20914 != EnumC20934.f68174) {
                                    c2922.f16198.m42172(c2922.f16199.f42728, "{0} is expected", C16523.m38890("\"", enumC20934M20914.m47084(), "\""));
                                    throw null;
                                }
                                c2922.f16199.m31840();
                                c2922.f16199.m31848(EnumC20934.f68094);
                                c7904.f25986 = new C24027();
                                C12842 c128425 = c2922.f16199;
                                if (c128425.f42721 == EnumC20934.f68096) {
                                    if (c128425.f42724.equals(EnumC20934.f68157.m47084() + EnumC20934.f68025.m47084())) {
                                        c2922.f16199.m31840();
                                    } else {
                                        c2922.f16199.m31846(EnumC20934.f68157);
                                        while (true) {
                                            c12847 = c2922.f16199;
                                            enumC209312 = c12847.f42721;
                                            if (enumC209312 == EnumC20934.f68179) {
                                                enumC209313 = EnumC20934.f68171;
                                                if (enumC209312 == enumC209313) {
                                                    c12847.m31840();
                                                    c2922.f16199.m31846(EnumC20934.f68025);
                                                } else if (enumC209312 == EnumC20934.f68096 || !c12847.f42724.equals(EnumC20934.f68025.m47084())) {
                                                    c2922.f16200.m34801(c7904.f25986);
                                                    c12848 = c2922.f16199;
                                                    enumC209314 = c12848.f42721;
                                                    if (enumC209314 != EnumC20934.f68072) {
                                                        c12848.m31840();
                                                    } else if (enumC209314 == enumC209313) {
                                                        c2922.f16198.m42172(c12848.f42728, "\"{0}\" token is expected", enumC209313.m47084());
                                                        throw null;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    c2922.f16199.m31846(EnumC20934.f68157);
                                    while (true) {
                                        c12847 = c2922.f16199;
                                        enumC209312 = c12847.f42721;
                                        if (enumC209312 == EnumC20934.f68179) {
                                            enumC209313 = EnumC20934.f68171;
                                            if (enumC209312 == enumC209313) {
                                                c12847.m31840();
                                                c2922.f16199.m31846(EnumC20934.f68025);
                                            } else {
                                                if (enumC209312 == EnumC20934.f68096) {
                                                }
                                                c2922.f16200.m34801(c7904.f25986);
                                                c12848 = c2922.f16199;
                                                enumC209314 = c12848.f42721;
                                                if (enumC209314 != EnumC20934.f68072) {
                                                    c12848.m31840();
                                                } else if (enumC209314 == enumC209313) {
                                                    c2922.f16198.m42172(c12848.f42728, "\"{0}\" token is expected", enumC209313.m47084());
                                                    throw null;
                                                }
                                            }
                                        }
                                    }
                                }
                                if (c7904.m20910() == null) {
                                    arrayList3.add(c7904);
                                    i4 = 1;
                                    c7904 = null;
                                } else {
                                    i4 = 1;
                                }
                                break;
                                break;
                        }
                    }
                }
                c229411.m50789(arrayList3);
            } else {
                c12842.m31848(EnumC20934.f68171);
            }
        }
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    private void m34775() throws Throwable {
        this.f16199.m31840();
        this.f16199.m31848(EnumC20934.f68039);
        int i = 1;
        Object[] objArr = {EnumC20934.f68154};
        ArrayList arrayList = new ArrayList(1);
        Object obj = objArr[0];
        C13638.requireNonNull(obj);
        arrayList.add(obj);
        List listUnmodifiableList = C0561.unmodifiableList(arrayList);
        int i2 = 10;
        ArrayList arrayList2 = new ArrayList(10);
        Throwable th = null;
        C15187 c15187M34780 = null;
        while (true) {
            int i3 = C17262.f55005[this.f16199.f42721.ordinal()];
            if (i3 != i) {
                if (i3 != 32) {
                    if (i3 != 33) {
                        String str = (String) C9030.stream(listUnmodifiableList).map(new C16485(i2)).collect(C1890.joining(", "));
                        C18111 c18111 = this.f16198;
                        long j = this.f16199.f42728;
                        String str2 = listUnmodifiableList.size() != i ? "One of {0} tokens is expected" : "\"{0}\" token is expected";
                        Object[] objArr2 = new Object[i];
                        objArr2[0] = str;
                        c18111.m42172(j, str2, objArr2);
                        throw th;
                    }
                    if (listUnmodifiableList.contains(this.f16199.f42721)) {
                        if (c15187M34780 != null) {
                            this.f47341.m24124(new C6574(c15187M34780, arrayList2));
                        }
                        this.f16199.m31840();
                        return;
                    } else {
                        C18111 c18112 = this.f16198;
                        long j2 = this.f16199.f42728;
                        Object[] objArr3 = new Object[i];
                        objArr3[0] = EnumC20934.f68195.m47084();
                        c18112.m42172(j2, "\"{0}\" token is expected", objArr3);
                        throw th;
                    }
                }
                if (!listUnmodifiableList.contains(this.f16199.f42721)) {
                    Throwable th2 = th;
                    this.f16198.m42172(this.f16199.f42728, "\"{0}\" token is not expected", EnumC20934.f68063.m47084());
                    throw th2;
                }
                this.f16199.m31840();
                this.f16199.m31848(EnumC20934.f68046);
                C1033 c1033 = this.f47343;
                c1033.m3887();
                ArrayList arrayList3 = new ArrayList(i2);
                Object[] objArr4 = new Object[3];
                objArr4[0] = EnumC20934.f68161;
                objArr4[i] = EnumC20934.f68096;
                objArr4[2] = EnumC20934.f68148;
                ArrayList arrayList4 = new ArrayList(3);
                int iM51269 = 0;
                while (iM51269 < 3) {
                    Object obj2 = objArr4[iM51269];
                    iM51269 = C23234.m51269(obj2, arrayList4, obj2, iM51269, i);
                }
                List listUnmodifiableList2 = C0561.unmodifiableList(arrayList4);
                while (true) {
                    EnumC20934 enumC20934 = this.f16199.f42721;
                    EnumC20934 enumC20935 = EnumC20934.f68161;
                    EnumC20934 enumC20936 = EnumC20934.f68096;
                    if (!enumC20934.m47087(enumC20935, enumC20936, EnumC20934.f68148)) {
                        EnumC20934 enumC20937 = this.f16199.f42721;
                        EnumC20934 enumC20938 = EnumC20934.f68072;
                        if (enumC20937 != enumC20938) {
                            EnumC20934 enumC20939 = EnumC20934.f68171;
                            if (enumC20937 != enumC20939) {
                                if (arrayList3.isEmpty()) {
                                    this.f16198.m42172(this.f16199.f42728, "BootstrapMethod argument is expected", new Object[0]);
                                    throw null;
                                }
                                this.f16198.m42172(this.f16199.f42728, "One of {0} tokens is expected", (String) C9030.stream(listUnmodifiableList2).map(new C16485(10)).collect(C1890.joining(", ")));
                                throw null;
                            }
                            if (!listUnmodifiableList2.contains(enumC20937)) {
                                this.f16198.m42172(this.f16199.f42728, "\"{0}\" token is not expected", enumC20939.m47084());
                                throw null;
                            }
                            c1033.m3884();
                            this.f16199.m31840();
                            this.f47341.m24124(new C6574(c15187M34780, arrayList3));
                            arrayList2 = new ArrayList(10);
                            Object[] objArr5 = {EnumC20934.f68154, EnumC20934.f68195};
                            ArrayList arrayList5 = new ArrayList(2);
                            int iM512610 = 0;
                            while (iM512610 < 2) {
                                Object obj3 = objArr5[iM512610];
                                iM512610 = C23234.m51269(obj3, arrayList5, obj3, iM512610, 1);
                            }
                            listUnmodifiableList = C0561.unmodifiableList(arrayList5);
                            i = 1;
                            i2 = 10;
                            th = null;
                            c15187M34780 = null;
                            break;
                        }
                        if (!listUnmodifiableList2.contains(enumC20937)) {
                            this.f16198.m42172(this.f16199.f42728, "\"{0}\" token is not expected", enumC20938.m47084());
                            throw null;
                        }
                        this.f16199.m31840();
                        Object[] objArr6 = {enumC20935, enumC20936};
                        ArrayList arrayList6 = new ArrayList(2);
                        int iM512611 = 0;
                        while (iM512611 < 2) {
                            Object obj4 = objArr6[iM512611];
                            iM512611 = C23234.m51269(obj4, arrayList6, obj4, iM512611, 1);
                        }
                        listUnmodifiableList2 = C0561.unmodifiableList(arrayList6);
                    } else {
                        if (!listUnmodifiableList2.contains(this.f16199.f42721)) {
                            this.f16198.m42172(this.f16199.f42728, "BootstrapMethod argument is not expected", new Object[0]);
                            throw null;
                        }
                        arrayList3.add(c1033.m3881(null, null, false));
                        Object[] objArr7 = {EnumC20934.f68072, EnumC20934.f68171};
                        ArrayList arrayList7 = new ArrayList(2);
                        int iM512612 = 0;
                        while (iM512612 < 2) {
                            Object obj5 = objArr7[iM512612];
                            iM512612 = C23234.m51269(obj5, arrayList7, obj5, iM512612, 1);
                        }
                        listUnmodifiableList2 = C0561.unmodifiableList(arrayList7);
                    }
                }
            } else {
                if (!listUnmodifiableList.contains(this.f16199.f42721)) {
                    this.f16198.m42172(this.f16199.f42728, "\"{0}\" token is expected", EnumC20934.f68154.m47084());
                    throw null;
                }
                if (c15187M34780 != null) {
                    this.f47341.m24124(new C6574(c15187M34780, arrayList2));
                }
                C12842 c12842 = this.f16199;
                EnumC20934 enumC209310 = EnumC20934.f68154;
                c12842.m31848(enumC209310);
                C12842 c12843 = this.f16199;
                int i4 = c12843.f42726;
                c12843.m31848(EnumC20934.f68046);
                c15187M34780 = m34780();
                C12842 c12844 = this.f16199;
                if (c12844.f42721 == EnumC20934.f68161) {
                    c12844.m31840();
                    this.f16199.m31848(EnumC20934.f68171);
                }
                Object[] objArr8 = {EnumC20934.f68063, enumC209310, EnumC20934.f68195};
                ArrayList arrayList8 = new ArrayList(3);
                int iM512613 = 0;
                while (iM512613 < 3) {
                    Object obj6 = objArr8[iM512613];
                    iM512613 = C23234.m51269(obj6, arrayList8, obj6, iM512613, 1);
                }
                listUnmodifiableList = C0561.unmodifiableList(arrayList8);
                i = 1;
                th = null;
            }
        }
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    private void m34785() {
        ArrayList arrayList = new ArrayList(256);
        C15187 c15187M34780 = m34780();
        C12842 c12842 = this.f16199;
        EnumC20934 enumC20934 = c12842.f42721;
        EnumC20934 enumC20935 = EnumC20934.f68039;
        if (enumC20934 != enumC20935) {
            c12842.m31840();
        }
        C12842 c12843 = this.f16199;
        EnumC20934 enumC20936 = c12843.f42721;
        EnumC20934 enumC20937 = EnumC20934.f68171;
        C1033 c1033 = this.f47343;
        if (enumC20936 == enumC20937) {
            c12843.m31840();
            C12842 c12844 = this.f16199;
            if (c12844.f42721 == enumC20935) {
                c12844.m31840();
                c1033.m3887();
                if (this.f16199.f42721 == EnumC20934.f68195) {
                    this.f47341.m24124(new C6574(c15187M34780, Collections.EMPTY_LIST));
                    this.f16199.m31840();
                    return;
                }
                while (true) {
                    arrayList.add(c1033.m3881(null, null, false));
                    EnumC20934 enumC20938 = this.f16199.f42721;
                    EnumC20934 enumC20939 = EnumC20934.f68072;
                    EnumC20934 enumC209310 = EnumC20934.f68171;
                    if (!enumC20938.m47087(enumC20939, enumC209310)) {
                        C12842 c12845 = this.f16199;
                        EnumC20934 enumC209311 = c12845.f42721;
                        EnumC20934 enumC209312 = EnumC20934.f68195;
                        if (enumC209311 == enumC209312) {
                            c1033.m3884();
                            this.f16199.m31840();
                            break;
                        }
                        this.f16198.m42172(c12845.f42728, "One of {0} tokens is expected", enumC20939.m47092() + ", " + enumC209310.m47092() + ", or " + enumC209312.m47092());
                        throw null;
                    }
                    this.f16199.m31840();
                    if (this.f16199.f42721 == EnumC20934.f68195) {
                        c1033.m3884();
                        this.f16199.m31840();
                        break;
                    }
                }
            }
            this.f47341.m24124(new C6574(c15187M34780, arrayList));
        }
        C12842 c12846 = this.f16199;
        EnumC20934 enumC209313 = c12846.f42721;
        if (enumC209313 == EnumC20934.f68039) {
            c12846.m31840();
            c1033.m3887();
            if (this.f16199.f42721 == EnumC20934.f68195) {
                this.f47341.m24124(new C6574(c15187M34780, Collections.EMPTY_LIST));
                this.f16199.m31840();
                return;
            }
            do {
                arrayList.add(c1033.m3881(null, null, false));
                EnumC20934 enumC209314 = this.f16199.f42721;
                EnumC20934 enumC209315 = EnumC20934.f68072;
                EnumC20934 enumC209316 = EnumC20934.f68171;
                if (enumC209314.m47087(enumC209315, enumC209316)) {
                    this.f16199.m31840();
                } else {
                    C12842 c12847 = this.f16199;
                    EnumC20934 enumC209317 = c12847.f42721;
                    EnumC20934 enumC209318 = EnumC20934.f68195;
                    if (enumC209317 != enumC209318) {
                        this.f16198.m42172(c12847.f42728, "One of {0} tokens is expected", enumC209315.m47092() + ", " + enumC209316.m47092() + ", or " + enumC209318.m47092());
                        throw null;
                    }
                    c1033.m3884();
                    this.f16199.m31840();
                }
                this.f47341.m24124(new C6574(c15187M34780, arrayList));
                return;
            } while (this.f16199.f42721 != EnumC20934.f68195);
            c1033.m3884();
            this.f16199.m31840();
            this.f47341.m24124(new C6574(c15187M34780, arrayList));
            return;
        }
        if (enumC209313 != EnumC20934.f68161) {
            return;
        }
        arrayList.add(this.f47348.m31654(c12846.f42726));
        this.f16199.m31840();
        while (true) {
            C12842 c12848 = this.f16199;
            EnumC20934 enumC209319 = c12848.f42721;
            if (enumC209319 == EnumC20934.f68171) {
                this.f47341.m24124(new C6574(c15187M34780, arrayList));
                return;
            } else {
                if (enumC209319 != EnumC20934.f68161) {
                    this.f16198.m42172(c12848.f42728, "invalid.bootstrapmethod", new Object[0]);
                    throw null;
                }
                arrayList.add(this.f47348.m31654(c12848.f42726));
                this.f16199.m31840();
            }
        }
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    private C15187 m34780() {
        C15187 c15187M34791;
        C12842 c12842 = this.f16199;
        EnumC20934 enumC20934 = c12842.f42721;
        EnumC20934 enumC20935 = EnumC20934.f68161;
        if (enumC20934 == enumC20935) {
            return this.f47348.m31654(c12842.f42726);
        }
        EnumC11659 enumC11659M34786 = this.f16200.m34786();
        this.f16199.m31848(EnumC20934.f68046);
        C12842 c12843 = this.f16199;
        if (c12843.f42721 == enumC20935) {
            c15187M34791 = this.f47348.m31654(c12843.f42726);
            this.f16199.m31840();
        } else {
            c15187M34791 = this.f16200.m34791(enumC11659M34786);
        }
        this.f16199.m31848(EnumC20934.f68171);
        return c15187M34791;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m34760(Consumer consumer) {
        C12842 c12842 = this.f16199;
        if (c12842.f42721 == EnumC20934.f68046) {
            c12842.m31840();
        }
        consumer.n(this.f47343.m3881(EnumC13776.f45400, null, true));
    }

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    private void m34781() {
        C12738 c12738 = this.f47348;
        EnumC16783 enumC16783 = EnumC16783.f53741;
        c12738.m31655(enumC16783.m39431());
        final String strM2156 = this.f16198.m2156();
        C15187 c15187M31656 = this.f47348.m31656(new Function() { // from class: l.ᩳۢۡ
            @Override // java.util.function.Function
            /* JADX INFO: renamed from: andThen */
            public /* synthetic */ Function mo33696andThen(Function function) {
                return C4277.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public /* synthetic */ Function compose(Function function) {
                return C4277.$default$compose(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Boolean bool;
                String str = (String) obj;
                boolean z = false;
                if (str.contains(strM2156)) {
                    Object[] objArr = {".java", ".jcod", ".jasm", ".class"};
                    ArrayList arrayList = new ArrayList(4);
                    int iM51269 = 0;
                    while (iM51269 < 4) {
                        Object obj2 = objArr[iM51269];
                        iM51269 = C23234.m51269(obj2, arrayList, obj2, iM51269, 1);
                    }
                    Iterator it = C0561.unmodifiableList(arrayList).iterator();
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
        String str = c15187M31656 != null ? (String) c15187M31656.f49578.f69953 : null;
        C15187 c15187M34802 = m34802();
        if (c15187M34802.f49578 == null && c15187M34802.f43854 != -1) {
            throw C7997.m21056(this.f16198, this.f16199.f42722, "SourceFile attribute incorrectly points to the ConstantPool", new Object[0]);
        }
        c15187M34802.toString();
        if (str != null && !str.equals(c15187M34802.f49578.f69953)) {
            this.f16198.mo2164(this.f16199.f42722, "The \"{0}\" attribute is already declared in the constant pool structure. A new value \"{1}\" is used.", enumC16783.m39431(), c15187M34802.f49578.f69953);
        }
        C9398 c9398 = this.f47341;
        c9398.f31836 = new C7986(c9398.f20884, enumC16783, c15187M34802);
    }

    /* JADX WARN: Code duplicated, block: B:52:0x013f A[Catch: IllegalArgumentException -> 0x015d, TRY_LEAVE, TryCatch #1 {IllegalArgumentException -> 0x015d, blocks: (B:50:0x0135, B:52:0x013f, B:55:0x0155, B:56:0x015c), top: B:61:0x0135 }] */
    /* JADX WARN: Code duplicated, block: B:61:0x0135 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:0x0155 A[SYNTHETIC] */
    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    private void m34776() {
        int i;
        C9398 c9398 = this.f47341;
        C6491 c6491 = new C6491(c9398.f20884, EnumC16783.f53749);
        c6491.f21890 = new StringBuilder();
        c6491.f21889 = new ArrayList();
        c6491.f21891 = EnumC3668.NONE;
        c9398.f31844 = c6491;
        this.f16199.m31848(EnumC20934.f68039);
        boolean zIsEmpty = true;
        boolean z = true;
        while (true) {
            int i2 = C17262.f55005[this.f16199.f42721.ordinal()];
            if (i2 == 1) {
                try {
                    i = this.f16199.f42726;
                    if (c6491.f21891 != EnumC3668.UTF8) {
                        throw new IllegalArgumentException("The byte representation of the string is expected.");
                    }
                    c6491.f21889.add(Byte.valueOf((byte) i));
                    c6491.f21891 = EnumC3668.BYTE;
                    z = false;
                } catch (IllegalArgumentException unused) {
                    throw C7997.m21056(this.f16198, this.f16199.f42728, "\"{0}\" token is expected", new Object[]{EnumC20934.f68034.m47084()});
                }
            } else if (i2 != 30) {
                switch (i2) {
                    case 33:
                        if (!z) {
                            throw C7997.m21056(this.f16198, this.f16199.f42728, "\"{0}\" token is expected", new Object[]{EnumC20934.f68171.m47084()});
                        }
                        int iOrdinal = c6491.f21891.ordinal();
                        if (iOrdinal != 0) {
                            if (iOrdinal != 1) {
                                if (iOrdinal != 2) {
                                    throw new IncompatibleClassChangeError();
                                }
                                zIsEmpty = c6491.f21889.isEmpty();
                            } else if (c6491.f21890.length() != 0) {
                                zIsEmpty = false;
                            }
                        }
                        if (zIsEmpty) {
                            this.f16198.mo2164(this.f16199.f42728, "The SourceDebugExtension attribute has the empty debug_extension structure.", new Object[0]);
                        }
                        this.f16199.m31840();
                        return;
                    case 34:
                    case 35:
                        i = this.f16199.f42726;
                        if (c6491.f21891 != EnumC3668.UTF8) {
                            throw new IllegalArgumentException("The byte representation of the string is expected.");
                        }
                        c6491.f21889.add(Byte.valueOf((byte) i));
                        c6491.f21891 = EnumC3668.BYTE;
                        break;
                        break;
                    case 36:
                        if (!z) {
                            throw C7997.m21056(this.f16198, this.f16199.f42728, "\"{0}\" token is expected", new Object[]{EnumC20934.f68171.m47084()});
                        }
                        try {
                            String str = this.f16199.f42724;
                            if (c6491.f21891 == EnumC3668.BYTE) {
                                throw new IllegalArgumentException("The valid modified UTF-8 string is expected.");
                            }
                            c6491.f21890.append(str);
                            c6491.f21891 = EnumC3668.UTF8;
                        } catch (IllegalArgumentException unused2) {
                            throw C7997.m21056(this.f16198, this.f16199.f42728, "\"{0}\" token is expected", new Object[]{EnumC20934.f68231.m47084()});
                        }
                        break;
                        break;
                    default:
                        if (z) {
                            this.f16198.mo2149(this.f16199.f42728, "Either \"{0}\" or \"{1}\" token is expected", EnumC20934.f68034.m47084(), EnumC20934.f68195.m47084());
                        } else {
                            this.f16198.mo2149(this.f16199.f42728, "\"{0}\" token is expected", EnumC20934.f68171.m47084());
                        }
                        throw new C6055();
                }
                z = false;
            } else {
                if (z) {
                    throw C7997.m21056(this.f16198, this.f16199.f42728, "\"{0}\" token is expected", new Object[]{(c6491.f21891 == EnumC3668.BYTE ? EnumC20934.f68231 : EnumC20934.f68034).m47084()});
                }
                z = true;
            }
            this.f16199.m31840();
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private void m34768() {
        C15187 c15187M34792 = m34792(true);
        if (!c15187M34792.m36398().m33537(EnumC13776.f45415, EnumC13776.f45400)) {
            m34758("Either a class name or Constant Pool index expected, got {0}");
            throw null;
        }
        this.f47341.m24136(c15187M34792);
        c15187M34792.toString();
        this.f16199.m31848(EnumC20934.f68171);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private void m34774(Consumer consumer) {
        ArrayList arrayList = new ArrayList();
        while (true) {
            C15187 c15187M34792 = m34792(true);
            if (!c15187M34792.m36398().m33537(EnumC13776.f45415, EnumC13776.f45400)) {
                m34758("Either a class name or Constant Pool index expected, got {0}");
                throw null;
            }
            arrayList.add(c15187M34792);
            c15187M34792.toString();
            C12842 c12842 = this.f16199;
            if (c12842.f42721 != EnumC20934.f68072) {
                c12842.m31848(EnumC20934.f68171);
                consumer.n(arrayList);
                return;
            }
            c12842.m31840();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m34761(C16557 c16557) {
        ArrayList arrayList = new ArrayList();
        while (true) {
            C15187 c15187M34802 = m34802();
            if (!c15187M34802.m36398().m33536(EnumC13776.f45415)) {
                m34758("Either a field descriptor or Constant Pool index expected, got {0}");
                throw null;
            }
            arrayList.add(c15187M34802);
            c15187M34802.toString();
            C12842 c12842 = this.f16199;
            if (c12842.f42721 != EnumC20934.f68072) {
                c12842.m31848(EnumC20934.f68171);
                c16557.n(arrayList);
                return;
            }
            c12842.m31840();
        }
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    private void m34779() {
        C15187 c15187M31658;
        EnumC13776 enumC13776 = EnumC13776.f45400;
        C1033 c1033 = this.f47343;
        C15187 c15187M3881 = c1033.m3881(enumC13776, null, true);
        C12842 c12842 = this.f16199;
        if (c12842.f42721 == EnumC20934.f68171) {
            this.f47341.m24127(c15187M3881, (C15187) null);
            return;
        }
        c12842.m31848(EnumC20934.f68046);
        if (this.f16199.f42721.m47087(EnumC20934.f68161, EnumC20934.f68154)) {
            int i = this.f16199.f42726;
            c15187M31658 = i != 0 ? this.f47348.m31654(i) : null;
            this.f16199.m31840();
        } else {
            c15187M31658 = this.f47348.m31658(c1033.m3882(EnumC13776.f45398));
        }
        this.f47341.m24127(c15187M3881, c15187M31658);
    }

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    private void m34765() {
        C15187 c15187M34802;
        this.f16199.m31848(EnumC20934.f68039);
        C4374 c4374M24120 = this.f47341.m24120(this.f16199.f42728);
        while (true) {
            EnumC20934 enumC20934 = this.f16199.f42721;
            if (enumC20934 == EnumC20934.f68195) {
                if (c4374M24120.isEmpty()) {
                    this.f16198.mo2164(this.f16199.f42728, "Record should have at least one component", new Object[0]);
                    this.f47341.m24118();
                }
                this.f16199.m31840();
                return;
            }
            ArrayList arrayListM5217 = enumC20934 == EnumC20934.f68105 ? this.f47342.m5217() : null;
            this.f16199.m31848(EnumC20934.f68033);
            C15187 c15187M34803 = m34802();
            this.f16199.m31848(EnumC20934.f68046);
            C15187 c15187M34804 = m34802();
            int i = C17262.f55005[this.f16199.f42721.ordinal()];
            if (i == 30 || i == 31) {
                this.f16199.m31840();
                C12842 c12842 = this.f16199;
                if (c12842.f42721 == EnumC20934.f68121) {
                    c12842.m31840();
                    c15187M34802 = m34802();
                } else {
                    c4374M24120.m12227(c15187M34803, c15187M34804, null, arrayListM5217);
                }
            } else if (i != 37) {
                c15187M34802 = null;
            } else {
                this.f16199.m31840();
                C12842 c12843 = this.f16199;
                if (c12843.f42721 == EnumC20934.f68121) {
                    c12843.m31840();
                }
                c15187M34802 = m34802();
            }
            c4374M24120.m12227(c15187M34803, c15187M34804, c15187M34802, arrayListM5217);
            EnumC20934 enumC20935 = this.f16199.f42721;
            EnumC20934 enumC20936 = EnumC20934.f68072;
            EnumC20934 enumC20937 = EnumC20934.f68171;
            if (!enumC20935.m47087(enumC20936, enumC20937)) {
                this.f16198.m42172(this.f16199.f42728, "Either \"{0}\" or \"{1}\" token is expected", "<" + enumC20937.m47092() + ">", "<" + enumC20936.m47092() + ">");
                throw null;
            }
            this.f16199.m31840();
        }
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    private void m34763(int i) {
        if (i != 0) {
            this.f16198.mo2164(this.f16199.f42728, "Modifier(s) are ignored as they cannot be applied to a group of inner classes", new Object[0]);
        }
        this.f16199.m31848(EnumC20934.f68039);
        while (true) {
            C12842 c12842 = this.f16199;
            if (c12842.f42721 == EnumC20934.f68195) {
                if (this.f47341.f31853 == null) {
                    this.f16198.mo2164(c12842.f42728, "InnerClasses group should have at least one inner class", new Object[0]);
                }
                this.f16199.m31840();
                return;
            }
            m34752(0);
            EnumC20934 enumC20934 = this.f16199.f42721;
            EnumC20934 enumC20935 = EnumC20934.f68072;
            EnumC20934 enumC20936 = EnumC20934.f68171;
            if (!enumC20934.m47087(enumC20935, enumC20936)) {
                this.f16198.m42172(this.f16199.f42728, "Either \"{0}\" or \"{1}\" token is expected", "<" + enumC20936.m47092() + ">", "<" + enumC20935.m47092() + ">");
                throw null;
            }
            this.f16199.m31840();
        }
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private void m34752(int i) {
        C9398 c9398 = this.f47341;
        long j = this.f16199.f42728;
        C18111 c18111 = (C18111) c9398.m17095();
        int iM52537 = EnumC23839.m52537(i, EnumC23839.f77058, EnumC23839.f77067);
        EnumC23839[] enumC23839Arr = EnumC23839.f77057;
        if (((~EnumC23839.m52516(enumC23839Arr)) & iM52537) != 0) {
            c18111.mo2164(j, "Invalid modifier(s) for an inner class {0}", EnumC23839.m52538(iM52537 & (~EnumC23839.m52516(enumC23839Arr)), EnumC0554.INNER_CLASS));
        }
        int iM34798 = m34798();
        if (i != 0 && iM34798 != 0) {
            C18111 c18112 = this.f16198;
            long j2 = this.f16199.f42728;
            String strM52517 = EnumC23839.m52517(i | iM34798, EnumC0554.INNER_CLASS);
            int length = strM52517.length();
            int iCharCount = 0;
            while (iCharCount < length) {
                int iCodePointAt = strM52517.codePointAt(iCharCount);
                if (!Character.isWhitespace(iCodePointAt)) {
                    break;
                } else {
                    iCharCount += Character.charCount(iCodePointAt);
                }
            }
            while (length > iCharCount) {
                int iCodePointBefore = Character.codePointBefore(strM52517, length);
                if (!Character.isWhitespace(iCodePointBefore)) {
                    break;
                } else {
                    length -= Character.charCount(iCodePointBefore);
                }
            }
            c18112.mo2164(j2, "Combined \"{0}\" modifiers apply to the InnerClass", strM52517.substring(iCharCount, length));
        }
        int i2 = i | iM34798;
        EnumC20934 enumC20934 = this.f16199.f42721;
        if (enumC20934 == EnumC20934.f68148) {
            m34773(i2, this.f47348.m31654(0));
            return;
        }
        if (enumC20934 == EnumC20934.f68096 && enumC20934.m47088()) {
            m34755(i2, m34802());
            return;
        }
        C12842 c12842 = this.f16199;
        EnumC20934 enumC20935 = c12842.f42721;
        if (enumC20935 == EnumC20934.f68161) {
            C15187 c15187M31654 = this.f47348.m31654(c12842.f42726);
            if (!(c15187M31654.f49578 instanceof C20499)) {
                m34773(i2, this.f47348.m31654(0));
                return;
            } else {
                this.f16199.m31840();
                m34755(i2, c15187M31654);
                return;
            }
        }
        if (!enumC20935.m47088()) {
            m34777();
            throw null;
        }
        C15187 c15187M31655 = this.f47348.m31655(this.f16199.f42721.m47084());
        this.f16199.m31840();
        m34755(i2, c15187M31655);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m34755(int i, C15187 c15187) {
        C12842 c12842 = this.f16199;
        if (c12842.f42721 == EnumC20934.f68094) {
            c12842.m31840();
            m34773(i, c15187);
        } else {
            m34777();
            throw null;
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private void m34773(int i, C15187 c15187) {
        C15187 c15187M3881;
        EnumC20934 enumC20934 = this.f16199.f42721;
        EnumC20934 enumC20935 = EnumC20934.f68161;
        if (enumC20934 == enumC20935 || enumC20934 == EnumC20934.f68148) {
            C1033 c1033 = this.f47343;
            C15187 c15187M3882 = enumC20934 == enumC20935 ? c1033.m3881(EnumC13776.f45400, null, false) : null;
            C12842 c12842 = this.f16199;
            EnumC20934 enumC20936 = c12842.f42721;
            EnumC20934 enumC20937 = EnumC20934.f68148;
            if (enumC20936 == enumC20937) {
                c12842.m31840();
                c15187M3882 = c1033.m3881(EnumC13776.f45400, null, true);
            }
            C12842 c12843 = this.f16199;
            EnumC20934 enumC20938 = c12843.f42721;
            EnumC20934 enumC20939 = EnumC20934.f68171;
            if (enumC20938 == enumC20939) {
                C15187 c15187M31654 = this.f47348.m31654(0);
                m34756(i, c15187, c15187M3882, c15187M31654);
                this.f47341.m24123(i, c15187, c15187M3882, c15187M31654);
                return;
            }
            if (enumC20938 != EnumC20934.f68106) {
                m34777();
                throw null;
            }
            c12843.m31840();
            C12842 c12844 = this.f16199;
            EnumC20934 enumC209310 = c12844.f42721;
            if (enumC209310 == enumC20937 || enumC209310 == enumC20935) {
                if (enumC209310 == enumC20937) {
                    c12844.m31840();
                    c15187M3881 = c1033.m3881(EnumC13776.f45400, null, true);
                } else {
                    c15187M3881 = null;
                }
                if (this.f16199.f42721 == enumC20935) {
                    c15187M3881 = c1033.m3881(EnumC13776.f45400, null, false);
                }
                if (this.f16199.f42721 == enumC20939) {
                    m34756(i, c15187, c15187M3882, c15187M3881);
                    this.f47341.m24123(i, c15187, c15187M3882, c15187M3881);
                    return;
                } else {
                    m34777();
                    throw null;
                }
            }
            m34777();
            throw null;
        }
        m34777();
        throw null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m34756(int i, C15187 c15187, C15187 c15188, C15187 c15189) {
        AbstractC21536 abstractC21536;
        this.f16198.m2160("[" + EnumC23839.m52538(i, EnumC0554.INNER_CLASS) + "], ", new Object[0]);
        if (c15187 != this.f47348.m31654(0) && (abstractC21536 = c15187.f49578) != null) {
            this.f16198.m2160(abstractC21536 + " =\n\t\t", new Object[0]);
        }
        C15187 c151810 = (C15187) ((C5682) c15188.f49578).f69953;
        AbstractC21536 abstractC21537 = c151810.f49578;
        if (abstractC21537 == null) {
            this.f16198.m2160("<#cpx-unresolved> ", new Object[0]);
        } else if (abstractC21537.f69953 == null) {
            this.f16198.m2160("<#cpx-0> ", new Object[0]);
        } else {
            this.f16198.m2160(c151810.f49578.f69953 + " ", new Object[0]);
        }
        if (c15189 != this.f47348.m31654(0) && c15189.f43854 != 0) {
            AbstractC21536 abstractC21538 = ((C15187) ((C5682) c15189.f49578).f69953).f49578;
            if (abstractC21538 == null) {
                this.f16198.m2160("\n\t\tof <#cpx-unresolved>  ", new Object[0]);
            } else {
                C20499 c20499 = (C20499) abstractC21538;
                if (c20499.f69953 == null) {
                    this.f16198.m2160("\n\t\tof <#cpx-0>  ", new Object[0]);
                } else {
                    this.f16198.m2160("\n\t\tof " + ((String) c20499.f69953), new Object[0]);
                }
            }
        }
        this.f16198.m2160("\n", new Object[0]);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m34777() {
        throw C7997.m21056(this.f16198, this.f16199.f42728, "Invalid declaration of Inner Class", new Object[0]);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m34762(EnumC20934 enumC20934, EnumC20934 enumC20935) {
        int i = 1;
        while (true) {
            this.f16199.m31840();
            C12842 c12842 = this.f16199;
            EnumC20934 enumC20936 = c12842.f42721;
            if (enumC20936 == enumC20934) {
                i++;
            } else if (enumC20936 == enumC20935) {
                i--;
                if (i == 0) {
                    return;
                }
            } else if (enumC20936 == EnumC20934.f68179) {
                this.f16198.mo2149(c12842.f42728, "Unbalanced parentheses", new Object[0]);
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private void m34772(int i) throws Throwable {
        char c;
        C15187 c15187M3881;
        String str;
        int iM52558 = i;
        C12842 c12842 = this.f16199;
        long j = c12842.f42728;
        if (EnumC23839.m52532(i)) {
            EnumC23839.m52520(EnumC0554.VALUE_OBJECTS);
        }
        int iM52537 = EnumC23839.m52537(iM52558, EnumC23839.f77058, EnumC23839.f77067, EnumC23839.f77062);
        if (EnumC23839.m52525(iM52537, EnumC23839.f77039, EnumC23839.f77081, EnumC23839.f77049)) {
            c12842.f16198.mo2164(c12842.f42728, "Ambiguous use of similar modifiers", new Object[0]);
        }
        EnumC20934 enumC20934 = c12842.f42721;
        EnumC20934 enumC20935 = EnumC20934.f68148;
        if (enumC20934 == enumC20935 || EnumC23839.m52527(iM52537)) {
            c = 0;
        } else {
            c = 0;
            c12842.f16198.mo2164(c12842.f42728, "Expected \"{0}\" or \"{1}\" token; interpreted as \"{2}\"", enumC20935.m47084(), EnumC20934.f68233.m47084(), enumC20935.m47084());
        }
        if (EnumC23839.m52527(iM52537)) {
            if (!EnumC23839.m52539(iM52537)) {
                C18111 c18111 = c12842.f16198;
                long j2 = c12842.f42728;
                Object[] objArr = new Object[1];
                objArr[c] = EnumC23839.m52538(iM52537, EnumC0554.CLASS);
                c18111.mo2164(j2, "\"{0}\": If the ACC_INTERFACE flag is set, the ACC_ABSTRACT flag must also be set", objArr);
            }
            EnumC23839[] enumC23839Arr = new EnumC23839[4];
            enumC23839Arr[c] = EnumC23839.f77068;
            enumC23839Arr[1] = EnumC23839.f77083;
            enumC23839Arr[2] = EnumC23839.f77040;
            enumC23839Arr[3] = EnumC23839.f77047;
            if (EnumC23839.m52523(iM52537, enumC23839Arr)) {
                if (EnumC23839.m52542() == EnumC0554.VALUE_OBJECTS) {
                    C18111 c18112 = c12842.f16198;
                    long j3 = c12842.f42728;
                    Object[] objArr2 = new Object[1];
                    objArr2[c] = EnumC23839.m52538(iM52537, EnumC0554.CLASS);
                    c18112.mo2164(j3, "\"{0}\": If the ACC_INTERFACE flag is set, the ACC_FINAL, ACC_IDENTITY, ACC_ENUM, and ACC_MODULE flags must not be set.", objArr2);
                } else {
                    C18111 c18113 = c12842.f16198;
                    long j4 = c12842.f42728;
                    Object[] objArr3 = new Object[1];
                    objArr3[c] = EnumC23839.m52538(iM52537, EnumC0554.CLASS);
                    c18113.mo2164(j4, "\"{0}\": If the ACC_INTERFACE flag is set, the ACC_FINAL, ACC_SUPER, ACC_ENUM, and ACC_MODULE flags must not be set.", objArr3);
                }
            }
        } else {
            EnumC23839[] enumC23839Arr2 = new EnumC23839[2];
            enumC23839Arr2[c] = EnumC23839.f77050;
            enumC23839Arr2[1] = EnumC23839.f77047;
            if (EnumC23839.m52523(iM52537, enumC23839Arr2)) {
                C18111 c18114 = c12842.f16198;
                long j5 = c12842.f42728;
                Object[] objArr4 = new Object[1];
                objArr4[c] = EnumC23839.m52538(iM52537, EnumC0554.CLASS);
                c18114.mo2164(j5, "\"{0}\": If the ACC_INTERFACE flag is not set ACC_ANNOTATION, and ACC_MODULE flags must not be set.", objArr4);
            }
            if (EnumC23839.m52542() == EnumC0554.VALUE_OBJECTS) {
                EnumC23839[] enumC23839Arr3 = new EnumC23839[3];
                enumC23839Arr3[c] = EnumC23839.f77068;
                enumC23839Arr3[1] = EnumC23839.f77040;
                enumC23839Arr3[2] = EnumC23839.f77073;
                if (!EnumC23839.m52523(iM52537, enumC23839Arr3)) {
                    String strM52538 = EnumC23839.m52538(iM52537, EnumC0554.CLASS);
                    String strConcat = strM52538.isEmpty() ? "ACC_VALUE" : "ACC_VALUE, ".concat(strM52538);
                    C18111 c18115 = c12842.f16198;
                    long j6 = c12842.f42728;
                    Object[] objArr5 = new Object[1];
                    objArr5[c] = strConcat;
                    c18115.mo2164(j6, "\"{0}\": If the ACC_INTERFACE flag is not set a value class must have at least one of its ACC_FINAL, ACC_IDENTITY, or ACC_ABSTRACT flags set", objArr5);
                }
            }
            EnumC23839[] enumC23839Arr4 = EnumC23839.f77078;
            if (!EnumC23839.m52551(iM52537, enumC23839Arr4)) {
                C18111 c18116 = c12842.f16198;
                long j7 = c12842.f42728;
                Object[] objArr6 = new Object[1];
                objArr6[c] = EnumC23839.m52538((~EnumC23839.m52516(enumC23839Arr4)) & iM52537, EnumC0554.CLASS);
                c18116.mo2164(j7, "Invalid modifier(s) for a class: \"{0}\"", objArr6);
            }
        }
        if (EnumC23839.m52522(iM52537, EnumC23839.f77073, EnumC23839.f77068)) {
            C18111 c18117 = c12842.f16198;
            long j8 = c12842.f42728;
            String strM52539 = EnumC23839.m52538(iM52537, EnumC0554.CLASS);
            Object[] objArr7 = new Object[1];
            objArr7[c] = strM52539;
            c18117.mo2164(j8, "\"{0}\": Class cannot be both abstract and final", objArr7);
        }
        ArrayList arrayList = this.f47355;
        if (arrayList != null) {
            this.f47341.m17092(arrayList);
        }
        C12842 c12843 = this.f16199;
        EnumC20934 enumC20936 = c12843.f42721;
        if (enumC20936 == enumC20935) {
            c12843.m31840();
        } else {
            EnumC20934 enumC20937 = EnumC20934.f68105;
            if (enumC20936 == enumC20937) {
                c12843.m31840();
                C12842 c12844 = this.f16199;
                EnumC20934 enumC20938 = c12844.f42721;
                EnumC20934 enumC20939 = EnumC20934.f68233;
                if (enumC20938 != enumC20939) {
                    C18111 c18118 = this.f16198;
                    long j9 = c12844.f42722;
                    String strM47084 = enumC20937.m47084();
                    String strM47085 = enumC20939.m47084();
                    Object[] objArr8 = new Object[2];
                    objArr8[c] = strM47084;
                    objArr8[1] = strM47085;
                    throw C7997.m21056(c18118, j9, "Either \"{0}\" or \"{1}\" token is expected", objArr8);
                }
                iM52558 |= EnumC23839.f77050.m52558() | EnumC23839.f77056.m52558();
                this.f16199.m31840();
            }
        }
        EnumC13776 enumC13776 = EnumC13776.f45400;
        C1033 c1033 = this.f47343;
        C15187 c15187M3882 = c1033.m3881(enumC13776, null, true);
        C12842 c12845 = this.f16199;
        EnumC20934 enumC209310 = c12845.f42721;
        if (enumC209310 == EnumC20934.f68045) {
            c12845.m31840();
            int i2 = C17262.f55005[this.f16199.f42721.ordinal()];
            if (i2 == 2) {
                str = this.f16199.f42724;
            } else if (i2 != 4) {
                if (i2 != 36) {
                    C18111 c18119 = this.f16198;
                    long j10 = this.f16199.f42728;
                    Object[] objArr9 = new Object[1];
                    objArr9[c] = C16236.m38348(this.f16199.f42721, new StringBuilder("\""), "\"");
                    throw C7997.m21056(c18119, j10, "Either name or Constant Pool index expected, got {0}", objArr9);
                }
                str = this.f16199.f42724;
            } else {
                str = this.f16199.f42720;
            }
            this.f16199.m31840();
            this.f47341.f31838 = C0252.m1693(".", str);
        } else {
            if (enumC209310 == EnumC20934.f68193) {
                throw C7997.m21056(this.f16198, c12845.f42722, "\"{0}\" token is expected", new Object[]{C16236.m38348(EnumC20934.f68064, new StringBuilder("\""), "\"")});
            }
            if (enumC209310 == EnumC20934.f68171) {
                c12845.m31840();
            } else if (enumC209310 == EnumC20934.f68046) {
                c12845.m31840();
                C15187 c15187M34802 = m34802();
                c15187M34802.toString();
                this.f47341.m17093(c15187M34802);
            }
        }
        C12842 c12846 = this.f16199;
        if (c12846.f42721 == EnumC20934.f68147) {
            c12846.m31840();
            c15187M3881 = c1033.m3881(enumC13776, null, true);
            while (true) {
                C12842 c12847 = this.f16199;
                if (c12847.f42721 != EnumC20934.f68072) {
                    break;
                }
                c12847.m31840();
                this.f16198.mo2164(j, "Multiple inheritance is not supported", new Object[0]);
                c15187M3881 = c1033.m3881(EnumC13776.f45400, null, true);
            }
        } else {
            c15187M3881 = null;
        }
        ArrayList arrayList2 = new ArrayList();
        if (this.f16199.f42721 == EnumC20934.f68115) {
            do {
                this.f16199.m31840();
                C15187 c15187M3883 = c1033.m3881(EnumC13776.f45400, null, true);
                if (arrayList2.contains(c15187M3883)) {
                    this.f16198.mo2164(j, "Interface {0} repeated", c15187M3883);
                } else {
                    arrayList2.add(c15187M3883);
                }
            } while (this.f16199.f42721 == EnumC20934.f68072);
        }
        EnumC20934 enumC209311 = this.f16199.f42721;
        EnumC20934 enumC209312 = EnumC20934.f68039;
        if (enumC209311 != enumC209312) {
            if (this.f47341.f31849.m45847()) {
                this.f47341.f31849.getClass();
            }
            m34750();
            if (EnumC23839.m52542() == EnumC0554.VALUE_OBJECTS && !this.f47341.f31849.m45851()) {
                this.f16198.mo2164(this.f16199.f42722, "Class file version {0} does not conform to the new kind of objects; expected version {1}", this.f47341.f31849.m45843(), C20311.m45839().m45843());
            }
        } else if (!this.f47341.f31849.m45847()) {
            this.f47341.f31849.getClass();
            this.f47341.f31849.m45849();
            this.f16198.mo2164(this.f16199.f42722, "Class file version not specified in file or by -cv parameter. Defaulting to version \"{0}\"", this.f47341.f31849.m45843());
        }
        this.f16199.m31848(enumC209312);
        C9398 c9398 = this.f47341;
        C1635 c1635 = c9398.f31850;
        c9398.f20887 = iM52558;
        if (EnumC23839.m52521(iM52558)) {
            c9398.m17091();
        }
        EnumC14337 enumC14337 = EnumC14337.HEADER;
        c1635.getClass();
        C13111 c13111 = c1635.f6555;
        C13111 c13112 = c1635.f6554;
        EnumC14337 enumC14338 = EnumC14337.CLASSFILE;
        if (enumC14337 == enumC14338) {
            c13112.f43679 = c15187M3882;
        } else {
            c13111.f43679 = c15187M3882;
        }
        if (enumC14337 == enumC14338) {
            c13112.f43680 = c15187M3881;
        } else {
            c13111.f43680 = c15187M3881;
        }
        c9398.f31846 = arrayList2;
        c9398.f31849.m45849();
        while (true) {
            C12842 c12848 = this.f16199;
            EnumC20934 enumC209313 = c12848.f42721;
            if (enumC209313 == EnumC20934.f68179 || enumC209313 == EnumC20934.f68195) {
                c12848.m31848(EnumC20934.f68195);
                m34764();
                return;
            }
            int[] iArr = C17262.f55005;
            int i3 = iArr[enumC209313.ordinal()];
            if (i3 == 30) {
                this.f16199.m31840();
            } else if (i3 != 44) {
                if (this.f16199.f42721 == EnumC20934.f68105) {
                    this.f47351 = this.f47342.m5217();
                }
                int iM34798 = m34798();
                try {
                    int i4 = iArr[this.f16199.f42721.ordinal()];
                    if (i4 != 29) {
                        switch (i4) {
                            case 53:
                                this.f16199.m31840();
                                m34769(iM34798);
                                break;
                            case ThreefishEngine.Threefish512Cipher.ROTATION_3_2 /* 54 */:
                                this.f16199.m31840();
                                m34784(iM34798);
                                break;
                            case ThreefishEngine.Threefish1024Cipher.ROTATION_1_3 /* 55 */:
                                this.f16199.m31840();
                                if (!this.f16199.f42724.equals(EnumC20934.f68134.m47085())) {
                                    m34752(iM34798);
                                } else {
                                    m34763(iM34798);
                                }
                                break;
                            case 56:
                                if (!this.f16199.f42724.equals(EnumC20934.f68170.m47085())) {
                                    this.f16199.m31840();
                                    m34785();
                                } else {
                                    m34775();
                                }
                                break;
                            case 57:
                                this.f16199.m31840();
                                m34760(new C20790(0, this));
                                this.f16199.m31848(EnumC20934.f68171);
                                break;
                            case ThreefishEngine.Threefish256Cipher.ROTATION_6_0 /* 58 */:
                                this.f16199.m31840();
                                m34760(new Consumer() { // from class: l.ܺۢۡ
                                    public /* synthetic */ Consumer andThen(Consumer consumer) {
                                        return C1455.$default$andThen(this, consumer);
                                    }

                                    @Override // java.util.function.Consumer
                                    /* JADX INFO: renamed from: accept */
                                    public final void n(Object obj) {
                                        C1635 c1636 = this.f51314.f47341.f31850;
                                        EnumC14337 enumC14339 = EnumC14337.HEADER;
                                        c1636.getClass();
                                        c1636.f6554.f43680 = (C15187) obj;
                                    }
                                });
                                this.f16199.m31848(EnumC20934.f68171);
                                break;
                            case ThreefishEngine.Threefish1024Cipher.ROTATION_2_6 /* 59 */:
                                this.f47341.m24128(EnumC16783.f53741, this.f16199.f42728);
                                this.f16199.m31840();
                                m34781();
                                this.f16199.m31848(EnumC20934.f68171);
                                break;
                            case 60:
                                this.f47341.m24128(EnumC16783.f53749, this.f16199.f42728);
                                this.f16199.m31840();
                                m34776();
                                break;
                            case 61:
                                C9398 c9399 = this.f47341;
                                c9399.m24128(EnumC16783.f53726, this.f16199.f42728);
                                if (c9399.m24130(EnumC16783.f53752)) {
                                    this.f16198.mo2164(this.f16199.f42728, "The attribute table of a ClassFile structure must not contain both a NestMembers attribute and a NestHost attribute", new Object[0]);
                                }
                                this.f16199.m31840();
                                m34768();
                                break;
                            case 62:
                                C9398 c93910 = this.f47341;
                                c93910.m24128(EnumC16783.f53752, this.f16199.f42728);
                                if (c93910.m24130(EnumC16783.f53726)) {
                                    this.f16198.mo2164(this.f16199.f42728, "The attribute table of a ClassFile structure must not contain both a NestMembers attribute and a NestHost attribute", new Object[0]);
                                }
                                this.f16199.m31840();
                                m34774(new Consumer() { // from class: l.᩶ۢۡ
                                    public /* synthetic */ Consumer andThen(Consumer consumer) {
                                        return C1455.$default$andThen(this, consumer);
                                    }

                                    @Override // java.util.function.Consumer
                                    /* JADX INFO: renamed from: accept */
                                    public final void n(Object obj) {
                                        this.f65266.f47341.m24133((ArrayList) obj);
                                    }
                                });
                                break;
                            case 63:
                                this.f47341.m24128(EnumC16783.f53740, this.f16199.f42728);
                                this.f16199.m31840();
                                m34774(new Consumer() { // from class: l.֡ۢۡ
                                    public /* synthetic */ Consumer andThen(Consumer consumer) {
                                        return C1455.$default$andThen(this, consumer);
                                    }

                                    @Override // java.util.function.Consumer
                                    /* JADX INFO: renamed from: accept */
                                    public final void n(Object obj) {
                                        this.f1724.f47341.m24119((ArrayList) obj);
                                    }
                                });
                                break;
                            case 64:
                                this.f47341.m24128(EnumC16783.f53750, this.f16199.f42728);
                                this.f16199.m31840();
                                m34765();
                                break;
                            case 65:
                                this.f47341.m24128(EnumC16783.f53738, this.f16199.f42728);
                                this.f16199.m31840();
                                m34761(new C16557(this));
                                break;
                            case 66:
                                this.f47341.m24128(EnumC16783.f53718, this.f16199.f42728);
                                this.f16199.m31840();
                                m34779();
                                break;
                            default:
                                this.f16198.mo2149(this.f16199.f42728, "Class member declaration expected", new Object[0]);
                                C6055 c6055 = new C6055();
                                c6055.m16453();
                                throw c6055;
                        }
                    } else {
                        this.f16199.m31840();
                        this.f47341.m17094(m34802(), this.f16199.f42728);
                        this.f16199.m31848(EnumC20934.f68171);
                    }
                } catch (C6055 e) {
                    if (e.m16452()) {
                        C6055 c6056 = new C6055();
                        c6056.m16453();
                        throw c6056;
                    }
                    while (true) {
                        int i5 = C17262.f55005[this.f16199.f42721.ordinal()];
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
                                                            m34762(EnumC20934.f68039, EnumC20934.f68195);
                                                            this.f16199.m31840();
                                                            break;
                                                        case 40:
                                                            m34762(EnumC20934.f68081, EnumC20934.f68165);
                                                            this.f16199.m31840();
                                                            break;
                                                        case 41:
                                                            m34762(EnumC20934.f68157, EnumC20934.f68025);
                                                            this.f16199.m31840();
                                                            break;
                                                        case 42:
                                                        case 43:
                                                            break;
                                                        default:
                                                            this.f16199.m31840();
                                                            break;
                                                    }
                                                    break;
                                            }
                                            break;
                                    }
                                }
                            }
                        }
                        m34764();
                        String.format("scanner position %d", Long.valueOf(this.f16199.f42728));
                        C6055 c6057 = new C6055();
                        c6057.m16453();
                        throw c6057;
                    }
                }
                this.f47351 = null;
            } else {
                this.f16199.m31840();
                m34778();
                this.f47350 = true;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public C9979 m34767() {
        C9979 c9979 = new C9979();
        C12842 c12842 = this.f16199;
        EnumC20934 enumC20934 = c12842.f42721;
        if (enumC20934 != EnumC20934.f68096) {
            if (enumC20934 != EnumC20934.f68161) {
                throw C0252.m1696(this.f16198, c12842.f42728, "Either a module name or Constant Pool index expected, got {0}", new Object[]{C16236.m38348(this.f16199.f42721, new StringBuilder("\""), "\"")});
            }
            c9979.f43679 = Integer.valueOf(c12842.f42726);
            this.f16199.m31840();
            return c9979;
        }
        String string = "";
        while (this.f16199.f42721.m47083()) {
            c9979.f43680 = ((String) c9979.f43680) + string + this.f16199.f42720;
            this.f16199.m31847();
            EnumC20934 enumC20935 = this.f16199.f42721;
            if (enumC20935 != EnumC20934.f68045) {
                return c9979;
            }
            string = Character.toString((char) enumC20935.m47091());
            this.f16199.m31847();
        }
        throw C0252.m1696(this.f16198, this.f16199.f42728, "Either a module name or Constant Pool index expected, got {0}", new Object[]{C16236.m38348(this.f16199.f42721, new StringBuilder("\""), "\"")});
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    private void m34751(int i) {
        C12842 c12842;
        int iM52558;
        if (i != 0) {
            this.f16198.mo2164(this.f16199.f42728, "The class access modifier(s) {0} ignored", EnumC23839.m52538(i, EnumC0554.MODULE));
        }
        ArrayList arrayList = this.f47355;
        if (arrayList != null) {
            this.f47341.m17092(arrayList);
        }
        C8568 c8568 = new C8568(this.f47341);
        this.f47352 = c8568;
        if (this.f16199.f42721 == EnumC20934.f68064) {
            c8568.m22347();
            this.f16199.m31840();
        }
        C12842 c12843 = this.f16199;
        EnumC20934 enumC20934 = c12843.f42721;
        EnumC20934 enumC20935 = EnumC20934.f68193;
        if (enumC20934 != enumC20935) {
            throw C0252.m1696(this.f16198, c12843.f42728, "\"{0}\" token is expected", new Object[]{enumC20935.m47084()});
        }
        c12843.m31847();
        C9979 c9979M34767 = m34767();
        if (c9979M34767.m25243()) {
            throw C0252.m1696(this.f16198, this.f16199.f42728, "Either name or Constant Pool index expected, got {0}", new Object[]{"\"" + this.f16199.f42721 + "\""});
        }
        if (c9979M34767.m25242() != 0) {
            this.f47352.m22344(c9979M34767.m25242());
        } else {
            this.f47352.m22345((String) c9979M34767.f43680);
        }
        EnumC20934 enumC20936 = this.f16199.f42721;
        EnumC20934 enumC20937 = EnumC20934.f68039;
        if (enumC20936 == enumC20937) {
            C20311 c20311 = this.f47341.f31849;
            if (!c20311.m45847()) {
                c20311.m45845(53, 0);
            }
            this.f16198.mo2164(this.f16199.f42728, "Class file version not specified in file or by -cv parameter. Defaulting to version \"{0}\"", this.f47341.f31849.m45843());
        } else {
            m34750();
        }
        this.f16199.m31848(enumC20937);
        C9398 c9398 = this.f47341;
        c9398.getClass();
        c9398.f20887 = EnumC23839.f77047.m52558();
        C1635 c1635 = c9398.f31850;
        EnumC14337 enumC14337 = EnumC14337.HEADER;
        C15187 c15187 = new C15187(0, null);
        c1635.getClass();
        if (enumC14337 == EnumC14337.CLASSFILE) {
            c1635.f6554.f43680 = c15187;
        } else {
            c1635.f6555.f43680 = c15187;
        }
        C20311 c20312 = c9398.f31849;
        if (!c20312.m45847()) {
            c20312.m45845(53, 0);
        }
        while (true) {
            c12842 = this.f16199;
            EnumC20934 enumC20938 = c12842.f42721;
            if (enumC20938 != EnumC20934.f68179 && enumC20938 != EnumC20934.f68195) {
                int i2 = C17262.f55005[enumC20938.ordinal()];
                if (i2 != 30) {
                    switch (i2) {
                        case 44:
                            this.f16199.m31840();
                            m34778();
                            this.f47350 = true;
                            break;
                        case WXMediaMessage.IMediaObject.TYPE_BUSINESS_CARD /* 45 */:
                            C1883 c1883 = this.f47352.f29616;
                            C9979 c9979 = new C9979();
                            this.f16199.m31847();
                            int i3 = 0;
                            while (true) {
                                EnumC20934 enumC20939 = this.f16199.f42721;
                                if (enumC20939 == EnumC20934.f68171) {
                                    if (!c9979.m25243()) {
                                        c1883.n(new C19173((String) c9979.f43680, c9979.m25242(), i3, null));
                                        this.f16199.m31847();
                                        break;
                                    }
                                    throw C0252.m1696(this.f16198, this.f16199.f42728, "Module statement \"requires [transitive | static | mandated | synthetic] ModuleName;\" expected", new Object[0]);
                                }
                                int i4 = C17262.f55005[enumC20939.ordinal()];
                                if (i4 != 3 && i4 != 4) {
                                    if (i4 != 8) {
                                        if (i4 != 23) {
                                            if (i4 != 26) {
                                                if (i4 != 50) {
                                                    throw C0252.m1696(this.f16198, this.f16199.f42728, "Module statement \"requires [transitive | static | mandated | synthetic] ModuleName;\" expected", new Object[0]);
                                                }
                                                if (EnumC23839.m52526(i3) || !c9979.m25243()) {
                                                    throw C0252.m1696(this.f16198, this.f16199.f42728, "Module statement \"requires [transitive | static | mandated | synthetic] ModuleName;\" expected", new Object[0]);
                                                }
                                                iM52558 = EnumC23839.f77076.m52558();
                                            } else {
                                                if (EnumC23839.m52552(i3) || !c9979.m25243()) {
                                                    throw C0252.m1696(this.f16198, this.f16199.f42728, "Module statement \"requires [transitive | static | mandated | synthetic] ModuleName;\" expected", new Object[0]);
                                                }
                                                iM52558 = EnumC23839.f77044.m52558();
                                            }
                                        } else {
                                            if (EnumC23839.m52544(i3) || !c9979.m25243()) {
                                                throw C0252.m1696(this.f16198, this.f16199.f42728, "Module statement \"requires [transitive | static | mandated | synthetic] ModuleName;\" expected", new Object[0]);
                                            }
                                            iM52558 = EnumC23839.f77080.m52558();
                                        }
                                    } else {
                                        if (EnumC23839.m52548(i3) || !c9979.m25243()) {
                                            throw C0252.m1696(this.f16198, this.f16199.f42728, "Module statement \"requires [transitive | static | mandated | synthetic] ModuleName;\" expected", new Object[0]);
                                        }
                                        iM52558 = EnumC23839.f77046.m52558();
                                    }
                                    i3 |= iM52558;
                                    this.f16199.m31847();
                                } else {
                                    if (!c9979.m25243()) {
                                        throw C0252.m1696(this.f16198, this.f16199.f42728, "Module statement \"requires [transitive | static | mandated | synthetic] ModuleName;\" expected", new Object[0]);
                                    }
                                    c9979 = m34767();
                                }
                            }
                            break;
                        case 46:
                            m34759(this.f47352.f29622, new InterfaceC23613() { // from class: l.ۜۢۡ
                                @Override // l.InterfaceC23613
                                public final C9979 get() {
                                    C14441 c14441 = this.f22537;
                                    C12842 c12844 = c14441.f16199;
                                    EnumC20934 enumC209310 = c12844.f42721;
                                    String string = "";
                                    int i5 = 0;
                                    if (enumC209310 == EnumC20934.f68096) {
                                        String str = "";
                                        while (c14441.f16199.f42721.m47090()) {
                                            StringBuilder sbM8976 = C3012.m8976(string, str);
                                            sbM8976.append(c14441.f16199.f42720);
                                            string = sbM8976.toString();
                                            c14441.f16199.m31840();
                                            C12842 c12845 = c14441.f16199;
                                            if (c12845.f42721 == EnumC20934.f68045) {
                                                c14441.f16198.mo2164(c12845.f42728, "Forward slash \"/\" expected instead of dot \".\". The dot is replaced by \"/\"", new Object[0]);
                                                c14441.f16199.m31840();
                                                str = "/";
                                            }
                                        }
                                        throw C7997.m21056(c14441.f16198, c14441.f16199.f42728, "Either name or Constant Pool index expected, got {0}", new Object[]{C16236.m38348(c14441.f16199.f42721, new StringBuilder("\""), "\"")});
                                    }
                                    if (enumC209310 == EnumC20934.f68161) {
                                        i5 = c12844.f42726;
                                        c12844.m31840();
                                    }
                                    return new C9979(Integer.valueOf(i5), string);
                                }
                            }, new InterfaceC23613() { // from class: l.ۡۢۡ
                                @Override // l.InterfaceC23613
                                public final C9979 get() {
                                    return this.f30270.m34767();
                                }
                            }, EnumC20934.f68104, true, "Module statement \"exports [mandated | synthetic] PackageName [to ModuleName(1)[,ModuleName(2)[...]]];\" expected");
                            break;
                        case 47:
                            m34759(this.f47352.f29624, new InterfaceC23613() { // from class: l.ۜۢۡ
                                @Override // l.InterfaceC23613
                                public final C9979 get() {
                                    C14441 c14441 = this.f22537;
                                    C12842 c12844 = c14441.f16199;
                                    EnumC20934 enumC209310 = c12844.f42721;
                                    String string = "";
                                    int i5 = 0;
                                    if (enumC209310 == EnumC20934.f68096) {
                                        String str = "";
                                        while (c14441.f16199.f42721.m47090()) {
                                            StringBuilder sbM8976 = C3012.m8976(string, str);
                                            sbM8976.append(c14441.f16199.f42720);
                                            string = sbM8976.toString();
                                            c14441.f16199.m31840();
                                            C12842 c12845 = c14441.f16199;
                                            if (c12845.f42721 == EnumC20934.f68045) {
                                                c14441.f16198.mo2164(c12845.f42728, "Forward slash \"/\" expected instead of dot \".\". The dot is replaced by \"/\"", new Object[0]);
                                                c14441.f16199.m31840();
                                                str = "/";
                                            }
                                        }
                                        throw C7997.m21056(c14441.f16198, c14441.f16199.f42728, "Either name or Constant Pool index expected, got {0}", new Object[]{C16236.m38348(c14441.f16199.f42721, new StringBuilder("\""), "\"")});
                                    }
                                    if (enumC209310 == EnumC20934.f68161) {
                                        i5 = c12844.f42726;
                                        c12844.m31840();
                                    }
                                    return new C9979(Integer.valueOf(i5), string);
                                }
                            }, new InterfaceC23613() { // from class: l.ۡۢۡ
                                @Override // l.InterfaceC23613
                                public final C9979 get() {
                                    return this.f30270.m34767();
                                }
                            }, EnumC20934.f68104, true, "Module statement \"opens [mandated | synthetic] PackageName [to ModuleName(1)[,ModuleName(2)[...]]];\" expected");
                            break;
                        case 48:
                            m34759(this.f47352.f29621, new InterfaceC23613() { // from class: l.ۜۢۡ
                                @Override // l.InterfaceC23613
                                public final C9979 get() {
                                    C14441 c14441 = this.f22537;
                                    C12842 c12844 = c14441.f16199;
                                    EnumC20934 enumC209310 = c12844.f42721;
                                    String string = "";
                                    int i5 = 0;
                                    if (enumC209310 == EnumC20934.f68096) {
                                        String str = "";
                                        while (c14441.f16199.f42721.m47090()) {
                                            StringBuilder sbM8976 = C3012.m8976(string, str);
                                            sbM8976.append(c14441.f16199.f42720);
                                            string = sbM8976.toString();
                                            c14441.f16199.m31840();
                                            C12842 c12845 = c14441.f16199;
                                            if (c12845.f42721 == EnumC20934.f68045) {
                                                c14441.f16198.mo2164(c12845.f42728, "Forward slash \"/\" expected instead of dot \".\". The dot is replaced by \"/\"", new Object[0]);
                                                c14441.f16199.m31840();
                                                str = "/";
                                            }
                                        }
                                        throw C7997.m21056(c14441.f16198, c14441.f16199.f42728, "Either name or Constant Pool index expected, got {0}", new Object[]{C16236.m38348(c14441.f16199.f42721, new StringBuilder("\""), "\"")});
                                    }
                                    if (enumC209310 == EnumC20934.f68161) {
                                        i5 = c12844.f42726;
                                        c12844.m31840();
                                    }
                                    return new C9979(Integer.valueOf(i5), string);
                                }
                            }, new InterfaceC23613() { // from class: l.ۜۢۡ
                                @Override // l.InterfaceC23613
                                public final C9979 get() {
                                    C14441 c14441 = this.f22537;
                                    C12842 c12844 = c14441.f16199;
                                    EnumC20934 enumC209310 = c12844.f42721;
                                    String string = "";
                                    int i5 = 0;
                                    if (enumC209310 == EnumC20934.f68096) {
                                        String str = "";
                                        while (c14441.f16199.f42721.m47090()) {
                                            StringBuilder sbM8976 = C3012.m8976(string, str);
                                            sbM8976.append(c14441.f16199.f42720);
                                            string = sbM8976.toString();
                                            c14441.f16199.m31840();
                                            C12842 c12845 = c14441.f16199;
                                            if (c12845.f42721 == EnumC20934.f68045) {
                                                c14441.f16198.mo2164(c12845.f42728, "Forward slash \"/\" expected instead of dot \".\". The dot is replaced by \"/\"", new Object[0]);
                                                c14441.f16199.m31840();
                                                str = "/";
                                            }
                                        }
                                        throw C7997.m21056(c14441.f16198, c14441.f16199.f42728, "Either name or Constant Pool index expected, got {0}", new Object[]{C16236.m38348(c14441.f16199.f42721, new StringBuilder("\""), "\"")});
                                    }
                                    if (enumC209310 == EnumC20934.f68161) {
                                        i5 = c12844.f42726;
                                        c12844.m31840();
                                    }
                                    return new C9979(Integer.valueOf(i5), string);
                                }
                            }, EnumC20934.f68143, false, "Module statement \"provides ClassName with ClassName(1)[,ClassName(2)[...]]];\" expected");
                            break;
                        case 49:
                            final C13507 c13507 = this.f47352.f29618;
                            HashSet hashSetM34753 = m34753(new InterfaceC10913() { // from class: l.ܶۢۡ
                                @Override // l.InterfaceC10913
                                public final void call() {
                                    this.f49482.f16199.m31840();
                                }
                            }, new InterfaceC23613() { // from class: l.ۜۢۡ
                                @Override // l.InterfaceC23613
                                public final C9979 get() {
                                    C14441 c14441 = this.f22537;
                                    C12842 c12844 = c14441.f16199;
                                    EnumC20934 enumC209310 = c12844.f42721;
                                    String string = "";
                                    int i5 = 0;
                                    if (enumC209310 == EnumC20934.f68096) {
                                        String str = "";
                                        while (c14441.f16199.f42721.m47090()) {
                                            StringBuilder sbM8976 = C3012.m8976(string, str);
                                            sbM8976.append(c14441.f16199.f42720);
                                            string = sbM8976.toString();
                                            c14441.f16199.m31840();
                                            C12842 c12845 = c14441.f16199;
                                            if (c12845.f42721 == EnumC20934.f68045) {
                                                c14441.f16198.mo2164(c12845.f42728, "Forward slash \"/\" expected instead of dot \".\". The dot is replaced by \"/\"", new Object[0]);
                                                c14441.f16199.m31840();
                                                str = "/";
                                            }
                                        }
                                        throw C7997.m21056(c14441.f16198, c14441.f16199.f42728, "Either name or Constant Pool index expected, got {0}", new Object[]{C16236.m38348(c14441.f16199.f42721, new StringBuilder("\""), "\"")});
                                    }
                                    if (enumC209310 == EnumC20934.f68161) {
                                        i5 = c12844.f42726;
                                        c12844.m31840();
                                    }
                                    return new C9979(Integer.valueOf(i5), string);
                                }
                            }, "Module statement \"uses ClassName;\" expected", true);
                            if (hashSetM34753.size() != 1) {
                                throw C0252.m1696(this.f16198, this.f16199.f42728, "Module statement \"uses ClassName;\" expected", new Object[0]);
                            }
                            C0356.forEach(hashSetM34753, new Consumer() { // from class: l.᩸ۢۡ
                                public /* synthetic */ Consumer andThen(Consumer consumer) {
                                    return C1455.$default$andThen(this, consumer);
                                }

                                @Override // java.util.function.Consumer
                                /* JADX INFO: renamed from: accept */
                                public final void n(Object obj) {
                                    C9979 c99710 = (C9979) obj;
                                    EnumC6098 enumC6098 = EnumC6098.CONSTANT_NULL;
                                    c13507.n(new C19879(c99710.m25242(), (String) c99710.f43680));
                                }
                            });
                            this.f16199.m31840();
                            break;
                            break;
                        default:
                            throw C0252.m1696(this.f16198, this.f16199.f42728, "Module statement expected", new Object[0]);
                    }
                } else {
                    this.f16199.m31840();
                }
            }
        }
        c12842.m31848(EnumC20934.f68195);
        if (this.f47350) {
            this.f47348.m31651();
            if (this.f47341.f31836 == null) {
                String strM2145 = this.f16198.m2145();
                C9398 c9399 = this.f47341;
                C22720 c22720 = new C22720(c9399.f20884, strM2145);
                c22720.m50363(this.f47341.f20884, new C22907(0));
                c9399.f31836 = c22720;
            }
        } else {
            C9398 c93910 = this.f47341;
            if (c93910.f31836 == null) {
                C12738 c12738 = this.f47348;
                c93910.f31836 = new C7986(c12738, EnumC16783.f53741, c12738.m31655(this.f16198.m2145()));
            }
        }
        this.f47341.m24125(this.f47352);
        this.f47349.add(this.f47341);
        this.f47341 = null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m34759(BiConsumer biConsumer, InterfaceC23613 interfaceC23613, InterfaceC23613 interfaceC23614, EnumC20934 enumC20934, boolean z, String str) {
        int iM52558;
        boolean z2 = enumC20934 == EnumC20934.f68143;
        C9979 c9979 = new C9979();
        HashSet hashSet = new HashSet();
        this.f16199.m31840();
        int i = 0;
        while (true) {
            EnumC20934 enumC20935 = this.f16199.f42721;
            if (enumC20935 == EnumC20934.f68171) {
                if (c9979.m25243() || (hashSet.isEmpty() && !z)) {
                    throw C0252.m1696(this.f16198, this.f16199.f42728, str, new Object[0]);
                }
                if (z2) {
                    Set set = (Set) C9030.stream(hashSet).map(new C19379()).collect(C1890.toSet());
                    EnumC6098 enumC6098 = EnumC6098.CONSTANT_NULL;
                    biConsumer.accept(new C10001(c9979.m25242(), (String) c9979.f43680, i, EnumC0554.MODULE), set);
                } else {
                    Set set2 = (Set) C9030.stream(hashSet).map(new C7497(8)).collect(C1890.toSet());
                    EnumC6098 enumC6099 = EnumC6098.CONSTANT_NULL;
                    biConsumer.accept(new C10001(c9979.m25242(), (String) c9979.f43680, i, EnumC0554.MODULE), set2);
                }
                this.f16199.m31840();
                return;
            }
            int i2 = C17262.f55005[enumC20935.ordinal()];
            if (i2 != 3 && i2 != 4) {
                if (i2 != 23) {
                    if (i2 != 26) {
                        if (i2 != 51 && i2 != 52) {
                            throw C0252.m1696(this.f16198, this.f16199.f42728, str, new Object[0]);
                        }
                        hashSet = m34753(z2 ? new InterfaceC10913() { // from class: l.ᩴۢۡ
                            @Override // l.InterfaceC10913
                            public final void call() {
                                this.f60610.f16199.m31840();
                            }
                        } : new InterfaceC10913() { // from class: l.۠ۢۡ
                            @Override // l.InterfaceC10913
                            public final void call() {
                                this.f28342.f16199.m31847();
                            }
                        }, interfaceC23614, str, false);
                    } else {
                        if (EnumC23839.m52552(i) || !c9979.m25243() || z2) {
                            throw C0252.m1696(this.f16198, this.f16199.f42728, str, new Object[0]);
                        }
                        iM52558 = EnumC23839.f77044.m52558();
                    }
                } else {
                    if (EnumC23839.m52544(i) || !c9979.m25243() || z2) {
                        throw C0252.m1696(this.f16198, this.f16199.f42728, str, new Object[0]);
                    }
                    iM52558 = EnumC23839.f77080.m52558();
                }
                i |= iM52558;
                if (z2) {
                    this.f16199.m31840();
                } else {
                    this.f16199.m31847();
                }
            } else {
                if (!c9979.m25243()) {
                    throw C0252.m1696(this.f16198, this.f16199.f42728, str, new Object[0]);
                }
                c9979 = interfaceC23613.get();
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private HashSet m34753(InterfaceC10913 interfaceC10913, InterfaceC23613 interfaceC23613, String str, boolean z) {
        HashSet hashSet = new HashSet();
        interfaceC10913.call();
        boolean z2 = false;
        boolean z3 = true;
        while (true) {
            EnumC20934 enumC20934 = this.f16199.f42721;
            if (enumC20934 == EnumC20934.f68171) {
                if (hashSet.isEmpty() || z2) {
                    throw C0252.m1696(this.f16198, this.f16199.f42728, str, new Object[0]);
                }
                return hashSet;
            }
            int i = C17262.f55005[enumC20934.ordinal()];
            if (i == 3 || i == 4) {
                if (!z3 && !z2) {
                    throw C0252.m1696(this.f16198, this.f16199.f42728, str, new Object[0]);
                }
                hashSet.add(interfaceC23613.get());
                z2 = false;
                z3 = false;
            } else {
                if (i != 31) {
                    throw C0252.m1696(this.f16198, this.f16199.f42728, str, new Object[0]);
                }
                if (z2 || z3 || z) {
                    throw C0252.m1696(this.f16198, this.f16199.f42728, str, new Object[0]);
                }
                this.f16199.m31840();
                z2 = true;
            }
        }
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    private void m34770() {
        while (true) {
            this.f16198.m2152(new Supplier() { // from class: l.۟ۢۡ
                @Override // java.util.function.Supplier
                public final Object get() {
                    return "recoverFile: scanner.token=" + this.f24508.f16199.f42721;
                }
            });
            int i = C17262.f55005[this.f16199.f42721.ordinal()];
            if (i != 2 && i != 19) {
                switch (i) {
                    case 38:
                        return;
                    case 39:
                        m34762(EnumC20934.f68039, EnumC20934.f68195);
                        this.f16199.m31840();
                        break;
                    case 40:
                        m34762(EnumC20934.f68081, EnumC20934.f68165);
                        this.f16199.m31840();
                        break;
                    case 41:
                        m34762(EnumC20934.f68157, EnumC20934.f68025);
                        this.f16199.m31840();
                        break;
                    default:
                        this.f16199.m31840();
                        break;
                }
            } else {
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    private void m34764() {
        if (this.f47350) {
            this.f47348.m31651();
            this.f47341.m24131();
            if (this.f47341.f31836 == null) {
                String strM2145 = this.f16198.m2145();
                final String strM2156 = this.f16198.m2156();
                C9398 c9398 = this.f47341;
                C22720 c22720 = new C22720(c9398.f20884, strM2145);
                c22720.m50363(this.f47341.f20884, new Function() { // from class: l.۫ۢۡ
                    @Override // java.util.function.Function
                    /* JADX INFO: renamed from: andThen */
                    public /* synthetic */ Function mo33696andThen(Function function) {
                        return C4277.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public /* synthetic */ Function compose(Function function) {
                        return C4277.$default$compose(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        Boolean bool;
                        String str = (String) obj;
                        boolean z = false;
                        if (str.contains(strM2156)) {
                            Object[] objArr = {".java", ".jcod", ".jasm", ".class"};
                            ArrayList arrayList = new ArrayList(4);
                            int iM51269 = 0;
                            while (iM51269 < 4) {
                                Object obj2 = objArr[iM51269];
                                iM51269 = C23234.m51269(obj2, arrayList, obj2, iM51269, 1);
                            }
                            Iterator it = C0561.unmodifiableList(arrayList).iterator();
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
                c9398.f31836 = c22720;
            }
        } else {
            C9398 c9399 = this.f47341;
            if (c9399.f31836 == null) {
                C12738 c12738 = this.f47348;
                c9399.f31836 = new C7986(c12738, EnumC16783.f53741, c12738.m31655(this.f16198.m2145()));
            }
        }
        this.f47341.m24132();
        this.f47349.add(this.f47341);
        C9398 c93910 = new C9398(this.f16198, C20311.m45840(this.f47356));
        this.f47341 = c93910;
        this.f47348 = c93910.f20884;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C9398[] m34795() {
        return (C9398[]) this.f47349.toArray(new C9398[0]);
    }

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    private void m34766() {
        EnumC20934 enumC20934;
        ArrayList arrayList;
        if (this.f16199.f42721.m47087(EnumC20934.f68059, EnumC20934.f68105, EnumC20934.f68044)) {
            boolean z = true;
            while (true) {
                try {
                    EnumC20934 enumC20935 = this.f16199.f42721;
                    if (enumC20935 == EnumC20934.f68179 || !z) {
                        break;
                    }
                    int i = C17262.f55005[enumC20935.ordinal()];
                    if (i == 30) {
                        this.f16199.m31840();
                    } else if (i != 67) {
                        if (i == 43) {
                            this.f16199.m31840();
                            C12842 c12842 = this.f16199;
                            long j = c12842.f42728;
                            String str = c12842.f42720;
                            c12842.m31848(EnumC20934.f68096);
                            EnumC20934 enumC20936 = this.f16199.f42721;
                            EnumC20934 enumC20937 = EnumC20934.f68171;
                            if (enumC20936 != enumC20937) {
                                m34750();
                                this.f16199.m31848(enumC20937);
                            }
                            if (this.f47353 == null) {
                                this.f47353 = str;
                                this.f47347 = str + "/";
                            } else {
                                this.f16198.mo2149(j, "Package statement repeated", new Object[0]);
                            }
                        } else if (i == 44) {
                            this.f16199.m31840();
                            m34778();
                            this.f47350 = true;
                        }
                        z = false;
                    } else {
                        this.f47346 = this.f47342.m5217();
                    }
                } catch (C6055 unused) {
                    m34770();
                }
            }
            while (true) {
                C12842 c12843 = this.f16199;
                enumC20934 = c12843.f42721;
                if (enumC20934 != EnumC20934.f68171) {
                    break;
                } else {
                    c12843.m31840();
                }
            }
            if (enumC20934 != EnumC20934.f68179) {
                if (this.f47353 != null || (arrayList = this.f47346) == null) {
                    return;
                }
                this.f47355 = arrayList;
                this.f47346 = null;
                return;
            }
            this.f16198.m2146("Scanner:  EOF", new Object[0]);
            if (this.f16198.m2145().contains("package-info")) {
                this.f16198.m2152(new Supplier() { // from class: l.ۤۢۡ
                    @Override // java.util.function.Supplier
                    public final Object get() {
                        return C14441.m34771(this.f34860);
                    }
                });
                int iM52558 = EnumC23839.f77056.m52558() | EnumC23839.f77073.m52558();
                if (this.f47341.f31849.m45841() > 49) {
                    iM52558 |= EnumC23839.f77067.m52558();
                }
                C9398 c9398 = this.f47341;
                String strM50267 = C22697.m50267(new StringBuilder(), this.f47347, "package-info");
                c9398.f20887 = iM52558;
                c9398.f31843 = strM50267;
                c9398.f31849.m45849();
                ArrayList arrayList2 = this.f47346;
                if (arrayList2 != null) {
                    this.f47341.m17092(arrayList2);
                }
                if (this.f47350) {
                    this.f47348.m31651();
                    if (this.f47341.f31836 == null) {
                        String strM2145 = this.f16198.m2145();
                        C9398 c9399 = this.f47341;
                        C22720 c22720 = new C22720(c9399.f20884, strM2145);
                        c22720.m50363(this.f47341.f20884, new C12740(5));
                        c9399.f31836 = c22720;
                    }
                } else {
                    C9398 c93910 = this.f47341;
                    if (c93910.f31836 == null) {
                        C12738 c12738 = this.f47348;
                        c93910.f31836 = new C7986(c12738, EnumC16783.f53741, c12738.m31655(this.f16198.m2145()));
                    }
                }
                C9398 c93911 = this.f47341;
                C1635 c1635 = c93911.f31850;
                C12738 c12739 = c93911.f20884;
                String str2 = c93911.f31843;
                c12739.getClass();
                EnumC13776 enumC13776 = EnumC13776.f45400;
                c1635.m5530(c12739.m31658((AbstractC21536) new C5682(enumC13776, c12739.m31655(str2))));
                C13111 c13111 = c1635.f6555;
                C13111 c13112 = c1635.f6554;
                C15187 c15187M31658 = c12739.m31658((AbstractC21536) new C5682(enumC13776, c12739.m31655("java/lang/Object")));
                if (c13112.f43680 != null) {
                    c13112.f43680 = c15187M31658;
                } else {
                    c13111.f43680 = c15187M31658;
                }
                c12739.m31673();
                C15187 c15187M31664 = c12739.m31664(c1635.m5532());
                if (c13112.f43680 != null) {
                    c13112.f43680 = c15187M31664;
                } else {
                    c13111.f43680 = c15187M31664;
                }
                c1635.m5530(c12739.m31664(c1635.m5531()));
                c12739.m31669();
                this.f47349.add(this.f47341);
                this.f47341 = null;
            }
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ String m34771(C14441 c14441) {
        return "Creating \"package-info.jasm\": package: " + c14441.f47353 + " " + c14441.f47341.f31849.m45843();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private String m34782() {
        if (!this.f16199.f42721.m47087(EnumC20934.f68220, EnumC20934.f68129)) {
            return null;
        }
        boolean z = false;
        String string = null;
        while (true) {
            EnumC20934 enumC20934 = this.f16199.f42721;
            if (enumC20934 == EnumC20934.f68179) {
                return string;
            }
            int i = C17262.f55005[enumC20934.ordinal()];
            if (i != 2 && i != 4) {
                if (i == 30) {
                    if (string == null) {
                        this.f16198.m42172(this.f16199.f42728, "\"{0}\" token is expected", z ? "CLASSNAME" : "FILENAME");
                        throw null;
                    }
                    this.f16199.m31840();
                    return string.concat(z ? ".class" : "");
                }
                switch (i) {
                    case 70:
                        if (string != null) {
                            this.f16198.m42172(this.f16199.f42728, "\"{0}\" token is expected", EnumC20934.f68171.m47084());
                            throw null;
                        }
                        break;
                        break;
                    case 71:
                        if (string != null) {
                            this.f16198.m42172(this.f16199.f42728, "\"{0}\" token is expected", EnumC20934.f68171.m47092());
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
                            this.f16198.m42172(this.f16199.f42728, "\"{0}\" token is expected", z ? "CLASSNAME" : "FILENAME");
                            throw null;
                        }
                        this.f16198.m42172(this.f16199.f42728, "\"{0}\" token is expected", EnumC20934.f68171.m47092());
                        throw null;
                }
            } else if (string == null) {
                string = this.f16199.f42724;
            } else {
                StringBuilder sbM23356 = C9023.m23356(string);
                sbM23356.append(this.f16199.f42724);
                string = sbM23356.toString();
            }
            this.f16199.m31840();
        }
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m34787() throws Throwable {
        try {
            C9398 c9398 = new C9398(this.f16198, C20311.m45840(this.f47356));
            this.f47341 = c9398;
            this.f47348 = c9398.f20884;
            String strM34782 = m34782();
            if (strM34782 != null) {
                InterfaceC10434 interfaceC10434M2144 = this.f16198.m2144();
                if (interfaceC10434M2144 instanceof AbstractC18194) {
                    ((AbstractC18194) interfaceC10434M2144).m42314(strM34782);
                }
            }
            m34766();
            while (true) {
                EnumC20934 enumC20934 = this.f16199.f42721;
                if (enumC20934 == EnumC20934.f68179) {
                    return;
                }
                try {
                    if (enumC20934 == EnumC20934.f68105) {
                        this.f47355 = this.f47342.m5217();
                    }
                    int iM34798 = m34798();
                    if (iM34798 == 0) {
                        int i = C17262.f55005[this.f16199.f42721.ordinal()];
                        if (i != 2 && i != 3 && i != 4 && i != 19) {
                            if (i == 30) {
                                this.f16199.m31840();
                            } else if (i != 36 && i != 68 && i != 69) {
                                this.f16198.mo2149(this.f16199.f42728, "Class, module or interface declaration expected", new Object[0]);
                                throw new C6055();
                            }
                        }
                    } else if (EnumC23839.m52527(iM34798) && this.f16199.f42721 != EnumC20934.f68148) {
                        iM34798 |= EnumC23839.f77073.m52558();
                    }
                    EnumC20934 enumC20935 = this.f16199.f42721;
                    if (enumC20935 == EnumC20934.f68193 || enumC20935 == EnumC20934.f68064) {
                        m34751(iM34798);
                    } else {
                        m34772(iM34798);
                    }
                    this.f47355 = null;
                } catch (C6055 e) {
                    this.f16198.m2146("^^^^^^^ Syntax Error ^^^^^^^^^^^^", new Object[0]);
                    this.f16199.f16198.getClass();
                    if (e.m16452()) {
                        return;
                    }
                    m34770();
                    return;
                }
            }
        } catch (IOException unused) {
            C18111 c18111 = this.f16198;
            c18111.mo2149(this.f16199.f42728, "I/O error in {0}", c18111.m2145());
        } catch (Error unused2) {
        }
    }
}
