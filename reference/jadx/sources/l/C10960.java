package l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.Map;
import org.bouncycastle.i18n.TextBundle;
import org.simpleframework.xml.strategy.Name;

/* JADX INFO: renamed from: l.ۤܶܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: W6DR */
/* JADX INFO: loaded from: classes3.dex */
public final class C10960 extends BaseAdapter {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C2012 f34629;

    public C10960(C2012 c2012) {
        this.f34629 = c2012;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.f34629.f6699.f77249.size();
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        return this.f34629.f6699.f77249.get(i);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return ((Integer) this.f34629.f6699.f77249.get(i)).intValue();
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        C2012 c2012 = this.f34629;
        int iIntValue = ((Integer) c2012.f6699.f77249.get(i)).intValue();
        C16401 c16401 = view instanceof C16401 ? (C16401) view : new C16401(c2012.getContext());
        Map map = ((C20131) c2012.f6713.f50877.get(iIntValue)).f64695;
        String str = (String) map.get(TextBundle.TEXT_ENTRY);
        if (str == null || str.isEmpty()) {
            str = (String) map.get("hint-text");
        }
        if (str == null || str.isEmpty()) {
            str = (String) map.get("content-desc");
        }
        c16401.m38961(iIntValue, C2012.m6896((String) map.get(Name.LABEL)), str, c2012.f6699, c2012.f6715.m48699() != null && c2012.f6715.m48699().m4786() == iIntValue, new RunnableC4995(this, iIntValue), new RunnableC22149(this, iIntValue));
        return c16401;
    }
}
