package l;

import java.util.Map;
import java.util.Set;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ᩳۖۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: 97F2 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C17761 implements Function {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f56339;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f56340;

    public /* synthetic */ C17761(int i, Object obj) {
        this.f56339 = i;
        this.f56340 = obj;
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
        switch (this.f56339) {
            case 0:
                C12118 c12118 = (C12118) this.f56340;
                Map.Entry entry = (Map.Entry) obj;
                return c12118.m18212(9, "provides").concat(String.format("%s with%n%s;%n", ((C15646) entry.getKey()).toString(), C9030.stream((Set) entry.getValue()).map(
                /*  JADX ERROR: Method code generation error
                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x002e: RETURN 
                      (wrap java.lang.String:0x002a: INVOKE 
                      (wrap java.lang.String:0x0004: INVOKE (r0v2 'c12118' l.ￛﾫￛﾖￛﾤ), (9 int), ("provides") VIRTUAL call: l.ￛﾜￛﾨￛﾤ.ￛﾙ(int, java.lang.String):java.lang.String A[MD:(int, java.lang.String):java.lang.String (m), WRAPPED] (LINE:120))
                      (wrap java.lang.String:0x003a: INVOKE 
                      ("%s with%n%s;%n")
                      (wrap java.lang.Object[]:0x0030: FILLED_NEW_ARRAY 
                      (wrap java.lang.String:0x000e: INVOKE 
                      (wrap l.ￜﾺￛﾖￛﾤ:0x000c: CHECK_CAST (l.ￜﾺￛﾖￛﾤ) (wrap java.lang.Object:0x0008: INVOKE (r3v1 'entry' java.util.Map$Entry) INTERFACE call: java.util.Map.Entry.getKey():java.lang.Object A[MD:():K (c), WRAPPED] (LINE:121)))
                     VIRTUAL call: l.￡ﾩﾶￛﾖￛﾤ.toString():java.lang.String A[MD:():java.lang.String (m), WRAPPED] (LINE:121))
                      (wrap java.lang.Object:0x002b: INVOKE 
                      (wrap l.ￛﾚￖﾫ￡ﾩﾴ:0x0021: INVOKE 
                      (wrap l.ￛﾚￖﾫ￡ﾩﾴ:0x0018: INVOKE 
                      (wrap java.util.Set:0x0016: CHECK_CAST (java.util.Set) (wrap java.lang.Object:0x0012: INVOKE (r3v1 'entry' java.util.Map$Entry) INTERFACE call: java.util.Map.Entry.getValue():java.lang.Object A[MD:():V (c), WRAPPED] (LINE:122)))
                     STATIC call: l.ￛﾡￜ﾿￡ﾩﾴ.stream(java.util.Collection):l.ￛﾚￖﾫ￡ﾩﾴ A[MD:(java.util.Collection):l.ￛﾚￖﾫ￡ﾩﾴ (m), WRAPPED] (LINE:122))
                      (wrap java.util.function.Function:0x001e: CONSTRUCTOR (r0v2 'c12118' l.ￛﾫￛﾖￛﾤ) A[MD:(l.ￛﾫￛﾖￛﾤ):void (m), WRAPPED] call: l.ￛﾜￛﾖￛﾤ.<init>(l.ￛﾫￛﾖￛﾤ):void type: CONSTRUCTOR)
                     INTERFACE call: l.ￛﾚￖﾫ￡ﾩﾴ.map(java.util.function.Function):l.ￛﾚￖﾫ￡ﾩﾴ A[MD:(java.util.function.Function):l.ￛﾚￖﾫ￡ﾩﾴ (m), WRAPPED] (LINE:123))
                      (wrap l.ￜﾳￜﾳ￡ﾩﾴ:0x0027: INVOKE (",
                    ") STATIC call: l.ￖﾫￜﾳ￡ﾩﾴ.joining(java.lang.CharSequence):l.ￜﾳￜﾳ￡ﾩﾴ A[MD:(java.lang.CharSequence):l.ￜﾳￜﾳ￡ﾩﾴ (m), WRAPPED] (LINE:124))
                     INTERFACE call: l.ￛﾚￖﾫ￡ﾩﾴ.collect(l.ￜﾳￜﾳ￡ﾩﾴ):java.lang.Object A[MD:(l.ￜﾳￜﾳ￡ﾩﾴ):java.lang.Object (m), WRAPPED] (LINE:124))
                     A[WRAPPED] (LINE:124) elemType: java.lang.Object)
                     STATIC call: java.lang.String.format(java.lang.String, java.lang.Object[]):java.lang.String A[MD:(java.lang.String, java.lang.Object[]):java.lang.String VARARG (c), VARARG_CALL, WRAPPED] (LINE:121))
                     VIRTUAL call: java.lang.String.concat(java.lang.String):java.lang.String A[MD:(java.lang.String):java.lang.String (c), WRAPPED] (LINE:121))
                     (LINE:121) in method: l.￡ﾩﾳￛﾖￛﾤ.apply(java.lang.Object):java.lang.Object, file: classes5.dex
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
                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: l.ￛﾜￛﾖￛﾤ, state: NOT_LOADED
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
                    int r0 = r2.f56339
                    switch(r0) {
                        case 0: goto L24;
                        case 1: goto L12;
                        default: goto L5;
                    }
                L5:
                    java.lang.Object r0 = r2.f56340
                    android.widget.EditText r0 = (android.widget.EditText) r0
                    java.lang.CharSequence r3 = (java.lang.CharSequence) r3
                    int r1 = r3.length()
                    if (r1 == 0) goto L2f
                    goto L33
                L12:
                    java.lang.Object r0 = r2.f56340
                    java.lang.String r0 = (java.lang.String) r0
                    java.lang.String r3 = (java.lang.String) r3
                    java.lang.String r3 = l.C15489.m37076(r0, r3)
                    r0 = 0
                    java.lang.String[] r0 = new java.lang.String[r0]
                    l.᩷۠ۚ r3 = l.C5553.m15313(r3, r0)
                    return r3
                L24:
                    java.lang.Object r0 = r2.f56340
                    l.۫ۖۤ r0 = (l.C12118) r0
                    java.util.Map$Entry r3 = (java.util.Map.Entry) r3
                    java.lang.String r3 = l.C12118.m30160(r0, r3)
                    return r3
                L2f:
                    android.text.Editable r3 = r0.getText()
                L33:
                    return r3
                */
                throw new UnsupportedOperationException("Method not decompiled: l.C17761.apply(java.lang.Object):java.lang.Object");
            }
        }
