.class public final enum Ll/ۡۧۙ;
.super Ljava/lang/Enum;
.source "Y5SN"


# static fields
.field public static final enum ֡:Ll/ۡۧۙ;

.field public static final enum ֨:Ll/ۡۧۙ;

.field public static final enum ۖ:Ll/ۡۧۙ;

.field public static final enum ۟:Ll/ۡۧۙ;

.field public static final enum ۡ:Ll/ۡۧۙ;

.field public static final enum ۢ:Ll/ۡۧۙ;

.field public static final synthetic ܰ:Ll/ᩳۢ᩵;

.field public static final ܿ:Ll/ۢۧۙ;

.field public static final enum ᩳ:Ll/ۡۧۙ;

.field public static final synthetic ᩶:[Ll/ۡۧۙ;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    .line 111
    new-instance v0, Ll/ۡۧۙ;

    const-string v1, "ON_CREATE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ll/ۡۧۙ;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ll/ۡۧۙ;->۟:Ll/ۡۧۙ;

    .line 114
    new-instance v0, Ll/ۡۧۙ;

    const-string v1, "ON_START"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Ll/ۡۧۙ;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ll/ۡۧۙ;->ۡ:Ll/ۡۧۙ;

    .line 117
    new-instance v0, Ll/ۡۧۙ;

    const-string v1, "ON_RESUME"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Ll/ۡۧۙ;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ll/ۡۧۙ;->֨:Ll/ۡۧۙ;

    .line 120
    new-instance v0, Ll/ۡۧۙ;

    const-string v1, "ON_PAUSE"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Ll/ۡۧۙ;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ll/ۡۧۙ;->ۢ:Ll/ۡۧۙ;

    .line 123
    new-instance v0, Ll/ۡۧۙ;

    const-string v1, "ON_STOP"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Ll/ۡۧۙ;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ll/ۡۧۙ;->ۖ:Ll/ۡۧۙ;

    .line 126
    new-instance v0, Ll/ۡۧۙ;

    const-string v1, "ON_DESTROY"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Ll/ۡۧۙ;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ll/ۡۧۙ;->ᩳ:Ll/ۡۧۙ;

    .line 129
    new-instance v0, Ll/ۡۧۙ;

    const-string v1, "ON_ANY"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2}, Ll/ۡۧۙ;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ll/ۡۧۙ;->֡:Ll/ۡۧۙ;

    invoke-static {}, Ll/ۡۧۙ;->᩸()[Ll/ۡۧۙ;

    move-result-object v0

    sput-object v0, Ll/ۡۧۙ;->᩶:[Ll/ۡۧۙ;

    invoke-static {v0}, Ll/ۢۢ᩵;->ۙ([Ljava/lang/Enum;)Ll/ᩳۢ᩵;

    move-result-object v0

    sput-object v0, Ll/ۡۧۙ;->ܰ:Ll/ᩳۢ᩵;

    new-instance v0, Ll/ۢۧۙ;

    .line 154
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 129
    sput-object v0, Ll/ۡۧۙ;->ܿ:Ll/ۢۧۙ;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 0

    .line 109
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Ll/ۡۧۙ;
    .locals 1

    .line 2
    const-class v0, Ll/ۡۧۙ;

    .line 5
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    .line 227
    check-cast p0, Ll/ۡۧۙ;

    return-object p0
.end method

.method public static values()[Ll/ۡۧۙ;
    .locals 1

    .line 2
    sget-object v0, Ll/ۡۧۙ;->᩶:[Ll/ۡۧۙ;

    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    .line 227
    check-cast v0, [Ll/ۡۧۙ;

    return-object v0
.end method

.method public static final ۙ(Ll/ۖۧۙ;)Ll/ۡۧۙ;
    .locals 1

    .line 0
    sget-object v0, Ll/ۡۧۙ;->ܿ:Ll/ۢۧۙ;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p0}, Ll/ۢۧۙ;->ۙ(Ll/ۖۧۙ;)Ll/ۡۧۙ;

    move-result-object p0

    return-object p0
.end method

.method public static final ۤ(Ll/ۖۧۙ;)Ll/ۡۧۙ;
    .locals 1

    .line 0
    sget-object v0, Ll/ۡۧۙ;->ܿ:Ll/ۢۧۙ;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p0}, Ll/ۢۧۙ;->᩷(Ll/ۖۧۙ;)Ll/ۡۧۙ;

    move-result-object p0

    return-object p0
.end method

.method public static ᩴ()Ll/ᩳۢ᩵;
    .locals 1

    .line 0
    sget-object v0, Ll/ۡۧۙ;->ܰ:Ll/ᩳۢ᩵;

    return-object v0
.end method

.method public static final ᩷(Ll/ۖۧۙ;)Ll/ۡۧۙ;
    .locals 1

    .line 2
    sget-object v0, Ll/ۡۧۙ;->ܿ:Ll/ۢۧۙ;

    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v0, "state"

    .line 0
    invoke-static {p0, v0}, Ll/ܳۡ᩵;->ۤ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 183
    sget-object v0, Ll/ᩳۧۙ;->ۙ:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v0, p0

    const/4 v0, 0x1

    if-eq p0, v0, :cond_2

    const/4 v0, 0x2

    if-eq p0, v0, :cond_1

    const/4 v0, 0x4

    if-eq p0, v0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 184
    :cond_0
    sget-object p0, Ll/ۡۧۙ;->ᩳ:Ll/ۡۧۙ;

    return-object p0

    .line 186
    :cond_1
    sget-object p0, Ll/ۡۧۙ;->ۢ:Ll/ۡۧۙ;

    return-object p0

    .line 185
    :cond_2
    sget-object p0, Ll/ۡۧۙ;->ۖ:Ll/ۡۧۙ;

    return-object p0
.end method

.method public static final ᩸(Ll/ۖۧۙ;)Ll/ۡۧۙ;
    .locals 1

    .line 2
    sget-object v0, Ll/ۡۧۙ;->ܿ:Ll/ۢۧۙ;

    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v0, "state"

    .line 0
    invoke-static {p0, v0}, Ll/ܳۡ᩵;->ۤ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 219
    sget-object v0, Ll/ᩳۧۙ;->ۙ:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v0, p0

    const/4 v0, 0x1

    if-eq p0, v0, :cond_2

    const/4 v0, 0x2

    if-eq p0, v0, :cond_1

    const/4 v0, 0x3

    if-eq p0, v0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 222
    :cond_0
    sget-object p0, Ll/ۡۧۙ;->֨:Ll/ۡۧۙ;

    return-object p0

    .line 221
    :cond_1
    sget-object p0, Ll/ۡۧۙ;->ۡ:Ll/ۡۧۙ;

    return-object p0

    .line 220
    :cond_2
    sget-object p0, Ll/ۡۧۙ;->۟:Ll/ۡۧۙ;

    return-object p0
.end method

.method public static final synthetic ᩸()[Ll/ۡۧۙ;
    .locals 3

    const/4 v0, 0x7

    new-array v0, v0, [Ll/ۡۧۙ;

    .line 0
    sget-object v1, Ll/ۡۧۙ;->۟:Ll/ۡۧۙ;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Ll/ۡۧۙ;->ۡ:Ll/ۡۧۙ;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Ll/ۡۧۙ;->֨:Ll/ۡۧۙ;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, Ll/ۡۧۙ;->ۢ:Ll/ۡۧۙ;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    sget-object v1, Ll/ۡۧۙ;->ۖ:Ll/ۡۧۙ;

    const/4 v2, 0x4

    aput-object v1, v0, v2

    sget-object v1, Ll/ۡۧۙ;->ᩳ:Ll/ۡۧۙ;

    const/4 v2, 0x5

    aput-object v1, v0, v2

    sget-object v1, Ll/ۡۧۙ;->֡:Ll/ۡۧۙ;

    const/4 v2, 0x6

    aput-object v1, v0, v2

    return-object v0
.end method


# virtual methods
.method public final ۙ()Ll/ۖۧۙ;
    .locals 3

    .line 142
    sget-object v0, Ll/֨ۧۙ;->ۙ:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    new-instance v0, Ll/ۙ۟᩵;

    .line 9
    invoke-direct {v0}, Ljava/lang/RuntimeException;-><init>()V

    .line 142
    throw v0

    .line 151
    :pswitch_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " has no target state"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 148
    :pswitch_1
    sget-object v0, Ll/ۖۧۙ;->֡:Ll/ۖۧۙ;

    return-object v0

    .line 147
    :pswitch_2
    sget-object v0, Ll/ۖۧۙ;->ᩳ:Ll/ۖۧۙ;

    return-object v0

    .line 146
    :pswitch_3
    sget-object v0, Ll/ۖۧۙ;->ۢ:Ll/ۖۧۙ;

    return-object v0

    .line 144
    :pswitch_4
    sget-object v0, Ll/ۖۧۙ;->ܿ:Ll/ۖۧۙ;

    return-object v0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_4
        :pswitch_4
        :pswitch_3
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
