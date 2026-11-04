package l;

import com.google.android.material.color.utilities.DynamicScheme;
import com.google.android.material.color.utilities.Hct;
import com.google.android.material.color.utilities.MaterialDynamicColors;
import com.google.android.material.color.utilities.TemperatureCache;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;

/* JADX INFO: renamed from: l.֨ᩴ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: 64JA */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C1385 implements Function {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f4938;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f4939;

    public /* synthetic */ C1385(int i, Object obj) {
        this.f4938 = i;
        this.f4939 = obj;
    }

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
        int i = this.f4938;
        Object obj2 = this.f4939;
        switch (i) {
            case 0:
                String str = (String) obj;
                boolean zContains = str.contains((String) obj2);
                boolean z = false;
                if (zContains) {
                    Object[] objArr = {".java", ".jcod", ".jasm", ".class"};
                    ArrayList arrayList = new ArrayList(4);
                    int iM9136 = 0;
                    while (iM9136 < 4) {
                        Object obj3 = objArr[iM9136];
                        iM9136 = C2764.m9136(obj3, arrayList, obj3, iM9136, 1);
                    }
                    Iterator it = C4681.unmodifiableList(arrayList).iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            bool = Boolean.FALSE;
                        } else if (str.contains((String) it.next())) {
                            bool = Boolean.TRUE;
                        }
                    }
                    if (bool.booleanValue()) {
                        z = true;
                    }
                }
                return Boolean.valueOf(z);
            case 1:
                return ((MaterialDynamicColors) obj2).lambda$primary$54((DynamicScheme) obj);
            case 2:
                return ((TemperatureCache) obj2).lambda$getHctsByTemp$0((Hct) obj);
            default:
                C22422 c22422 = (C22422) obj2;
                Map.Entry entry = (Map.Entry) obj;
                return c22422.m47990(9, "opens").concat(String.format("%s to%n%s;%n", ((C2635) entry.getKey()).toString(), C1170.stream((Set) entry.getValue()).map(
                /*  JADX ERROR: Method code generation error
                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x000f: RETURN 
                      (wrap java.lang.String:0x000b: INVOKE 
                      (wrap java.lang.String:0x0004: INVOKE (r1v7 'c22422' l.￡ﾩﾷ￡ﾩﾻ￡ﾩﾺ), (9 int), ("opens") VIRTUAL call: l.￡ﾩﾶￖﾫ￡ﾩﾺ.ￛﾙ(int, java.lang.String):java.lang.String A[MD:(int, java.lang.String):java.lang.String (m), WRAPPED] (LINE:108))
                      (wrap java.lang.String:0x003a: INVOKE 
                      ("%s to%n%s;%n")
                      (wrap java.lang.Object[]:0x0030: FILLED_NEW_ARRAY 
                      (wrap java.lang.String:0x000e: INVOKE 
                      (wrap l.ￛﾖￛﾧ￡ﾩﾺ:0x000c: CHECK_CAST (l.ￛﾖￛﾧ￡ﾩﾺ) (wrap java.lang.Object:0x0008: INVOKE (r8v11 'entry' java.util.Map$Entry) INTERFACE call: java.util.Map.Entry.getKey():java.lang.Object A[MD:():K (c), WRAPPED] (LINE:109)))
                     VIRTUAL call: l.ￖﾨￛﾧ￡ﾩﾺ.toString():java.lang.String A[MD:():java.lang.String (m), WRAPPED] (LINE:109))
                      (wrap java.lang.Object:0x002b: INVOKE 
                      (wrap l.￡ﾩﾵￜﾺￛﾗ:0x0021: INVOKE 
                      (wrap l.￡ﾩﾵￜﾺￛﾗ:0x0018: INVOKE 
                      (wrap java.util.Set:0x0016: CHECK_CAST (java.util.Set) (wrap java.lang.Object:0x0012: INVOKE (r8v11 'entry' java.util.Map$Entry) INTERFACE call: java.util.Map.Entry.getValue():java.lang.Object A[MD:():V (c), WRAPPED] (LINE:110)))
                     STATIC call: l.ￖﾨￛﾫￛﾗ.stream(java.util.Collection):l.￡ﾩﾵￜﾺￛﾗ A[MD:(java.util.Collection):l.￡ﾩﾵￜﾺￛﾗ (m), WRAPPED] (LINE:110))
                      (wrap java.util.function.Function:0x001e: CONSTRUCTOR (r1v7 'c22422' l.￡ﾩﾷ￡ﾩﾻ￡ﾩﾺ) A[MD:(l.￡ﾩﾷ￡ﾩﾻ￡ﾩﾺ):void (m), WRAPPED] call: l.ￛﾛￛﾧ￡ﾩﾺ.<init>(l.￡ﾩﾷ￡ﾩﾻ￡ﾩﾺ):void type: CONSTRUCTOR)
                     INTERFACE call: l.￡ﾩﾵￜﾺￛﾗ.map(java.util.function.Function):l.￡ﾩﾵￜﾺￛﾗ A[MD:(java.util.function.Function):l.￡ﾩﾵￜﾺￛﾗ (m), WRAPPED] (LINE:111))
                      (wrap l.ￛﾚￜﾺￛﾗ:0x0027: INVOKE (",
                    ") STATIC call: l.ￖﾫￜﾺￛﾗ.joining(java.lang.CharSequence):l.ￛﾚￜﾺￛﾗ A[MD:(java.lang.CharSequence):l.ￛﾚￜﾺￛﾗ (m), WRAPPED] (LINE:112))
                     INTERFACE call: l.￡ﾩﾵￜﾺￛﾗ.collect(l.ￛﾚￜﾺￛﾗ):java.lang.Object A[MD:(l.ￛﾚￜﾺￛﾗ):java.lang.Object (m), WRAPPED] (LINE:112))
                     A[WRAPPED] (LINE:112) elemType: java.lang.Object)
                     STATIC call: java.lang.String.format(java.lang.String, java.lang.Object[]):java.lang.String A[MD:(java.lang.String, java.lang.Object[]):java.lang.String VARARG (c), VARARG_CALL, WRAPPED] (LINE:109))
                     VIRTUAL call: java.lang.String.concat(java.lang.String):java.lang.String A[MD:(java.lang.String):java.lang.String (c), WRAPPED] (LINE:109))
                     (LINE:109) in method: l.ￖﾨ￡ﾩﾴ￡ﾩﾺ.apply(java.lang.Object):java.lang.Object, file: classes3.dex
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                    	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                    	at jadx.core.codegen.RegionGen.makeSwitch(RegionGen.java:267)
                    	at jadx.core.dex.regions.SwitchRegion.generate(SwitchRegion.java:90)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:291)
                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:270)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: l.ￛﾛￛﾧ￡ﾩﾺ, state: NOT_LOADED
                    	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:306)
                    	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:807)
                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:145)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:121)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
                    	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:1143)
                    	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:910)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:422)
                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:145)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:121)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
                    	at jadx.core.codegen.InsnGen.addArgDot(InsnGen.java:97)
                    	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:878)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:422)
                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:145)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:121)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
                    	at jadx.core.codegen.InsnGen.processVarArg(InsnGen.java:1166)
                    	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:1140)
                    	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:910)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:422)
                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:145)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:121)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
                    	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:1143)
                    	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:910)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:422)
                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:145)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:121)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
                    	... 21 more
                    */
                /*
                    this = this;
                    int r0 = r7.f4938
                    java.lang.Object r1 = r7.f4939
                    switch(r0) {
                        case 0: goto L22;
                        case 1: goto L19;
                        case 2: goto L10;
                        default: goto L7;
                    }
                L7:
                    l.᩷᩻᩺ r1 = (l.C22422) r1
                    java.util.Map$Entry r8 = (java.util.Map.Entry) r8
                    java.lang.String r8 = l.C22422.m50564(r1, r8)
                    return r8
                L10:
                    com.google.android.material.color.utilities.TemperatureCache r1 = (com.google.android.material.color.utilities.TemperatureCache) r1
                    com.google.android.material.color.utilities.Hct r8 = (com.google.android.material.color.utilities.Hct) r8
                    java.lang.Double r8 = com.google.android.material.color.utilities.TemperatureCache.$r8$lambda$VKoHiU00a9ybz_sbHTTerV8DYaI(r1, r8)
                    return r8
                L19:
                    com.google.android.material.color.utilities.MaterialDynamicColors r1 = (com.google.android.material.color.utilities.MaterialDynamicColors) r1
                    com.google.android.material.color.utilities.DynamicScheme r8 = (com.google.android.material.color.utilities.DynamicScheme) r8
                    com.google.android.material.color.utilities.ToneDeltaPair r8 = com.google.android.material.color.utilities.MaterialDynamicColors.$r8$lambda$flOmK91DuQNU6ZQSz7iP36OcNL0(r1, r8)
                    return r8
                L22:
                    java.lang.String r1 = (java.lang.String) r1
                    java.lang.String r8 = (java.lang.String) r8
                    boolean r0 = r8.contains(r1)
                    r1 = 0
                    if (r0 == 0) goto L78
                    r0 = 4
                    java.lang.Object[] r2 = new java.lang.Object[r0]
                    java.lang.String r3 = ".java"
                    r2[r1] = r3
                    java.lang.String r3 = ".jcod"
                    r4 = 1
                    r2[r4] = r3
                    java.lang.String r3 = ".jasm"
                    r5 = 2
                    r2[r5] = r3
                    java.lang.String r3 = ".class"
                    r5 = 3
                    r2[r5] = r3
                    java.util.ArrayList r3 = new java.util.ArrayList
                    r3.<init>(r0)
                    r5 = 0
                L49:
                    if (r5 >= r0) goto L52
                    r6 = r2[r5]
                    int r5 = l.C2764.m9136(r6, r3, r6, r5, r4)
                    goto L49
                L52:
                    java.util.List r0 = l.C4681.unmodifiableList(r3)
                    java.util.Iterator r0 = r0.iterator()
                L5a:
                    boolean r2 = r0.hasNext()
                    if (r2 == 0) goto L6f
                    java.lang.Object r2 = r0.next()
                    java.lang.String r2 = (java.lang.String) r2
                    boolean r2 = r8.contains(r2)
                    if (r2 == 0) goto L5a
                    java.lang.Boolean r8 = java.lang.Boolean.TRUE
                    goto L71
                L6f:
                    java.lang.Boolean r8 = java.lang.Boolean.FALSE
                L71:
                    boolean r8 = r8.booleanValue()
                    if (r8 == 0) goto L78
                    r1 = 1
                L78:
                    java.lang.Boolean r8 = java.lang.Boolean.valueOf(r1)
                    return r8
                */
                throw new UnsupportedOperationException("Method not decompiled: l.C1385.apply(java.lang.Object):java.lang.Object");
            }
        }
