package bin.mt.json;

import bin.mt.plugin.api.ui.PluginCompoundButton;
import bin.mt.plugin.api.ui.PluginEditText;
import bin.mt.plugin.api.ui.PluginRadioGroup;
import bin.mt.plugin.api.ui.PluginSpinner;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l.C12351;
import l.C1486;
import l.C14909;
import l.C19385;
import l.C4681;
import l.C8198;

/* JADX INFO: loaded from: classes.dex */
public class JSONObject extends JSONValue implements Iterable {
    public final List names;
    public transient C19385 table;
    public final List values;

    private synchronized void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        this.table = new C19385();
        updateHashIndex();
    }

    @Override // bin.mt.json.JSONValue
    public JSONObject asObject() {
        return this;
    }

    @Override // bin.mt.json.JSONValue
    public boolean isObject() {
        return true;
    }

    public JSONObject() {
        this.names = new ArrayList();
        this.values = new ArrayList();
        this.table = new C19385();
    }

    public JSONObject(String str) {
        this();
        if (str == null) {
            throw new NullPointerException("source is null");
        }
        new JSONParser(new C14909()).parseObject(this, str);
    }

    public JSONObject(JSONObject jSONObject) {
        this(jSONObject, false);
    }

    public JSONObject(JSONObject jSONObject, boolean z) {
        if (jSONObject == null) {
            throw new NullPointerException("object is null");
        }
        if (z) {
            this.names = C4681.unmodifiableList(jSONObject.names);
            this.values = C4681.unmodifiableList(jSONObject.values);
        } else {
            this.names = new ArrayList(jSONObject.names);
            this.values = new ArrayList(jSONObject.values);
        }
        this.table = new C19385();
        updateHashIndex();
    }

    public static JSONObject unmodifiableObject(JSONObject jSONObject) {
        return new JSONObject(jSONObject, true);
    }

    public JSONObject add(String str, int i) {
        add(str, JSON.value(i));
        return this;
    }

    public JSONObject add(String str, long j) {
        add(str, JSON.value(j));
        return this;
    }

    public JSONObject add(String str, float f) {
        add(str, JSON.value(f));
        return this;
    }

    public JSONObject add(String str, double d) {
        add(str, JSON.value(d));
        return this;
    }

    public JSONObject add(String str, boolean z) {
        add(str, JSON.value(z));
        return this;
    }

    public JSONObject add(String str, String str2) {
        add(str, JSON.value(str2));
        return this;
    }

    public JSONObject add(String str, JSONValue jSONValue) {
        if (str == null) {
            throw new NullPointerException("name is null");
        }
        if (jSONValue == null) {
            throw new NullPointerException("value is null");
        }
        this.table.m44829(str, this.names.size());
        this.names.add(str);
        this.values.add(jSONValue);
        return this;
    }

    public JSONObject putText(PluginEditText pluginEditText) {
        put(pluginEditText.requireId(), pluginEditText.getText().toString());
        return this;
    }

    public JSONObject putChecked(PluginCompoundButton pluginCompoundButton) {
        put(pluginCompoundButton.requireId(), pluginCompoundButton.isChecked());
        return this;
    }

    public JSONObject putSelection(PluginSpinner pluginSpinner) {
        put(pluginSpinner.requireId(), pluginSpinner.getSelection());
        return this;
    }

    public JSONObject putCheckedPosition(PluginRadioGroup pluginRadioGroup) {
        put(pluginRadioGroup.getId(), pluginRadioGroup.getCheckedRadioButtonPosition());
        return this;
    }

    public JSONObject putCheckedId(PluginRadioGroup pluginRadioGroup) {
        put(pluginRadioGroup.getId(), pluginRadioGroup.getCheckedRadioButtonId());
        return this;
    }

    public JSONObject put(String str, int i) {
        put(str, JSON.value(i));
        return this;
    }

    public JSONObject put(String str, long j) {
        put(str, JSON.value(j));
        return this;
    }

    public JSONObject put(String str, float f) {
        put(str, JSON.value(f));
        return this;
    }

    public JSONObject put(String str, double d) {
        put(str, JSON.value(d));
        return this;
    }

    public JSONObject put(String str, boolean z) {
        put(str, JSON.value(z));
        return this;
    }

    public JSONObject put(String str, String str2) {
        put(str, JSON.value(str2));
        return this;
    }

    public JSONObject put(String str, JSONValue jSONValue) {
        if (str == null) {
            throw new NullPointerException("name is null");
        }
        if (jSONValue == null) {
            throw new NullPointerException("value is null");
        }
        int iIndexOf = indexOf(str);
        if (iIndexOf != -1) {
            this.values.set(iIndexOf, jSONValue);
            return this;
        }
        this.table.m44829(str, this.names.size());
        this.names.add(str);
        this.values.add(jSONValue);
        return this;
    }

    public JSONObject remove(String str) {
        if (str == null) {
            throw new NullPointerException("name is null");
        }
        int iIndexOf = indexOf(str);
        if (iIndexOf != -1) {
            this.table.m44828(iIndexOf);
            this.names.remove(iIndexOf);
            this.values.remove(iIndexOf);
        }
        return this;
    }

    public boolean contains(String str) {
        return this.names.contains(str);
    }

    public JSONObject merge(JSONObject jSONObject) {
        if (jSONObject == null) {
            throw new NullPointerException("object is null");
        }
        Iterator it = jSONObject.iterator();
        while (it.hasNext()) {
            Member member = (Member) it.next();
            put(member.name, member.value);
        }
        return this;
    }

    public JSONValue get(String str) {
        if (str == null) {
            throw new NullPointerException("name is null");
        }
        int iIndexOf = indexOf(str);
        if (iIndexOf != -1) {
            return (JSONValue) this.values.get(iIndexOf);
        }
        return null;
    }

    public JSONObject getJSONObject(String str) {
        JSONValue jSONValue = get(str);
        if (jSONValue == null || jSONValue.isNull()) {
            return null;
        }
        return jSONValue.asObject();
    }

    public JSONArray getJSONArray(String str) {
        JSONValue jSONValue = get(str);
        if (jSONValue == null || jSONValue.isNull()) {
            return null;
        }
        return jSONValue.asArray();
    }

    public int getInt(String str, int i) {
        JSONValue jSONValue = get(str);
        return jSONValue != null ? jSONValue.asInt() : i;
    }

    public int getInt(String str) {
        return getInt(str, 0);
    }

    public Integer getIntegerObject(String str) {
        JSONValue jSONValue = get(str);
        if (jSONValue == null || jSONValue.isNull()) {
            return null;
        }
        return Integer.valueOf(jSONValue.asInt());
    }

    public long getLong(String str, long j) {
        JSONValue jSONValue = get(str);
        return jSONValue != null ? jSONValue.asLong() : j;
    }

    public long getLong(String str) {
        return getLong(str, 0L);
    }

    public Long getLongObject(String str) {
        JSONValue jSONValue = get(str);
        if (jSONValue == null || jSONValue.isNull()) {
            return null;
        }
        return Long.valueOf(jSONValue.asLong());
    }

    public float getFloat(String str, float f) {
        JSONValue jSONValue = get(str);
        return jSONValue != null ? jSONValue.asFloat() : f;
    }

    public float getFloat(String str) {
        return getFloat(str, 0.0f);
    }

    public Float getFloatObject(String str) {
        JSONValue jSONValue = get(str);
        if (jSONValue == null || jSONValue.isNull()) {
            return null;
        }
        return Float.valueOf(jSONValue.asFloat());
    }

    public double getDouble(String str, double d) {
        JSONValue jSONValue = get(str);
        return jSONValue != null ? jSONValue.asDouble() : d;
    }

    public double getDouble(String str) {
        return getDouble(str, 0.0d);
    }

    public Double getDoubleObject(String str) {
        JSONValue jSONValue = get(str);
        if (jSONValue == null || jSONValue.isNull()) {
            return null;
        }
        return Double.valueOf(jSONValue.asDouble());
    }

    public boolean getBoolean(String str, boolean z) {
        JSONValue jSONValue = get(str);
        return jSONValue != null ? jSONValue.asBoolean() : z;
    }

    public boolean getBoolean(String str) {
        return getBoolean(str, false);
    }

    public Boolean getBooleanObject(String str) {
        JSONValue jSONValue = get(str);
        if (jSONValue == null || jSONValue.isNull()) {
            return null;
        }
        return Boolean.valueOf(jSONValue.asBoolean());
    }

    public String getString(String str, String str2) {
        JSONValue jSONValue = get(str);
        return (jSONValue == null || jSONValue.isNull()) ? str2 : jSONValue.asString();
    }

    public String getString(String str) {
        return getString(str, null);
    }

    public int size() {
        return this.names.size();
    }

    public boolean isEmpty() {
        return this.names.isEmpty();
    }

    public List names() {
        return C4681.unmodifiableList(this.names);
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return new C8198(this, this.names.iterator(), this.values.iterator());
    }

    @Override // bin.mt.json.JSONValue
    public void write(C1486 c1486) throws IOException {
        c1486.mo5302();
        Iterator it = this.names.iterator();
        Iterator it2 = this.values.iterator();
        if (it.hasNext()) {
            c1486.m5300((String) it.next());
            c1486.mo5307();
            ((JSONValue) it2.next()).write(c1486);
            while (it.hasNext()) {
                c1486.mo5301();
                c1486.m5300((String) it.next());
                c1486.mo5307();
                ((JSONValue) it2.next()).write(c1486);
            }
        }
        c1486.mo5303();
    }

    @Override // bin.mt.json.JSONValue
    public int hashCode() {
        return this.values.hashCode() + ((this.names.hashCode() + 31) * 31);
    }

    @Override // bin.mt.json.JSONValue
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        JSONObject jSONObject = (JSONObject) obj;
        return this.names.equals(jSONObject.names) && this.values.equals(jSONObject.values);
    }

    public int indexOf(String str) {
        int iM44827 = this.table.m44827(str);
        return (iM44827 == -1 || !str.equals(this.names.get(iM44827))) ? this.names.lastIndexOf(str) : iM44827;
    }

    private void updateHashIndex() {
        int size = this.names.size();
        for (int i = 0; i < size; i++) {
            this.table.m44829((String) this.names.get(i), i);
        }
    }

    public class Member {
        public final String name;
        public final JSONValue value;

        public Member(String str, JSONValue jSONValue) {
            this.name = str;
            this.value = jSONValue;
        }

        public String getName() {
            return this.name;
        }

        public JSONValue getValue() {
            return this.value;
        }

        public int hashCode() {
            return this.value.hashCode() + C12351.m30817(31, 31, this.name);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            Member member = (Member) obj;
            return this.name.equals(member.name) && this.value.equals(member.value);
        }
    }
}
