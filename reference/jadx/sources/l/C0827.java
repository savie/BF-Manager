package l;

import java.util.Map;
import java.util.Set;
import java.util.function.Function;

/* JADX INFO: renamed from: l.֨ۖۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: 97F2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C0827 implements Function {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f3455;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f3456;

    public /* synthetic */ C0827(int i, Object obj) {
        this.f3455 = i;
        this.f3456 = obj;
    }

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
        switch (this.f3455) {
            case 0:
                C12118 c12118 = (C12118) this.f3456;
                Map.Entry entry = (Map.Entry) obj;
                return c12118.m18212(9, "exports").concat(String.format("%s to%n%s;%n", ((C8590) entry.getKey()).toString(), C9030.stream((Set) entry.getValue()).map(
                /*  JADX ERROR: Method code generation error
                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0031: RETURN 
                      (wrap java.lang.String:0x002d: INVOKE 
                      (wrap java.lang.String:0x0004: INVOKE (r0v2 'c12118' l.ￛﾫￛﾖￛﾤ), (9 int), ("exports") VIRTUAL call: l.ￛﾜￛﾨￛﾤ.ￛﾙ(int, java.lang.String):java.lang.String A[MD:(int, java.lang.String):java.lang.String (m), WRAPPED] (LINE:95))
                      (wrap java.lang.String:0x003a: INVOKE 
                      ("%s to%n%s;%n")
                      (wrap java.lang.Object[]:0x0030: FILLED_NEW_ARRAY 
                      (wrap java.lang.String:0x000e: INVOKE 
                      (wrap l.ￛﾡￛﾖￛﾤ:0x000c: CHECK_CAST (l.ￛﾡￛﾖￛﾤ) (wrap java.lang.Object:0x0008: INVOKE (r3v1 'entry' java.util.Map$Entry) INTERFACE call: java.util.Map.Entry.getKey():java.lang.Object A[MD:():K (c), WRAPPED] (LINE:96)))
                     VIRTUAL call: l.ￛﾤￛﾖￛﾤ.toString():java.lang.String A[MD:():java.lang.String (m), WRAPPED] (LINE:96))
                      (wrap java.lang.Object:0x002b: INVOKE 
                      (wrap l.ￛﾚￖﾫ￡ﾩﾴ:0x0021: INVOKE 
                      (wrap l.ￛﾚￖﾫ￡ﾩﾴ:0x0018: INVOKE 
                      (wrap java.util.Set:0x0016: CHECK_CAST (java.util.Set) (wrap java.lang.Object:0x0012: INVOKE (r3v1 'entry' java.util.Map$Entry) INTERFACE call: java.util.Map.Entry.getValue():java.lang.Object A[MD:():V (c), WRAPPED] (LINE:97)))
                     STATIC call: l.ￛﾡￜ﾿￡ﾩﾴ.stream(java.util.Collection):l.ￛﾚￖﾫ￡ﾩﾴ A[MD:(java.util.Collection):l.ￛﾚￖﾫ￡ﾩﾴ (m), WRAPPED] (LINE:97))
                      (wrap java.util.function.Function:0x001e: CONSTRUCTOR (r0v2 'c12118' l.ￛﾫￛﾖￛﾤ) A[MD:(l.ￛﾫￛﾖￛﾤ):void (m), WRAPPED] call: l.ￛﾘￛﾖￛﾤ.<init>(l.ￛﾫￛﾖￛﾤ):void type: CONSTRUCTOR)
                     INTERFACE call: l.ￛﾚￖﾫ￡ﾩﾴ.map(java.util.function.Function):l.ￛﾚￖﾫ￡ﾩﾴ A[MD:(java.util.function.Function):l.ￛﾚￖﾫ￡ﾩﾴ (m), WRAPPED] (LINE:98))
                      (wrap l.ￜﾳￜﾳ￡ﾩﾴ:0x0027: INVOKE (",
                    ") STATIC call: l.ￖﾫￜﾳ￡ﾩﾴ.joining(java.lang.CharSequence):l.ￜﾳￜﾳ￡ﾩﾴ A[MD:(java.lang.CharSequence):l.ￜﾳￜﾳ￡ﾩﾴ (m), WRAPPED] (LINE:99))
                     INTERFACE call: l.ￛﾚￖﾫ￡ﾩﾴ.collect(l.ￜﾳￜﾳ￡ﾩﾴ):java.lang.Object A[MD:(l.ￜﾳￜﾳ￡ﾩﾴ):java.lang.Object (m), WRAPPED] (LINE:99))
                     A[WRAPPED] (LINE:99) elemType: java.lang.Object)
                     STATIC call: java.lang.String.format(java.lang.String, java.lang.Object[]):java.lang.String A[MD:(java.lang.String, java.lang.Object[]):java.lang.String VARARG (c), VARARG_CALL, WRAPPED] (LINE:96))
                     VIRTUAL call: java.lang.String.concat(java.lang.String):java.lang.String A[MD:(java.lang.String):java.lang.String (c), WRAPPED] (LINE:96))
                     (LINE:96) in method: l.ￖﾨￛﾖￛﾤ.apply(java.lang.Object):java.lang.Object, file: classes2.dex
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
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: l.ￛﾘￛﾖￛﾤ, state: NOT_LOADED
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
                    int r0 = r2.f3455
                    switch(r0) {
                        case 0: goto L27;
                        case 1: goto L1c;
                        default: goto L5;
                    }
                L5:
                    java.lang.Object r0 = r2.f3456
                    l.ܰ᩹ۤ r0 = (l.C14110) r0
                    java.lang.Integer r3 = (java.lang.Integer) r3
                    java.lang.StringBuilder r3 = new java.lang.StringBuilder
                    java.lang.String r1 = "#"
                    r3.<init>(r1)
                    int r0 = r0.f17268
                    r3.append(r0)
                    java.lang.String r3 = r3.toString()
                    return r3
                L1c:
                    java.lang.Object r0 = r2.f3456
                    com.google.android.material.color.utilities.MaterialDynamicColors r0 = (com.google.android.material.color.utilities.MaterialDynamicColors) r0
                    com.google.android.material.color.utilities.DynamicScheme r3 = (com.google.android.material.color.utilities.DynamicScheme) r3
                    com.google.android.material.color.utilities.ToneDeltaPair r3 = com.google.android.material.color.utilities.MaterialDynamicColors.$r8$lambda$BFmGIXcWi4f4p2BcAJRzW9LQ2ls(r0, r3)
                    return r3
                L27:
                    java.lang.Object r0 = r2.f3456
                    l.۫ۖۤ r0 = (l.C12118) r0
                    java.util.Map$Entry r3 = (java.util.Map.Entry) r3
                    java.lang.String r3 = l.C12118.m30159(r0, r3)
                    return r3
                */
                throw new UnsupportedOperationException("Method not decompiled: l.C0827.apply(java.lang.Object):java.lang.Object");
            }
        }
