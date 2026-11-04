package l;

import android.content.Intent;
import android.widget.TextView;
import bin.mt.plugin.api.ui.PluginUI;
import bin.mt.plugin.api.ui.builder.PluginUIBuilder;
import bin.mt.plugin.api.ui.dialog.LoadingDialog;
import bin.mt.plugin.api.util.Consumer;

/* JADX INFO: renamed from: l.ۤܰۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: G1PO */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C10912 implements InterfaceC17544, InterfaceC10523, Consumer, InterfaceC16025, InterfaceC22615 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f34543;

    public /* synthetic */ C10912(Object obj) {
        this.f34543 = obj;
    }

    @Override // bin.mt.plugin.api.util.Consumer
    public void accept(Object obj) {
        LoadingDialog.lambda$new$0((PluginUI) this.f34543, (PluginUIBuilder) obj);
    }

    @Override // l.InterfaceC17544
    /* JADX INFO: renamed from: ۙ */
    public void mo1209(int i) {
        ((C25085) this.f34543).mo16839(i);
    }

    @Override // l.InterfaceC16025
    /* JADX INFO: renamed from: ۙ */
    public void mo8384(Intent intent, int i) {
        ActivityC3846.m12406((ActivityC3846) this.f34543, i, intent);
    }

    @Override // l.InterfaceC22615
    public Object construct() {
        Class cls = (Class) this.f34543;
        try {
            return AbstractC3223.f10514.mo10572(cls);
        } catch (Exception e) {
            throw new RuntimeException(C20551.m47117(cls, "Unable to create instance of ", ". Registering an InstanceCreator or a TypeAdapter for this type, or adding a no-args constructor may fix this problem."), e);
        }
    }

    @Override // l.InterfaceC10523
    public void accept(TextView textView) {
        ViewOnClickListenerC15284.m36687(textView, (CharSequence) this.f34543);
    }
}
