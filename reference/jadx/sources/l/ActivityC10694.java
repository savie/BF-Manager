package l;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Base64;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import bin.mt.plus.R;
import java.util.Collections;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: renamed from: l.ۤۜۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: G16V */
/* JADX INFO: loaded from: classes4.dex */
public class ActivityC10694 extends AbstractActivityC17204 implements AdapterView.OnItemClickListener, AdapterView.OnItemLongClickListener {

    /* JADX INFO: renamed from: ܳ᩷, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f33933 = 0;

    /* JADX INFO: renamed from: ᩴ᩷, reason: not valid java name and contains not printable characters */
    public List f33934 = Collections.EMPTY_LIST;

    /* JADX INFO: renamed from: ᩸᩷, reason: not valid java name and contains not printable characters */
    public C21883 f33935;

    @Override // l.AbstractActivityC17204
    /* JADX INFO: renamed from: ᩶ */
    public final String mo122() {
        return "SchemeManagerActivity";
    }

    @Override // l.AbstractActivityC17204, l.ActivityC7405, l.ActivityC3409, l.ActivityC5577, l.ActivityC8866, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m40418(R.string.MT_Protector);
        m40418(R.layout.MT_Protector);
        this.f56046 = (C16390) m40418(R.id.MT_Protector);
        ListView listView = (ListView) m40418(android.R.id.list);
        m40407(this.f56046);
        m40393();
        this.f56046.setNavigationOnClickListener(new ViewOnClickListenerC23960(2, this));
        this.f33934 = C16704.m39467();
        C21883 c21883 = new C21883(this);
        this.f33935 = c21883;
        listView.setAdapter((ListAdapter) c21883);
        listView.setOnItemClickListener(this);
        listView.setOnItemLongClickListener(this);
    }

    @Override // l.AbstractActivityC17204, l.ActivityC3409, android.app.Activity
    public final void onResume() {
        super.onResume();
        this.f33934 = C16704.m39467();
        this.f33935.notifyDataSetChanged();
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.MT_Protector, menu);
        return true;
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == R.id.MT_Protector) {
            C7009 c7009 = new C7009(this, this);
            c7009.m22945(R.string.MT_Protector);
            c7009.m22918();
            c7009.m22957(6);
            c7009.m22955(true);
            return true;
        }
        if (itemId != R.id.MT_Protector) {
            return false;
        }
        try {
            C20348 c20348M46740 = C20348.m46740(Base64.decode(C21576.m49080().trim(), 3));
            C17364.m40795((InterfaceC15872) c20348M46740, -2106428910);
            String strM46758 = c20348M46740.m46758();
            String strM46759 = c20348M46740.m46758();
            if (strM46759.hashCode() != c20348M46740.readInt()) {
                throw new Exception();
            }
            C24910 c24910 = new C24910(C16704.m39470(strM46758));
            c24910.m55496(new JSONObject(strM46759));
            C16704.m39465(c24910);
            this.f33934 = C16704.m39467();
            this.f33935.notifyDataSetChanged();
            C22673.m51152(R.string.MT_Protector);
            return true;
        } catch (Exception unused) {
            C22673.m51152(R.string.MT_Protector);
            return true;
        }
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        String str = (String) this.f33934.get(i);
        Intent intent = new Intent(this, (Class<?>) ActivityC2534.class);
        intent.putExtra("schemeName", str);
        startActivity(intent);
    }

    @Override // android.widget.AdapterView.OnItemLongClickListener
    public final boolean onItemLongClick(AdapterView adapterView, View view, final int i, long j) {
        C18452 c18452 = new C18452(this, view, 0);
        c18452.m42995().add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
        c18452.m42995().add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
        c18452.m42995().add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
        c18452.m42995().add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
        c18452.m42994(new InterfaceC21436() { // from class: l.۠۠ۤ
            @Override // l.InterfaceC21436
            public final boolean onMenuItemClick(MenuItem menuItem) {
                ActivityC10694.m27240(this.f27799, i, menuItem);
                return true;
            }
        });
        C22744.m51282(view, c18452);
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m27240(ActivityC10694 activityC10694, int i, MenuItem menuItem) {
        String str = (String) activityC10694.f33934.get(i);
        int i2 = 3;
        if (menuItem.getItemId() == R.string.MT_Protector) {
            try {
                String string = C16704.m39466(str).m55497().toString();
                C6178 c6178 = new C6178();
                c6178.writeInt(-2106428910);
                c6178.m17800(str);
                c6178.m17800(string);
                c6178.writeInt(string.hashCode());
                C21576.m49067((CharSequence) Base64.encodeToString(c6178.m17792(), 3));
                return;
            } catch (Exception e) {
                activityC10694.m40401(e, (DialogInterface.OnDismissListener) null);
                return;
            }
        }
        int i3 = 1;
        if (menuItem.getItemId() == R.string.MT_Protector) {
            C13720 c13720 = new C13720(activityC10694, activityC10694, str);
            c13720.m22945(R.string.MT_Protector);
            c13720.m22924((CharSequence) str);
            c13720.m22918();
            c13720.m22957(6);
            c13720.m22959();
            c13720.m22955(true);
            return;
        }
        if (menuItem.getItemId() == R.string.MT_Protector) {
            int i4 = DialogInterfaceC8327.f27315;
            C2361 c2361 = new C2361(activityC10694);
            c2361.m8021(R.string.MT_Protector);
            c2361.m8008(activityC10694.getString(R.string.MT_Protector, str));
            c2361.m8026(R.string.MT_Protector, new DialogInterfaceOnClickListenerC23137(i3, activityC10694, str));
            c2361.m8022(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
            c2361.m8016();
            return;
        }
        String string2 = str + 2;
        while (C16704.m39468(string2)) {
            StringBuilder sbM27333 = C10732.m27333(str);
            sbM27333.append(i2);
            string2 = sbM27333.toString();
            i2++;
        }
        C4729 c4729 = new C4729(activityC10694, activityC10694, str);
        c4729.m22945(R.string.MT_Protector);
        c4729.m22924((CharSequence) string2);
        c4729.m22918();
        c4729.m22957(6);
        c4729.m22959();
        c4729.m22955(true);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m27241(ActivityC10694 activityC10694, String str) {
        C16704.m39463(str);
        activityC10694.f33934 = C16704.m39467();
        activityC10694.f33935.notifyDataSetChanged();
    }
}
