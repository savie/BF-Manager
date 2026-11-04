package l;

import bin.mt.plus.R;

/* JADX INFO: renamed from: l.֫ܽۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: I1KV */
/* JADX INFO: loaded from: classes3.dex */
public final class C2053 extends AbstractDialogInterfaceOnClickListenerC8552 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewOnClickListenerC20698 f6821;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f6822;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2053(ViewOnClickListenerC20698 viewOnClickListenerC20698, AbstractActivityC17204 abstractActivityC17204, String str) {
        super(abstractActivityC17204, -1);
        this.f6821 = viewOnClickListenerC20698;
        this.f6822 = str;
    }

    @Override // l.AbstractDialogInterfaceOnClickListenerC8552
    /* JADX INFO: renamed from: ܶ */
    public final void mo1877() {
        String lowerCase = m22914().toLowerCase();
        if (lowerCase.isEmpty()) {
            m22951();
            return;
        }
        if (!lowerCase.matches("[a-z0-9^\\-]+")) {
            m22952(R.string.MT_Protector);
            return;
        }
        StringBuilder sb = new StringBuilder();
        String str = this.f6822;
        sb.append(str);
        sb.append("/");
        sb.append(lowerCase);
        sb.append("/type-info");
        String string = sb.toString();
        ViewOnClickListenerC20698 viewOnClickListenerC20698 = this.f6821;
        if (viewOnClickListenerC20698.f66350.m30009(string)) {
            m22952(R.string.MT_Protector);
            return;
        }
        C0594 c0594M30004 = viewOnClickListenerC20698.f66350.m30004(str);
        int size = c0594M30004.size() + 1;
        while (c0594M30004.contains(size)) {
            size++;
        }
        try {
            viewOnClickListenerC20698.f66350.m29973(string, "<?xml version='1.0' encoding='utf-8' ?>\n" + String.format("<type id=\"0x%02x\">\n", Integer.valueOf(size)) + String.format("    <entry id=\"0x%02x%02x0000\" name=\"todo\" />\n", Integer.valueOf(viewOnClickListenerC20698.f66350.m29971(127, str)), Integer.valueOf(size)) + "</type>\n");
            viewOnClickListenerC20698.m47363();
            viewOnClickListenerC20698.m47364(string);
            m22951();
        } catch (Exception e) {
            viewOnClickListenerC20698.f66353.m51299(e);
        }
    }
}
