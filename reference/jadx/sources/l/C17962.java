package l;

import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ᩳۢۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: I1KV */
/* JADX INFO: loaded from: classes5.dex */
public final class C17962 extends AbstractDialogInterfaceOnClickListenerC17341 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewOnClickListenerC15847 f57452;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f57453;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17962(ViewOnClickListenerC15847 viewOnClickListenerC15847, AbstractActivityC12483 abstractActivityC12483, String str) {
        super(abstractActivityC12483, -1);
        this.f57452 = viewOnClickListenerC15847;
        this.f57453 = str;
    }

    @Override // l.AbstractDialogInterfaceOnClickListenerC17341
    /* JADX INFO: renamed from: ᩴ */
    public final void mo1069() {
        String lowerCase = m40352().toLowerCase();
        if (lowerCase.isEmpty()) {
            m40364();
            return;
        }
        if (!lowerCase.matches("[a-z0-9^\\-]+")) {
            m40365(R.string.MT_Protector);
            return;
        }
        StringBuilder sb = new StringBuilder();
        String str = this.f57453;
        sb.append(str);
        sb.append("/");
        sb.append(lowerCase);
        sb.append("/type-info");
        String string = sb.toString();
        ViewOnClickListenerC15847 viewOnClickListenerC15847 = this.f57452;
        if (viewOnClickListenerC15847.f51287.m21609(string)) {
            m40365(R.string.MT_Protector);
            return;
        }
        C18597 c18597M21600 = viewOnClickListenerC15847.f51287.m21600(str);
        int size = c18597M21600.size() + 1;
        while (c18597M21600.contains(size)) {
            size++;
        }
        try {
            viewOnClickListenerC15847.f51287.m21576(string, "<?xml version='1.0' encoding='utf-8' ?>\n" + String.format("<type id=\"0x%02x\">\n", Integer.valueOf(size)) + String.format("    <entry id=\"0x%02x%02x0000\" name=\"todo\" />\n", Integer.valueOf(viewOnClickListenerC15847.f51287.m21574(127, str)), Integer.valueOf(size)) + "</type>\n");
            viewOnClickListenerC15847.m37734();
            viewOnClickListenerC15847.m37735(string);
            m40364();
        } catch (Exception e) {
            viewOnClickListenerC15847.f51295.m42627((Throwable) e);
        }
    }
}
