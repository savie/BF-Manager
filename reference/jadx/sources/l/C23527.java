package l;

import android.graphics.Bitmap;

/* JADX INFO: renamed from: l.᩻ۜۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: 31PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C23527 implements InterfaceC16464, InterfaceC1692, InterfaceC3740 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f76169;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f76170;

    public /* synthetic */ C23527(int i, Object obj) {
        this.f76169 = i;
        this.f76170 = obj;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private final /* synthetic */ void m51831() {
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private final /* synthetic */ void m51832() {
    }

    @Override // l.InterfaceC1692
    public /* synthetic */ void onCanceled() {
    }

    @Override // l.InterfaceC1692
    /* JADX INFO: renamed from: ۙ */
    public void mo3908(String str) {
        switch (this.f76169) {
            case 0:
                ActivityC3541.m10447((ActivityC3541) this.f76170, str);
                break;
            default:
                ViewOnClickListenerC15847 viewOnClickListenerC15847 = (ViewOnClickListenerC15847) this.f76170;
                viewOnClickListenerC15847.m37715(
                /*  JADX ERROR: Method code generation error
                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0009: INVOKE 
                      (r0v4 'viewOnClickListenerC15847' l.ￜﾺￛﾢￛﾘ)
                      (wrap java.lang.Runnable:0x0002: CONSTRUCTOR (r0v4 'viewOnClickListenerC15847' l.ￜﾺￛﾢￛﾘ), (r2v0 'str' java.lang.String) A[MD:(l.ￜﾺￛﾢￛﾘ, java.lang.String):void (m), WRAPPED] (LINE:198) call: l.ￛﾬￛﾢￛﾘ.<init>(l.ￜﾺￛﾢￛﾘ, java.lang.String):void type: CONSTRUCTOR)
                     DIRECT call: l.ￜﾺￛﾢￛﾘ.ￛﾙ(java.lang.Runnable):void A[MD:(java.lang.Runnable):void (m)] (LINE:198) in method: l.￡ﾩﾻￛﾜￛﾜ.ￛﾙ(java.lang.String):void, file: classes.dex
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
                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: l.ￛﾬￛﾢￛﾘ, state: NOT_LOADED
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
                    	... 21 more
                    */
                /*
                    this = this;
                    int r0 = r1.f76169
                    switch(r0) {
                        case 0: goto Ld;
                        default: goto L5;
                    }
                L5:
                    java.lang.Object r0 = r1.f76170
                    l.ܺۢۘ r0 = (l.ViewOnClickListenerC15847) r0
                    l.ViewOnClickListenerC15847.m37732(r0, r2)
                    return
                Ld:
                    java.lang.Object r0 = r1.f76170
                    l.ۗ᩺ۜ r0 = (l.ActivityC3541) r0
                    l.ActivityC3541.m10447(r0, r2)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: l.C23527.mo3908(java.lang.String):void");
            }

            @Override // l.InterfaceC16464
            /* JADX INFO: renamed from: ۙ */
            public Bitmap mo947() {
                return C5443.m15057((InterfaceC13911) this.f76170);
            }

            @Override // l.InterfaceC3740
            /* JADX INFO: renamed from: ܰ */
            public Object mo1620() {
                throw new C9573((String) this.f76170);
            }
        }
