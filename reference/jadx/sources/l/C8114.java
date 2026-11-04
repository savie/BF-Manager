package l;

import android.content.Intent;
import android.view.MenuItem;
import android.widget.TextView;
import bin.mt.plus.R;
import java.io.InputStream;

/* JADX INFO: renamed from: l.۟᩵ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: A186 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C8114 implements InterfaceC1733, InterfaceC16025, InterfaceC10523, InterfaceC3735, InterfaceC17544, InterfaceC0073, InterfaceC18006, InterfaceC21436 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f26781;

    public /* synthetic */ C8114(Object obj) {
        this.f26781 = obj;
    }

    @Override // l.InterfaceC10523
    public void accept(TextView textView) {
        C22501 c22501 = (C22501) this.f26781;
        c22501.f72798.m15908(R.string.MT_Protector, new C21755(c22501, textView));
    }

    @Override // l.InterfaceC3735
    public InputStream getAssetsAsStream(String str) {
        return C18300.m42636((C18300) this.f26781, str);
    }

    @Override // l.InterfaceC21436
    public boolean onMenuItemClick(MenuItem menuItem) {
        ActivityC11563.m29087((ActivityC11563) this.f26781, menuItem);
        return true;
    }

    @Override // l.InterfaceC0073
    /* JADX INFO: renamed from: ۙ */
    public /* synthetic */ void mo1127() {
    }

    @Override // l.InterfaceC17544
    /* JADX INFO: renamed from: ۙ */
    public void mo1209(int i) {
        ((InterfaceC16793) this.f26781).mo13596(i);
    }

    @Override // l.InterfaceC16025
    /* JADX INFO: renamed from: ۙ */
    public void mo8384(Intent intent, int i) {
        C20175.m46420((C20175) this.f26781, i, intent);
    }

    @Override // l.InterfaceC18006
    /* JADX INFO: renamed from: ۙ */
    public void mo1736(Object obj) {
        C1965.m6749((C1965) this.f26781);
    }

    @Override // l.InterfaceC0073
    /* JADX INFO: renamed from: ۙ */
    public void mo1128(String str) {
        ViewOnClickListenerC19404 viewOnClickListenerC19404 = (ViewOnClickListenerC19404) this.f26781;
        viewOnClickListenerC19404.m44872(
        /*  JADX ERROR: Method code generation error
            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0004: INVOKE 
              (r0v1 'viewOnClickListenerC19404' l.￡ﾩﾳ￡ﾩﾺￛﾧ)
              (wrap java.lang.Runnable:0x0002: CONSTRUCTOR (r0v1 'viewOnClickListenerC19404' l.￡ﾩﾳ￡ﾩﾺￛﾧ), (r2v0 'str' java.lang.String) A[MD:(l.￡ﾩﾳ￡ﾩﾺￛﾧ, java.lang.String):void (m), WRAPPED] (LINE:181) call: l.￡ﾩﾴ￡ﾩﾺￛﾧ.<init>(l.￡ﾩﾳ￡ﾩﾺￛﾧ, java.lang.String):void type: CONSTRUCTOR)
             DIRECT call: l.￡ﾩﾳ￡ﾩﾺￛﾧ.ￛﾙ(java.lang.Runnable):void A[MD:(java.lang.Runnable):void (m)] (LINE:181) in method: l.ￛﾟ￡ﾩﾵ￡ﾩﾴ.ￛﾙ(java.lang.String):void, file: classes4.dex
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
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: l.￡ﾩﾴ￡ﾩﾺￛﾧ, state: NOT_LOADED
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
            java.lang.Object r0 = r1.f26781
            l.ᩳ᩺ۧ r0 = (l.ViewOnClickListenerC19404) r0
            l.ViewOnClickListenerC19404.m44892(r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C8114.mo1128(java.lang.String):void");
    }

    @Override // l.InterfaceC11427
    /* JADX INFO: renamed from: ۙ */
    public void mo14029(AbstractC22044 abstractC22044) {
        abstractC22044.m49879((String) this.f26781);
    }
}
