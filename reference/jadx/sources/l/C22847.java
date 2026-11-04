package l;

import bin.mt.plugin.api.ui.PluginTextView;
import bin.mt.plugin.api.util.Consumer;

/* JADX INFO: renamed from: l.᩸ܰۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: G1PO */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C22847 implements InterfaceC17855, Consumer {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f74224;

    public /* synthetic */ C22847(Object obj) {
        this.f74224 = obj;
    }

    @Override // bin.mt.plugin.api.util.Consumer
    public void accept(Object obj) {
        ((PluginTextView) this.f74224).setText((CharSequence) obj);
    }
}
