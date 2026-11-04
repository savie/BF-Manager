.class public final Ll/ᩳۡܶ;
.super Ljava/lang/Object;
.source "G8CV"

# interfaces
.implements Ll/᩸ۧۤ;


# direct methods
.method public static ۙ()Lbin/mt/json/JSONObject;
    .locals 5

    const-string v0, "description"

    const-string v1, "Edit session prepare failures bound to locator. Success data describes current saved session failures. Error diagnostics describe prepare failures; use overlaySaved to distinguish saved text from rejected edits."

    const-string v2, "type"

    const-string v3, "array"

    .line 0
    invoke-static {v2, v3, v0, v1}, Ll/᩷ܳۚ;->ۙ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    .line 117
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "string"

    const-string v3, "Failure text locator. Smali compile failures use dex_class because line and column are class-smali coordinates."

    .line 103
    invoke-static {v2, v3}, Ll/ۤܳۚ;->᩷(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "locator"

    .line 118
    invoke-virtual {v1, v4, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v3, "Dex class descriptor."

    .line 103
    invoke-static {v2, v3}, Ll/ۤܳۚ;->᩷(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "className"

    .line 119
    invoke-virtual {v1, v4, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v3, "Failure code."

    .line 103
    invoke-static {v2, v3}, Ll/ۤܳۚ;->᩷(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "errorCode"

    .line 120
    invoke-virtual {v1, v4, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v3, "Compiler error message."

    .line 103
    invoke-static {v2, v3}, Ll/ۤܳۚ;->᩷(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "message"

    .line 121
    invoke-virtual {v1, v3, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "integer"

    const-string v3, "0-based line, or null."

    .line 117
    invoke-static {v2, v3}, Ll/ۤܳۚ;->᩷(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "line"

    .line 122
    invoke-virtual {v1, v4, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v3, "0-based column, or null."

    .line 117
    invoke-static {v2, v3}, Ll/ۤܳۚ;->᩷(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "column"

    .line 123
    invoke-virtual {v1, v3, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "One edit session prepare failure."

    .line 117
    invoke-static {v1, v2}, Ll/ۤܳۚ;->ۙ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "items"

    invoke-virtual {v0, v2, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    return-object v0
.end method

.method public static ۙ(Ll/ۨۛۚ;)Lbin/mt/json/JSONObject;
    .locals 7

    .line 48
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "workspaceId"

    iget-object v2, p0, Ll/ۨۛۚ;->ܽ:Ljava/lang/String;

    .line 49
    invoke-virtual {v0, v1, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "editSessionId"

    iget-object v2, p0, Ll/ۨۛۚ;->ۚ:Ljava/lang/String;

    .line 50
    invoke-virtual {v0, v1, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "runBuildChecks"

    iget-boolean v2, p0, Ll/ۨۛۚ;->ܺ:Z

    .line 51
    invoke-virtual {v0, v1, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "pendingCompileCount"

    iget v2, p0, Ll/ۨۛۚ;->᩻:I

    .line 52
    invoke-virtual {v0, v1, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "failedCount"

    iget v2, p0, Ll/ۨۛۚ;->֫:I

    .line 53
    invoke-virtual {v0, v1, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v0

    iget-object v1, p0, Ll/ۨۛۚ;->ۧ:Ljava/util/ArrayList;

    .line 74
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v2

    .line 75
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ܽۛۚ;

    .line 76
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v4

    iget-object v5, v3, Ll/ܽۛۚ;->ۚ:Ljava/lang/String;

    iget-object v6, v3, Ll/ܽۛۚ;->۫:Ljava/lang/String;

    .line 77
    invoke-static {v5, v6}, Ll/ۘ᩵ۚ;->᩷(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v5

    const-string v6, "locator"

    invoke-virtual {v4, v6, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v4

    const-string v5, "className"

    iget-object v6, v3, Ll/ܽۛۚ;->ۙ:Ljava/lang/String;

    .line 78
    invoke-virtual {v4, v5, v6}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v4

    const-string v5, "errorCode"

    iget-object v6, v3, Ll/ܽۛۚ;->᩸:Ljava/lang/String;

    .line 79
    invoke-virtual {v4, v5, v6}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v4

    const-string v5, "message"

    iget-object v6, v3, Ll/ܽۛۚ;->ܳ:Ljava/lang/String;

    .line 80
    invoke-virtual {v4, v5, v6}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v4

    .line 81
    iget-object v5, v3, Ll/ܽۛۚ;->ᩴ:Ljava/lang/Integer;

    if-nez v5, :cond_0

    sget-object v5, Lbin/mt/json/JSON;->NULL:Lbin/mt/json/JSONValue;

    goto :goto_1

    :cond_0
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v5

    invoke-static {v5}, Lbin/mt/json/JSON;->value(I)Lbin/mt/json/JSONValue;

    move-result-object v5

    :goto_1
    const-string v6, "line"

    invoke-virtual {v4, v6, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v4

    .line 82
    iget-object v3, v3, Ll/ܽۛۚ;->᩷:Ljava/lang/Integer;

    if-nez v3, :cond_1

    sget-object v3, Lbin/mt/json/JSON;->NULL:Lbin/mt/json/JSONValue;

    goto :goto_2

    :cond_1
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    invoke-static {v3}, Lbin/mt/json/JSON;->value(I)Lbin/mt/json/JSONValue;

    move-result-object v3

    :goto_2
    const-string v5, "column"

    invoke-virtual {v4, v5, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v3

    .line 76
    invoke-virtual {v2, v3}, Lbin/mt/json/JSONArray;->add(Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONArray;

    goto :goto_0

    :cond_2
    const-string v1, "failures"

    .line 54
    invoke-virtual {v0, v1, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "buildCheckStatus"

    iget-object v2, p0, Ll/ۨۛۚ;->᩷:Ljava/lang/String;

    .line 55
    invoke-virtual {v0, v1, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    iget-object v1, p0, Ll/ۨۛۚ;->᩸:Ljava/util/ArrayList;

    .line 56
    invoke-static {v1}, Ll/ۨᩴۚ;->ۙ(Ljava/lang/Iterable;)Lbin/mt/json/JSONArray;

    move-result-object v1

    const-string v2, "changedDexEntries"

    invoke-virtual {v0, v2, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "changedClassCount"

    iget v2, p0, Ll/ۨۛۚ;->ۤ:I

    .line 57
    invoke-virtual {v0, v1, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "deletedClassCount"

    iget v2, p0, Ll/ۨۛۚ;->ܳ:I

    .line 58
    invoke-virtual {v0, v1, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v0

    iget-object v1, p0, Ll/ۨۛۚ;->ۙ:Ljava/util/ArrayList;

    .line 59
    invoke-static {v1}, Ll/ۨᩴۚ;->ۙ(Ljava/lang/Iterable;)Lbin/mt/json/JSONArray;

    move-result-object v1

    const-string v2, "addedZipEntries"

    invoke-virtual {v0, v2, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    iget-object v1, p0, Ll/ۨۛۚ;->ᩴ:Ljava/util/ArrayList;

    .line 60
    invoke-static {v1}, Ll/ۨᩴۚ;->ۙ(Ljava/lang/Iterable;)Lbin/mt/json/JSONArray;

    move-result-object v1

    const-string v2, "changedZipEntries"

    invoke-virtual {v0, v2, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    iget-object p0, p0, Ll/ۨۛۚ;->۫:Ljava/util/ArrayList;

    .line 61
    invoke-static {p0}, Ll/ۨᩴۚ;->ۙ(Ljava/lang/Iterable;)Lbin/mt/json/JSONArray;

    move-result-object p0

    const-string v1, "deletedZipEntries"

    invoke-virtual {v0, v1, p0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object p0

    .line 37
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v0

    invoke-static {p0, v0}, Ll/ܳۧۤ;->ۙ(Lbin/mt/json/JSONObject;Lbin/mt/json/JSONArray;)Lbin/mt/json/JSONObject;

    move-result-object p0

    return-object p0
.end method

.method public static ۙ(Ljava/lang/String;Z)Ljava/lang/Class;
    .locals 2

    .line 25
    :try_start_0
    invoke-static {p0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object p0

    .line 28
    :catchall_0
    :try_start_1
    invoke-static {}, Ljava/lang/ClassLoader;->getSystemClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    const/4 v1, 0x1

    .line 29
    invoke-static {p0, v1, v0}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    move-result-object p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception p0

    if-eqz p1, :cond_0

    .line 32
    sget-object p1, Ljava/lang/System;->err:Ljava/io/PrintStream;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Caught "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1, p0}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return-object p0
.end method

.method public static ۙ(ILjava/lang/String;)Ljava/lang/String;
    .locals 2

    if-nez p1, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 9
    :cond_0
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    if-le v0, p0, :cond_1

    .line 10
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    add-int/lit8 p0, p0, -0x1

    const/4 v1, 0x0

    invoke-virtual {p1, v1, p0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, "\u2026"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_1
    return-object p1
.end method

.method public static ۙ(III)V
    .locals 0

    if-lez p0, :cond_1

    if-lez p1, :cond_1

    const/4 p0, 0x1

    if-lt p2, p0, :cond_0

    const/16 p0, 0x8

    if-gt p2, p0, :cond_0

    return-void

    .line 80
    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "EXIF orientation must be between 1 and 8"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 78
    :cond_1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Image dimensions must be positive"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static ۙ(III[F)V
    .locals 7

    .line 24
    invoke-static {p0, p1, p2}, Ll/ᩳۡܶ;->ۙ(III)V

    if-eqz p3, :cond_0

    .line 25
    array-length v0, p3

    const/16 v1, 0x9

    if-lt v0, v1, :cond_0

    const/high16 v0, 0x3f800000    # 1.0f

    const/high16 v1, -0x40800000    # -1.0f

    const/4 v2, 0x0

    packed-switch p2, :pswitch_data_0

    const/4 p0, 0x0

    const/4 p1, 0x0

    const/4 p2, 0x0

    const/high16 v1, 0x3f800000    # 1.0f

    goto :goto_4

    :pswitch_0
    int-to-float p0, p0

    const/4 p1, 0x0

    const/high16 p2, 0x3f800000    # 1.0f

    goto :goto_0

    :pswitch_1
    int-to-float p1, p1

    int-to-float p0, p0

    const/high16 p2, -0x40800000    # -1.0f

    :goto_0
    const/4 v1, 0x0

    const/high16 v3, -0x40800000    # -1.0f

    goto :goto_2

    :pswitch_2
    int-to-float p0, p1

    const/4 p1, 0x0

    const/high16 p2, -0x40800000    # -1.0f

    move p1, p0

    const/4 p0, 0x0

    goto :goto_1

    :pswitch_3
    const/4 p0, 0x0

    const/4 p1, 0x0

    const/high16 p2, 0x3f800000    # 1.0f

    :goto_1
    const/4 v1, 0x0

    const/high16 v3, 0x3f800000    # 1.0f

    :goto_2
    const/4 v4, 0x0

    goto :goto_5

    :pswitch_4
    int-to-float p0, p1

    const/4 p1, 0x0

    const/4 p2, 0x0

    const/high16 v1, 0x3f800000    # 1.0f

    goto :goto_3

    :pswitch_5
    int-to-float p0, p0

    int-to-float p1, p1

    const/4 p2, 0x0

    move v6, p1

    move p1, p0

    move p0, v6

    :goto_3
    const/4 v3, 0x0

    const/high16 v4, -0x40800000    # -1.0f

    goto :goto_5

    :pswitch_6
    int-to-float p0, p0

    const/4 p1, 0x0

    const/4 p2, 0x0

    move p1, p0

    const/4 p0, 0x0

    :goto_4
    const/4 v3, 0x0

    const/high16 v4, 0x3f800000    # 1.0f

    :goto_5
    const/4 v5, 0x0

    .line 66
    aput v1, p3, v5

    const/4 v1, 0x1

    .line 67
    aput p2, p3, v1

    const/4 p2, 0x2

    .line 68
    aput p1, p3, p2

    const/4 p1, 0x3

    .line 69
    aput v3, p3, p1

    const/4 p1, 0x4

    .line 70
    aput v4, p3, p1

    const/4 p1, 0x5

    .line 71
    aput p0, p3, p1

    const/4 p0, 0x7

    .line 72
    aput v2, p3, p0

    const/4 p0, 0x6

    aput v2, p3, p0

    const/16 p0, 0x8

    .line 73
    aput v0, p3, p0

    return-void

    .line 26
    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Matrix output must contain at least 9 elements"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static ۤ(III)I
    .locals 1

    .line 10
    invoke-static {p0, p1, p2}, Ll/ᩳۡܶ;->ۙ(III)V

    const/4 v0, 0x5

    if-lt p2, v0, :cond_0

    return p1

    :cond_0
    return p0
.end method

.method public static ᩷(III)I
    .locals 1

    .line 15
    invoke-static {p0, p1, p2}, Ll/ᩳۡܶ;->ۙ(III)V

    const/4 v0, 0x5

    if-lt p2, v0, :cond_0

    return p0

    :cond_0
    return p1
.end method

.method public static ᩷()Lbin/mt/json/JSONObject;
    .locals 11

    .line 88
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "string"

    const-string v2, "Workspace id used for this edit check."

    .line 96
    invoke-static {v1, v2}, Ll/ۤܳۚ;->ۤ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "workspaceId"

    .line 89
    invoke-virtual {v0, v3, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v2, "Edit session id used for this edit check."

    .line 96
    invoke-static {v1, v2}, Ll/ۤܳۚ;->ۤ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v4, "editSessionId"

    .line 90
    invoke-virtual {v0, v4, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v2, "boolean"

    const-string v5, "Whether this call ran pre-build content checks."

    .line 124
    invoke-static {v2, v5}, Ll/ۤܳۚ;->ۤ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v5

    const-string v6, "runBuildChecks"

    .line 91
    invoke-virtual {v0, v6, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v5, "integer"

    const-string v7, "Number of edited Smali or AXML targets still awaiting validation."

    .line 110
    invoke-static {v5, v7}, Ll/ۤܳۚ;->ۤ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v7

    const-string v8, "pendingCompileCount"

    .line 92
    invoke-virtual {v0, v8, v7}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v7, "Current Smali compile or AXML encode failure count."

    .line 110
    invoke-static {v5, v7}, Ll/ۤܳۚ;->ۤ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v7

    const-string v8, "failedCount"

    .line 93
    invoke-virtual {v0, v8, v7}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    .line 94
    invoke-static {}, Ll/ᩳۡܶ;->ۙ()Lbin/mt/json/JSONObject;

    move-result-object v7

    const-string v8, "failures"

    invoke-virtual {v0, v8, v7}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v7, "not_run means status only; passed means edited content preparation, changed entry reads, and Dex merge passed. This does not validate output paths, signing configuration, final APK packaging, or installability. Failed checks return an error envelope."

    .line 96
    invoke-static {v1, v7}, Ll/ۤܳۚ;->ۤ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v7

    const-string v9, "buildCheckStatus"

    .line 95
    invoke-virtual {v0, v9, v7}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v7, "Dex entries rewritten or created during dex merge."

    .line 96
    invoke-static {v7}, Ll/ۤܳۚ;->᩷(Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v7

    const-string v9, "changedDexEntries"

    invoke-virtual {v0, v9, v7}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v7, "Modified or deleted class count included in the check."

    .line 110
    invoke-static {v5, v7}, Ll/ۤܳۚ;->ۤ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v7

    const-string v9, "changedClassCount"

    .line 97
    invoke-virtual {v0, v9, v7}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v7, "Deleted class count included in the check."

    .line 110
    invoke-static {v5, v7}, Ll/ۤܳۚ;->ۤ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v5

    const-string v7, "deletedClassCount"

    .line 98
    invoke-virtual {v0, v7, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v5, "New AXML or ordinary ZIP entries added by the edit session."

    .line 99
    invoke-static {v5}, Ll/ۤܳۚ;->᩷(Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v5

    const-string v7, "addedZipEntries"

    invoke-virtual {v0, v7, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v5, "Existing AXML or ordinary ZIP entries replaced by the edit session; resource patches appear here as resources.arsc."

    .line 100
    invoke-static {v5}, Ll/ۤܳۚ;->᩷(Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v5

    const-string v7, "changedZipEntries"

    invoke-virtual {v0, v7, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v5, "Existing AXML or ordinary ZIP entries deleted by the edit session."

    .line 101
    invoke-static {v5}, Ll/ۤܳۚ;->᩷(Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v5

    const-string v7, "deletedZipEntries"

    invoke-virtual {v0, v7, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v5, "Successful mt_apk_session_check data."

    .line 88
    invoke-static {v0, v5}, Ll/ۤܳۚ;->ۙ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    .line 105
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v5

    const-string v7, "Workspace id, or null."

    .line 103
    invoke-static {v1, v7}, Ll/ۤܳۚ;->᩷(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v7

    .line 106
    invoke-virtual {v5, v3, v7}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v5, "Edit session id, or null."

    .line 103
    invoke-static {v1, v5}, Ll/ۤܳۚ;->᩷(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    .line 107
    invoke-virtual {v3, v4, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v3, "Whether this request was accepted for pre-build content checks. Parameter parsing failures always return false."

    .line 124
    invoke-static {v2, v3}, Ll/ۤܳۚ;->ۤ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    .line 108
    invoke-virtual {v1, v6, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v3, "Only interpret for SMALI_COMPILE_FAILED_IN_SESSION or EDIT_TEXT_PREPARE_FAILED_IN_SESSION; true means the failing text was already saved in the edit session."

    .line 124
    invoke-static {v2, v3}, Ll/ۤܳۚ;->ۤ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "overlaySaved"

    .line 109
    invoke-virtual {v1, v3, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v1

    .line 110
    invoke-static {}, Ll/ᩳۡܶ;->ۙ()Lbin/mt/json/JSONObject;

    move-result-object v2

    invoke-virtual {v1, v8, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "mt_apk_session_check diagnostics."

    .line 105
    invoke-static {v1, v2}, Ll/ۤܳۚ;->ۙ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    .line 30
    invoke-static {v1}, Ll/ۤܳۚ;->᩷(Lbin/mt/json/JSONObject;)Lbin/mt/json/JSONObject;

    move-result-object v1

    .line 129
    invoke-static {}, Ll/ܶܿ֫;->۫()Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "mt_apk_workspace_open"

    const-string v4, "retry"

    .line 128
    invoke-static {v2, v3, v4}, Ll/ۤܳۚ;->ۙ(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "mt_apk_read_text"

    .line 131
    invoke-static {}, Ll/ܶܿ֫;->᩻()Lbin/mt/json/JSONObject;

    move-result-object v5

    .line 130
    invoke-static {v5, v3, v4}, Ll/ۤܳۚ;->ۙ(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v5, "mt_apk_read_bytes"

    .line 133
    invoke-static {}, Ll/ܶܿ֫;->֫()Lbin/mt/json/JSONObject;

    move-result-object v6

    .line 132
    invoke-static {v6, v5, v4}, Ll/ۤܳۚ;->ۙ(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v4

    .line 135
    invoke-static {}, Ll/ܶܿ֫;->᩸()Lbin/mt/json/JSONObject;

    move-result-object v5

    const-string v6, "mt_apk_list_entries"

    const-string v7, "verify_workspace"

    .line 134
    invoke-static {v5, v6, v7}, Ll/ۤܳۚ;->ۙ(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v5

    const-string v6, "mt_apk_dex_list_classes"

    .line 137
    invoke-static {}, Ll/ܶܿ֫;->ۤ()Lbin/mt/json/JSONObject;

    move-result-object v8

    .line 136
    invoke-static {v8, v6, v7}, Ll/ۤܳۚ;->ۙ(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v6

    const-string v8, "mt_apk_resource_list"

    .line 139
    invoke-static {}, Ll/ܶܿ֫;->ᩴ()Lbin/mt/json/JSONObject;

    move-result-object v9

    .line 138
    invoke-static {v9, v8, v7}, Ll/ۤܳۚ;->ۙ(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v8

    const-string v9, "mt_apk_dex_read_class_outline"

    .line 141
    invoke-static {}, Ll/ܶܿ֫;->ۚ()Lbin/mt/json/JSONObject;

    move-result-object v10

    .line 140
    invoke-static {v10, v9, v7}, Ll/ۤܳۚ;->ۙ(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v7

    const/4 v9, 0x7

    new-array v9, v9, [Lbin/mt/json/JSONObject;

    const/4 v10, 0x0

    aput-object v2, v9, v10

    const/4 v2, 0x1

    aput-object v3, v9, v2

    const/4 v2, 0x2

    aput-object v4, v9, v2

    const/4 v2, 0x3

    aput-object v5, v9, v2

    const/4 v2, 0x4

    aput-object v6, v9, v2

    const/4 v2, 0x5

    aput-object v8, v9, v2

    const/4 v2, 0x6

    aput-object v7, v9, v2

    const-string v2, "mt_apk_session_check success emits no follow-up actions; errors may return retry or workspace verification actions."

    .line 127
    invoke-static {v2, v9}, Ll/ۤܳۚ;->ۙ(Ljava/lang/String;[Lbin/mt/json/JSONObject;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "Result for mt_apk_session_check. data returns edit session status and optional pre-build content checks without producing an APK."

    .line 28
    invoke-static {v3, v0, v1, v2}, Ll/ۤܳۚ;->ۙ(Ljava/lang/String;Lbin/mt/json/JSONObject;Lbin/mt/json/JSONObject;Lbin/mt/json/JSONObject;)Lbin/mt/json/JSONObject;

    move-result-object v0

    return-object v0
.end method

.method public static ᩷(ILjava/lang/String;)Ljava/lang/String;
    .locals 2

    if-nez p1, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 19
    :cond_0
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    if-le v0, p0, :cond_1

    .line 20
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "\u2026"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    sub-int/2addr v1, p0

    add-int/lit8 v1, v1, 0x1

    invoke-virtual {p1, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_1
    return-object p1
.end method


# virtual methods
.method public ۙ(Ll/ᩴܺۤ;)V
    .locals 3

    .line 16
    new-instance v0, Ll/ܰ֫ۤ;

    invoke-direct {v0}, Ll/ܰ֫ۤ;-><init>()V

    .line 17
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ll/ܰ֫ۤ;->ۙ(J)V

    .line 18
    invoke-virtual {p1, v0}, Ll/ᩴܺۤ;->ۙ(Ll/ܰ֫ۤ;)V

    return-void
.end method
