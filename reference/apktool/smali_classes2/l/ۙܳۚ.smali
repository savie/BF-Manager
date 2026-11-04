.class public final Ll/ۙܳۚ;
.super Ljava/lang/Object;
.source "Z6BP"


# instance fields
.field public final ۙ:I

.field public final ۤ:Ljava/lang/StringBuilder;

.field public ᩷:I

.field public ᩸:Z


# direct methods
.method public constructor <init>(I)V
    .locals 1

    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 13
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iput-object v0, p0, Ll/ۙܳۚ;->ۤ:Ljava/lang/StringBuilder;

    .line 19
    iput p1, p0, Ll/ۙܳۚ;->ۙ:I

    return-void
.end method

.method public static ۙ(ILjava/lang/String;)Ljava/lang/String;
    .locals 2

    if-nez p1, :cond_0

    const-string p0, ""

    return-object p0

    .line 161
    :cond_0
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    if-gt v0, p0, :cond_1

    return-object p1

    :cond_1
    add-int/lit8 v0, p0, -0x1

    if-lez v0, :cond_2

    add-int/lit8 v1, p0, -0x2

    .line 163
    invoke-virtual {p1, v1}, Ljava/lang/String;->charAt(I)C

    move-result v1

    invoke-static {v1}, Ljava/lang/Character;->isHighSurrogate(C)Z

    move-result v1

    if-eqz v1, :cond_2

    add-int/lit8 v0, p0, -0x2

    .line 164
    :cond_2
    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v1, 0x0

    invoke-virtual {p1, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "\u2026"

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ۙ(Lbin/mt/json/JSONObject;)Ljava/lang/String;
    .locals 1

    const/16 v0, 0x800

    .line 23
    invoke-static {p0, v0}, Ll/ۙܳۚ;->ۙ(Lbin/mt/json/JSONObject;I)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ۙ(Lbin/mt/json/JSONObject;I)Ljava/lang/String;
    .locals 3

    .line 31
    new-instance v0, Ll/ۙܳۚ;

    invoke-direct {v0, p1}, Ll/ۙܳۚ;-><init>(I)V

    const-string v1, ""

    const/4 v2, 0x0

    .line 32
    invoke-direct {v0, v2, p0, v1}, Ll/ۙܳۚ;->ۙ(ILbin/mt/json/JSONValue;Ljava/lang/String;)V

    .line 33
    iget-boolean p0, v0, Ll/ۙܳۚ;->᩸:Z

    iget-object v0, v0, Ll/ۙܳۚ;->ۤ:Ljava/lang/StringBuilder;

    if-eqz p0, :cond_0

    const-string p0, "\n\u2026"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    :cond_0
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p1, p0}, Ll/ۙܳۚ;->ۙ(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ۙ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 117
    invoke-virtual {p0, p1}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object p0

    if-eqz p0, :cond_0

    .line 118
    invoke-virtual {p0}, Lbin/mt/json/JSONValue;->isString()Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Lbin/mt/json/JSONValue;->asString()Ljava/lang/String;

    move-result-object p0

    const/16 p1, 0x200

    invoke-static {p1, p0}, Ll/ۙܳۚ;->ۙ(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_0
    const-string p0, ""

    return-object p0
.end method

.method public static ۙ(ILjava/lang/String;Z)Ll/۬ᩴۚ;
    .locals 8

    .line 133
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x0

    if-eqz p2, :cond_3

    const/4 p2, 0x0

    :goto_0
    const/16 v2, 0x2029

    const/16 v3, 0x2028

    const/16 v4, 0x85

    const/16 v5, 0xa

    const/16 v6, 0xd

    if-ge p2, v0, :cond_1

    .line 135
    invoke-virtual {p1, p2}, Ljava/lang/String;->charAt(I)C

    move-result v7

    if-eq v7, v6, :cond_0

    if-eq v7, v5, :cond_0

    if-eq v7, v4, :cond_0

    if-eq v7, v3, :cond_0

    if-ne v7, v2, :cond_1

    :cond_0
    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    :cond_1
    :goto_1
    if-le v0, p2, :cond_4

    add-int/lit8 v7, v0, -0x1

    .line 136
    invoke-virtual {p1, v7}, Ljava/lang/String;->charAt(I)C

    move-result v7

    if-eq v7, v6, :cond_2

    if-eq v7, v5, :cond_2

    if-eq v7, v4, :cond_2

    if-eq v7, v3, :cond_2

    if-ne v7, v2, :cond_4

    :cond_2
    add-int/lit8 v0, v0, -0x1

    goto :goto_1

    :cond_3
    const/4 p2, 0x0

    :cond_4
    sub-int v2, v0, p2

    if-gt v2, p0, :cond_5

    .line 138
    new-instance p0, Ll/۬ᩴۚ;

    invoke-virtual {p1, p2, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1, v1}, Ll/۬ᩴۚ;-><init>(Ljava/lang/String;Z)V

    return-object p0

    :cond_5
    add-int/2addr p0, p2

    add-int/lit8 v0, p0, -0x1

    if-le v0, p2, :cond_6

    add-int/lit8 p0, p0, -0x2

    .line 140
    invoke-virtual {p1, p0}, Ljava/lang/String;->charAt(I)C

    move-result v1

    invoke-static {v1}, Ljava/lang/Character;->isHighSurrogate(C)Z

    move-result v1

    if-eqz v1, :cond_6

    move v0, p0

    .line 141
    :cond_6
    new-instance p0, Ll/۬ᩴۚ;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1, p2, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "\u2026"

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 p2, 0x1

    invoke-direct {p0, p1, p2}, Ll/۬ᩴۚ;-><init>(Ljava/lang/String;Z)V

    return-object p0
.end method

.method private ۙ(ILbin/mt/json/JSONValue;Ljava/lang/String;)V
    .locals 9

    .line 38
    iget-object v0, p0, Ll/ۙܳۚ;->ۤ:Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    move-result v1

    const/4 v2, 0x1

    iget v3, p0, Ll/ۙܳۚ;->ۙ:I

    if-ge v1, v3, :cond_d

    iget v1, p0, Ll/ۙܳۚ;->᩷:I

    add-int/2addr v1, v2

    iput v1, p0, Ll/ۙܳۚ;->᩷:I

    const/16 v4, 0x64

    if-le v1, v4, :cond_0

    goto/16 :goto_6

    :cond_0
    if-eqz p2, :cond_c

    .line 42
    invoke-virtual {p2}, Lbin/mt/json/JSONValue;->isNull()Z

    move-result v1

    if-eqz v1, :cond_1

    goto/16 :goto_5

    :cond_1
    const/4 v1, 0x5

    const-string v5, "\u2026"

    if-le p1, v1, :cond_2

    .line 44
    invoke-direct {p0, p3, v5}, Ll/ۙܳۚ;->ۙ(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    .line 45
    :cond_2
    invoke-virtual {p2}, Lbin/mt/json/JSONValue;->isObject()Z

    move-result v1

    const/16 v6, 0xa0

    const/4 v7, 0x0

    if-eqz v1, :cond_8

    .line 47
    invoke-virtual {p2}, Lbin/mt/json/JSONValue;->asObject()Lbin/mt/json/JSONObject;

    move-result-object p2

    invoke-virtual {p2}, Lbin/mt/json/JSONObject;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_c

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lbin/mt/json/JSONObject$Member;

    add-int/2addr v7, v2

    const/16 v5, 0x28

    if-gt v7, v5, :cond_7

    .line 48
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    move-result v5

    if-ge v5, v3, :cond_7

    iget v5, p0, Ll/ۙܳۚ;->᩷:I

    if-le v5, v4, :cond_3

    goto :goto_2

    .line 52
    :cond_3
    invoke-virtual {v1}, Lbin/mt/json/JSONObject$Member;->getName()Ljava/lang/String;

    move-result-object v5

    .line 53
    invoke-static {v5}, Ll/ۙܳۚ;->ۙ(Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_4

    goto :goto_0

    .line 55
    :cond_4
    invoke-virtual {p3}, Ljava/lang/String;->isEmpty()Z

    move-result v8

    if-eqz v8, :cond_5

    const-string v8, "data"

    invoke-virtual {v8, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_6

    const-string v5, ""

    goto :goto_1

    :cond_5
    const-string v8, "."

    .line 0
    invoke-static {p3, v8, v5}, Ll/᩵֡ۨ;->ۙ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 56
    :cond_6
    :goto_1
    invoke-virtual {v1}, Lbin/mt/json/JSONObject$Member;->getValue()Lbin/mt/json/JSONValue;

    move-result-object v1

    invoke-static {v6, v5}, Ll/ۙܳۚ;->ۙ(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v5

    add-int/lit8 v8, p1, 0x1

    invoke-direct {p0, v8, v1, v5}, Ll/ۙܳۚ;->ۙ(ILbin/mt/json/JSONValue;Ljava/lang/String;)V

    goto :goto_0

    .line 49
    :cond_7
    :goto_2
    iput-boolean v2, p0, Ll/ۙܳۚ;->᩸:Z

    return-void

    .line 58
    :cond_8
    invoke-virtual {p2}, Lbin/mt/json/JSONValue;->isArray()Z

    move-result v0

    if-eqz v0, :cond_a

    .line 59
    invoke-virtual {p2}, Lbin/mt/json/JSONValue;->asArray()Lbin/mt/json/JSONArray;

    move-result-object p2

    .line 60
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "["

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2}, Lbin/mt/json/JSONArray;->size()I

    move-result v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, "]"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, p3, v0}, Ll/ۙܳۚ;->ۙ(Ljava/lang/String;Ljava/lang/String;)V

    .line 61
    :goto_3
    invoke-virtual {p2}, Lbin/mt/json/JSONArray;->size()I

    move-result v0

    const/4 v3, 0x3

    invoke-static {v3, v0}, Ljava/lang/Math;->min(II)I

    move-result v0

    if-ge v7, v0, :cond_9

    .line 62
    invoke-virtual {p2, v7}, Lbin/mt/json/JSONArray;->get(I)Lbin/mt/json/JSONValue;

    move-result-object v0

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {v6, p3}, Ll/ۙܳۚ;->ۙ(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    add-int/lit8 v4, p1, 0x1

    invoke-direct {p0, v4, v0, v3}, Ll/ۙܳۚ;->ۙ(ILbin/mt/json/JSONValue;Ljava/lang/String;)V

    add-int/lit8 v7, v7, 0x1

    goto :goto_3

    .line 64
    :cond_9
    invoke-virtual {p2}, Lbin/mt/json/JSONArray;->size()I

    move-result p1

    if-le p1, v3, :cond_c

    invoke-direct {p0, p3, v5}, Ll/ۙܳۚ;->ۙ(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    .line 66
    :cond_a
    invoke-virtual {p2}, Lbin/mt/json/JSONValue;->isString()Z

    move-result p1

    if-eqz p1, :cond_b

    invoke-virtual {p2}, Lbin/mt/json/JSONValue;->asString()Ljava/lang/String;

    move-result-object p1

    goto :goto_4

    :cond_b
    invoke-virtual {p2}, Lbin/mt/json/JSONValue;->toString()Ljava/lang/String;

    move-result-object p1

    .line 67
    :goto_4
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result p2

    if-nez p2, :cond_c

    const/16 p2, 0xdc

    .line 128
    invoke-static {p2, p1, v2}, Ll/ۙܳۚ;->ۙ(ILjava/lang/String;Z)Ll/۬ᩴۚ;

    move-result-object p1

    iget-object p1, p1, Ll/۬ᩴۚ;->ۙ:Ljava/lang/String;

    .line 67
    invoke-direct {p0, p3, p1}, Ll/ۙܳۚ;->ۙ(Ljava/lang/String;Ljava/lang/String;)V

    :cond_c
    :goto_5
    return-void

    .line 39
    :cond_d
    :goto_6
    iput-boolean v2, p0, Ll/ۙܳۚ;->᩸:Z

    return-void
.end method

.method private ۙ(Ljava/lang/String;Ljava/lang/String;)V
    .locals 4

    .line 72
    iget-object v0, p0, Ll/ۙܳۚ;->ۤ:Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    move-result v1

    iget v2, p0, Ll/ۙܳۚ;->ۙ:I

    const/4 v3, 0x1

    if-lt v1, v2, :cond_0

    .line 73
    iput-boolean v3, p0, Ll/ۙܳۚ;->᩸:Z

    return-void

    .line 76
    :cond_0
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    move-result v1

    if-eqz v1, :cond_1

    const/16 v1, 0xa

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 77
    :cond_1
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_2

    const/16 v1, 0xa0

    invoke-static {v1, p1}, Ll/ۙܳۚ;->ۙ(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 123
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v2

    .line 128
    invoke-static {v2, v1, v3}, Ll/ۙܳۚ;->ۙ(ILjava/lang/String;Z)Ll/۬ᩴۚ;

    move-result-object v1

    iget-object v1, v1, Ll/۬ᩴۚ;->ۙ:Ljava/lang/String;

    .line 77
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ": "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 78
    :cond_2
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_3

    goto :goto_0

    .line 123
    :cond_3
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result p1

    .line 128
    invoke-static {p1, p2, v3}, Ll/ۙܳۚ;->ۙ(ILjava/lang/String;Z)Ll/۬ᩴۚ;

    move-result-object p1

    iget-object p2, p1, Ll/۬ᩴۚ;->ۙ:Ljava/lang/String;

    .line 78
    :goto_0
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    return-void
.end method

.method public static ۙ(Ljava/lang/String;)Z
    .locals 1

    .line 83
    sget-object v0, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {p0, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p0

    const-string v0, "password"

    .line 84
    invoke-virtual {p0, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "token"

    invoke-virtual {p0, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "secret"

    invoke-virtual {p0, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "authorization"

    .line 85
    invoke-virtual {p0, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "credential"

    invoke-virtual {p0, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "cursor"

    .line 86
    invoke-virtual {p0, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "version"

    invoke-virtual {p0, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "workspaceid"

    .line 87
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "editsessionid"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "nextactions"

    .line 88
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "badvalue"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "example"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "message"

    .line 90
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "stacktrace"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    return p0

    :cond_1
    :goto_0
    const/4 p0, 0x1

    return p0
.end method

.method public static ᩷(Lbin/mt/json/JSONObject;)Ljava/lang/String;
    .locals 1

    const/16 v0, 0x1000

    .line 27
    invoke-static {p0, v0}, Ll/ۙܳۚ;->ۙ(Lbin/mt/json/JSONObject;I)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method
