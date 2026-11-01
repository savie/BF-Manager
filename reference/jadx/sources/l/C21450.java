package l;

/* JADX INFO: renamed from: l.᩸۠ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: A186 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C21450 implements InterfaceC21574, InterfaceC17547, InterfaceC21921, InterfaceC1692 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f69730;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f69731;

    public /* synthetic */ C21450(int i, Object obj) {
        this.f69730 = i;
        this.f69731 = obj;
    }

    @Override // l.InterfaceC1692
    public /* synthetic */ void onCanceled() {
    }

    @Override // l.InterfaceC21921
    /* JADX INFO: renamed from: ۙ */
    public void mo1855(int i) {
        switch (this.f69730) {
            case 2:
                ((C13520) this.f69731).mo21455(i);
                break;
            default:
                ((InterfaceC24022) this.f69731).mo18421(i);
                break;
        }
    }

    @Override // l.InterfaceC1692
    /* JADX INFO: renamed from: ۙ */
    public void mo3908(String str) {
        ViewOnClickListenerC3520 viewOnClickListenerC3520 = (ViewOnClickListenerC3520) this.f69731;
        viewOnClickListenerC3520.m10355(
        /*  JADX ERROR: Method code generation error
            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0004: INVOKE 
              (r0v1 'viewOnClickListenerC3520' l.ￛﾗ￡ﾩﾹￛﾜ)
              (wrap java.lang.Runnable:0x0002: CONSTRUCTOR (r0v1 'viewOnClickListenerC3520' l.ￛﾗ￡ﾩﾹￛﾜ), (r2v0 'str' java.lang.String) A[MD:(l.ￛﾗ￡ﾩﾹￛﾜ, java.lang.String):void (m), WRAPPED] (LINE:181) call: l.ￛﾬ￡ﾩﾹￛﾜ.<init>(l.ￛﾗ￡ﾩﾹￛﾜ, java.lang.String):void type: CONSTRUCTOR)
             DIRECT call: l.ￛﾗ￡ﾩﾹￛﾜ.ￛﾙ(java.lang.Runnable):void A[MD:(java.lang.Runnable):void (m)] (LINE:181) in method: l.￡ﾩﾸￛﾠￛﾚ.ￛﾙ(java.lang.String):void, file: classes5.dex
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
            	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
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
            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: l.ￛﾬ￡ﾩﾹￛﾜ, state: NOT_LOADED
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
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
            	... 15 more
            */
        /*
            this = this;
            java.lang.Object r0 = r1.f69731
            l.ۗ᩹ۜ r0 = (l.ViewOnClickListenerC3520) r0
            l.ViewOnClickListenerC3520.m10374(r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C21450.mo3908(java.lang.String):void");
    }

    @Override // l.InterfaceC21574
    /* JADX INFO: renamed from: ܰ */
    public void mo14999(int i) {
        ViewOnClickListenerC23253.m51314((ViewOnClickListenerC23253) this.f69731, i);
    }

    @Override // l.InterfaceC6258
    /* JADX INFO: renamed from: ۙ */
    public void mo4798(AbstractC20745 abstractC20745) {
        abstractC20745.m46703((byte[]) this.f69731);
    }
}
