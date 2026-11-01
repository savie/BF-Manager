package l;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: l.ܳۙܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: DAVS */
/* JADX INFO: loaded from: classes4.dex */
public final class C14301 implements InterfaceC11747 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static final char[] f46848 = {'t', 'r', 'u', 'e'};

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static final char[] f46849 = {'f', 'a', 'l', 's', 'e'};

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final String f46850;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f46851;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final String f46852;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C17122[] f46853;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C17122[] f46854;

    public C14301(Class cls) {
        EnumC16381 enumC16381Naming;
        String strTypeName;
        String strTypeKey;
        int modifiers = cls.getModifiers();
        this.f46851 = 0;
        InterfaceC5797 interfaceC5797 = (InterfaceC5797) cls.getAnnotation(InterfaceC5797.class);
        if (interfaceC5797 != null) {
            this.f46851 = EnumC3984.m11482(interfaceC5797.serialzeFeatures());
            strTypeName = interfaceC5797.typeName();
            if (strTypeName.length() == 0) {
                strTypeName = null;
                strTypeKey = null;
            } else {
                strTypeKey = null;
                for (Class superclass = cls.getSuperclass(); superclass != null && superclass != Object.class; superclass = superclass.getSuperclass()) {
                    InterfaceC5797 interfaceC5798 = (InterfaceC5797) superclass.getAnnotation(InterfaceC5797.class);
                    if (interfaceC5798 == null) {
                        break;
                    }
                    strTypeKey = interfaceC5798.typeKey();
                    if (strTypeKey.length() != 0) {
                        break;
                    }
                }
                for (Class<?> cls2 : cls.getInterfaces()) {
                    InterfaceC5797 interfaceC5799 = (InterfaceC5797) cls2.getAnnotation(InterfaceC5797.class);
                    if (interfaceC5799 != null) {
                        strTypeKey = interfaceC5799.typeKey();
                        if (strTypeKey.length() != 0) {
                            break;
                        }
                    }
                }
                if (strTypeKey != null && strTypeKey.length() == 0) {
                    strTypeKey = null;
                }
            }
            enumC16381Naming = interfaceC5797.naming();
            if (enumC16381Naming == EnumC16381.CamelCase) {
                enumC16381Naming = null;
            }
        } else {
            enumC16381Naming = null;
            strTypeName = null;
            strTypeKey = null;
        }
        this.f46852 = strTypeName;
        this.f46850 = strTypeKey;
        ArrayList arrayListM21517 = C8219.m21517(cls, modifiers, interfaceC5797, false, enumC16381Naming);
        ArrayList arrayList = new ArrayList();
        Iterator it = arrayListM21517.iterator();
        while (it.hasNext()) {
            arrayList.add(new C17122((C15275) it.next()));
        }
        C17122[] c17122Arr = (C17122[]) arrayList.toArray(new C17122[arrayList.size()]);
        this.f46854 = c17122Arr;
        String[] strArrOrders = interfaceC5797 != null ? interfaceC5797.orders() : null;
        if (strArrOrders != null && strArrOrders.length != 0) {
            ArrayList arrayListM21518 = C8219.m21517(cls, modifiers, interfaceC5797, true, enumC16381Naming);
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = arrayListM21518.iterator();
            while (it2.hasNext()) {
                arrayList2.add(new C17122((C15275) it2.next()));
            }
            this.f46853 = (C17122[]) arrayList2.toArray(new C17122[arrayList2.size()]);
            return;
        }
        C17122[] c17122Arr2 = new C17122[c17122Arr.length];
        System.arraycopy(c17122Arr, 0, c17122Arr2, 0, c17122Arr.length);
        Arrays.sort(c17122Arr2);
        if (Arrays.equals(c17122Arr2, c17122Arr)) {
            this.f46853 = c17122Arr;
        } else {
            this.f46853 = c17122Arr2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:104:0x016f  */
    /* JADX WARN: Code duplicated, block: B:112:0x0188 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:113:0x018a A[Catch: all -> 0x0178, Exception -> 0x0180, TryCatch #13 {Exception -> 0x0180, all -> 0x0178, blocks: (B:101:0x016a, B:105:0x0171, B:113:0x018a, B:114:0x018e, B:116:0x0194, B:127:0x01be, B:141:0x01fd, B:143:0x0204, B:145:0x020b, B:147:0x0211, B:148:0x0215, B:150:0x021b, B:160:0x023e, B:162:0x0245, B:164:0x024c, B:166:0x0252, B:167:0x0258, B:169:0x025e, B:176:0x0279, B:183:0x0294, B:184:0x029a, B:186:0x02a0, B:178:0x0280, B:180:0x0287, B:130:0x01c9, B:132:0x01d7, B:134:0x01e7), top: B:441:0x016a }] */
    /* JADX WARN: Code duplicated, block: B:116:0x0194 A[Catch: all -> 0x0178, Exception -> 0x0180, TRY_LEAVE, TryCatch #13 {Exception -> 0x0180, all -> 0x0178, blocks: (B:101:0x016a, B:105:0x0171, B:113:0x018a, B:114:0x018e, B:116:0x0194, B:127:0x01be, B:141:0x01fd, B:143:0x0204, B:145:0x020b, B:147:0x0211, B:148:0x0215, B:150:0x021b, B:160:0x023e, B:162:0x0245, B:164:0x024c, B:166:0x0252, B:167:0x0258, B:169:0x025e, B:176:0x0279, B:183:0x0294, B:184:0x029a, B:186:0x02a0, B:178:0x0280, B:180:0x0287, B:130:0x01c9, B:132:0x01d7, B:134:0x01e7), top: B:441:0x016a }] */
    /* JADX WARN: Code duplicated, block: B:119:0x01a2 A[EDGE_INSN: B:119:0x01a2->B:120:0x01a3 BREAK  A[LOOP:2: B:114:0x018e->B:453:?]] */
    /* JADX WARN: Code duplicated, block: B:122:0x01ab A[Catch: all -> 0x054c, Exception -> 0x0550, TRY_ENTER, TRY_LEAVE, TryCatch #17 {Exception -> 0x0550, all -> 0x054c, blocks: (B:97:0x015d, B:122:0x01ab, B:136:0x01ec), top: B:433:0x015d }] */
    /* JADX WARN: Code duplicated, block: B:125:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:127:0x01be A[Catch: all -> 0x0178, Exception -> 0x0180, TRY_ENTER, TryCatch #13 {Exception -> 0x0180, all -> 0x0178, blocks: (B:101:0x016a, B:105:0x0171, B:113:0x018a, B:114:0x018e, B:116:0x0194, B:127:0x01be, B:141:0x01fd, B:143:0x0204, B:145:0x020b, B:147:0x0211, B:148:0x0215, B:150:0x021b, B:160:0x023e, B:162:0x0245, B:164:0x024c, B:166:0x0252, B:167:0x0258, B:169:0x025e, B:176:0x0279, B:183:0x0294, B:184:0x029a, B:186:0x02a0, B:178:0x0280, B:180:0x0287, B:130:0x01c9, B:132:0x01d7, B:134:0x01e7), top: B:441:0x016a }] */
    /* JADX WARN: Code duplicated, block: B:129:0x01c7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:130:0x01c9 A[Catch: all -> 0x0178, Exception -> 0x0180, TryCatch #13 {Exception -> 0x0180, all -> 0x0178, blocks: (B:101:0x016a, B:105:0x0171, B:113:0x018a, B:114:0x018e, B:116:0x0194, B:127:0x01be, B:141:0x01fd, B:143:0x0204, B:145:0x020b, B:147:0x0211, B:148:0x0215, B:150:0x021b, B:160:0x023e, B:162:0x0245, B:164:0x024c, B:166:0x0252, B:167:0x0258, B:169:0x025e, B:176:0x0279, B:183:0x0294, B:184:0x029a, B:186:0x02a0, B:178:0x0280, B:180:0x0287, B:130:0x01c9, B:132:0x01d7, B:134:0x01e7), top: B:441:0x016a }] */
    /* JADX WARN: Code duplicated, block: B:131:0x01d5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:132:0x01d7 A[Catch: all -> 0x0178, Exception -> 0x0180, TryCatch #13 {Exception -> 0x0180, all -> 0x0178, blocks: (B:101:0x016a, B:105:0x0171, B:113:0x018a, B:114:0x018e, B:116:0x0194, B:127:0x01be, B:141:0x01fd, B:143:0x0204, B:145:0x020b, B:147:0x0211, B:148:0x0215, B:150:0x021b, B:160:0x023e, B:162:0x0245, B:164:0x024c, B:166:0x0252, B:167:0x0258, B:169:0x025e, B:176:0x0279, B:183:0x0294, B:184:0x029a, B:186:0x02a0, B:178:0x0280, B:180:0x0287, B:130:0x01c9, B:132:0x01d7, B:134:0x01e7), top: B:441:0x016a }] */
    /* JADX WARN: Code duplicated, block: B:134:0x01e7 A[Catch: all -> 0x0178, Exception -> 0x0180, TRY_LEAVE, TryCatch #13 {Exception -> 0x0180, all -> 0x0178, blocks: (B:101:0x016a, B:105:0x0171, B:113:0x018a, B:114:0x018e, B:116:0x0194, B:127:0x01be, B:141:0x01fd, B:143:0x0204, B:145:0x020b, B:147:0x0211, B:148:0x0215, B:150:0x021b, B:160:0x023e, B:162:0x0245, B:164:0x024c, B:166:0x0252, B:167:0x0258, B:169:0x025e, B:176:0x0279, B:183:0x0294, B:184:0x029a, B:186:0x02a0, B:178:0x0280, B:180:0x0287, B:130:0x01c9, B:132:0x01d7, B:134:0x01e7), top: B:441:0x016a }] */
    /* JADX WARN: Code duplicated, block: B:136:0x01ec A[Catch: all -> 0x054c, Exception -> 0x0550, TRY_ENTER, TRY_LEAVE, TryCatch #17 {Exception -> 0x0550, all -> 0x054c, blocks: (B:97:0x015d, B:122:0x01ab, B:136:0x01ec), top: B:433:0x015d }] */
    /* JADX WARN: Code duplicated, block: B:139:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:140:0x01fb A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:141:0x01fd A[Catch: all -> 0x0178, Exception -> 0x0180, TRY_ENTER, TryCatch #13 {Exception -> 0x0180, all -> 0x0178, blocks: (B:101:0x016a, B:105:0x0171, B:113:0x018a, B:114:0x018e, B:116:0x0194, B:127:0x01be, B:141:0x01fd, B:143:0x0204, B:145:0x020b, B:147:0x0211, B:148:0x0215, B:150:0x021b, B:160:0x023e, B:162:0x0245, B:164:0x024c, B:166:0x0252, B:167:0x0258, B:169:0x025e, B:176:0x0279, B:183:0x0294, B:184:0x029a, B:186:0x02a0, B:178:0x0280, B:180:0x0287, B:130:0x01c9, B:132:0x01d7, B:134:0x01e7), top: B:441:0x016a }] */
    /* JADX WARN: Code duplicated, block: B:142:0x0202 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:143:0x0204 A[Catch: all -> 0x0178, Exception -> 0x0180, TryCatch #13 {Exception -> 0x0180, all -> 0x0178, blocks: (B:101:0x016a, B:105:0x0171, B:113:0x018a, B:114:0x018e, B:116:0x0194, B:127:0x01be, B:141:0x01fd, B:143:0x0204, B:145:0x020b, B:147:0x0211, B:148:0x0215, B:150:0x021b, B:160:0x023e, B:162:0x0245, B:164:0x024c, B:166:0x0252, B:167:0x0258, B:169:0x025e, B:176:0x0279, B:183:0x0294, B:184:0x029a, B:186:0x02a0, B:178:0x0280, B:180:0x0287, B:130:0x01c9, B:132:0x01d7, B:134:0x01e7), top: B:441:0x016a }] */
    /* JADX WARN: Code duplicated, block: B:144:0x0209 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:145:0x020b A[Catch: all -> 0x0178, Exception -> 0x0180, TryCatch #13 {Exception -> 0x0180, all -> 0x0178, blocks: (B:101:0x016a, B:105:0x0171, B:113:0x018a, B:114:0x018e, B:116:0x0194, B:127:0x01be, B:141:0x01fd, B:143:0x0204, B:145:0x020b, B:147:0x0211, B:148:0x0215, B:150:0x021b, B:160:0x023e, B:162:0x0245, B:164:0x024c, B:166:0x0252, B:167:0x0258, B:169:0x025e, B:176:0x0279, B:183:0x0294, B:184:0x029a, B:186:0x02a0, B:178:0x0280, B:180:0x0287, B:130:0x01c9, B:132:0x01d7, B:134:0x01e7), top: B:441:0x016a }] */
    /* JADX WARN: Code duplicated, block: B:150:0x021b A[Catch: all -> 0x0178, Exception -> 0x0180, TryCatch #13 {Exception -> 0x0180, all -> 0x0178, blocks: (B:101:0x016a, B:105:0x0171, B:113:0x018a, B:114:0x018e, B:116:0x0194, B:127:0x01be, B:141:0x01fd, B:143:0x0204, B:145:0x020b, B:147:0x0211, B:148:0x0215, B:150:0x021b, B:160:0x023e, B:162:0x0245, B:164:0x024c, B:166:0x0252, B:167:0x0258, B:169:0x025e, B:176:0x0279, B:183:0x0294, B:184:0x029a, B:186:0x02a0, B:178:0x0280, B:180:0x0287, B:130:0x01c9, B:132:0x01d7, B:134:0x01e7), top: B:441:0x016a }] */
    /* JADX WARN: Code duplicated, block: B:153:0x022a A[EDGE_INSN: B:153:0x022a->B:154:0x022c BREAK  A[LOOP:3: B:148:0x0215->B:456:?], PHI: r2 r31
      0x022a: PHI (r2v19 java.lang.Object) = (r2v18 java.lang.Object), (r2v47 java.lang.Object) binds: [B:138:0x01f7, B:454:0x022a] A[DONT_GENERATE, DONT_INLINE]
      0x022a: PHI (r31v2 boolean) = (r31v1 boolean), (r31v16 boolean) binds: [B:138:0x01f7, B:454:0x022a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:156:0x0236 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:157:0x0238  */
    /* JADX WARN: Code duplicated, block: B:158:0x023a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:160:0x023e A[Catch: all -> 0x0178, Exception -> 0x0180, TryCatch #13 {Exception -> 0x0180, all -> 0x0178, blocks: (B:101:0x016a, B:105:0x0171, B:113:0x018a, B:114:0x018e, B:116:0x0194, B:127:0x01be, B:141:0x01fd, B:143:0x0204, B:145:0x020b, B:147:0x0211, B:148:0x0215, B:150:0x021b, B:160:0x023e, B:162:0x0245, B:164:0x024c, B:166:0x0252, B:167:0x0258, B:169:0x025e, B:176:0x0279, B:183:0x0294, B:184:0x029a, B:186:0x02a0, B:178:0x0280, B:180:0x0287, B:130:0x01c9, B:132:0x01d7, B:134:0x01e7), top: B:441:0x016a }] */
    /* JADX WARN: Code duplicated, block: B:161:0x0243 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:162:0x0245 A[Catch: all -> 0x0178, Exception -> 0x0180, TryCatch #13 {Exception -> 0x0180, all -> 0x0178, blocks: (B:101:0x016a, B:105:0x0171, B:113:0x018a, B:114:0x018e, B:116:0x0194, B:127:0x01be, B:141:0x01fd, B:143:0x0204, B:145:0x020b, B:147:0x0211, B:148:0x0215, B:150:0x021b, B:160:0x023e, B:162:0x0245, B:164:0x024c, B:166:0x0252, B:167:0x0258, B:169:0x025e, B:176:0x0279, B:183:0x0294, B:184:0x029a, B:186:0x02a0, B:178:0x0280, B:180:0x0287, B:130:0x01c9, B:132:0x01d7, B:134:0x01e7), top: B:441:0x016a }] */
    /* JADX WARN: Code duplicated, block: B:163:0x024a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:164:0x024c A[Catch: all -> 0x0178, Exception -> 0x0180, TryCatch #13 {Exception -> 0x0180, all -> 0x0178, blocks: (B:101:0x016a, B:105:0x0171, B:113:0x018a, B:114:0x018e, B:116:0x0194, B:127:0x01be, B:141:0x01fd, B:143:0x0204, B:145:0x020b, B:147:0x0211, B:148:0x0215, B:150:0x021b, B:160:0x023e, B:162:0x0245, B:164:0x024c, B:166:0x0252, B:167:0x0258, B:169:0x025e, B:176:0x0279, B:183:0x0294, B:184:0x029a, B:186:0x02a0, B:178:0x0280, B:180:0x0287, B:130:0x01c9, B:132:0x01d7, B:134:0x01e7), top: B:441:0x016a }] */
    /* JADX WARN: Code duplicated, block: B:169:0x025e A[Catch: all -> 0x0178, Exception -> 0x0180, LOOP:4: B:167:0x0258->B:169:0x025e, LOOP_END, TryCatch #13 {Exception -> 0x0180, all -> 0x0178, blocks: (B:101:0x016a, B:105:0x0171, B:113:0x018a, B:114:0x018e, B:116:0x0194, B:127:0x01be, B:141:0x01fd, B:143:0x0204, B:145:0x020b, B:147:0x0211, B:148:0x0215, B:150:0x021b, B:160:0x023e, B:162:0x0245, B:164:0x024c, B:166:0x0252, B:167:0x0258, B:169:0x025e, B:176:0x0279, B:183:0x0294, B:184:0x029a, B:186:0x02a0, B:178:0x0280, B:180:0x0287, B:130:0x01c9, B:132:0x01d7, B:134:0x01e7), top: B:441:0x016a }] */
    /* JADX WARN: Code duplicated, block: B:171:0x026e  */
    /* JADX WARN: Code duplicated, block: B:173:0x0273  */
    /* JADX WARN: Code duplicated, block: B:174:0x0275 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:182:0x028e  */
    /* JADX WARN: Code duplicated, block: B:186:0x02a0 A[Catch: all -> 0x0178, Exception -> 0x0180, LOOP:5: B:184:0x029a->B:186:0x02a0, LOOP_END, TRY_LEAVE, TryCatch #13 {Exception -> 0x0180, all -> 0x0178, blocks: (B:101:0x016a, B:105:0x0171, B:113:0x018a, B:114:0x018e, B:116:0x0194, B:127:0x01be, B:141:0x01fd, B:143:0x0204, B:145:0x020b, B:147:0x0211, B:148:0x0215, B:150:0x021b, B:160:0x023e, B:162:0x0245, B:164:0x024c, B:166:0x0252, B:167:0x0258, B:169:0x025e, B:176:0x0279, B:183:0x0294, B:184:0x029a, B:186:0x02a0, B:178:0x0280, B:180:0x0287, B:130:0x01c9, B:132:0x01d7, B:134:0x01e7), top: B:441:0x016a }] */
    /* JADX WARN: Code duplicated, block: B:189:0x02b8  */
    /* JADX WARN: Code duplicated, block: B:192:0x02c8 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:263:0x0391  */
    /* JADX WARN: Code duplicated, block: B:266:0x0399 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:290:0x03d8 A[Catch: all -> 0x0383, Exception -> 0x038a, TryCatch #15 {Exception -> 0x038a, all -> 0x0383, blocks: (B:193:0x02ca, B:195:0x02da, B:197:0x02e5, B:199:0x02e9, B:202:0x02ee, B:204:0x02f1, B:268:0x039d, B:270:0x03a1, B:274:0x03a9, B:276:0x03ad, B:284:0x03c1, B:286:0x03c5, B:278:0x03b1, B:280:0x03b5, B:290:0x03d8, B:292:0x03e1, B:293:0x03e4, B:295:0x03f7, B:299:0x0401, B:206:0x02f5, B:208:0x02fb, B:210:0x0306, B:212:0x030a, B:215:0x030f, B:217:0x0312, B:220:0x031a, B:222:0x0322, B:224:0x032d, B:226:0x0331, B:229:0x0338, B:231:0x033b, B:233:0x0340, B:234:0x0345, B:236:0x034d, B:238:0x0358, B:240:0x035c, B:243:0x0363, B:245:0x0366, B:247:0x036b, B:249:0x0370, B:251:0x0374), top: B:437:0x02ca }] */
    /* JADX WARN: Code duplicated, block: B:292:0x03e1 A[Catch: all -> 0x0383, Exception -> 0x038a, TryCatch #15 {Exception -> 0x038a, all -> 0x0383, blocks: (B:193:0x02ca, B:195:0x02da, B:197:0x02e5, B:199:0x02e9, B:202:0x02ee, B:204:0x02f1, B:268:0x039d, B:270:0x03a1, B:274:0x03a9, B:276:0x03ad, B:284:0x03c1, B:286:0x03c5, B:278:0x03b1, B:280:0x03b5, B:290:0x03d8, B:292:0x03e1, B:293:0x03e4, B:295:0x03f7, B:299:0x0401, B:206:0x02f5, B:208:0x02fb, B:210:0x0306, B:212:0x030a, B:215:0x030f, B:217:0x0312, B:220:0x031a, B:222:0x0322, B:224:0x032d, B:226:0x0331, B:229:0x0338, B:231:0x033b, B:233:0x0340, B:234:0x0345, B:236:0x034d, B:238:0x0358, B:240:0x035c, B:243:0x0363, B:245:0x0366, B:247:0x036b, B:249:0x0370, B:251:0x0374), top: B:437:0x02ca }] */
    /* JADX WARN: Code duplicated, block: B:295:0x03f7 A[Catch: all -> 0x0383, Exception -> 0x038a, TryCatch #15 {Exception -> 0x038a, all -> 0x0383, blocks: (B:193:0x02ca, B:195:0x02da, B:197:0x02e5, B:199:0x02e9, B:202:0x02ee, B:204:0x02f1, B:268:0x039d, B:270:0x03a1, B:274:0x03a9, B:276:0x03ad, B:284:0x03c1, B:286:0x03c5, B:278:0x03b1, B:280:0x03b5, B:290:0x03d8, B:292:0x03e1, B:293:0x03e4, B:295:0x03f7, B:299:0x0401, B:206:0x02f5, B:208:0x02fb, B:210:0x0306, B:212:0x030a, B:215:0x030f, B:217:0x0312, B:220:0x031a, B:222:0x0322, B:224:0x032d, B:226:0x0331, B:229:0x0338, B:231:0x033b, B:233:0x0340, B:234:0x0345, B:236:0x034d, B:238:0x0358, B:240:0x035c, B:243:0x0363, B:245:0x0366, B:247:0x036b, B:249:0x0370, B:251:0x0374), top: B:437:0x02ca }] */
    /* JADX WARN: Code duplicated, block: B:296:0x03fb  */
    /* JADX WARN: Code duplicated, block: B:298:0x03ff A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:299:0x0401 A[Catch: all -> 0x0383, Exception -> 0x038a, TRY_LEAVE, TryCatch #15 {Exception -> 0x038a, all -> 0x0383, blocks: (B:193:0x02ca, B:195:0x02da, B:197:0x02e5, B:199:0x02e9, B:202:0x02ee, B:204:0x02f1, B:268:0x039d, B:270:0x03a1, B:274:0x03a9, B:276:0x03ad, B:284:0x03c1, B:286:0x03c5, B:278:0x03b1, B:280:0x03b5, B:290:0x03d8, B:292:0x03e1, B:293:0x03e4, B:295:0x03f7, B:299:0x0401, B:206:0x02f5, B:208:0x02fb, B:210:0x0306, B:212:0x030a, B:215:0x030f, B:217:0x0312, B:220:0x031a, B:222:0x0322, B:224:0x032d, B:226:0x0331, B:229:0x0338, B:231:0x033b, B:233:0x0340, B:234:0x0345, B:236:0x034d, B:238:0x0358, B:240:0x035c, B:243:0x0363, B:245:0x0366, B:247:0x036b, B:249:0x0370, B:251:0x0374), top: B:437:0x02ca }] */
    /* JADX WARN: Code duplicated, block: B:307:0x0418  */
    /* JADX WARN: Code duplicated, block: B:309:0x041c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:310:0x041e A[Catch: all -> 0x040e, Exception -> 0x0413, TryCatch #14 {Exception -> 0x0413, all -> 0x040e, blocks: (B:301:0x0407, B:310:0x041e, B:311:0x0421, B:314:0x0429, B:316:0x0434, B:317:0x0437, B:325:0x0458, B:330:0x0464, B:332:0x046a, B:334:0x046e, B:335:0x0470, B:337:0x0478, B:338:0x047b, B:339:0x0484, B:341:0x0489, B:344:0x0494, B:345:0x049d, B:348:0x04aa, B:318:0x0444), top: B:439:0x0407 }] */
    /* JADX WARN: Code duplicated, block: B:312:0x0425  */
    /* JADX WARN: Code duplicated, block: B:313:0x0427 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:314:0x0429 A[Catch: all -> 0x040e, Exception -> 0x0413, TryCatch #14 {Exception -> 0x0413, all -> 0x040e, blocks: (B:301:0x0407, B:310:0x041e, B:311:0x0421, B:314:0x0429, B:316:0x0434, B:317:0x0437, B:325:0x0458, B:330:0x0464, B:332:0x046a, B:334:0x046e, B:335:0x0470, B:337:0x0478, B:338:0x047b, B:339:0x0484, B:341:0x0489, B:344:0x0494, B:345:0x049d, B:348:0x04aa, B:318:0x0444), top: B:439:0x0407 }] */
    /* JADX WARN: Code duplicated, block: B:316:0x0434 A[Catch: all -> 0x040e, Exception -> 0x0413, TryCatch #14 {Exception -> 0x0413, all -> 0x040e, blocks: (B:301:0x0407, B:310:0x041e, B:311:0x0421, B:314:0x0429, B:316:0x0434, B:317:0x0437, B:325:0x0458, B:330:0x0464, B:332:0x046a, B:334:0x046e, B:335:0x0470, B:337:0x0478, B:338:0x047b, B:339:0x0484, B:341:0x0489, B:344:0x0494, B:345:0x049d, B:348:0x04aa, B:318:0x0444), top: B:439:0x0407 }] */
    /* JADX WARN: Code duplicated, block: B:318:0x0444 A[Catch: all -> 0x040e, Exception -> 0x0413, TryCatch #14 {Exception -> 0x0413, all -> 0x040e, blocks: (B:301:0x0407, B:310:0x041e, B:311:0x0421, B:314:0x0429, B:316:0x0434, B:317:0x0437, B:325:0x0458, B:330:0x0464, B:332:0x046a, B:334:0x046e, B:335:0x0470, B:337:0x0478, B:338:0x047b, B:339:0x0484, B:341:0x0489, B:344:0x0494, B:345:0x049d, B:348:0x04aa, B:318:0x0444), top: B:439:0x0407 }] */
    /* JADX WARN: Code duplicated, block: B:319:0x044a  */
    /* JADX WARN: Code duplicated, block: B:321:0x044e A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:347:0x04a8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:348:0x04aa A[Catch: all -> 0x040e, Exception -> 0x0413, TRY_LEAVE, TryCatch #14 {Exception -> 0x0413, all -> 0x040e, blocks: (B:301:0x0407, B:310:0x041e, B:311:0x0421, B:314:0x0429, B:316:0x0434, B:317:0x0437, B:325:0x0458, B:330:0x0464, B:332:0x046a, B:334:0x046e, B:335:0x0470, B:337:0x0478, B:338:0x047b, B:339:0x0484, B:341:0x0489, B:344:0x0494, B:345:0x049d, B:348:0x04aa, B:318:0x0444), top: B:439:0x0407 }] */
    /* JADX WARN: Code duplicated, block: B:352:0x04b3 A[Catch: all -> 0x05b7, Exception -> 0x05bb, TryCatch #11 {Exception -> 0x05bb, all -> 0x05b7, blocks: (B:380:0x052d, B:350:0x04ae, B:352:0x04b3, B:354:0x04bc, B:357:0x04c0, B:358:0x04c5, B:359:0x04cb, B:361:0x04d1, B:362:0x04d5, B:363:0x04db, B:366:0x04e5, B:368:0x04ee, B:373:0x0504, B:374:0x0508, B:375:0x050d, B:376:0x0519, B:377:0x051d, B:378:0x0523, B:389:0x0562, B:394:0x0573, B:395:0x0577, B:397:0x057d, B:398:0x058a, B:400:0x058f, B:402:0x0598, B:403:0x059e, B:405:0x05a7, B:406:0x05aa), top: B:445:0x052d }] */
    /* JADX WARN: Code duplicated, block: B:354:0x04bc A[Catch: all -> 0x05b7, Exception -> 0x05bb, TryCatch #11 {Exception -> 0x05bb, all -> 0x05b7, blocks: (B:380:0x052d, B:350:0x04ae, B:352:0x04b3, B:354:0x04bc, B:357:0x04c0, B:358:0x04c5, B:359:0x04cb, B:361:0x04d1, B:362:0x04d5, B:363:0x04db, B:366:0x04e5, B:368:0x04ee, B:373:0x0504, B:374:0x0508, B:375:0x050d, B:376:0x0519, B:377:0x051d, B:378:0x0523, B:389:0x0562, B:394:0x0573, B:395:0x0577, B:397:0x057d, B:398:0x058a, B:400:0x058f, B:402:0x0598, B:403:0x059e, B:405:0x05a7, B:406:0x05aa), top: B:445:0x052d }] */
    /* JADX WARN: Code duplicated, block: B:358:0x04c5 A[Catch: all -> 0x05b7, Exception -> 0x05bb, TryCatch #11 {Exception -> 0x05bb, all -> 0x05b7, blocks: (B:380:0x052d, B:350:0x04ae, B:352:0x04b3, B:354:0x04bc, B:357:0x04c0, B:358:0x04c5, B:359:0x04cb, B:361:0x04d1, B:362:0x04d5, B:363:0x04db, B:366:0x04e5, B:368:0x04ee, B:373:0x0504, B:374:0x0508, B:375:0x050d, B:376:0x0519, B:377:0x051d, B:378:0x0523, B:389:0x0562, B:394:0x0573, B:395:0x0577, B:397:0x057d, B:398:0x058a, B:400:0x058f, B:402:0x0598, B:403:0x059e, B:405:0x05a7, B:406:0x05aa), top: B:445:0x052d }] */
    /* JADX WARN: Code duplicated, block: B:359:0x04cb A[Catch: all -> 0x05b7, Exception -> 0x05bb, TryCatch #11 {Exception -> 0x05bb, all -> 0x05b7, blocks: (B:380:0x052d, B:350:0x04ae, B:352:0x04b3, B:354:0x04bc, B:357:0x04c0, B:358:0x04c5, B:359:0x04cb, B:361:0x04d1, B:362:0x04d5, B:363:0x04db, B:366:0x04e5, B:368:0x04ee, B:373:0x0504, B:374:0x0508, B:375:0x050d, B:376:0x0519, B:377:0x051d, B:378:0x0523, B:389:0x0562, B:394:0x0573, B:395:0x0577, B:397:0x057d, B:398:0x058a, B:400:0x058f, B:402:0x0598, B:403:0x059e, B:405:0x05a7, B:406:0x05aa), top: B:445:0x052d }] */
    /* JADX WARN: Code duplicated, block: B:361:0x04d1 A[Catch: all -> 0x05b7, Exception -> 0x05bb, TryCatch #11 {Exception -> 0x05bb, all -> 0x05b7, blocks: (B:380:0x052d, B:350:0x04ae, B:352:0x04b3, B:354:0x04bc, B:357:0x04c0, B:358:0x04c5, B:359:0x04cb, B:361:0x04d1, B:362:0x04d5, B:363:0x04db, B:366:0x04e5, B:368:0x04ee, B:373:0x0504, B:374:0x0508, B:375:0x050d, B:376:0x0519, B:377:0x051d, B:378:0x0523, B:389:0x0562, B:394:0x0573, B:395:0x0577, B:397:0x057d, B:398:0x058a, B:400:0x058f, B:402:0x0598, B:403:0x059e, B:405:0x05a7, B:406:0x05aa), top: B:445:0x052d }] */
    /* JADX WARN: Code duplicated, block: B:362:0x04d5 A[Catch: all -> 0x05b7, Exception -> 0x05bb, TryCatch #11 {Exception -> 0x05bb, all -> 0x05b7, blocks: (B:380:0x052d, B:350:0x04ae, B:352:0x04b3, B:354:0x04bc, B:357:0x04c0, B:358:0x04c5, B:359:0x04cb, B:361:0x04d1, B:362:0x04d5, B:363:0x04db, B:366:0x04e5, B:368:0x04ee, B:373:0x0504, B:374:0x0508, B:375:0x050d, B:376:0x0519, B:377:0x051d, B:378:0x0523, B:389:0x0562, B:394:0x0573, B:395:0x0577, B:397:0x057d, B:398:0x058a, B:400:0x058f, B:402:0x0598, B:403:0x059e, B:405:0x05a7, B:406:0x05aa), top: B:445:0x052d }] */
    /* JADX WARN: Code duplicated, block: B:363:0x04db A[Catch: all -> 0x05b7, Exception -> 0x05bb, TryCatch #11 {Exception -> 0x05bb, all -> 0x05b7, blocks: (B:380:0x052d, B:350:0x04ae, B:352:0x04b3, B:354:0x04bc, B:357:0x04c0, B:358:0x04c5, B:359:0x04cb, B:361:0x04d1, B:362:0x04d5, B:363:0x04db, B:366:0x04e5, B:368:0x04ee, B:373:0x0504, B:374:0x0508, B:375:0x050d, B:376:0x0519, B:377:0x051d, B:378:0x0523, B:389:0x0562, B:394:0x0573, B:395:0x0577, B:397:0x057d, B:398:0x058a, B:400:0x058f, B:402:0x0598, B:403:0x059e, B:405:0x05a7, B:406:0x05aa), top: B:445:0x052d }] */
    /* JADX WARN: Code duplicated, block: B:365:0x04e3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:366:0x04e5 A[Catch: all -> 0x05b7, Exception -> 0x05bb, TryCatch #11 {Exception -> 0x05bb, all -> 0x05b7, blocks: (B:380:0x052d, B:350:0x04ae, B:352:0x04b3, B:354:0x04bc, B:357:0x04c0, B:358:0x04c5, B:359:0x04cb, B:361:0x04d1, B:362:0x04d5, B:363:0x04db, B:366:0x04e5, B:368:0x04ee, B:373:0x0504, B:374:0x0508, B:375:0x050d, B:376:0x0519, B:377:0x051d, B:378:0x0523, B:389:0x0562, B:394:0x0573, B:395:0x0577, B:397:0x057d, B:398:0x058a, B:400:0x058f, B:402:0x0598, B:403:0x059e, B:405:0x05a7, B:406:0x05aa), top: B:445:0x052d }] */
    /* JADX WARN: Code duplicated, block: B:368:0x04ee A[Catch: all -> 0x05b7, Exception -> 0x05bb, TryCatch #11 {Exception -> 0x05bb, all -> 0x05b7, blocks: (B:380:0x052d, B:350:0x04ae, B:352:0x04b3, B:354:0x04bc, B:357:0x04c0, B:358:0x04c5, B:359:0x04cb, B:361:0x04d1, B:362:0x04d5, B:363:0x04db, B:366:0x04e5, B:368:0x04ee, B:373:0x0504, B:374:0x0508, B:375:0x050d, B:376:0x0519, B:377:0x051d, B:378:0x0523, B:389:0x0562, B:394:0x0573, B:395:0x0577, B:397:0x057d, B:398:0x058a, B:400:0x058f, B:402:0x0598, B:403:0x059e, B:405:0x05a7, B:406:0x05aa), top: B:445:0x052d }] */
    /* JADX WARN: Code duplicated, block: B:370:0x04ff  */
    /* JADX WARN: Code duplicated, block: B:371:0x0501  */
    /* JADX WARN: Code duplicated, block: B:373:0x0504 A[Catch: all -> 0x05b7, Exception -> 0x05bb, TryCatch #11 {Exception -> 0x05bb, all -> 0x05b7, blocks: (B:380:0x052d, B:350:0x04ae, B:352:0x04b3, B:354:0x04bc, B:357:0x04c0, B:358:0x04c5, B:359:0x04cb, B:361:0x04d1, B:362:0x04d5, B:363:0x04db, B:366:0x04e5, B:368:0x04ee, B:373:0x0504, B:374:0x0508, B:375:0x050d, B:376:0x0519, B:377:0x051d, B:378:0x0523, B:389:0x0562, B:394:0x0573, B:395:0x0577, B:397:0x057d, B:398:0x058a, B:400:0x058f, B:402:0x0598, B:403:0x059e, B:405:0x05a7, B:406:0x05aa), top: B:445:0x052d }] */
    /* JADX WARN: Code duplicated, block: B:374:0x0508 A[Catch: all -> 0x05b7, Exception -> 0x05bb, TryCatch #11 {Exception -> 0x05bb, all -> 0x05b7, blocks: (B:380:0x052d, B:350:0x04ae, B:352:0x04b3, B:354:0x04bc, B:357:0x04c0, B:358:0x04c5, B:359:0x04cb, B:361:0x04d1, B:362:0x04d5, B:363:0x04db, B:366:0x04e5, B:368:0x04ee, B:373:0x0504, B:374:0x0508, B:375:0x050d, B:376:0x0519, B:377:0x051d, B:378:0x0523, B:389:0x0562, B:394:0x0573, B:395:0x0577, B:397:0x057d, B:398:0x058a, B:400:0x058f, B:402:0x0598, B:403:0x059e, B:405:0x05a7, B:406:0x05aa), top: B:445:0x052d }] */
    /* JADX WARN: Code duplicated, block: B:375:0x050d A[Catch: all -> 0x05b7, Exception -> 0x05bb, TryCatch #11 {Exception -> 0x05bb, all -> 0x05b7, blocks: (B:380:0x052d, B:350:0x04ae, B:352:0x04b3, B:354:0x04bc, B:357:0x04c0, B:358:0x04c5, B:359:0x04cb, B:361:0x04d1, B:362:0x04d5, B:363:0x04db, B:366:0x04e5, B:368:0x04ee, B:373:0x0504, B:374:0x0508, B:375:0x050d, B:376:0x0519, B:377:0x051d, B:378:0x0523, B:389:0x0562, B:394:0x0573, B:395:0x0577, B:397:0x057d, B:398:0x058a, B:400:0x058f, B:402:0x0598, B:403:0x059e, B:405:0x05a7, B:406:0x05aa), top: B:445:0x052d }] */
    /* JADX WARN: Code duplicated, block: B:376:0x0519 A[Catch: all -> 0x05b7, Exception -> 0x05bb, TryCatch #11 {Exception -> 0x05bb, all -> 0x05b7, blocks: (B:380:0x052d, B:350:0x04ae, B:352:0x04b3, B:354:0x04bc, B:357:0x04c0, B:358:0x04c5, B:359:0x04cb, B:361:0x04d1, B:362:0x04d5, B:363:0x04db, B:366:0x04e5, B:368:0x04ee, B:373:0x0504, B:374:0x0508, B:375:0x050d, B:376:0x0519, B:377:0x051d, B:378:0x0523, B:389:0x0562, B:394:0x0573, B:395:0x0577, B:397:0x057d, B:398:0x058a, B:400:0x058f, B:402:0x0598, B:403:0x059e, B:405:0x05a7, B:406:0x05aa), top: B:445:0x052d }] */
    /* JADX WARN: Code duplicated, block: B:377:0x051d A[Catch: all -> 0x05b7, Exception -> 0x05bb, TryCatch #11 {Exception -> 0x05bb, all -> 0x05b7, blocks: (B:380:0x052d, B:350:0x04ae, B:352:0x04b3, B:354:0x04bc, B:357:0x04c0, B:358:0x04c5, B:359:0x04cb, B:361:0x04d1, B:362:0x04d5, B:363:0x04db, B:366:0x04e5, B:368:0x04ee, B:373:0x0504, B:374:0x0508, B:375:0x050d, B:376:0x0519, B:377:0x051d, B:378:0x0523, B:389:0x0562, B:394:0x0573, B:395:0x0577, B:397:0x057d, B:398:0x058a, B:400:0x058f, B:402:0x0598, B:403:0x059e, B:405:0x05a7, B:406:0x05aa), top: B:445:0x052d }] */
    /* JADX WARN: Code duplicated, block: B:378:0x0523 A[Catch: all -> 0x05b7, Exception -> 0x05bb, TryCatch #11 {Exception -> 0x05bb, all -> 0x05b7, blocks: (B:380:0x052d, B:350:0x04ae, B:352:0x04b3, B:354:0x04bc, B:357:0x04c0, B:358:0x04c5, B:359:0x04cb, B:361:0x04d1, B:362:0x04d5, B:363:0x04db, B:366:0x04e5, B:368:0x04ee, B:373:0x0504, B:374:0x0508, B:375:0x050d, B:376:0x0519, B:377:0x051d, B:378:0x0523, B:389:0x0562, B:394:0x0573, B:395:0x0577, B:397:0x057d, B:398:0x058a, B:400:0x058f, B:402:0x0598, B:403:0x059e, B:405:0x05a7, B:406:0x05aa), top: B:445:0x052d }] */
    /* JADX WARN: Code duplicated, block: B:431:0x05dc A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:451:0x01a2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:452:0x01a0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:453:? A[LOOP:2: B:114:0x018e->B:453:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:454:0x022a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:455:0x0227 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:456:? A[LOOP:3: B:148:0x0215->B:456:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x00c9 A[Catch: all -> 0x05c7, Exception -> 0x05cf, TryCatch #16 {Exception -> 0x05cf, all -> 0x05c7, blocks: (B:39:0x0080, B:41:0x0089, B:42:0x008c, B:44:0x0097, B:46:0x00a0, B:47:0x00a6, B:50:0x00b3, B:53:0x00ba, B:55:0x00c1, B:57:0x00c5, B:69:0x00f0, B:71:0x00f4, B:72:0x00f8, B:74:0x00fe, B:78:0x010e, B:80:0x0117, B:84:0x0121, B:88:0x012b, B:92:0x0135, B:59:0x00c9, B:64:0x00da, B:66:0x00e1, B:67:0x00e9, B:63:0x00d3), top: B:435:0x0080 }] */
    /* JADX WARN: Code duplicated, block: B:61:0x00cf A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:62:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:63:0x00d3 A[Catch: all -> 0x05c7, Exception -> 0x05cf, TryCatch #16 {Exception -> 0x05cf, all -> 0x05c7, blocks: (B:39:0x0080, B:41:0x0089, B:42:0x008c, B:44:0x0097, B:46:0x00a0, B:47:0x00a6, B:50:0x00b3, B:53:0x00ba, B:55:0x00c1, B:57:0x00c5, B:69:0x00f0, B:71:0x00f4, B:72:0x00f8, B:74:0x00fe, B:78:0x010e, B:80:0x0117, B:84:0x0121, B:88:0x012b, B:92:0x0135, B:59:0x00c9, B:64:0x00da, B:66:0x00e1, B:67:0x00e9, B:63:0x00d3), top: B:435:0x0080 }] */
    /* JADX WARN: Code duplicated, block: B:66:0x00e1 A[Catch: all -> 0x05c7, Exception -> 0x05cf, TryCatch #16 {Exception -> 0x05cf, all -> 0x05c7, blocks: (B:39:0x0080, B:41:0x0089, B:42:0x008c, B:44:0x0097, B:46:0x00a0, B:47:0x00a6, B:50:0x00b3, B:53:0x00ba, B:55:0x00c1, B:57:0x00c5, B:69:0x00f0, B:71:0x00f4, B:72:0x00f8, B:74:0x00fe, B:78:0x010e, B:80:0x0117, B:84:0x0121, B:88:0x012b, B:92:0x0135, B:59:0x00c9, B:64:0x00da, B:66:0x00e1, B:67:0x00e9, B:63:0x00d3), top: B:435:0x0080 }] */
    /* JADX WARN: Code duplicated, block: B:68:0x00ef  */
    @Override // l.InterfaceC11747
    /* JADX INFO: renamed from: ۙ */
    public final void mo1396(C23473 c23473, Object obj, Object obj2, Type type) throws Throwable {
        IdentityHashMap identityHashMap;
        C17122[] c17122Arr;
        C22330 c22330;
        C23473 c23474;
        String str;
        String str2;
        String name;
        char cM19357;
        boolean z;
        boolean z2;
        Class cls;
        ArrayList arrayList;
        Class cls2;
        String str3;
        Class cls3;
        long j;
        Object objM39978;
        boolean z3;
        int i;
        boolean z4;
        boolean z5;
        boolean z6;
        Object objValueOf;
        String str4;
        boolean z7;
        Object obj3;
        ArrayList arrayList2;
        C15275 c15275;
        String str5;
        Object obj4;
        C14301 c14301;
        Object obj5;
        String string;
        boolean z8;
        Object obj6;
        String str6;
        int i2;
        int i3;
        int i4;
        int i5;
        boolean z9;
        Object objValueOf2;
        Iterator it;
        Object objM50969;
        Iterator it2;
        String strM12997;
        Iterator it3;
        boolean z10;
        int i6;
        Iterator it4;
        C22330 c22331;
        C14301 c14302 = this;
        C23473 c23475 = c23473;
        Object obj7 = obj;
        C13158 c13158 = c23475.f76006;
        if (obj7 == null) {
            c13158.m32530();
            return;
        }
        C22330 c22332 = c23475.f76000;
        if ((c22332 == null || (c22332.f72909 & EnumC3984.DisableCircularReferenceDetect.f14811) == 0) && (identityHashMap = c23475.f76011) != null && identityHashMap.containsKey(obj7)) {
            c23473.m51730(obj);
            return;
        }
        int i7 = c13158.f43818;
        if ((EnumC3984.SortField.f14811 & i7) != 0) {
            c17122Arr = c14302.f46853;
        } else {
            c17122Arr = c14302.f46854;
        }
        C22330 c22333 = c23475.f76000;
        if ((i7 & EnumC3984.DisableCircularReferenceDetect.f14811) == 0) {
            c23475.f76000 = new C22330(c22333, obj7, obj2, c14302.f46851);
            if (c23475.f76011 == null) {
                c23475.f76011 = new IdentityHashMap();
            }
            c23475.f76011.put(obj7, c23475.f76000);
        }
        int i8 = c14302.f46851;
        int i9 = EnumC3984.BeanToArray.f14811;
        boolean z11 = ((i8 & i9) == 0 && (c13158.f43818 & i9) == 0) ? false : true;
        char c = z11 ? '[' : '{';
        char c2 = z11 ? ']' : '}';
        try {
            int i10 = c13158.f43820 + 1;
            if (i10 > c13158.f43819.length) {
                c13158.m32534(i10);
            }
            c13158.f43819[c13158.f43820] = c;
            c13158.f43820 = i10;
            if (c17122Arr.length > 0 && (c13158.f43818 & EnumC3984.PrettyFormat.f14811) != 0) {
                c23473.m51728();
                c23473.m51723();
            }
            int i11 = c14302.f46851;
            int i12 = EnumC3984.WriteClassName.f14811;
            int i13 = i11 & i12;
            String str7 = c14302.f46850;
            if (i13 == 0) {
                int i14 = c13158.f43818;
                if ((i12 & i14) == 0 || (type == null && (i14 & EnumC3984.NotWriteRootClassName.f14811) != 0 && ((c22331 = c23475.f76000) == null || c22331.f72908 == null))) {
                    cM19357 = 0;
                } else if (obj.getClass() != type) {
                    if (str7 != null) {
                        str2 = str7;
                    } else {
                        c23475.f76005.getClass();
                        str2 = "@type";
                    }
                    c13158.m32533(str2, false);
                    name = c14302.f46852;
                    if (name == null) {
                        name = obj.getClass().getName();
                    }
                    c23475.m51726(name);
                    cM19357 = ',';
                } else {
                    cM19357 = 0;
                }
            } else if (obj.getClass() != type) {
                if (str7 != null) {
                    str2 = str7;
                } else {
                    c23475.f76005.getClass();
                    str2 = "@type";
                }
                c13158.m32533(str2, false);
                name = c14302.f46852;
                if (name == null) {
                    name = obj.getClass().getName();
                }
                c23475.m51726(name);
                cM19357 = ',';
            } else {
                cM19357 = 0;
            }
            ArrayList arrayList3 = c23475.f76007;
            if (arrayList3 != null) {
                Iterator it5 = arrayList3.iterator();
                while (it5.hasNext()) {
                    cM19357 = ((AbstractC7244) it5.next()).m19357(c23475, obj7, cM19357);
                }
            }
            boolean z12 = cM19357 == ',';
            int i15 = c13158.f43818;
            boolean z13 = (EnumC3984.QuoteFieldNames.f14811 & i15) != 0 && (EnumC3984.UseSingleQuotes.f14811 & i15) == 0;
            boolean z14 = (EnumC3984.UseSingleQuotes.f14811 & i15) != 0;
            boolean z15 = (i15 & EnumC3984.NotWriteDefaultValue.f14811) != 0;
            ArrayList arrayList4 = c23475.f76001;
            ArrayList arrayList5 = c23475.f75999;
            boolean z16 = z12;
            ArrayList arrayList6 = c23475.f76009;
            ArrayList arrayList7 = c23475.f76004;
            char c3 = c2;
            int i16 = 0;
            int i17 = 0;
            while (i16 < c17122Arr.length) {
                try {
                    try {
                        C17122 c17122 = c17122Arr[i16];
                        C17122[] c17122Arr2 = c17122Arr;
                        C15275 c15276 = c17122.f54607;
                        int i18 = i16;
                        Class cls4 = c15276.f49790;
                        boolean z17 = z14;
                        Field field = c15276.f49783;
                        boolean z18 = z13;
                        String str8 = c15276.f49788;
                        try {
                            boolean z19 = z15;
                            if ((c13158.f43818 & EnumC3984.SkipTransientField.f14811) != 0 && field != null) {
                                try {
                                    if (!c15276.f49795) {
                                        if (str7 != null) {
                                            if (arrayList7 == null) {
                                                z = true;
                                                break;
                                            }
                                            it4 = arrayList7.iterator();
                                            while (true) {
                                                if (!it4.hasNext()) {
                                                    z = true;
                                                    break;
                                                } else if (!((InterfaceC5396) it4.next()).m14962()) {
                                                    z = false;
                                                    break;
                                                }
                                            }
                                            if (z) {
                                                z2 = c15276.f49794;
                                                cls = Boolean.TYPE;
                                                arrayList = arrayList7;
                                                cls2 = Long.TYPE;
                                                str3 = str7;
                                                cls3 = Integer.TYPE;
                                                j = 0;
                                                if (z2) {
                                                    objM39978 = null;
                                                    if (cls4 == cls3) {
                                                        i6 = field.getInt(obj7);
                                                        z10 = false;
                                                    } else {
                                                        if (cls4 == cls2) {
                                                            j = field.getLong(obj7);
                                                            z3 = true;
                                                            i = 0;
                                                            z4 = false;
                                                            z5 = false;
                                                        } else if (cls4 == cls) {
                                                            z10 = field.getBoolean(obj7);
                                                            i6 = 0;
                                                        } else {
                                                            objM39978 = field.get(obj7);
                                                        }
                                                        if (arrayList4 != null) {
                                                            if (z3) {
                                                                if (cls4 == cls3) {
                                                                    objM39978 = Integer.valueOf(i);
                                                                } else if (cls4 == cls2) {
                                                                    objM39978 = Long.valueOf(j);
                                                                } else if (cls4 == cls) {
                                                                    objM39978 = Boolean.valueOf(z4);
                                                                }
                                                                z5 = true;
                                                            }
                                                            it3 = arrayList4.iterator();
                                                            while (true) {
                                                                if (!it3.hasNext()) {
                                                                    z6 = true;
                                                                    break;
                                                                } else if (!((InterfaceC2573) it3.next()).apply()) {
                                                                    z6 = false;
                                                                    break;
                                                                }
                                                            }
                                                        } else {
                                                            z6 = true;
                                                            break;
                                                        }
                                                        if (z6) {
                                                            if (arrayList5 != null) {
                                                                if (z3) {
                                                                    if (cls4 == cls3) {
                                                                        objM39978 = Integer.valueOf(i);
                                                                    } else if (cls4 == cls2) {
                                                                        objM39978 = Long.valueOf(j);
                                                                    } else if (cls4 == cls) {
                                                                        objM39978 = Boolean.valueOf(z4);
                                                                    }
                                                                    z5 = true;
                                                                }
                                                                it2 = arrayList5.iterator();
                                                                strM12997 = str8;
                                                                while (it2.hasNext()) {
                                                                    strM12997 = ((InterfaceC4690) it2.next()).m12997();
                                                                }
                                                                objValueOf = objM39978;
                                                                str4 = strM12997;
                                                            } else {
                                                                objValueOf = objM39978;
                                                                str4 = str8;
                                                            }
                                                            if (arrayList6 != null) {
                                                                if (z3) {
                                                                    Object obj8 = objValueOf;
                                                                    z9 = z5;
                                                                    objValueOf2 = obj8;
                                                                } else {
                                                                    Object obj9 = objValueOf;
                                                                    z9 = z5;
                                                                    objValueOf2 = obj9;
                                                                }
                                                                it = arrayList6.iterator();
                                                                objM50969 = objValueOf2;
                                                                while (it.hasNext()) {
                                                                    objM50969 = ((InterfaceC23036) it.next()).m50969();
                                                                }
                                                                z7 = z9;
                                                                objValueOf = objM50969;
                                                                obj3 = objValueOf2;
                                                            } else {
                                                                z7 = z5;
                                                                obj3 = objValueOf;
                                                            }
                                                            arrayList2 = arrayList4;
                                                            if (z7) {
                                                                c15275 = c15276;
                                                                str5 = "";
                                                                obj4 = objValueOf;
                                                                if (z7) {
                                                                }
                                                                if (!z16) {
                                                                    i5 = c13158.f43820 + 1;
                                                                    if (i5 > c13158.f43819.length) {
                                                                        c13158.m32534(i5);
                                                                    }
                                                                    c13158.f43819[c13158.f43820] = ',';
                                                                    c13158.f43820 = i5;
                                                                    if ((c13158.f43818 & EnumC3984.PrettyFormat.f14811) != 0) {
                                                                        c23473.m51723();
                                                                    }
                                                                }
                                                                if (str4 != str8) {
                                                                    if (!z11) {
                                                                        c13158.m32533(str4, true);
                                                                    }
                                                                    c23474 = c23473;
                                                                    c23474.m51725(obj4);
                                                                } else {
                                                                    c23474 = c23473;
                                                                    if (obj3 != obj4) {
                                                                        if (!z11) {
                                                                            c17122.m39979(c23474);
                                                                        }
                                                                        c23474.m51725(obj4);
                                                                    } else {
                                                                        if (z11) {
                                                                            if (z18) {
                                                                                char[] cArr = c17122.f54605;
                                                                                int length = cArr.length;
                                                                                i4 = c13158.f43820 + length;
                                                                                if (i4 > c13158.f43819.length) {
                                                                                    c13158.m32534(i4);
                                                                                }
                                                                                System.arraycopy(cArr, 0, c13158.f43819, c13158.f43820, length);
                                                                                c13158.f43820 = i4;
                                                                            } else {
                                                                                c17122.m39979(c23474);
                                                                            }
                                                                        }
                                                                        if (z3) {
                                                                        }
                                                                        if (!z11) {
                                                                            if (cls4 == String.class) {
                                                                                c14301 = this;
                                                                                int i19 = c17122.f54604 | c14301.f46851;
                                                                                if (obj4 == 0) {
                                                                                    i2 = c13158.f43818;
                                                                                    i3 = EnumC3984.WriteNullStringAsEmpty.f14811;
                                                                                    if ((i2 & i3) == 0) {
                                                                                        c13158.m32531(str5);
                                                                                    } else {
                                                                                        c13158.m32531(str5);
                                                                                    }
                                                                                } else {
                                                                                    str6 = (String) obj6;
                                                                                    if (z17) {
                                                                                        obj6 = obj4;
                                                                                        c13158.m32536(str6);
                                                                                    } else {
                                                                                        obj6 = obj4;
                                                                                        c13158.m32532(str6, (char) 0, true);
                                                                                    }
                                                                                }
                                                                            } else {
                                                                                c14301 = this;
                                                                                if (c15275.f49792) {
                                                                                    c17122.m39980(c23474, obj4);
                                                                                } else if (obj4 != 0) {
                                                                                    if ((c13158.f43818 & EnumC3984.WriteEnumUsingToString.f14811) != 0) {
                                                                                        string = ((Enum) obj5).toString();
                                                                                        if ((c13158.f43818 & EnumC3984.UseSingleQuotes.f14811) != 0) {
                                                                                            z8 = true;
                                                                                        } else {
                                                                                            z8 = false;
                                                                                        }
                                                                                        if (z8) {
                                                                                            obj5 = obj4;
                                                                                            obj5 = obj4;
                                                                                            c13158.m32536(string);
                                                                                        } else {
                                                                                            obj5 = obj4;
                                                                                            obj5 = obj4;
                                                                                            c13158.m32532(string, (char) 0, false);
                                                                                        }
                                                                                    } else {
                                                                                        c13158.writeInt(((Enum) obj4).ordinal());
                                                                                    }
                                                                                } else {
                                                                                    c13158.m32530();
                                                                                }
                                                                            }
                                                                        } else {
                                                                            c14301 = this;
                                                                            c17122.m39980(c23474, obj4);
                                                                        }
                                                                        z16 = true;
                                                                    }
                                                                }
                                                                c14301 = this;
                                                                z16 = true;
                                                            } else {
                                                                c15275 = c15276;
                                                                str5 = "";
                                                                obj4 = objValueOf;
                                                                if (z7) {
                                                                }
                                                                if (!z16) {
                                                                    i5 = c13158.f43820 + 1;
                                                                    if (i5 > c13158.f43819.length) {
                                                                        c13158.m32534(i5);
                                                                    }
                                                                    c13158.f43819[c13158.f43820] = ',';
                                                                    c13158.f43820 = i5;
                                                                    if ((c13158.f43818 & EnumC3984.PrettyFormat.f14811) != 0) {
                                                                        c23473.m51723();
                                                                    }
                                                                }
                                                                if (str4 != str8) {
                                                                    if (!z11) {
                                                                        c13158.m32533(str4, true);
                                                                    }
                                                                    c23474 = c23473;
                                                                    c23474.m51725(obj4);
                                                                } else {
                                                                    c23474 = c23473;
                                                                    if (obj3 != obj4) {
                                                                        if (!z11) {
                                                                            c17122.m39979(c23474);
                                                                        }
                                                                        c23474.m51725(obj4);
                                                                    } else {
                                                                        if (z11) {
                                                                            if (z18) {
                                                                                char[] cArr2 = c17122.f54605;
                                                                                int length2 = cArr2.length;
                                                                                i4 = c13158.f43820 + length2;
                                                                                if (i4 > c13158.f43819.length) {
                                                                                    c13158.m32534(i4);
                                                                                }
                                                                                System.arraycopy(cArr2, 0, c13158.f43819, c13158.f43820, length2);
                                                                                c13158.f43820 = i4;
                                                                            } else {
                                                                                c17122.m39979(c23474);
                                                                            }
                                                                        }
                                                                        if (z3) {
                                                                        }
                                                                        if (!z11) {
                                                                            if (cls4 == String.class) {
                                                                                c14301 = this;
                                                                                int i110 = c17122.f54604 | c14301.f46851;
                                                                                if (obj4 == 0) {
                                                                                    i2 = c13158.f43818;
                                                                                    i3 = EnumC3984.WriteNullStringAsEmpty.f14811;
                                                                                    if ((i2 & i3) == 0) {
                                                                                        c13158.m32531(str5);
                                                                                    } else {
                                                                                        c13158.m32531(str5);
                                                                                    }
                                                                                } else {
                                                                                    str6 = (String) obj6;
                                                                                    if (z17) {
                                                                                        obj6 = obj4;
                                                                                        c13158.m32536(str6);
                                                                                    } else {
                                                                                        obj6 = obj4;
                                                                                        c13158.m32532(str6, (char) 0, true);
                                                                                    }
                                                                                }
                                                                            } else {
                                                                                c14301 = this;
                                                                                if (c15275.f49792) {
                                                                                    c17122.m39980(c23474, obj4);
                                                                                } else if (obj4 != 0) {
                                                                                    if ((c13158.f43818 & EnumC3984.WriteEnumUsingToString.f14811) != 0) {
                                                                                        string = ((Enum) obj5).toString();
                                                                                        if ((c13158.f43818 & EnumC3984.UseSingleQuotes.f14811) != 0) {
                                                                                            z8 = true;
                                                                                        } else {
                                                                                            z8 = false;
                                                                                        }
                                                                                        if (z8) {
                                                                                            obj5 = obj4;
                                                                                            obj5 = obj4;
                                                                                            c13158.m32536(string);
                                                                                        } else {
                                                                                            obj5 = obj4;
                                                                                            obj5 = obj4;
                                                                                            c13158.m32532(string, (char) 0, false);
                                                                                        }
                                                                                    } else {
                                                                                        c13158.writeInt(((Enum) obj4).ordinal());
                                                                                    }
                                                                                } else {
                                                                                    c13158.m32530();
                                                                                }
                                                                            }
                                                                        } else {
                                                                            c14301 = this;
                                                                            c17122.m39980(c23474, obj4);
                                                                        }
                                                                        z16 = true;
                                                                    }
                                                                }
                                                                c14301 = this;
                                                                z16 = true;
                                                            }
                                                        }
                                                        c14301 = this;
                                                        c23474 = c23473;
                                                    }
                                                    z5 = false;
                                                    z4 = z10;
                                                    i = i6;
                                                    z3 = true;
                                                    if (arrayList4 != null) {
                                                        if (z3) {
                                                            if (cls4 == cls3) {
                                                                objM39978 = Integer.valueOf(i);
                                                            } else if (cls4 == cls2) {
                                                                objM39978 = Long.valueOf(j);
                                                            } else if (cls4 == cls) {
                                                                objM39978 = Boolean.valueOf(z4);
                                                            }
                                                            z5 = true;
                                                        }
                                                        it3 = arrayList4.iterator();
                                                        while (true) {
                                                            if (!it3.hasNext()) {
                                                                z6 = true;
                                                                break;
                                                            } else if (!((InterfaceC2573) it3.next()).apply()) {
                                                                z6 = false;
                                                                break;
                                                            }
                                                        }
                                                    } else {
                                                        z6 = true;
                                                        break;
                                                    }
                                                    if (z6) {
                                                        if (arrayList5 != null) {
                                                            if (z3) {
                                                                if (cls4 == cls3) {
                                                                    objM39978 = Integer.valueOf(i);
                                                                } else if (cls4 == cls2) {
                                                                    objM39978 = Long.valueOf(j);
                                                                } else if (cls4 == cls) {
                                                                    objM39978 = Boolean.valueOf(z4);
                                                                }
                                                                z5 = true;
                                                            }
                                                            it2 = arrayList5.iterator();
                                                            strM12997 = str8;
                                                            while (it2.hasNext()) {
                                                                strM12997 = ((InterfaceC4690) it2.next()).m12997();
                                                            }
                                                            objValueOf = objM39978;
                                                            str4 = strM12997;
                                                        } else {
                                                            objValueOf = objM39978;
                                                            str4 = str8;
                                                        }
                                                        if (arrayList6 != null) {
                                                            if (z3) {
                                                                Object obj10 = objValueOf;
                                                                z9 = z5;
                                                                objValueOf2 = obj10;
                                                            } else {
                                                                Object obj11 = objValueOf;
                                                                z9 = z5;
                                                                objValueOf2 = obj11;
                                                            }
                                                            it = arrayList6.iterator();
                                                            objM50969 = objValueOf2;
                                                            while (it.hasNext()) {
                                                                objM50969 = ((InterfaceC23036) it.next()).m50969();
                                                            }
                                                            z7 = z9;
                                                            objValueOf = objM50969;
                                                            obj3 = objValueOf2;
                                                        } else {
                                                            z7 = z5;
                                                            obj3 = objValueOf;
                                                        }
                                                        arrayList2 = arrayList4;
                                                        if (z7) {
                                                            c15275 = c15276;
                                                            str5 = "";
                                                            obj4 = objValueOf;
                                                            if (z7) {
                                                            }
                                                            if (!z16) {
                                                                i5 = c13158.f43820 + 1;
                                                                if (i5 > c13158.f43819.length) {
                                                                    c13158.m32534(i5);
                                                                }
                                                                c13158.f43819[c13158.f43820] = ',';
                                                                c13158.f43820 = i5;
                                                                if ((c13158.f43818 & EnumC3984.PrettyFormat.f14811) != 0) {
                                                                    c23473.m51723();
                                                                }
                                                            }
                                                            if (str4 != str8) {
                                                                if (!z11) {
                                                                    c13158.m32533(str4, true);
                                                                }
                                                                c23474 = c23473;
                                                                c23474.m51725(obj4);
                                                            } else {
                                                                c23474 = c23473;
                                                                if (obj3 != obj4) {
                                                                    if (!z11) {
                                                                        c17122.m39979(c23474);
                                                                    }
                                                                    c23474.m51725(obj4);
                                                                } else {
                                                                    if (z11) {
                                                                        if (z18) {
                                                                            char[] cArr3 = c17122.f54605;
                                                                            int length3 = cArr3.length;
                                                                            i4 = c13158.f43820 + length3;
                                                                            if (i4 > c13158.f43819.length) {
                                                                                c13158.m32534(i4);
                                                                            }
                                                                            System.arraycopy(cArr3, 0, c13158.f43819, c13158.f43820, length3);
                                                                            c13158.f43820 = i4;
                                                                        } else {
                                                                            c17122.m39979(c23474);
                                                                        }
                                                                    }
                                                                    if (z3) {
                                                                    }
                                                                    if (!z11) {
                                                                        if (cls4 == String.class) {
                                                                            c14301 = this;
                                                                            int i111 = c17122.f54604 | c14301.f46851;
                                                                            if (obj4 == 0) {
                                                                                i2 = c13158.f43818;
                                                                                i3 = EnumC3984.WriteNullStringAsEmpty.f14811;
                                                                                if ((i2 & i3) == 0) {
                                                                                    c13158.m32531(str5);
                                                                                } else {
                                                                                    c13158.m32531(str5);
                                                                                }
                                                                            } else {
                                                                                str6 = (String) obj6;
                                                                                if (z17) {
                                                                                    obj6 = obj4;
                                                                                    c13158.m32536(str6);
                                                                                } else {
                                                                                    obj6 = obj4;
                                                                                    c13158.m32532(str6, (char) 0, true);
                                                                                }
                                                                            }
                                                                        } else {
                                                                            c14301 = this;
                                                                            if (c15275.f49792) {
                                                                                c17122.m39980(c23474, obj4);
                                                                            } else if (obj4 != 0) {
                                                                                if ((c13158.f43818 & EnumC3984.WriteEnumUsingToString.f14811) != 0) {
                                                                                    string = ((Enum) obj5).toString();
                                                                                    if ((c13158.f43818 & EnumC3984.UseSingleQuotes.f14811) != 0) {
                                                                                        z8 = true;
                                                                                    } else {
                                                                                        z8 = false;
                                                                                    }
                                                                                    if (z8) {
                                                                                        obj5 = obj4;
                                                                                        obj5 = obj4;
                                                                                        c13158.m32536(string);
                                                                                    } else {
                                                                                        obj5 = obj4;
                                                                                        obj5 = obj4;
                                                                                        c13158.m32532(string, (char) 0, false);
                                                                                    }
                                                                                } else {
                                                                                    c13158.writeInt(((Enum) obj4).ordinal());
                                                                                }
                                                                            } else {
                                                                                c13158.m32530();
                                                                            }
                                                                        }
                                                                    } else {
                                                                        c14301 = this;
                                                                        c17122.m39980(c23474, obj4);
                                                                    }
                                                                    z16 = true;
                                                                }
                                                            }
                                                            c14301 = this;
                                                            z16 = true;
                                                        } else {
                                                            c15275 = c15276;
                                                            str5 = "";
                                                            obj4 = objValueOf;
                                                            if (z7) {
                                                            }
                                                            if (!z16) {
                                                                i5 = c13158.f43820 + 1;
                                                                if (i5 > c13158.f43819.length) {
                                                                    c13158.m32534(i5);
                                                                }
                                                                c13158.f43819[c13158.f43820] = ',';
                                                                c13158.f43820 = i5;
                                                                if ((c13158.f43818 & EnumC3984.PrettyFormat.f14811) != 0) {
                                                                    c23473.m51723();
                                                                }
                                                            }
                                                            if (str4 != str8) {
                                                                if (!z11) {
                                                                    c13158.m32533(str4, true);
                                                                }
                                                                c23474 = c23473;
                                                                c23474.m51725(obj4);
                                                            } else {
                                                                c23474 = c23473;
                                                                if (obj3 != obj4) {
                                                                    if (!z11) {
                                                                        c17122.m39979(c23474);
                                                                    }
                                                                    c23474.m51725(obj4);
                                                                } else {
                                                                    if (z11) {
                                                                        if (z18) {
                                                                            char[] cArr4 = c17122.f54605;
                                                                            int length4 = cArr4.length;
                                                                            i4 = c13158.f43820 + length4;
                                                                            if (i4 > c13158.f43819.length) {
                                                                                c13158.m32534(i4);
                                                                            }
                                                                            System.arraycopy(cArr4, 0, c13158.f43819, c13158.f43820, length4);
                                                                            c13158.f43820 = i4;
                                                                        } else {
                                                                            c17122.m39979(c23474);
                                                                        }
                                                                    }
                                                                    if (z3) {
                                                                    }
                                                                    if (!z11) {
                                                                        if (cls4 == String.class) {
                                                                            c14301 = this;
                                                                            int i112 = c17122.f54604 | c14301.f46851;
                                                                            if (obj4 == 0) {
                                                                                i2 = c13158.f43818;
                                                                                i3 = EnumC3984.WriteNullStringAsEmpty.f14811;
                                                                                if ((i2 & i3) == 0) {
                                                                                    c13158.m32531(str5);
                                                                                } else {
                                                                                    c13158.m32531(str5);
                                                                                }
                                                                            } else {
                                                                                str6 = (String) obj6;
                                                                                if (z17) {
                                                                                    obj6 = obj4;
                                                                                    c13158.m32536(str6);
                                                                                } else {
                                                                                    obj6 = obj4;
                                                                                    c13158.m32532(str6, (char) 0, true);
                                                                                }
                                                                            }
                                                                        } else {
                                                                            c14301 = this;
                                                                            if (c15275.f49792) {
                                                                                c17122.m39980(c23474, obj4);
                                                                            } else if (obj4 != 0) {
                                                                                if ((c13158.f43818 & EnumC3984.WriteEnumUsingToString.f14811) != 0) {
                                                                                    string = ((Enum) obj5).toString();
                                                                                    if ((c13158.f43818 & EnumC3984.UseSingleQuotes.f14811) != 0) {
                                                                                        z8 = true;
                                                                                    } else {
                                                                                        z8 = false;
                                                                                    }
                                                                                    if (z8) {
                                                                                        obj5 = obj4;
                                                                                        obj5 = obj4;
                                                                                        c13158.m32536(string);
                                                                                    } else {
                                                                                        obj5 = obj4;
                                                                                        obj5 = obj4;
                                                                                        c13158.m32532(string, (char) 0, false);
                                                                                    }
                                                                                } else {
                                                                                    c13158.writeInt(((Enum) obj4).ordinal());
                                                                                }
                                                                            } else {
                                                                                c13158.m32530();
                                                                            }
                                                                        }
                                                                    } else {
                                                                        c14301 = this;
                                                                        c17122.m39980(c23474, obj4);
                                                                    }
                                                                    z16 = true;
                                                                }
                                                            }
                                                            c14301 = this;
                                                            z16 = true;
                                                        }
                                                    }
                                                    c14301 = this;
                                                    c23474 = c23473;
                                                } else {
                                                    objM39978 = c17122.m39978(obj7);
                                                }
                                                z3 = false;
                                                i = 0;
                                                z4 = false;
                                                z5 = true;
                                                if (arrayList4 != null) {
                                                    if (z3) {
                                                        if (cls4 == cls3) {
                                                            objM39978 = Integer.valueOf(i);
                                                        } else if (cls4 == cls2) {
                                                            objM39978 = Long.valueOf(j);
                                                        } else if (cls4 == cls) {
                                                            objM39978 = Boolean.valueOf(z4);
                                                        }
                                                        z5 = true;
                                                    }
                                                    it3 = arrayList4.iterator();
                                                    while (true) {
                                                        if (!it3.hasNext()) {
                                                            z6 = true;
                                                            break;
                                                        } else if (!((InterfaceC2573) it3.next()).apply()) {
                                                            z6 = false;
                                                            break;
                                                        }
                                                    }
                                                } else {
                                                    z6 = true;
                                                    break;
                                                }
                                                if (z6) {
                                                    if (arrayList5 != null) {
                                                        if (z3) {
                                                            if (cls4 == cls3) {
                                                                objM39978 = Integer.valueOf(i);
                                                            } else if (cls4 == cls2) {
                                                                objM39978 = Long.valueOf(j);
                                                            } else if (cls4 == cls) {
                                                                objM39978 = Boolean.valueOf(z4);
                                                            }
                                                            z5 = true;
                                                        }
                                                        it2 = arrayList5.iterator();
                                                        strM12997 = str8;
                                                        while (it2.hasNext()) {
                                                            strM12997 = ((InterfaceC4690) it2.next()).m12997();
                                                        }
                                                        objValueOf = objM39978;
                                                        str4 = strM12997;
                                                    } else {
                                                        objValueOf = objM39978;
                                                        str4 = str8;
                                                    }
                                                    if (arrayList6 != null) {
                                                        if (z3) {
                                                            Object obj12 = objValueOf;
                                                            z9 = z5;
                                                            objValueOf2 = obj12;
                                                        } else {
                                                            Object obj13 = objValueOf;
                                                            z9 = z5;
                                                            objValueOf2 = obj13;
                                                        }
                                                        it = arrayList6.iterator();
                                                        objM50969 = objValueOf2;
                                                        while (it.hasNext()) {
                                                            objM50969 = ((InterfaceC23036) it.next()).m50969();
                                                        }
                                                        z7 = z9;
                                                        objValueOf = objM50969;
                                                        obj3 = objValueOf2;
                                                    } else {
                                                        z7 = z5;
                                                        obj3 = objValueOf;
                                                    }
                                                    arrayList2 = arrayList4;
                                                    if (z7) {
                                                        c15275 = c15276;
                                                        str5 = "";
                                                        obj4 = objValueOf;
                                                        if (z7) {
                                                        }
                                                        if (!z16) {
                                                            i5 = c13158.f43820 + 1;
                                                            if (i5 > c13158.f43819.length) {
                                                                c13158.m32534(i5);
                                                            }
                                                            c13158.f43819[c13158.f43820] = ',';
                                                            c13158.f43820 = i5;
                                                            if ((c13158.f43818 & EnumC3984.PrettyFormat.f14811) != 0) {
                                                                c23473.m51723();
                                                            }
                                                        }
                                                        if (str4 != str8) {
                                                            if (!z11) {
                                                                c13158.m32533(str4, true);
                                                            }
                                                            c23474 = c23473;
                                                            c23474.m51725(obj4);
                                                        } else {
                                                            c23474 = c23473;
                                                            if (obj3 != obj4) {
                                                                if (!z11) {
                                                                    c17122.m39979(c23474);
                                                                }
                                                                c23474.m51725(obj4);
                                                            } else {
                                                                if (z11) {
                                                                    if (z18) {
                                                                        char[] cArr5 = c17122.f54605;
                                                                        int length5 = cArr5.length;
                                                                        i4 = c13158.f43820 + length5;
                                                                        if (i4 > c13158.f43819.length) {
                                                                            c13158.m32534(i4);
                                                                        }
                                                                        System.arraycopy(cArr5, 0, c13158.f43819, c13158.f43820, length5);
                                                                        c13158.f43820 = i4;
                                                                    } else {
                                                                        c17122.m39979(c23474);
                                                                    }
                                                                }
                                                                if (z3) {
                                                                }
                                                                if (!z11) {
                                                                    if (cls4 == String.class) {
                                                                        c14301 = this;
                                                                        int i113 = c17122.f54604 | c14301.f46851;
                                                                        if (obj4 == 0) {
                                                                            i2 = c13158.f43818;
                                                                            i3 = EnumC3984.WriteNullStringAsEmpty.f14811;
                                                                            if ((i2 & i3) == 0) {
                                                                                c13158.m32531(str5);
                                                                            } else {
                                                                                c13158.m32531(str5);
                                                                            }
                                                                        } else {
                                                                            str6 = (String) obj6;
                                                                            if (z17) {
                                                                                obj6 = obj4;
                                                                                c13158.m32536(str6);
                                                                            } else {
                                                                                obj6 = obj4;
                                                                                c13158.m32532(str6, (char) 0, true);
                                                                            }
                                                                        }
                                                                    } else {
                                                                        c14301 = this;
                                                                        if (c15275.f49792) {
                                                                            c17122.m39980(c23474, obj4);
                                                                        } else if (obj4 != 0) {
                                                                            if ((c13158.f43818 & EnumC3984.WriteEnumUsingToString.f14811) != 0) {
                                                                                string = ((Enum) obj5).toString();
                                                                                if ((c13158.f43818 & EnumC3984.UseSingleQuotes.f14811) != 0) {
                                                                                    z8 = true;
                                                                                } else {
                                                                                    z8 = false;
                                                                                }
                                                                                if (z8) {
                                                                                    obj5 = obj4;
                                                                                    obj5 = obj4;
                                                                                    c13158.m32536(string);
                                                                                } else {
                                                                                    obj5 = obj4;
                                                                                    obj5 = obj4;
                                                                                    c13158.m32532(string, (char) 0, false);
                                                                                }
                                                                            } else {
                                                                                c13158.writeInt(((Enum) obj4).ordinal());
                                                                            }
                                                                        } else {
                                                                            c13158.m32530();
                                                                        }
                                                                    }
                                                                } else {
                                                                    c14301 = this;
                                                                    c17122.m39980(c23474, obj4);
                                                                }
                                                                z16 = true;
                                                            }
                                                        }
                                                        c14301 = this;
                                                        z16 = true;
                                                    } else {
                                                        c15275 = c15276;
                                                        str5 = "";
                                                        obj4 = objValueOf;
                                                        if (z7) {
                                                        }
                                                        if (!z16) {
                                                            i5 = c13158.f43820 + 1;
                                                            if (i5 > c13158.f43819.length) {
                                                                c13158.m32534(i5);
                                                            }
                                                            c13158.f43819[c13158.f43820] = ',';
                                                            c13158.f43820 = i5;
                                                            if ((c13158.f43818 & EnumC3984.PrettyFormat.f14811) != 0) {
                                                                c23473.m51723();
                                                            }
                                                        }
                                                        if (str4 != str8) {
                                                            if (!z11) {
                                                                c13158.m32533(str4, true);
                                                            }
                                                            c23474 = c23473;
                                                            c23474.m51725(obj4);
                                                        } else {
                                                            c23474 = c23473;
                                                            if (obj3 != obj4) {
                                                                if (!z11) {
                                                                    c17122.m39979(c23474);
                                                                }
                                                                c23474.m51725(obj4);
                                                            } else {
                                                                if (z11) {
                                                                    if (z18) {
                                                                        char[] cArr6 = c17122.f54605;
                                                                        int length6 = cArr6.length;
                                                                        i4 = c13158.f43820 + length6;
                                                                        if (i4 > c13158.f43819.length) {
                                                                            c13158.m32534(i4);
                                                                        }
                                                                        System.arraycopy(cArr6, 0, c13158.f43819, c13158.f43820, length6);
                                                                        c13158.f43820 = i4;
                                                                    } else {
                                                                        c17122.m39979(c23474);
                                                                    }
                                                                }
                                                                if (z3) {
                                                                }
                                                                if (!z11) {
                                                                    if (cls4 == String.class) {
                                                                        c14301 = this;
                                                                        int i114 = c17122.f54604 | c14301.f46851;
                                                                        if (obj4 == 0) {
                                                                            i2 = c13158.f43818;
                                                                            i3 = EnumC3984.WriteNullStringAsEmpty.f14811;
                                                                            if ((i2 & i3) == 0) {
                                                                                c13158.m32531(str5);
                                                                            } else {
                                                                                c13158.m32531(str5);
                                                                            }
                                                                        } else {
                                                                            str6 = (String) obj6;
                                                                            if (z17) {
                                                                                obj6 = obj4;
                                                                                c13158.m32536(str6);
                                                                            } else {
                                                                                obj6 = obj4;
                                                                                c13158.m32532(str6, (char) 0, true);
                                                                            }
                                                                        }
                                                                    } else {
                                                                        c14301 = this;
                                                                        if (c15275.f49792) {
                                                                            c17122.m39980(c23474, obj4);
                                                                        } else if (obj4 != 0) {
                                                                            if ((c13158.f43818 & EnumC3984.WriteEnumUsingToString.f14811) != 0) {
                                                                                string = ((Enum) obj5).toString();
                                                                                if ((c13158.f43818 & EnumC3984.UseSingleQuotes.f14811) != 0) {
                                                                                    z8 = true;
                                                                                } else {
                                                                                    z8 = false;
                                                                                }
                                                                                if (z8) {
                                                                                    obj5 = obj4;
                                                                                    obj5 = obj4;
                                                                                    c13158.m32536(string);
                                                                                } else {
                                                                                    obj5 = obj4;
                                                                                    obj5 = obj4;
                                                                                    c13158.m32532(string, (char) 0, false);
                                                                                }
                                                                            } else {
                                                                                c13158.writeInt(((Enum) obj4).ordinal());
                                                                            }
                                                                        } else {
                                                                            c13158.m32530();
                                                                        }
                                                                    }
                                                                } else {
                                                                    c14301 = this;
                                                                    c17122.m39980(c23474, obj4);
                                                                }
                                                                z16 = true;
                                                            }
                                                        }
                                                        c14301 = this;
                                                        z16 = true;
                                                    }
                                                }
                                                c14301 = this;
                                                c23474 = c23473;
                                            }
                                            arrayList6 = arrayList6;
                                            arrayList5 = arrayList5;
                                            arrayList2 = arrayList4;
                                            c14301 = this;
                                            c23474 = c23473;
                                        } else {
                                            if (arrayList7 == null) {
                                                z = true;
                                                break;
                                            }
                                            it4 = arrayList7.iterator();
                                            while (true) {
                                                if (!it4.hasNext()) {
                                                    z = true;
                                                    break;
                                                } else if (!((InterfaceC5396) it4.next()).m14962()) {
                                                    z = false;
                                                    break;
                                                }
                                            }
                                            if (z) {
                                                z2 = c15276.f49794;
                                                cls = Boolean.TYPE;
                                                arrayList = arrayList7;
                                                cls2 = Long.TYPE;
                                                str3 = str7;
                                                cls3 = Integer.TYPE;
                                                j = 0;
                                                if (z2) {
                                                    objM39978 = null;
                                                    if (cls4 == cls3) {
                                                        i6 = field.getInt(obj7);
                                                        z10 = false;
                                                    } else {
                                                        if (cls4 == cls2) {
                                                            j = field.getLong(obj7);
                                                            z3 = true;
                                                            i = 0;
                                                            z4 = false;
                                                            z5 = false;
                                                        } else if (cls4 == cls) {
                                                            z10 = field.getBoolean(obj7);
                                                            i6 = 0;
                                                        } else {
                                                            objM39978 = field.get(obj7);
                                                        }
                                                        if (arrayList4 != null) {
                                                            if (z3) {
                                                                if (cls4 == cls3) {
                                                                    objM39978 = Integer.valueOf(i);
                                                                } else if (cls4 == cls2) {
                                                                    objM39978 = Long.valueOf(j);
                                                                } else if (cls4 == cls) {
                                                                    objM39978 = Boolean.valueOf(z4);
                                                                }
                                                                z5 = true;
                                                            }
                                                            it3 = arrayList4.iterator();
                                                            while (true) {
                                                                if (!it3.hasNext()) {
                                                                    z6 = true;
                                                                    break;
                                                                } else if (!((InterfaceC2573) it3.next()).apply()) {
                                                                    z6 = false;
                                                                    break;
                                                                }
                                                            }
                                                        } else {
                                                            z6 = true;
                                                            break;
                                                        }
                                                        if (z6) {
                                                            if (arrayList5 != null) {
                                                                if (z3) {
                                                                    if (cls4 == cls3) {
                                                                        objM39978 = Integer.valueOf(i);
                                                                    } else if (cls4 == cls2) {
                                                                        objM39978 = Long.valueOf(j);
                                                                    } else if (cls4 == cls) {
                                                                        objM39978 = Boolean.valueOf(z4);
                                                                    }
                                                                    z5 = true;
                                                                }
                                                                it2 = arrayList5.iterator();
                                                                strM12997 = str8;
                                                                while (it2.hasNext()) {
                                                                    strM12997 = ((InterfaceC4690) it2.next()).m12997();
                                                                }
                                                                objValueOf = objM39978;
                                                                str4 = strM12997;
                                                            } else {
                                                                objValueOf = objM39978;
                                                                str4 = str8;
                                                            }
                                                            if (arrayList6 != null) {
                                                                if (z3) {
                                                                    Object obj14 = objValueOf;
                                                                    z9 = z5;
                                                                    objValueOf2 = obj14;
                                                                } else {
                                                                    Object obj15 = objValueOf;
                                                                    z9 = z5;
                                                                    objValueOf2 = obj15;
                                                                }
                                                                it = arrayList6.iterator();
                                                                objM50969 = objValueOf2;
                                                                while (it.hasNext()) {
                                                                    objM50969 = ((InterfaceC23036) it.next()).m50969();
                                                                }
                                                                z7 = z9;
                                                                objValueOf = objM50969;
                                                                obj3 = objValueOf2;
                                                            } else {
                                                                z7 = z5;
                                                                obj3 = objValueOf;
                                                            }
                                                            arrayList2 = arrayList4;
                                                            if (z7) {
                                                                c15275 = c15276;
                                                                str5 = "";
                                                                obj4 = objValueOf;
                                                                if (z7) {
                                                                }
                                                                if (!z16) {
                                                                    i5 = c13158.f43820 + 1;
                                                                    if (i5 > c13158.f43819.length) {
                                                                        c13158.m32534(i5);
                                                                    }
                                                                    c13158.f43819[c13158.f43820] = ',';
                                                                    c13158.f43820 = i5;
                                                                    if ((c13158.f43818 & EnumC3984.PrettyFormat.f14811) != 0) {
                                                                        c23473.m51723();
                                                                    }
                                                                }
                                                                if (str4 != str8) {
                                                                    if (!z11) {
                                                                        c13158.m32533(str4, true);
                                                                    }
                                                                    c23474 = c23473;
                                                                    c23474.m51725(obj4);
                                                                } else {
                                                                    c23474 = c23473;
                                                                    if (obj3 != obj4) {
                                                                        if (!z11) {
                                                                            c17122.m39979(c23474);
                                                                        }
                                                                        c23474.m51725(obj4);
                                                                    } else {
                                                                        if (z11) {
                                                                            if (z18) {
                                                                                char[] cArr7 = c17122.f54605;
                                                                                int length7 = cArr7.length;
                                                                                i4 = c13158.f43820 + length7;
                                                                                if (i4 > c13158.f43819.length) {
                                                                                    c13158.m32534(i4);
                                                                                }
                                                                                System.arraycopy(cArr7, 0, c13158.f43819, c13158.f43820, length7);
                                                                                c13158.f43820 = i4;
                                                                            } else {
                                                                                c17122.m39979(c23474);
                                                                            }
                                                                        }
                                                                        if (z3) {
                                                                        }
                                                                        if (!z11) {
                                                                            if (cls4 == String.class) {
                                                                                c14301 = this;
                                                                                int i115 = c17122.f54604 | c14301.f46851;
                                                                                if (obj4 == 0) {
                                                                                    i2 = c13158.f43818;
                                                                                    i3 = EnumC3984.WriteNullStringAsEmpty.f14811;
                                                                                    if ((i2 & i3) == 0) {
                                                                                        c13158.m32531(str5);
                                                                                    } else {
                                                                                        c13158.m32531(str5);
                                                                                    }
                                                                                } else {
                                                                                    str6 = (String) obj6;
                                                                                    if (z17) {
                                                                                        obj6 = obj4;
                                                                                        c13158.m32536(str6);
                                                                                    } else {
                                                                                        obj6 = obj4;
                                                                                        c13158.m32532(str6, (char) 0, true);
                                                                                    }
                                                                                }
                                                                            } else {
                                                                                c14301 = this;
                                                                                if (c15275.f49792) {
                                                                                    c17122.m39980(c23474, obj4);
                                                                                } else if (obj4 != 0) {
                                                                                    if ((c13158.f43818 & EnumC3984.WriteEnumUsingToString.f14811) != 0) {
                                                                                        string = ((Enum) obj5).toString();
                                                                                        if ((c13158.f43818 & EnumC3984.UseSingleQuotes.f14811) != 0) {
                                                                                            z8 = true;
                                                                                        } else {
                                                                                            z8 = false;
                                                                                        }
                                                                                        if (z8) {
                                                                                            obj5 = obj4;
                                                                                            obj5 = obj4;
                                                                                            c13158.m32536(string);
                                                                                        } else {
                                                                                            obj5 = obj4;
                                                                                            obj5 = obj4;
                                                                                            c13158.m32532(string, (char) 0, false);
                                                                                        }
                                                                                    } else {
                                                                                        c13158.writeInt(((Enum) obj4).ordinal());
                                                                                    }
                                                                                } else {
                                                                                    c13158.m32530();
                                                                                }
                                                                            }
                                                                        } else {
                                                                            c14301 = this;
                                                                            c17122.m39980(c23474, obj4);
                                                                        }
                                                                        z16 = true;
                                                                    }
                                                                }
                                                                c14301 = this;
                                                                z16 = true;
                                                            } else {
                                                                c15275 = c15276;
                                                                str5 = "";
                                                                obj4 = objValueOf;
                                                                if (z7) {
                                                                }
                                                                if (!z16) {
                                                                    i5 = c13158.f43820 + 1;
                                                                    if (i5 > c13158.f43819.length) {
                                                                        c13158.m32534(i5);
                                                                    }
                                                                    c13158.f43819[c13158.f43820] = ',';
                                                                    c13158.f43820 = i5;
                                                                    if ((c13158.f43818 & EnumC3984.PrettyFormat.f14811) != 0) {
                                                                        c23473.m51723();
                                                                    }
                                                                }
                                                                if (str4 != str8) {
                                                                    if (!z11) {
                                                                        c13158.m32533(str4, true);
                                                                    }
                                                                    c23474 = c23473;
                                                                    c23474.m51725(obj4);
                                                                } else {
                                                                    c23474 = c23473;
                                                                    if (obj3 != obj4) {
                                                                        if (!z11) {
                                                                            c17122.m39979(c23474);
                                                                        }
                                                                        c23474.m51725(obj4);
                                                                    } else {
                                                                        if (z11) {
                                                                            if (z18) {
                                                                                char[] cArr8 = c17122.f54605;
                                                                                int length8 = cArr8.length;
                                                                                i4 = c13158.f43820 + length8;
                                                                                if (i4 > c13158.f43819.length) {
                                                                                    c13158.m32534(i4);
                                                                                }
                                                                                System.arraycopy(cArr8, 0, c13158.f43819, c13158.f43820, length8);
                                                                                c13158.f43820 = i4;
                                                                            } else {
                                                                                c17122.m39979(c23474);
                                                                            }
                                                                        }
                                                                        if (z3) {
                                                                        }
                                                                        if (!z11) {
                                                                            if (cls4 == String.class) {
                                                                                c14301 = this;
                                                                                int i116 = c17122.f54604 | c14301.f46851;
                                                                                if (obj4 == 0) {
                                                                                    i2 = c13158.f43818;
                                                                                    i3 = EnumC3984.WriteNullStringAsEmpty.f14811;
                                                                                    if ((i2 & i3) == 0) {
                                                                                        c13158.m32531(str5);
                                                                                    } else {
                                                                                        c13158.m32531(str5);
                                                                                    }
                                                                                } else {
                                                                                    str6 = (String) obj6;
                                                                                    if (z17) {
                                                                                        obj6 = obj4;
                                                                                        c13158.m32536(str6);
                                                                                    } else {
                                                                                        obj6 = obj4;
                                                                                        c13158.m32532(str6, (char) 0, true);
                                                                                    }
                                                                                }
                                                                            } else {
                                                                                c14301 = this;
                                                                                if (c15275.f49792) {
                                                                                    c17122.m39980(c23474, obj4);
                                                                                } else if (obj4 != 0) {
                                                                                    if ((c13158.f43818 & EnumC3984.WriteEnumUsingToString.f14811) != 0) {
                                                                                        string = ((Enum) obj5).toString();
                                                                                        if ((c13158.f43818 & EnumC3984.UseSingleQuotes.f14811) != 0) {
                                                                                            z8 = true;
                                                                                        } else {
                                                                                            z8 = false;
                                                                                        }
                                                                                        if (z8) {
                                                                                            obj5 = obj4;
                                                                                            obj5 = obj4;
                                                                                            c13158.m32536(string);
                                                                                        } else {
                                                                                            obj5 = obj4;
                                                                                            obj5 = obj4;
                                                                                            c13158.m32532(string, (char) 0, false);
                                                                                        }
                                                                                    } else {
                                                                                        c13158.writeInt(((Enum) obj4).ordinal());
                                                                                    }
                                                                                } else {
                                                                                    c13158.m32530();
                                                                                }
                                                                            }
                                                                        } else {
                                                                            c14301 = this;
                                                                            c17122.m39980(c23474, obj4);
                                                                        }
                                                                        z16 = true;
                                                                    }
                                                                }
                                                                c14301 = this;
                                                                z16 = true;
                                                            }
                                                        }
                                                        c14301 = this;
                                                        c23474 = c23473;
                                                    }
                                                    z5 = false;
                                                    z4 = z10;
                                                    i = i6;
                                                    z3 = true;
                                                    if (arrayList4 != null) {
                                                        if (z3) {
                                                            if (cls4 == cls3) {
                                                                objM39978 = Integer.valueOf(i);
                                                            } else if (cls4 == cls2) {
                                                                objM39978 = Long.valueOf(j);
                                                            } else if (cls4 == cls) {
                                                                objM39978 = Boolean.valueOf(z4);
                                                            }
                                                            z5 = true;
                                                        }
                                                        it3 = arrayList4.iterator();
                                                        while (true) {
                                                            if (!it3.hasNext()) {
                                                                z6 = true;
                                                                break;
                                                            } else if (!((InterfaceC2573) it3.next()).apply()) {
                                                                z6 = false;
                                                                break;
                                                            }
                                                        }
                                                    } else {
                                                        z6 = true;
                                                        break;
                                                    }
                                                    if (z6) {
                                                        if (arrayList5 != null) {
                                                            if (z3) {
                                                                if (cls4 == cls3) {
                                                                    objM39978 = Integer.valueOf(i);
                                                                } else if (cls4 == cls2) {
                                                                    objM39978 = Long.valueOf(j);
                                                                } else if (cls4 == cls) {
                                                                    objM39978 = Boolean.valueOf(z4);
                                                                }
                                                                z5 = true;
                                                            }
                                                            it2 = arrayList5.iterator();
                                                            strM12997 = str8;
                                                            while (it2.hasNext()) {
                                                                strM12997 = ((InterfaceC4690) it2.next()).m12997();
                                                            }
                                                            objValueOf = objM39978;
                                                            str4 = strM12997;
                                                        } else {
                                                            objValueOf = objM39978;
                                                            str4 = str8;
                                                        }
                                                        if (arrayList6 != null) {
                                                            if (z3) {
                                                                Object obj16 = objValueOf;
                                                                z9 = z5;
                                                                objValueOf2 = obj16;
                                                            } else {
                                                                Object obj17 = objValueOf;
                                                                z9 = z5;
                                                                objValueOf2 = obj17;
                                                            }
                                                            it = arrayList6.iterator();
                                                            objM50969 = objValueOf2;
                                                            while (it.hasNext()) {
                                                                objM50969 = ((InterfaceC23036) it.next()).m50969();
                                                            }
                                                            z7 = z9;
                                                            objValueOf = objM50969;
                                                            obj3 = objValueOf2;
                                                        } else {
                                                            z7 = z5;
                                                            obj3 = objValueOf;
                                                        }
                                                        arrayList2 = arrayList4;
                                                        if (z7) {
                                                            c15275 = c15276;
                                                            str5 = "";
                                                            obj4 = objValueOf;
                                                            if (z7) {
                                                            }
                                                            if (!z16) {
                                                                i5 = c13158.f43820 + 1;
                                                                if (i5 > c13158.f43819.length) {
                                                                    c13158.m32534(i5);
                                                                }
                                                                c13158.f43819[c13158.f43820] = ',';
                                                                c13158.f43820 = i5;
                                                                if ((c13158.f43818 & EnumC3984.PrettyFormat.f14811) != 0) {
                                                                    c23473.m51723();
                                                                }
                                                            }
                                                            if (str4 != str8) {
                                                                if (!z11) {
                                                                    c13158.m32533(str4, true);
                                                                }
                                                                c23474 = c23473;
                                                                c23474.m51725(obj4);
                                                            } else {
                                                                c23474 = c23473;
                                                                if (obj3 != obj4) {
                                                                    if (!z11) {
                                                                        c17122.m39979(c23474);
                                                                    }
                                                                    c23474.m51725(obj4);
                                                                } else {
                                                                    if (z11) {
                                                                        if (z18) {
                                                                            char[] cArr9 = c17122.f54605;
                                                                            int length9 = cArr9.length;
                                                                            i4 = c13158.f43820 + length9;
                                                                            if (i4 > c13158.f43819.length) {
                                                                                c13158.m32534(i4);
                                                                            }
                                                                            System.arraycopy(cArr9, 0, c13158.f43819, c13158.f43820, length9);
                                                                            c13158.f43820 = i4;
                                                                        } else {
                                                                            c17122.m39979(c23474);
                                                                        }
                                                                    }
                                                                    if (z3) {
                                                                    }
                                                                    if (!z11) {
                                                                        if (cls4 == String.class) {
                                                                            c14301 = this;
                                                                            int i117 = c17122.f54604 | c14301.f46851;
                                                                            if (obj4 == 0) {
                                                                                i2 = c13158.f43818;
                                                                                i3 = EnumC3984.WriteNullStringAsEmpty.f14811;
                                                                                if ((i2 & i3) == 0) {
                                                                                    c13158.m32531(str5);
                                                                                } else {
                                                                                    c13158.m32531(str5);
                                                                                }
                                                                            } else {
                                                                                str6 = (String) obj6;
                                                                                if (z17) {
                                                                                    obj6 = obj4;
                                                                                    c13158.m32536(str6);
                                                                                } else {
                                                                                    obj6 = obj4;
                                                                                    c13158.m32532(str6, (char) 0, true);
                                                                                }
                                                                            }
                                                                        } else {
                                                                            c14301 = this;
                                                                            if (c15275.f49792) {
                                                                                c17122.m39980(c23474, obj4);
                                                                            } else if (obj4 != 0) {
                                                                                if ((c13158.f43818 & EnumC3984.WriteEnumUsingToString.f14811) != 0) {
                                                                                    string = ((Enum) obj5).toString();
                                                                                    if ((c13158.f43818 & EnumC3984.UseSingleQuotes.f14811) != 0) {
                                                                                        z8 = true;
                                                                                    } else {
                                                                                        z8 = false;
                                                                                    }
                                                                                    if (z8) {
                                                                                        obj5 = obj4;
                                                                                        obj5 = obj4;
                                                                                        c13158.m32536(string);
                                                                                    } else {
                                                                                        obj5 = obj4;
                                                                                        obj5 = obj4;
                                                                                        c13158.m32532(string, (char) 0, false);
                                                                                    }
                                                                                } else {
                                                                                    c13158.writeInt(((Enum) obj4).ordinal());
                                                                                }
                                                                            } else {
                                                                                c13158.m32530();
                                                                            }
                                                                        }
                                                                    } else {
                                                                        c14301 = this;
                                                                        c17122.m39980(c23474, obj4);
                                                                    }
                                                                    z16 = true;
                                                                }
                                                            }
                                                            c14301 = this;
                                                            z16 = true;
                                                        } else {
                                                            c15275 = c15276;
                                                            str5 = "";
                                                            obj4 = objValueOf;
                                                            if (z7) {
                                                            }
                                                            if (!z16) {
                                                                i5 = c13158.f43820 + 1;
                                                                if (i5 > c13158.f43819.length) {
                                                                    c13158.m32534(i5);
                                                                }
                                                                c13158.f43819[c13158.f43820] = ',';
                                                                c13158.f43820 = i5;
                                                                if ((c13158.f43818 & EnumC3984.PrettyFormat.f14811) != 0) {
                                                                    c23473.m51723();
                                                                }
                                                            }
                                                            if (str4 != str8) {
                                                                if (!z11) {
                                                                    c13158.m32533(str4, true);
                                                                }
                                                                c23474 = c23473;
                                                                c23474.m51725(obj4);
                                                            } else {
                                                                c23474 = c23473;
                                                                if (obj3 != obj4) {
                                                                    if (!z11) {
                                                                        c17122.m39979(c23474);
                                                                    }
                                                                    c23474.m51725(obj4);
                                                                } else {
                                                                    if (z11) {
                                                                        if (z18) {
                                                                            char[] cArr10 = c17122.f54605;
                                                                            int length10 = cArr10.length;
                                                                            i4 = c13158.f43820 + length10;
                                                                            if (i4 > c13158.f43819.length) {
                                                                                c13158.m32534(i4);
                                                                            }
                                                                            System.arraycopy(cArr10, 0, c13158.f43819, c13158.f43820, length10);
                                                                            c13158.f43820 = i4;
                                                                        } else {
                                                                            c17122.m39979(c23474);
                                                                        }
                                                                    }
                                                                    if (z3) {
                                                                    }
                                                                    if (!z11) {
                                                                        if (cls4 == String.class) {
                                                                            c14301 = this;
                                                                            int i118 = c17122.f54604 | c14301.f46851;
                                                                            if (obj4 == 0) {
                                                                                i2 = c13158.f43818;
                                                                                i3 = EnumC3984.WriteNullStringAsEmpty.f14811;
                                                                                if ((i2 & i3) == 0) {
                                                                                    c13158.m32531(str5);
                                                                                } else {
                                                                                    c13158.m32531(str5);
                                                                                }
                                                                            } else {
                                                                                str6 = (String) obj6;
                                                                                if (z17) {
                                                                                    obj6 = obj4;
                                                                                    c13158.m32536(str6);
                                                                                } else {
                                                                                    obj6 = obj4;
                                                                                    c13158.m32532(str6, (char) 0, true);
                                                                                }
                                                                            }
                                                                        } else {
                                                                            c14301 = this;
                                                                            if (c15275.f49792) {
                                                                                c17122.m39980(c23474, obj4);
                                                                            } else if (obj4 != 0) {
                                                                                if ((c13158.f43818 & EnumC3984.WriteEnumUsingToString.f14811) != 0) {
                                                                                    string = ((Enum) obj5).toString();
                                                                                    if ((c13158.f43818 & EnumC3984.UseSingleQuotes.f14811) != 0) {
                                                                                        z8 = true;
                                                                                    } else {
                                                                                        z8 = false;
                                                                                    }
                                                                                    if (z8) {
                                                                                        obj5 = obj4;
                                                                                        obj5 = obj4;
                                                                                        c13158.m32536(string);
                                                                                    } else {
                                                                                        obj5 = obj4;
                                                                                        obj5 = obj4;
                                                                                        c13158.m32532(string, (char) 0, false);
                                                                                    }
                                                                                } else {
                                                                                    c13158.writeInt(((Enum) obj4).ordinal());
                                                                                }
                                                                            } else {
                                                                                c13158.m32530();
                                                                            }
                                                                        }
                                                                    } else {
                                                                        c14301 = this;
                                                                        c17122.m39980(c23474, obj4);
                                                                    }
                                                                    z16 = true;
                                                                }
                                                            }
                                                            c14301 = this;
                                                            z16 = true;
                                                        }
                                                    }
                                                    c14301 = this;
                                                    c23474 = c23473;
                                                } else {
                                                    objM39978 = c17122.m39978(obj7);
                                                }
                                                z3 = false;
                                                i = 0;
                                                z4 = false;
                                                z5 = true;
                                                if (arrayList4 != null) {
                                                    if (z3) {
                                                        if (cls4 == cls3) {
                                                            objM39978 = Integer.valueOf(i);
                                                        } else if (cls4 == cls2) {
                                                            objM39978 = Long.valueOf(j);
                                                        } else if (cls4 == cls) {
                                                            objM39978 = Boolean.valueOf(z4);
                                                        }
                                                        z5 = true;
                                                    }
                                                    it3 = arrayList4.iterator();
                                                    while (true) {
                                                        if (!it3.hasNext()) {
                                                            z6 = true;
                                                            break;
                                                        } else if (!((InterfaceC2573) it3.next()).apply()) {
                                                            z6 = false;
                                                            break;
                                                        }
                                                    }
                                                } else {
                                                    z6 = true;
                                                    break;
                                                }
                                                if (z6) {
                                                    if (arrayList5 != null) {
                                                        if (z3) {
                                                            if (cls4 == cls3) {
                                                                objM39978 = Integer.valueOf(i);
                                                            } else if (cls4 == cls2) {
                                                                objM39978 = Long.valueOf(j);
                                                            } else if (cls4 == cls) {
                                                                objM39978 = Boolean.valueOf(z4);
                                                            }
                                                            z5 = true;
                                                        }
                                                        it2 = arrayList5.iterator();
                                                        strM12997 = str8;
                                                        while (it2.hasNext()) {
                                                            strM12997 = ((InterfaceC4690) it2.next()).m12997();
                                                        }
                                                        objValueOf = objM39978;
                                                        str4 = strM12997;
                                                    } else {
                                                        objValueOf = objM39978;
                                                        str4 = str8;
                                                    }
                                                    if (arrayList6 != null) {
                                                        if (z3) {
                                                            Object obj18 = objValueOf;
                                                            z9 = z5;
                                                            objValueOf2 = obj18;
                                                        } else {
                                                            Object obj19 = objValueOf;
                                                            z9 = z5;
                                                            objValueOf2 = obj19;
                                                        }
                                                        it = arrayList6.iterator();
                                                        objM50969 = objValueOf2;
                                                        while (it.hasNext()) {
                                                            objM50969 = ((InterfaceC23036) it.next()).m50969();
                                                        }
                                                        z7 = z9;
                                                        objValueOf = objM50969;
                                                        obj3 = objValueOf2;
                                                    } else {
                                                        z7 = z5;
                                                        obj3 = objValueOf;
                                                    }
                                                    arrayList2 = arrayList4;
                                                    if (z7) {
                                                        c15275 = c15276;
                                                        str5 = "";
                                                        obj4 = objValueOf;
                                                        if (z7) {
                                                        }
                                                        if (!z16) {
                                                            i5 = c13158.f43820 + 1;
                                                            if (i5 > c13158.f43819.length) {
                                                                c13158.m32534(i5);
                                                            }
                                                            c13158.f43819[c13158.f43820] = ',';
                                                            c13158.f43820 = i5;
                                                            if ((c13158.f43818 & EnumC3984.PrettyFormat.f14811) != 0) {
                                                                c23473.m51723();
                                                            }
                                                        }
                                                        if (str4 != str8) {
                                                            if (!z11) {
                                                                c13158.m32533(str4, true);
                                                            }
                                                            c23474 = c23473;
                                                            c23474.m51725(obj4);
                                                        } else {
                                                            c23474 = c23473;
                                                            if (obj3 != obj4) {
                                                                if (!z11) {
                                                                    c17122.m39979(c23474);
                                                                }
                                                                c23474.m51725(obj4);
                                                            } else {
                                                                if (z11) {
                                                                    if (z18) {
                                                                        char[] cArr11 = c17122.f54605;
                                                                        int length11 = cArr11.length;
                                                                        i4 = c13158.f43820 + length11;
                                                                        if (i4 > c13158.f43819.length) {
                                                                            c13158.m32534(i4);
                                                                        }
                                                                        System.arraycopy(cArr11, 0, c13158.f43819, c13158.f43820, length11);
                                                                        c13158.f43820 = i4;
                                                                    } else {
                                                                        c17122.m39979(c23474);
                                                                    }
                                                                }
                                                                if (z3) {
                                                                }
                                                                if (!z11) {
                                                                    if (cls4 == String.class) {
                                                                        c14301 = this;
                                                                        int i119 = c17122.f54604 | c14301.f46851;
                                                                        if (obj4 == 0) {
                                                                            i2 = c13158.f43818;
                                                                            i3 = EnumC3984.WriteNullStringAsEmpty.f14811;
                                                                            if ((i2 & i3) == 0) {
                                                                                c13158.m32531(str5);
                                                                            } else {
                                                                                c13158.m32531(str5);
                                                                            }
                                                                        } else {
                                                                            str6 = (String) obj6;
                                                                            if (z17) {
                                                                                obj6 = obj4;
                                                                                c13158.m32536(str6);
                                                                            } else {
                                                                                obj6 = obj4;
                                                                                c13158.m32532(str6, (char) 0, true);
                                                                            }
                                                                        }
                                                                    } else {
                                                                        c14301 = this;
                                                                        if (c15275.f49792) {
                                                                            c17122.m39980(c23474, obj4);
                                                                        } else if (obj4 != 0) {
                                                                            if ((c13158.f43818 & EnumC3984.WriteEnumUsingToString.f14811) != 0) {
                                                                                string = ((Enum) obj5).toString();
                                                                                if ((c13158.f43818 & EnumC3984.UseSingleQuotes.f14811) != 0) {
                                                                                    z8 = true;
                                                                                } else {
                                                                                    z8 = false;
                                                                                }
                                                                                if (z8) {
                                                                                    obj5 = obj4;
                                                                                    obj5 = obj4;
                                                                                    c13158.m32536(string);
                                                                                } else {
                                                                                    obj5 = obj4;
                                                                                    obj5 = obj4;
                                                                                    c13158.m32532(string, (char) 0, false);
                                                                                }
                                                                            } else {
                                                                                c13158.writeInt(((Enum) obj4).ordinal());
                                                                            }
                                                                        } else {
                                                                            c13158.m32530();
                                                                        }
                                                                    }
                                                                } else {
                                                                    c14301 = this;
                                                                    c17122.m39980(c23474, obj4);
                                                                }
                                                                z16 = true;
                                                            }
                                                        }
                                                        c14301 = this;
                                                        z16 = true;
                                                    } else {
                                                        c15275 = c15276;
                                                        str5 = "";
                                                        obj4 = objValueOf;
                                                        if (z7) {
                                                        }
                                                        if (!z16) {
                                                            i5 = c13158.f43820 + 1;
                                                            if (i5 > c13158.f43819.length) {
                                                                c13158.m32534(i5);
                                                            }
                                                            c13158.f43819[c13158.f43820] = ',';
                                                            c13158.f43820 = i5;
                                                            if ((c13158.f43818 & EnumC3984.PrettyFormat.f14811) != 0) {
                                                                c23473.m51723();
                                                            }
                                                        }
                                                        if (str4 != str8) {
                                                            if (!z11) {
                                                                c13158.m32533(str4, true);
                                                            }
                                                            c23474 = c23473;
                                                            c23474.m51725(obj4);
                                                        } else {
                                                            c23474 = c23473;
                                                            if (obj3 != obj4) {
                                                                if (!z11) {
                                                                    c17122.m39979(c23474);
                                                                }
                                                                c23474.m51725(obj4);
                                                            } else {
                                                                if (z11) {
                                                                    if (z18) {
                                                                        char[] cArr12 = c17122.f54605;
                                                                        int length12 = cArr12.length;
                                                                        i4 = c13158.f43820 + length12;
                                                                        if (i4 > c13158.f43819.length) {
                                                                            c13158.m32534(i4);
                                                                        }
                                                                        System.arraycopy(cArr12, 0, c13158.f43819, c13158.f43820, length12);
                                                                        c13158.f43820 = i4;
                                                                    } else {
                                                                        c17122.m39979(c23474);
                                                                    }
                                                                }
                                                                if (z3) {
                                                                }
                                                                if (!z11) {
                                                                    if (cls4 == String.class) {
                                                                        c14301 = this;
                                                                        int i1110 = c17122.f54604 | c14301.f46851;
                                                                        if (obj4 == 0) {
                                                                            i2 = c13158.f43818;
                                                                            i3 = EnumC3984.WriteNullStringAsEmpty.f14811;
                                                                            if ((i2 & i3) == 0) {
                                                                                c13158.m32531(str5);
                                                                            } else {
                                                                                c13158.m32531(str5);
                                                                            }
                                                                        } else {
                                                                            str6 = (String) obj6;
                                                                            if (z17) {
                                                                                obj6 = obj4;
                                                                                c13158.m32536(str6);
                                                                            } else {
                                                                                obj6 = obj4;
                                                                                c13158.m32532(str6, (char) 0, true);
                                                                            }
                                                                        }
                                                                    } else {
                                                                        c14301 = this;
                                                                        if (c15275.f49792) {
                                                                            c17122.m39980(c23474, obj4);
                                                                        } else if (obj4 != 0) {
                                                                            if ((c13158.f43818 & EnumC3984.WriteEnumUsingToString.f14811) != 0) {
                                                                                string = ((Enum) obj5).toString();
                                                                                if ((c13158.f43818 & EnumC3984.UseSingleQuotes.f14811) != 0) {
                                                                                    z8 = true;
                                                                                } else {
                                                                                    z8 = false;
                                                                                }
                                                                                if (z8) {
                                                                                    obj5 = obj4;
                                                                                    obj5 = obj4;
                                                                                    c13158.m32536(string);
                                                                                } else {
                                                                                    obj5 = obj4;
                                                                                    obj5 = obj4;
                                                                                    c13158.m32532(string, (char) 0, false);
                                                                                }
                                                                            } else {
                                                                                c13158.writeInt(((Enum) obj4).ordinal());
                                                                            }
                                                                        } else {
                                                                            c13158.m32530();
                                                                        }
                                                                    }
                                                                } else {
                                                                    c14301 = this;
                                                                    c17122.m39980(c23474, obj4);
                                                                }
                                                                z16 = true;
                                                            }
                                                        }
                                                        c14301 = this;
                                                        z16 = true;
                                                    }
                                                }
                                                c14301 = this;
                                                c23474 = c23473;
                                            }
                                            arrayList6 = arrayList6;
                                            arrayList5 = arrayList5;
                                            arrayList2 = arrayList4;
                                            c14301 = this;
                                            c23474 = c23473;
                                        }
                                    }
                                    arrayList = arrayList7;
                                    str3 = str7;
                                    arrayList6 = arrayList6;
                                    arrayList5 = arrayList5;
                                    arrayList2 = arrayList4;
                                    c14301 = this;
                                    c23474 = c23473;
                                } catch (Exception e) {
                                    e = e;
                                    c22330 = c22333;
                                    c23474 = c23473;
                                    str = "write javaBean error, fastjson version 1.1.72";
                                    if (obj2 != null) {
                                        str = "write javaBean error, fastjson version 1.1.72, fieldName : " + obj2;
                                    }
                                    throw new C20614(str, e);
                                } catch (Throwable th) {
                                    th = th;
                                    c22330 = c22333;
                                    c23474 = c23473;
                                    c23474.f76000 = c22330;
                                    throw th;
                                }
                            } else {
                                if (str7 != null || !str7.equals(str8)) {
                                    if (arrayList7 == null) {
                                        z = true;
                                        break;
                                    }
                                    it4 = arrayList7.iterator();
                                    while (true) {
                                        if (!it4.hasNext()) {
                                            z = true;
                                            break;
                                        } else if (!((InterfaceC5396) it4.next()).m14962()) {
                                            z = false;
                                            break;
                                        }
                                    }
                                    if (z) {
                                        z2 = c15276.f49794;
                                        cls = Boolean.TYPE;
                                        arrayList = arrayList7;
                                        cls2 = Long.TYPE;
                                        str3 = str7;
                                        cls3 = Integer.TYPE;
                                        j = 0;
                                        if (z2) {
                                            objM39978 = null;
                                            if (cls4 == cls3) {
                                                i6 = field.getInt(obj7);
                                                z10 = false;
                                            } else {
                                                if (cls4 == cls2) {
                                                    j = field.getLong(obj7);
                                                    z3 = true;
                                                    i = 0;
                                                    z4 = false;
                                                    z5 = false;
                                                } else if (cls4 == cls) {
                                                    z10 = field.getBoolean(obj7);
                                                    i6 = 0;
                                                } else {
                                                    objM39978 = field.get(obj7);
                                                }
                                                if (arrayList4 != null) {
                                                    if (z3) {
                                                        if (cls4 == cls3) {
                                                            objM39978 = Integer.valueOf(i);
                                                        } else if (cls4 == cls2) {
                                                            objM39978 = Long.valueOf(j);
                                                        } else if (cls4 == cls) {
                                                            objM39978 = Boolean.valueOf(z4);
                                                        }
                                                        z5 = true;
                                                    }
                                                    it3 = arrayList4.iterator();
                                                    while (true) {
                                                        if (!it3.hasNext()) {
                                                            z6 = true;
                                                            break;
                                                        } else if (!((InterfaceC2573) it3.next()).apply()) {
                                                            z6 = false;
                                                            break;
                                                        }
                                                    }
                                                } else {
                                                    z6 = true;
                                                    break;
                                                }
                                                if (z6) {
                                                    if (arrayList5 != null) {
                                                        if (z3 && !z5) {
                                                            if (cls4 == cls3) {
                                                                objM39978 = Integer.valueOf(i);
                                                            } else if (cls4 == cls2) {
                                                                objM39978 = Long.valueOf(j);
                                                            } else if (cls4 == cls) {
                                                                objM39978 = Boolean.valueOf(z4);
                                                            }
                                                            z5 = true;
                                                        }
                                                        it2 = arrayList5.iterator();
                                                        strM12997 = str8;
                                                        while (it2.hasNext()) {
                                                            strM12997 = ((InterfaceC4690) it2.next()).m12997();
                                                        }
                                                        objValueOf = objM39978;
                                                        str4 = strM12997;
                                                    } else {
                                                        objValueOf = objM39978;
                                                        str4 = str8;
                                                    }
                                                    if (arrayList6 != null) {
                                                        if (z3 || z5) {
                                                            Object obj110 = objValueOf;
                                                            z9 = z5;
                                                            objValueOf2 = obj110;
                                                        } else {
                                                            if (cls4 == cls3) {
                                                                objValueOf2 = Integer.valueOf(i);
                                                            } else if (cls4 == cls2) {
                                                                objValueOf2 = Long.valueOf(j);
                                                            } else if (cls4 == cls) {
                                                                objValueOf2 = Boolean.valueOf(z4);
                                                            } else {
                                                                Object obj111 = objValueOf;
                                                                z9 = z5;
                                                                objValueOf2 = obj111;
                                                            }
                                                            z9 = true;
                                                        }
                                                        it = arrayList6.iterator();
                                                        objM50969 = objValueOf2;
                                                        while (it.hasNext()) {
                                                            objM50969 = ((InterfaceC23036) it.next()).m50969();
                                                        }
                                                        z7 = z9;
                                                        objValueOf = objM50969;
                                                        obj3 = objValueOf2;
                                                    } else {
                                                        z7 = z5;
                                                        obj3 = objValueOf;
                                                    }
                                                    arrayList2 = arrayList4;
                                                    if (z7 || objValueOf != null) {
                                                        c15275 = c15276;
                                                        str5 = "";
                                                    } else {
                                                        try {
                                                            c15275 = c15276;
                                                            int i20 = c15276.f49791 | c14302.f46851;
                                                            int i21 = c13158.f43818;
                                                            int i22 = i20 | i21;
                                                            str5 = "";
                                                            if (cls4 != Boolean.class) {
                                                                if (cls4 == String.class) {
                                                                    int i23 = EnumC3984.WriteNullStringAsEmpty.f14811;
                                                                    int i24 = EnumC3984.WriteMapNullValue.f14811 | i23;
                                                                    if (z11 || (i22 & i24) != 0 || (i24 & i21) != 0) {
                                                                        if ((i22 & i23) != 0 || (i21 & i23) != 0) {
                                                                            obj4 = str5;
                                                                        }
                                                                        if (z7 || obj4 == null || !z19 || (((cls4 != Byte.TYPE && cls4 != Short.TYPE && cls4 != cls3 && cls4 != cls2 && cls4 != Float.TYPE && cls4 != Double.TYPE) || !(obj4 instanceof Number) || ((Number) obj4).byteValue() != 0) && (cls4 != cls || !(obj4 instanceof Boolean) || ((Boolean) obj4).booleanValue()))) {
                                                                            if (!z16) {
                                                                                i5 = c13158.f43820 + 1;
                                                                                if (i5 > c13158.f43819.length) {
                                                                                    c13158.m32534(i5);
                                                                                }
                                                                                c13158.f43819[c13158.f43820] = ',';
                                                                                c13158.f43820 = i5;
                                                                                if ((c13158.f43818 & EnumC3984.PrettyFormat.f14811) != 0) {
                                                                                    c23473.m51723();
                                                                                }
                                                                            }
                                                                            if (str4 != str8) {
                                                                                if (!z11) {
                                                                                    c13158.m32533(str4, true);
                                                                                }
                                                                                c23474 = c23473;
                                                                                try {
                                                                                    c23474.m51725(obj4);
                                                                                } catch (Exception e2) {
                                                                                    e = e2;
                                                                                    c22330 = c22333;
                                                                                    str = "write javaBean error, fastjson version 1.1.72";
                                                                                    if (obj2 != null) {
                                                                                        try {
                                                                                            str = "write javaBean error, fastjson version 1.1.72, fieldName : " + obj2;
                                                                                        } catch (Throwable th2) {
                                                                                            th = th2;
                                                                                            c23474.f76000 = c22330;
                                                                                            throw th;
                                                                                        }
                                                                                    }
                                                                                    throw new C20614(str, e);
                                                                                } catch (Throwable th3) {
                                                                                    th = th3;
                                                                                    c22330 = c22333;
                                                                                    c23474.f76000 = c22330;
                                                                                    throw th;
                                                                                }
                                                                            } else {
                                                                                c23474 = c23473;
                                                                                if (obj3 != obj4) {
                                                                                    if (!z11) {
                                                                                        c17122.m39979(c23474);
                                                                                    }
                                                                                    c23474.m51725(obj4);
                                                                                } else {
                                                                                    if (z11) {
                                                                                        if (z18) {
                                                                                            char[] cArr13 = c17122.f54605;
                                                                                            int length13 = cArr13.length;
                                                                                            i4 = c13158.f43820 + length13;
                                                                                            if (i4 > c13158.f43819.length) {
                                                                                                c13158.m32534(i4);
                                                                                            }
                                                                                            System.arraycopy(cArr13, 0, c13158.f43819, c13158.f43820, length13);
                                                                                            c13158.f43820 = i4;
                                                                                        } else {
                                                                                            c17122.m39979(c23474);
                                                                                        }
                                                                                    }
                                                                                    if (z3 || z7) {
                                                                                        if (!z11) {
                                                                                            if (cls4 == String.class) {
                                                                                                c14301 = this;
                                                                                                int i1111 = c17122.f54604 | c14301.f46851;
                                                                                                if (obj4 == 0) {
                                                                                                    i2 = c13158.f43818;
                                                                                                    i3 = EnumC3984.WriteNullStringAsEmpty.f14811;
                                                                                                    if ((i2 & i3) == 0 || (i1111 & i3) != 0) {
                                                                                                        c13158.m32531(str5);
                                                                                                    } else {
                                                                                                        c13158.m32530();
                                                                                                    }
                                                                                                } else {
                                                                                                    str6 = (String) obj6;
                                                                                                    if (z17) {
                                                                                                        obj6 = obj4;
                                                                                                        c13158.m32536(str6);
                                                                                                    } else {
                                                                                                        obj6 = obj4;
                                                                                                        c13158.m32532(str6, (char) 0, true);
                                                                                                    }
                                                                                                }
                                                                                            } else {
                                                                                                c14301 = this;
                                                                                                if (c15275.f49792) {
                                                                                                    c17122.m39980(c23474, obj4);
                                                                                                } else if (obj4 != 0) {
                                                                                                    if ((c13158.f43818 & EnumC3984.WriteEnumUsingToString.f14811) != 0) {
                                                                                                        string = ((Enum) obj5).toString();
                                                                                                        if ((c13158.f43818 & EnumC3984.UseSingleQuotes.f14811) != 0) {
                                                                                                            z8 = true;
                                                                                                        } else {
                                                                                                            z8 = false;
                                                                                                        }
                                                                                                        if (z8) {
                                                                                                            obj5 = obj4;
                                                                                                            obj5 = obj4;
                                                                                                            c13158.m32536(string);
                                                                                                        } else {
                                                                                                            obj5 = obj4;
                                                                                                            obj5 = obj4;
                                                                                                            c13158.m32532(string, (char) 0, false);
                                                                                                        }
                                                                                                    } else {
                                                                                                        c13158.writeInt(((Enum) obj4).ordinal());
                                                                                                    }
                                                                                                } else {
                                                                                                    c13158.m32530();
                                                                                                }
                                                                                            }
                                                                                        } else {
                                                                                            c14301 = this;
                                                                                            c17122.m39980(c23474, obj4);
                                                                                        }
                                                                                    } else if (cls4 == cls3) {
                                                                                        int i25 = i;
                                                                                        if (i25 == Integer.MIN_VALUE) {
                                                                                            c13158.write("-2147483648");
                                                                                        } else {
                                                                                            int i26 = 0;
                                                                                            while ((i25 < 0 ? -i25 : i25) > C13158.f43814[i26]) {
                                                                                                i26++;
                                                                                            }
                                                                                            int i27 = i26 + 1;
                                                                                            if (i25 < 0) {
                                                                                                i27 = i26 + 2;
                                                                                            }
                                                                                            int i28 = c13158.f43820 + i27;
                                                                                            if (i28 > c13158.f43819.length) {
                                                                                                c13158.m32534(i28);
                                                                                            }
                                                                                            C13158.m32529(i25, i28, c13158.f43819);
                                                                                            c13158.f43820 = i28;
                                                                                        }
                                                                                    } else if (cls4 == cls2) {
                                                                                        c13158.m32535(j);
                                                                                    } else if (cls4 == cls) {
                                                                                        if (z4) {
                                                                                            c13158.write(f46848, 0, 4);
                                                                                        } else {
                                                                                            c13158.write(f46849, 0, 5);
                                                                                        }
                                                                                    }
                                                                                    z16 = true;
                                                                                }
                                                                            }
                                                                            c14301 = this;
                                                                            z16 = true;
                                                                        }
                                                                    }
                                                                } else if (Number.class.isAssignableFrom(cls4)) {
                                                                    int i29 = EnumC3984.WriteNullNumberAsZero.f14811;
                                                                    int i30 = EnumC3984.WriteMapNullValue.f14811 | i29;
                                                                    if (z11 || (i22 & i30) != 0 || (i30 & c13158.f43818) != 0) {
                                                                        if ((i22 & i29) != 0 || (c13158.f43818 & i29) != 0) {
                                                                            objValueOf = Integer.valueOf(i17);
                                                                        }
                                                                    }
                                                                } else if (Collection.class.isAssignableFrom(cls4)) {
                                                                    int i31 = EnumC3984.WriteNullListAsEmpty.f14811;
                                                                    int i32 = EnumC3984.WriteMapNullValue.f14811 | i31;
                                                                    if (z11 || (i22 & i32) != 0 || (i32 & c13158.f43818) != 0) {
                                                                        if ((i22 & i31) != 0 || (c13158.f43818 & i31) != 0) {
                                                                            objValueOf = Collections.EMPTY_LIST;
                                                                        }
                                                                    }
                                                                } else if (!z11 && !c17122.f54606) {
                                                                    if (!((EnumC3984.WriteMapNullValue.f14811 & c13158.f43818) != 0)) {
                                                                    }
                                                                }
                                                            } else {
                                                                int i33 = EnumC3984.WriteNullBooleanAsFalse.f14811;
                                                                int i34 = EnumC3984.WriteMapNullValue.f14811 | i33;
                                                                if (z11 || (i22 & i34) != 0 || (i34 & i21) != 0) {
                                                                    if ((i22 & i33) != 0 || (i21 & i33) != 0) {
                                                                        objValueOf = Boolean.FALSE;
                                                                    }
                                                                }
                                                            }
                                                        } catch (Exception e3) {
                                                            e = e3;
                                                            c23474 = c23473;
                                                            c22330 = c22333;
                                                            str = "write javaBean error, fastjson version 1.1.72";
                                                            if (obj2 != null) {
                                                                str = "write javaBean error, fastjson version 1.1.72, fieldName : " + obj2;
                                                            }
                                                            throw new C20614(str, e);
                                                        } catch (Throwable th4) {
                                                            th = th4;
                                                            c23474 = c23473;
                                                            c22330 = c22333;
                                                            c23474.f76000 = c22330;
                                                            throw th;
                                                        }
                                                    }
                                                    obj4 = objValueOf;
                                                    if (z7) {
                                                    }
                                                    if (!z16) {
                                                        i5 = c13158.f43820 + 1;
                                                        if (i5 > c13158.f43819.length) {
                                                            c13158.m32534(i5);
                                                        }
                                                        c13158.f43819[c13158.f43820] = ',';
                                                        c13158.f43820 = i5;
                                                        if ((c13158.f43818 & EnumC3984.PrettyFormat.f14811) != 0) {
                                                            c23473.m51723();
                                                        }
                                                    }
                                                    if (str4 != str8) {
                                                        if (!z11) {
                                                            c13158.m32533(str4, true);
                                                        }
                                                        c23474 = c23473;
                                                        c23474.m51725(obj4);
                                                    } else {
                                                        c23474 = c23473;
                                                        if (obj3 != obj4) {
                                                            if (!z11) {
                                                                c17122.m39979(c23474);
                                                            }
                                                            c23474.m51725(obj4);
                                                        } else {
                                                            if (z11) {
                                                                if (z18) {
                                                                    char[] cArr14 = c17122.f54605;
                                                                    int length14 = cArr14.length;
                                                                    i4 = c13158.f43820 + length14;
                                                                    if (i4 > c13158.f43819.length) {
                                                                        c13158.m32534(i4);
                                                                    }
                                                                    System.arraycopy(cArr14, 0, c13158.f43819, c13158.f43820, length14);
                                                                    c13158.f43820 = i4;
                                                                } else {
                                                                    c17122.m39979(c23474);
                                                                }
                                                            }
                                                            if (z3) {
                                                            }
                                                            if (!z11) {
                                                                if (cls4 == String.class) {
                                                                    c14301 = this;
                                                                    int i1112 = c17122.f54604 | c14301.f46851;
                                                                    if (obj4 == 0) {
                                                                        i2 = c13158.f43818;
                                                                        i3 = EnumC3984.WriteNullStringAsEmpty.f14811;
                                                                        if ((i2 & i3) == 0) {
                                                                            c13158.m32531(str5);
                                                                        } else {
                                                                            c13158.m32531(str5);
                                                                        }
                                                                    } else {
                                                                        str6 = (String) obj6;
                                                                        if (z17) {
                                                                            obj6 = obj4;
                                                                            c13158.m32536(str6);
                                                                        } else {
                                                                            obj6 = obj4;
                                                                            c13158.m32532(str6, (char) 0, true);
                                                                        }
                                                                    }
                                                                } else {
                                                                    c14301 = this;
                                                                    if (c15275.f49792) {
                                                                        c17122.m39980(c23474, obj4);
                                                                    } else if (obj4 != 0) {
                                                                        if ((c13158.f43818 & EnumC3984.WriteEnumUsingToString.f14811) != 0) {
                                                                            string = ((Enum) obj5).toString();
                                                                            if ((c13158.f43818 & EnumC3984.UseSingleQuotes.f14811) != 0) {
                                                                                z8 = true;
                                                                            } else {
                                                                                z8 = false;
                                                                            }
                                                                            if (z8) {
                                                                                obj5 = obj4;
                                                                                obj5 = obj4;
                                                                                c13158.m32536(string);
                                                                            } else {
                                                                                obj5 = obj4;
                                                                                obj5 = obj4;
                                                                                c13158.m32532(string, (char) 0, false);
                                                                            }
                                                                        } else {
                                                                            c13158.writeInt(((Enum) obj4).ordinal());
                                                                        }
                                                                    } else {
                                                                        c13158.m32530();
                                                                    }
                                                                }
                                                            } else {
                                                                c14301 = this;
                                                                c17122.m39980(c23474, obj4);
                                                            }
                                                            z16 = true;
                                                        }
                                                    }
                                                    c14301 = this;
                                                    z16 = true;
                                                }
                                                c14301 = this;
                                                c23474 = c23473;
                                            }
                                            z5 = false;
                                            z4 = z10;
                                            i = i6;
                                            z3 = true;
                                            if (arrayList4 != null) {
                                                if (z3) {
                                                    if (cls4 == cls3) {
                                                        objM39978 = Integer.valueOf(i);
                                                    } else if (cls4 == cls2) {
                                                        objM39978 = Long.valueOf(j);
                                                    } else if (cls4 == cls) {
                                                        objM39978 = Boolean.valueOf(z4);
                                                    }
                                                    z5 = true;
                                                }
                                                it3 = arrayList4.iterator();
                                                while (true) {
                                                    if (!it3.hasNext()) {
                                                        z6 = true;
                                                        break;
                                                    } else if (!((InterfaceC2573) it3.next()).apply()) {
                                                        z6 = false;
                                                        break;
                                                    }
                                                }
                                            } else {
                                                z6 = true;
                                                break;
                                            }
                                            if (z6) {
                                                if (arrayList5 != null) {
                                                    if (z3) {
                                                        if (cls4 == cls3) {
                                                            objM39978 = Integer.valueOf(i);
                                                        } else if (cls4 == cls2) {
                                                            objM39978 = Long.valueOf(j);
                                                        } else if (cls4 == cls) {
                                                            objM39978 = Boolean.valueOf(z4);
                                                        }
                                                        z5 = true;
                                                    }
                                                    it2 = arrayList5.iterator();
                                                    strM12997 = str8;
                                                    while (it2.hasNext()) {
                                                        strM12997 = ((InterfaceC4690) it2.next()).m12997();
                                                    }
                                                    objValueOf = objM39978;
                                                    str4 = strM12997;
                                                } else {
                                                    objValueOf = objM39978;
                                                    str4 = str8;
                                                }
                                                if (arrayList6 != null) {
                                                    if (z3) {
                                                        Object obj112 = objValueOf;
                                                        z9 = z5;
                                                        objValueOf2 = obj112;
                                                    } else {
                                                        Object obj113 = objValueOf;
                                                        z9 = z5;
                                                        objValueOf2 = obj113;
                                                    }
                                                    it = arrayList6.iterator();
                                                    objM50969 = objValueOf2;
                                                    while (it.hasNext()) {
                                                        objM50969 = ((InterfaceC23036) it.next()).m50969();
                                                    }
                                                    z7 = z9;
                                                    objValueOf = objM50969;
                                                    obj3 = objValueOf2;
                                                } else {
                                                    z7 = z5;
                                                    obj3 = objValueOf;
                                                }
                                                arrayList2 = arrayList4;
                                                if (z7) {
                                                    c15275 = c15276;
                                                    str5 = "";
                                                    obj4 = objValueOf;
                                                    if (z7) {
                                                    }
                                                    if (!z16) {
                                                        i5 = c13158.f43820 + 1;
                                                        if (i5 > c13158.f43819.length) {
                                                            c13158.m32534(i5);
                                                        }
                                                        c13158.f43819[c13158.f43820] = ',';
                                                        c13158.f43820 = i5;
                                                        if ((c13158.f43818 & EnumC3984.PrettyFormat.f14811) != 0) {
                                                            c23473.m51723();
                                                        }
                                                    }
                                                    if (str4 != str8) {
                                                        if (!z11) {
                                                            c13158.m32533(str4, true);
                                                        }
                                                        c23474 = c23473;
                                                        c23474.m51725(obj4);
                                                    } else {
                                                        c23474 = c23473;
                                                        if (obj3 != obj4) {
                                                            if (!z11) {
                                                                c17122.m39979(c23474);
                                                            }
                                                            c23474.m51725(obj4);
                                                        } else {
                                                            if (z11) {
                                                                if (z18) {
                                                                    char[] cArr15 = c17122.f54605;
                                                                    int length15 = cArr15.length;
                                                                    i4 = c13158.f43820 + length15;
                                                                    if (i4 > c13158.f43819.length) {
                                                                        c13158.m32534(i4);
                                                                    }
                                                                    System.arraycopy(cArr15, 0, c13158.f43819, c13158.f43820, length15);
                                                                    c13158.f43820 = i4;
                                                                } else {
                                                                    c17122.m39979(c23474);
                                                                }
                                                            }
                                                            if (z3) {
                                                            }
                                                            if (!z11) {
                                                                if (cls4 == String.class) {
                                                                    c14301 = this;
                                                                    int i1113 = c17122.f54604 | c14301.f46851;
                                                                    if (obj4 == 0) {
                                                                        i2 = c13158.f43818;
                                                                        i3 = EnumC3984.WriteNullStringAsEmpty.f14811;
                                                                        if ((i2 & i3) == 0) {
                                                                            c13158.m32531(str5);
                                                                        } else {
                                                                            c13158.m32531(str5);
                                                                        }
                                                                    } else {
                                                                        str6 = (String) obj6;
                                                                        if (z17) {
                                                                            obj6 = obj4;
                                                                            c13158.m32536(str6);
                                                                        } else {
                                                                            obj6 = obj4;
                                                                            c13158.m32532(str6, (char) 0, true);
                                                                        }
                                                                    }
                                                                } else {
                                                                    c14301 = this;
                                                                    if (c15275.f49792) {
                                                                        c17122.m39980(c23474, obj4);
                                                                    } else if (obj4 != 0) {
                                                                        if ((c13158.f43818 & EnumC3984.WriteEnumUsingToString.f14811) != 0) {
                                                                            string = ((Enum) obj5).toString();
                                                                            if ((c13158.f43818 & EnumC3984.UseSingleQuotes.f14811) != 0) {
                                                                                z8 = true;
                                                                            } else {
                                                                                z8 = false;
                                                                            }
                                                                            if (z8) {
                                                                                obj5 = obj4;
                                                                                obj5 = obj4;
                                                                                c13158.m32536(string);
                                                                            } else {
                                                                                obj5 = obj4;
                                                                                obj5 = obj4;
                                                                                c13158.m32532(string, (char) 0, false);
                                                                            }
                                                                        } else {
                                                                            c13158.writeInt(((Enum) obj4).ordinal());
                                                                        }
                                                                    } else {
                                                                        c13158.m32530();
                                                                    }
                                                                }
                                                            } else {
                                                                c14301 = this;
                                                                c17122.m39980(c23474, obj4);
                                                            }
                                                            z16 = true;
                                                        }
                                                    }
                                                    c14301 = this;
                                                    z16 = true;
                                                } else {
                                                    c15275 = c15276;
                                                    str5 = "";
                                                    obj4 = objValueOf;
                                                    if (z7) {
                                                    }
                                                    if (!z16) {
                                                        i5 = c13158.f43820 + 1;
                                                        if (i5 > c13158.f43819.length) {
                                                            c13158.m32534(i5);
                                                        }
                                                        c13158.f43819[c13158.f43820] = ',';
                                                        c13158.f43820 = i5;
                                                        if ((c13158.f43818 & EnumC3984.PrettyFormat.f14811) != 0) {
                                                            c23473.m51723();
                                                        }
                                                    }
                                                    if (str4 != str8) {
                                                        if (!z11) {
                                                            c13158.m32533(str4, true);
                                                        }
                                                        c23474 = c23473;
                                                        c23474.m51725(obj4);
                                                    } else {
                                                        c23474 = c23473;
                                                        if (obj3 != obj4) {
                                                            if (!z11) {
                                                                c17122.m39979(c23474);
                                                            }
                                                            c23474.m51725(obj4);
                                                        } else {
                                                            if (z11) {
                                                                if (z18) {
                                                                    char[] cArr16 = c17122.f54605;
                                                                    int length16 = cArr16.length;
                                                                    i4 = c13158.f43820 + length16;
                                                                    if (i4 > c13158.f43819.length) {
                                                                        c13158.m32534(i4);
                                                                    }
                                                                    System.arraycopy(cArr16, 0, c13158.f43819, c13158.f43820, length16);
                                                                    c13158.f43820 = i4;
                                                                } else {
                                                                    c17122.m39979(c23474);
                                                                }
                                                            }
                                                            if (z3) {
                                                            }
                                                            if (!z11) {
                                                                if (cls4 == String.class) {
                                                                    c14301 = this;
                                                                    int i1114 = c17122.f54604 | c14301.f46851;
                                                                    if (obj4 == 0) {
                                                                        i2 = c13158.f43818;
                                                                        i3 = EnumC3984.WriteNullStringAsEmpty.f14811;
                                                                        if ((i2 & i3) == 0) {
                                                                            c13158.m32531(str5);
                                                                        } else {
                                                                            c13158.m32531(str5);
                                                                        }
                                                                    } else {
                                                                        str6 = (String) obj6;
                                                                        if (z17) {
                                                                            obj6 = obj4;
                                                                            c13158.m32536(str6);
                                                                        } else {
                                                                            obj6 = obj4;
                                                                            c13158.m32532(str6, (char) 0, true);
                                                                        }
                                                                    }
                                                                } else {
                                                                    c14301 = this;
                                                                    if (c15275.f49792) {
                                                                        c17122.m39980(c23474, obj4);
                                                                    } else if (obj4 != 0) {
                                                                        if ((c13158.f43818 & EnumC3984.WriteEnumUsingToString.f14811) != 0) {
                                                                            string = ((Enum) obj5).toString();
                                                                            if ((c13158.f43818 & EnumC3984.UseSingleQuotes.f14811) != 0) {
                                                                                z8 = true;
                                                                            } else {
                                                                                z8 = false;
                                                                            }
                                                                            if (z8) {
                                                                                obj5 = obj4;
                                                                                obj5 = obj4;
                                                                                c13158.m32536(string);
                                                                            } else {
                                                                                obj5 = obj4;
                                                                                obj5 = obj4;
                                                                                c13158.m32532(string, (char) 0, false);
                                                                            }
                                                                        } else {
                                                                            c13158.writeInt(((Enum) obj4).ordinal());
                                                                        }
                                                                    } else {
                                                                        c13158.m32530();
                                                                    }
                                                                }
                                                            } else {
                                                                c14301 = this;
                                                                c17122.m39980(c23474, obj4);
                                                            }
                                                            z16 = true;
                                                        }
                                                    }
                                                    c14301 = this;
                                                    z16 = true;
                                                }
                                            }
                                            c14301 = this;
                                            c23474 = c23473;
                                        } else {
                                            objM39978 = c17122.m39978(obj7);
                                        }
                                        z3 = false;
                                        i = 0;
                                        z4 = false;
                                        z5 = true;
                                        if (arrayList4 != null) {
                                            if (z3) {
                                                if (cls4 == cls3) {
                                                    objM39978 = Integer.valueOf(i);
                                                } else if (cls4 == cls2) {
                                                    objM39978 = Long.valueOf(j);
                                                } else if (cls4 == cls) {
                                                    objM39978 = Boolean.valueOf(z4);
                                                }
                                                z5 = true;
                                            }
                                            it3 = arrayList4.iterator();
                                            while (true) {
                                                if (!it3.hasNext()) {
                                                    z6 = true;
                                                    break;
                                                } else if (!((InterfaceC2573) it3.next()).apply()) {
                                                    z6 = false;
                                                    break;
                                                }
                                            }
                                        } else {
                                            z6 = true;
                                            break;
                                        }
                                        if (z6) {
                                            if (arrayList5 != null) {
                                                if (z3) {
                                                    if (cls4 == cls3) {
                                                        objM39978 = Integer.valueOf(i);
                                                    } else if (cls4 == cls2) {
                                                        objM39978 = Long.valueOf(j);
                                                    } else if (cls4 == cls) {
                                                        objM39978 = Boolean.valueOf(z4);
                                                    }
                                                    z5 = true;
                                                }
                                                it2 = arrayList5.iterator();
                                                strM12997 = str8;
                                                while (it2.hasNext()) {
                                                    strM12997 = ((InterfaceC4690) it2.next()).m12997();
                                                }
                                                objValueOf = objM39978;
                                                str4 = strM12997;
                                            } else {
                                                objValueOf = objM39978;
                                                str4 = str8;
                                            }
                                            if (arrayList6 != null) {
                                                if (z3) {
                                                    Object obj114 = objValueOf;
                                                    z9 = z5;
                                                    objValueOf2 = obj114;
                                                } else {
                                                    Object obj115 = objValueOf;
                                                    z9 = z5;
                                                    objValueOf2 = obj115;
                                                }
                                                it = arrayList6.iterator();
                                                objM50969 = objValueOf2;
                                                while (it.hasNext()) {
                                                    objM50969 = ((InterfaceC23036) it.next()).m50969();
                                                }
                                                z7 = z9;
                                                objValueOf = objM50969;
                                                obj3 = objValueOf2;
                                            } else {
                                                z7 = z5;
                                                obj3 = objValueOf;
                                            }
                                            arrayList2 = arrayList4;
                                            if (z7) {
                                                c15275 = c15276;
                                                str5 = "";
                                                obj4 = objValueOf;
                                                if (z7) {
                                                }
                                                if (!z16) {
                                                    i5 = c13158.f43820 + 1;
                                                    if (i5 > c13158.f43819.length) {
                                                        c13158.m32534(i5);
                                                    }
                                                    c13158.f43819[c13158.f43820] = ',';
                                                    c13158.f43820 = i5;
                                                    if ((c13158.f43818 & EnumC3984.PrettyFormat.f14811) != 0) {
                                                        c23473.m51723();
                                                    }
                                                }
                                                if (str4 != str8) {
                                                    if (!z11) {
                                                        c13158.m32533(str4, true);
                                                    }
                                                    c23474 = c23473;
                                                    c23474.m51725(obj4);
                                                } else {
                                                    c23474 = c23473;
                                                    if (obj3 != obj4) {
                                                        if (!z11) {
                                                            c17122.m39979(c23474);
                                                        }
                                                        c23474.m51725(obj4);
                                                    } else {
                                                        if (z11) {
                                                            if (z18) {
                                                                char[] cArr17 = c17122.f54605;
                                                                int length17 = cArr17.length;
                                                                i4 = c13158.f43820 + length17;
                                                                if (i4 > c13158.f43819.length) {
                                                                    c13158.m32534(i4);
                                                                }
                                                                System.arraycopy(cArr17, 0, c13158.f43819, c13158.f43820, length17);
                                                                c13158.f43820 = i4;
                                                            } else {
                                                                c17122.m39979(c23474);
                                                            }
                                                        }
                                                        if (z3) {
                                                        }
                                                        if (!z11) {
                                                            if (cls4 == String.class) {
                                                                c14301 = this;
                                                                int i1115 = c17122.f54604 | c14301.f46851;
                                                                if (obj4 == 0) {
                                                                    i2 = c13158.f43818;
                                                                    i3 = EnumC3984.WriteNullStringAsEmpty.f14811;
                                                                    if ((i2 & i3) == 0) {
                                                                        c13158.m32531(str5);
                                                                    } else {
                                                                        c13158.m32531(str5);
                                                                    }
                                                                } else {
                                                                    str6 = (String) obj6;
                                                                    if (z17) {
                                                                        obj6 = obj4;
                                                                        c13158.m32536(str6);
                                                                    } else {
                                                                        obj6 = obj4;
                                                                        c13158.m32532(str6, (char) 0, true);
                                                                    }
                                                                }
                                                            } else {
                                                                c14301 = this;
                                                                if (c15275.f49792) {
                                                                    c17122.m39980(c23474, obj4);
                                                                } else if (obj4 != 0) {
                                                                    if ((c13158.f43818 & EnumC3984.WriteEnumUsingToString.f14811) != 0) {
                                                                        string = ((Enum) obj5).toString();
                                                                        if ((c13158.f43818 & EnumC3984.UseSingleQuotes.f14811) != 0) {
                                                                            z8 = true;
                                                                        } else {
                                                                            z8 = false;
                                                                        }
                                                                        if (z8) {
                                                                            obj5 = obj4;
                                                                            obj5 = obj4;
                                                                            c13158.m32536(string);
                                                                        } else {
                                                                            obj5 = obj4;
                                                                            obj5 = obj4;
                                                                            c13158.m32532(string, (char) 0, false);
                                                                        }
                                                                    } else {
                                                                        c13158.writeInt(((Enum) obj4).ordinal());
                                                                    }
                                                                } else {
                                                                    c13158.m32530();
                                                                }
                                                            }
                                                        } else {
                                                            c14301 = this;
                                                            c17122.m39980(c23474, obj4);
                                                        }
                                                        z16 = true;
                                                    }
                                                }
                                                c14301 = this;
                                                z16 = true;
                                            } else {
                                                c15275 = c15276;
                                                str5 = "";
                                                obj4 = objValueOf;
                                                if (z7) {
                                                }
                                                if (!z16) {
                                                    i5 = c13158.f43820 + 1;
                                                    if (i5 > c13158.f43819.length) {
                                                        c13158.m32534(i5);
                                                    }
                                                    c13158.f43819[c13158.f43820] = ',';
                                                    c13158.f43820 = i5;
                                                    if ((c13158.f43818 & EnumC3984.PrettyFormat.f14811) != 0) {
                                                        c23473.m51723();
                                                    }
                                                }
                                                if (str4 != str8) {
                                                    if (!z11) {
                                                        c13158.m32533(str4, true);
                                                    }
                                                    c23474 = c23473;
                                                    c23474.m51725(obj4);
                                                } else {
                                                    c23474 = c23473;
                                                    if (obj3 != obj4) {
                                                        if (!z11) {
                                                            c17122.m39979(c23474);
                                                        }
                                                        c23474.m51725(obj4);
                                                    } else {
                                                        if (z11) {
                                                            if (z18) {
                                                                char[] cArr18 = c17122.f54605;
                                                                int length18 = cArr18.length;
                                                                i4 = c13158.f43820 + length18;
                                                                if (i4 > c13158.f43819.length) {
                                                                    c13158.m32534(i4);
                                                                }
                                                                System.arraycopy(cArr18, 0, c13158.f43819, c13158.f43820, length18);
                                                                c13158.f43820 = i4;
                                                            } else {
                                                                c17122.m39979(c23474);
                                                            }
                                                        }
                                                        if (z3) {
                                                        }
                                                        if (!z11) {
                                                            if (cls4 == String.class) {
                                                                c14301 = this;
                                                                int i1116 = c17122.f54604 | c14301.f46851;
                                                                if (obj4 == 0) {
                                                                    i2 = c13158.f43818;
                                                                    i3 = EnumC3984.WriteNullStringAsEmpty.f14811;
                                                                    if ((i2 & i3) == 0) {
                                                                        c13158.m32531(str5);
                                                                    } else {
                                                                        c13158.m32531(str5);
                                                                    }
                                                                } else {
                                                                    str6 = (String) obj6;
                                                                    if (z17) {
                                                                        obj6 = obj4;
                                                                        c13158.m32536(str6);
                                                                    } else {
                                                                        obj6 = obj4;
                                                                        c13158.m32532(str6, (char) 0, true);
                                                                    }
                                                                }
                                                            } else {
                                                                c14301 = this;
                                                                if (c15275.f49792) {
                                                                    c17122.m39980(c23474, obj4);
                                                                } else if (obj4 != 0) {
                                                                    if ((c13158.f43818 & EnumC3984.WriteEnumUsingToString.f14811) != 0) {
                                                                        string = ((Enum) obj5).toString();
                                                                        if ((c13158.f43818 & EnumC3984.UseSingleQuotes.f14811) != 0) {
                                                                            z8 = true;
                                                                        } else {
                                                                            z8 = false;
                                                                        }
                                                                        if (z8) {
                                                                            obj5 = obj4;
                                                                            obj5 = obj4;
                                                                            c13158.m32536(string);
                                                                        } else {
                                                                            obj5 = obj4;
                                                                            obj5 = obj4;
                                                                            c13158.m32532(string, (char) 0, false);
                                                                        }
                                                                    } else {
                                                                        c13158.writeInt(((Enum) obj4).ordinal());
                                                                    }
                                                                } else {
                                                                    c13158.m32530();
                                                                }
                                                            }
                                                        } else {
                                                            c14301 = this;
                                                            c17122.m39980(c23474, obj4);
                                                        }
                                                        z16 = true;
                                                    }
                                                }
                                                c14301 = this;
                                                z16 = true;
                                            }
                                        }
                                        c14301 = this;
                                        c23474 = c23473;
                                    }
                                    arrayList6 = arrayList6;
                                    arrayList5 = arrayList5;
                                    arrayList2 = arrayList4;
                                    c14301 = this;
                                    c23474 = c23473;
                                }
                                arrayList = arrayList7;
                                str3 = str7;
                                arrayList6 = arrayList6;
                                arrayList5 = arrayList5;
                                arrayList2 = arrayList4;
                                c14301 = this;
                                c23474 = c23473;
                            }
                            try {
                                i16 = i18 + 1;
                                i17 = 0;
                                obj7 = obj;
                                c17122Arr = c17122Arr2;
                                z14 = z17;
                                z13 = z18;
                                z15 = z19;
                                arrayList7 = arrayList;
                                str7 = str3;
                                arrayList6 = arrayList6;
                                arrayList5 = arrayList5;
                                arrayList4 = arrayList2;
                                C14301 c14303 = c14301;
                                c23475 = c23474;
                                c14302 = c14303;
                            } catch (Exception e4) {
                                e = e4;
                                c22330 = c22333;
                                str = "write javaBean error, fastjson version 1.1.72";
                                if (obj2 != null) {
                                    str = "write javaBean error, fastjson version 1.1.72, fieldName : " + obj2;
                                }
                                throw new C20614(str, e);
                            } catch (Throwable th5) {
                                th = th5;
                                c22330 = c22333;
                                c23474.f76000 = c22330;
                                throw th;
                            }
                        } catch (Exception e5) {
                            e = e5;
                        } catch (Throwable th6) {
                            th = th6;
                        }
                    } catch (Exception e6) {
                        e = e6;
                        c23474 = c23475;
                    } catch (Throwable th7) {
                        th = th7;
                        c23474 = c23475;
                    }
                } catch (Exception e7) {
                    e = e7;
                    c22330 = c22333;
                    c23474 = c23475;
                    str = "write javaBean error, fastjson version 1.1.72";
                    if (obj2 != null) {
                        str = "write javaBean error, fastjson version 1.1.72, fieldName : " + obj2;
                    }
                    throw new C20614(str, e);
                } catch (Throwable th8) {
                    th = th8;
                    c22330 = c22333;
                    c23474 = c23475;
                    c23474.f76000 = c22330;
                    throw th;
                }
            }
            C17122[] c17122Arr3 = c17122Arr;
            c23474 = c23475;
            ArrayList arrayList8 = c23474.f76002;
            if (arrayList8 != null) {
                char cM44192 = z16 ? ',' : (char) 0;
                Iterator it6 = arrayList8.iterator();
                while (it6.hasNext()) {
                    cM44192 = ((AbstractC19239) it6.next()).m44192(c23474, obj, cM44192);
                }
            }
            if (c17122Arr3.length > 0 && (c13158.f43818 & EnumC3984.PrettyFormat.f14811) != 0) {
                c23473.m51724();
                c23473.m51723();
            }
            int i35 = c13158.f43820 + 1;
            if (i35 > c13158.f43819.length) {
                c13158.m32534(i35);
            }
            c13158.f43819[c13158.f43820] = c3;
            c13158.f43820 = i35;
            c23474.f76000 = c22333;
        } catch (Exception e8) {
            e = e8;
            c22330 = c22333;
        } catch (Throwable th9) {
            th = th9;
            c22330 = c22333;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final LinkedHashMap m34527(Object obj) {
        C17122[] c17122Arr = this.f46853;
        LinkedHashMap linkedHashMap = new LinkedHashMap(c17122Arr.length);
        for (C17122 c17122 : c17122Arr) {
            linkedHashMap.put(c17122.f54607.f49788, c17122.m39978(obj));
        }
        return linkedHashMap;
    }
}
