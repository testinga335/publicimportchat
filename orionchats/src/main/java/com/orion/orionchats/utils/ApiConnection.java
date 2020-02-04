package com.orion.orionchats.utils;


class ApiConnection {
    private static final String TAG = ApiConnection.class.getSimpleName();
    private static final String BASE_ADMIN_URL = "api.cometchat.com";
    private static final String BASE_ADMIN_DEV_URL = "api.cometchat-dev.com";
    private static final String BASE_URL = "kohoutek.cometchat.com";
    private static final String BASE_DEV_URL = "kohoutek.cometchat-dev.com";
    private static final String API_VERSION = "/v1.3";
    private static final String URL_LOGIN = "/v1.3/users/%s/auth_tokens";
    private static final String URL_LOGIN_TOKEN = "/v1.3/me";
    private static final String URL_SEND_MESSAGE = "/v1.3/messages";
    private static final String URL_CREATE_GROUP = "/v1.3/groups";
    private static final String URL_FETCH_SETTINGS = "/v1.3/settings";
    private static final String URL_JOIN_GROUP = "/v1.3/groups/%s/members";
    private static final String URL_USERS_LIST = "/v1.3/users";
    private static final String URL_USER_DETAILS = "/v1.3/users/%s";
    private static final String URL_GROUPS_LIST = "/v1.3/groups";
    private static final String URL_USER_GET_CONVERSATIONS = "/v1.3/users/%s/messages";
    private static final String URL_GROUP_GET_CONVERSATIONS = "/v1.3/groups/%s/messages";
    private static final String URL_GET_USERS_MESSAGES = "/v1.3/messages";
    private static final String URL_GET_GROUP_MEMBERS = "/v1.3/groups/%s/members";
    private static final String URL_LEAVE_GROUP = "/v1.3/groups/%s/members";
    private static final String URL_UPDATE_GROUP = "/v1.3/groups/%s";
    private static final String URL_DELETE_GROUP = "/v1.3/groups/%s";
    private static final String URL_KICK_USER = "/v1.3/groups/%s/members/%s";
    private static final String URL_BAN_USER = "/v1.3/groups/%s/bannedusers/%s";
    private static final String URL_UNBAN_USER = "/v1.3/groups/%s/bannedusers/%s";
    private static final String URL_CHANGE_MEMBER_SCOPE = "/v1.3/groups/%s/members/%s";
    private static final String URL_GET_BANNED_MEMBERS = "/v1.3/groups/%s/bannedusers";
    private static final String URL_GET_GROUP = "/v1.3/groups/%s";
    private static final String URL_INITIATE_CALL = "/v1.3/calls";
    private static final String URL_UPDATE_CALL_STATUS = "/v1.3/calls/%s";
    private static final String URL_LOGOUT = "/v1.3/me";
    private static ApiConnection mConnection;
//    private static OkHttpClient okHttpClient;
//    private static OkHttpClient okHttpFileClient;
//    private static Context context;

//    private ApiConnection(Context appContext) {
//        context = appContext;
//        okHttpClient = (new Builder()).connectTimeout(15L, TimeUnit.SECONDS).readTimeout(15L, TimeUnit.SECONDS).writeTimeout(15L, TimeUnit.SECONDS).build();
//        okHttpFileClient = (new Builder()).connectTimeout(40L, TimeUnit.SECONDS).readTimeout(40L, TimeUnit.SECONDS).writeTimeout(40L, TimeUnit.SECONDS).build();
//    }

//    static synchronized ApiConnection getInstance() {
//        if (mConnection == null) {
//            Log.d(TAG, "CometChat.init() not called");
//            throw new RuntimeException("CometChat.init() not called. Please call the method preferably in the onCreate() method of the Application class before calling any other methods related to CometChat.");
//        } else {
//            return mConnection;
//        }
//    }

//    static synchronized void init(Context context) {
//        if (mConnection == null) {
//            mConnection = new ApiConnection(context);
//        }
//
//    }

//    private Request createGET(String url, Headers headers, HashMap<String, String> queryParams) {
//        okhttp3.HttpUrl.Builder httpBuilder = HttpUrl.parse(url).newBuilder();
//        if (queryParams != null) {
//            Iterator var5 = queryParams.entrySet().iterator();
//
//            while(var5.hasNext()) {
//                Entry<String, String> param = (Entry)var5.next();
//                httpBuilder.addQueryParameter((String)param.getKey(), (String)param.getValue());
//            }
//        }
//
//        Request request = (new okhttp3.Request.Builder()).url(httpBuilder.build()).headers(headers).build();
//        Logger.error("Request URL : " + request.url());
//        return request;
//    }

//    private Request createPUT(String url, Headers headers, HashMap<String, String> body) {
//        RequestBody requestBody = null;
//        if (body != null) {
//            requestBody = this.getRequestBodyFromMap(body);
//        } else {
//            requestBody = (new okhttp3.FormBody.Builder()).build();
//        }
//
//        Request request = (new okhttp3.Request.Builder()).put((RequestBody)requestBody).url(url).headers(headers).build();
//        return request;
    }

//    private Request createPOST(String url, Headers headers, HashMap<String, String> body) {
//        RequestBody requestBody = null;
//        if (body != null) {
//            requestBody = this.getRequestBodyFromMap(body);
//        } else {
//            requestBody = (new okhttp3.FormBody.Builder()).build();
//        }
//
//        Request request = (new okhttp3.Request.Builder()).url(url).post((RequestBody)requestBody).headers(headers).build();
//        return request;
//    }

//    private Request createFile(String url, Headers headers, HashMap<String, String> body, File file) {
//        RequestBody requestBody = this.getRequestBodyFromMap(body, file);
//        Request request = (new okhttp3.Request.Builder()).url(url).post(requestBody).headers(headers).build();
//        return request;
//    }
//
//    private Request createDELETE(String url, Headers headers, HashMap<String, String> body) {
//        RequestBody requestBody = null;
//        if (body != null) {
//            requestBody = this.getRequestBodyFromMap(body);
//        } else {
//            requestBody = (new okhttp3.FormBody.Builder()).build();
//        }
//
//        Request request = (new okhttp3.Request.Builder()).url(url).delete((RequestBody)requestBody).headers(headers).build();
//        return request;
//    }

//    void login(String UID, String apiKey, ApiConnection.ConnectionListener listener) {
//        HashMap<String, String> params = new HashMap();
//        params.put("uid", UID);
//        Headers headers = (new okhttp3.Headers.Builder()).add("apikey", apiKey).add("appid", PreferenceHelper.getAppID()).build();
//        Request loginRequest = this.createPOST(this.getAdminUrl(String.format("/v1.3/users/%s/auth_tokens", UID)), headers, params);
//        this.makeApiCall(loginRequest, listener, false);
//    }

//    void login(String authToken, ApiConnection.ConnectionListener listener) {
//        Headers headers = (new okhttp3.Headers.Builder()).add("appid", PreferenceHelper.getAppID()).add("authToken", authToken).build();
//        Request loginRequest = this.createGET(this.getApiUrl("/v1.3/me"), headers, (HashMap)null);
//        this.makeApiCall(loginRequest, listener, false);
//    }
//
//    void getUser(String uid, ApiConnection.ConnectionListener listener) {
//        Request getUserRequest = this.createGET(this.getApiUrl(String.format("/v1.3/users/%s", uid)), this.getDefaultHeaders(), (HashMap)null);
//        this.makeApiCall(getUserRequest, listener, false);
//    }

//    void sendMessage(BaseMessage message, ApiConnection.ConnectionListener listener) {
//        if (message instanceof TextMessage) {
//            HashMap<String, String> bodyMap = ((TextMessage)message).toMap();
//            Request sendMessageRequest = this.createPOST(this.getApiUrl("/v1.3/messages"), this.getDefaultHeaders(), bodyMap);
//            Logger.error("Send Message Request Body : " + sendMessageRequest.body().toString());
//            this.makeApiCall(sendMessageRequest, listener, false);
//        } else {
//            Request sendCustomMessageRequest;
//            if (message instanceof MediaMessage) {
//                sendCustomMessageRequest = this.createFile(this.getApiUrl("/v1.3/messages"), this.getDefaultHeaders(), ((MediaMessage)message).toMap(), ((MediaMessage)message).getFile());
//                this.makeApiCall(sendCustomMessageRequest, listener, true);
//            } else if (message instanceof CustomMessage) {
//                sendCustomMessageRequest = this.createPOST(this.getApiUrl("/v1.3/messages"), this.getDefaultHeaders(), ((CustomMessage)message).toMap());
//                this.makeApiCall(sendCustomMessageRequest, listener, false);
//            }
//        }
//
//    }
//
//    void createGroup(Group group, ApiConnection.ConnectionListener listener) {
//        Request createGroupRequest = this.createPOST(this.getApiUrl("/v1.3/groups"), this.getDefaultHeaders(), group.toMap());
//        this.makeApiCall(createGroupRequest, listener, false);
//    }
//
//    void joinGroup(String groupGUID, String groupType, String password, ApiConnection.ConnectionListener listener) {
//        HashMap<String, String> body = new HashMap();
//        if (groupType.equalsIgnoreCase("password")) {
//            body.put("password", password);
//        }
//
//        Request joinGroupRequest = this.createPOST(this.getApiUrl(String.format("/v1.3/groups/%s/members", groupGUID)), this.getDefaultHeaders(), body);
//        this.makeApiCall(joinGroupRequest, listener, false);
//    }
//
//    void leaveGroup(String groupGUID, ApiConnection.ConnectionListener listener) {
//        Request leaveGroupRequest = this.createDELETE(this.getApiUrl(String.format("/v1.3/groups/%s/members", groupGUID)), this.getDefaultHeaders(), (HashMap)null);
//        this.makeApiCall(leaveGroupRequest, listener, false);
//    }
//
//    void getGroup(String guid, ApiConnection.ConnectionListener listener) {
//        Request getGroup = this.createGET(this.getApiUrl(String.format("/v1.3/groups/%s", guid)), this.getDefaultHeaders(), (HashMap)null);
//        this.makeApiCall(getGroup, listener, false);
//    }
//
//    void updateGroup(Group group, ApiConnection.ConnectionListener listener) {
//        Request updateGroup = this.createPUT(this.getApiUrl(String.format("/v1.3/groups/%s", group.getGuid())), this.getDefaultHeaders(), group.toMap());
//        this.makeApiCall(updateGroup, listener, false);
//    }
//
//    void deleteGroup(String guid, ApiConnection.ConnectionListener listener) {
//        Request deleteGroup = this.createDELETE(this.getApiUrl(String.format("/v1.3/groups/%s", guid)), this.getDefaultHeaders(), (HashMap)null);
//        this.makeApiCall(deleteGroup, listener, false);
//    }
//
//    void getSettings(ApiConnection.ConnectionListener listener) {
//        Request settingsRequest = this.createGET(this.getApiUrl("/v1.3/settings"), this.getDefaultHeaders(), (HashMap)null);
//        this.makeApiCall(settingsRequest, listener, false);
//    }
//
//    void getUsers(int limit, long token, int page, ApiConnection.ConnectionListener listener) {
//        HashMap<String, String> queryParams = new HashMap();
//        queryParams.put("per_page", String.valueOf(limit));
//        if (token != 0L) {
//            queryParams.put("cursor", String.valueOf(token));
//        }
//
//        if (page != 0) {
//            queryParams.put("page", String.valueOf(page));
//        }
//
//        Request userListRequest = this.createGET(this.getApiUrl("/v1.3/users"), this.getDefaultHeaders(), queryParams);
//        this.makeApiCall(userListRequest, listener, false);
//    }
//
//    void getGroups(int limit, long token, int page, ApiConnection.ConnectionListener listener) {
//        HashMap<String, String> queryParams = new HashMap();
//        queryParams.put("per_page", String.valueOf(limit));
//        if (token != 0L) {
//            queryParams.put("cursor", String.valueOf(token));
//        }
//
//        if (page != 0) {
//            queryParams.put("page", String.valueOf(page));
//        }
//
//        Request groupListRequest = this.createGET(this.getApiUrl("/v1.3/groups"), this.getDefaultHeaders(), queryParams);
//        this.makeApiCall(groupListRequest, listener, false);
//    }
//
//    void getAllMessages(int limit, long timestamp, int id, String affix, ApiConnection.ConnectionListener listener) {
//        HashMap<String, String> queryParams = new HashMap();
//        queryParams.put("per_page", String.valueOf(limit));
//        if (timestamp != -1L && timestamp != 0L) {
//            queryParams.put("cursorField", "sentAt");
//            queryParams.put("cursorValue", String.valueOf(timestamp));
//        } else if (id != -1 && id != 0) {
//            queryParams.put("cursorField", "id");
//            queryParams.put("cursorValue", String.valueOf(id));
//        }
//
//        if (affix.equalsIgnoreCase("prepend")) {
//            queryParams.put("affix", "prepend");
//        } else {
//            queryParams.put("affix", "append");
//        }
//
//        Request getAllMessagesRequest = this.createGET(this.getApiUrl("/v1.3/messages"), this.getDefaultHeaders(), queryParams);
//        this.makeApiCall(getAllMessagesRequest, listener, false);
//    }
//
//    void getUserConversationsByTimestamp(String fromUID, int limit, long timestamp, String affix, ApiConnection.ConnectionListener listener) {
//        HashMap<String, String> queryParams = new HashMap();
//        queryParams.put("per_page", String.valueOf(limit));
//        if (timestamp != -1L && timestamp != 0L) {
//            queryParams.put("cursorField", "sentAt");
//            queryParams.put("cursorValue", String.valueOf(timestamp));
//        }
//
//        if (affix.equalsIgnoreCase("prepend")) {
//            queryParams.put("affix", "prepend");
//        } else {
//            queryParams.put("affix", "append");
//        }
//
//        Request getConversationsRequest = this.createGET(this.getApiUrl(String.format("/v1.3/users/%s/messages", fromUID)), this.getDefaultHeaders(), queryParams);
//        this.makeApiCall(getConversationsRequest, listener, false);
//    }
//
//    void getUserConversationsByMessageId(String fromUID, int limit, int id, String affix, ApiConnection.ConnectionListener listener) {
//        HashMap<String, String> queryParams = new HashMap();
//        queryParams.put("per_page", String.valueOf(limit));
//        if (id > 0) {
//            queryParams.put("cursorField", "id");
//            queryParams.put("cursorValue", String.valueOf(id));
//        }
//
//        if (affix.equalsIgnoreCase("prepend")) {
//            queryParams.put("affix", "prepend");
//        } else {
//            queryParams.put("affix", "append");
//        }
//
//        Request getConversationsRequest = this.createGET(this.getApiUrl(String.format("/v1.3/users/%s/messages", fromUID)), this.getDefaultHeaders(), queryParams);
//        this.makeApiCall(getConversationsRequest, listener, false);
//    }
//
//    void getGroupConversationsByTimestamp(String guid, int limit, long timestamp, String affix, ApiConnection.ConnectionListener listener) {
//        HashMap<String, String> queryParams = new HashMap();
//        queryParams.put("per_page", String.valueOf(limit));
//        if (timestamp != -1L && timestamp != 0L) {
//            queryParams.put("cursorField", "sentAt");
//            queryParams.put("cursorValue", String.valueOf(timestamp));
//        }
//
//        if (affix.equalsIgnoreCase("prepend")) {
//            queryParams.put("affix", "prepend");
//        } else {
//            queryParams.put("affix", "append");
//        }
//
//        Request getConversationsRequest = this.createGET(this.getApiUrl(String.format("/v1.3/groups/%s/messages", guid)), this.getDefaultHeaders(), queryParams);
//        this.makeApiCall(getConversationsRequest, listener, false);
//    }
//
//    void getGroupConversationsByMessageId(String guid, int limit, int id, String affix, ApiConnection.ConnectionListener listener) {
//        HashMap<String, String> queryParams = new HashMap();
//        queryParams.put("per_page", String.valueOf(limit));
//        if (id > 0) {
//            queryParams.put("cursorField", "id");
//            queryParams.put("cursorValue", String.valueOf(id));
//        }
//
//        if (affix.equalsIgnoreCase("prepend")) {
//            queryParams.put("affix", "prepend");
//        } else {
//            queryParams.put("affix", "append");
//        }
//
//        Request getConversationsRequest = this.createGET(this.getApiUrl(String.format("/v1.3/groups/%s/messages", guid)), this.getDefaultHeaders(), queryParams);
//        this.makeApiCall(getConversationsRequest, listener, false);
//    }
//
//    void getGroupMembers(String guid, int limit, long cursor, int page, ApiConnection.ConnectionListener listener) {
//        HashMap<String, String> queryParams = new HashMap();
//        queryParams.put("per_page", String.valueOf(limit));
//        if (cursor != 0L) {
//            queryParams.put("cursor", String.valueOf(cursor));
//        }
//
//        if (page != 0) {
//            queryParams.put("page", String.valueOf(page));
//        }
//
//        Request groupListRequest = this.createGET(this.getApiUrl(String.format("/v1.3/groups/%s/members", guid)), this.getDefaultHeaders(), queryParams);
//        this.makeApiCall(groupListRequest, listener, false);
//    }
//
//    void getBannedMembers(String guid, int limit, long cursor, int page, ApiConnection.ConnectionListener listener) {
//        HashMap<String, String> queryParams = new HashMap();
//        queryParams.put("per_page", String.valueOf(limit));
//        if (cursor != 0L) {
//            queryParams.put("cursor", String.valueOf(cursor));
//        }
//
//        if (page != 0) {
//            queryParams.put("page", String.valueOf(page));
//        }
//
//        Request groupListRequest = this.createGET(this.getApiUrl(String.format("/v1.3/groups/%s/bannedusers", guid)), this.getDefaultHeaders(), queryParams);
//        this.makeApiCall(groupListRequest, listener, false);
//    }
//
//    void kickUser(String guid, String uid, ApiConnection.ConnectionListener listener) {
//        Request kickUserRequest = this.createDELETE(this.getApiUrl(String.format("/v1.3/groups/%s/members/%s", guid, uid)), this.getDefaultHeaders(), (HashMap)null);
//        this.makeApiCall(kickUserRequest, listener, false);
//    }
//
//    void banUser(String guid, String uid, ApiConnection.ConnectionListener listener) {
//        Request banUserRequest = this.createPOST(this.getApiUrl(String.format("/v1.3/groups/%s/bannedusers/%s", guid, uid)), this.getDefaultHeaders(), (HashMap)null);
//        this.makeApiCall(banUserRequest, listener, false);
//    }
//
//    void unbanUser(String guid, String uid, ApiConnection.ConnectionListener listener) {
//        Request unbanUserRequest = this.createDELETE(this.getApiUrl(String.format("/v1.3/groups/%s/bannedusers/%s", guid, uid)), this.getDefaultHeaders(), (HashMap)null);
//        this.makeApiCall(unbanUserRequest, listener, false);
//    }
//
//    void changeMemberScope(String guid, String uid, @NonNull String scope, ApiConnection.ConnectionListener listener) {
//        HashMap<String, String> params = new HashMap();
//        params.put("scope", scope);
//        Request changeScopeRequest = this.createPUT(this.getApiUrl(String.format("/v1.3/groups/%s/members/%s", guid, uid)), this.getDefaultHeaders(), params);
//        this.makeApiCall(changeScopeRequest, listener, false);
//    }
//
//    void initiateConference(Call call, ApiConnection.ConnectionListener listener) {
//        Request initiateConferenceRequest = this.createPOST(this.getApiUrl("/v1.3/calls"), this.getDefaultHeaders(), call.toMap());
//        this.makeApiCall(initiateConferenceRequest, listener, false);
//    }
//
//    void updateCallStatus(String sessionId, String callStatus, long joinedAt, ApiConnection.ConnectionListener listener) {
//        HashMap<String, String> params = new HashMap();
//        params.put("status", callStatus);
//        if (callStatus.equalsIgnoreCase("ended") && joinedAt != -1L) {
//            params.put("joinedAt", String.valueOf(joinedAt));
//        }
//
//        Request updateCallStatusRequest = this.createPUT(this.getApiUrl(String.format("/v1.3/calls/%s", sessionId)), this.getDefaultHeaders(), params);
//        this.makeApiCall(updateCallStatusRequest, listener, false);
//    }
//
//    void logout(ApiConnection.ConnectionListener listener) {
//        Request logoutRequest = this.createDELETE(this.getApiUrl("/v1.3/me"), this.getDefaultHeaders(), (HashMap)null);
//        this.makeApiCall(logoutRequest, listener, false);
//    }
//
//    void getUserConversations(String UID, int limit, String affix, long timestamp, int messageId, ApiConnection.ConnectionListener listener) {
//        HashMap<String, String> queryParams = new HashMap();
//        queryParams.put("per_page", String.valueOf(limit));
//        queryParams.put("affix", affix);
//        if (timestamp != -1L) {
//            queryParams.put("sentAt", String.valueOf(timestamp));
//        }
//
//        if (messageId != -1) {
//            queryParams.put("id", String.valueOf(messageId));
//        }
//
//        Request getConversationsRequest = this.createGET(this.getApiUrl(String.format("/v1.3/users/%s/messages", UID)), this.getDefaultHeaders(), queryParams);
//        this.makeApiCall(getConversationsRequest, listener, false);
//    }
//
//    void getGroupConversations(String GUID, int limit, String affix, long timestamp, int messageId, ApiConnection.ConnectionListener listener) {
//        HashMap<String, String> queryParams = new HashMap();
//        queryParams.put("per_page", String.valueOf(limit));
//        queryParams.put("affix", affix);
//        if (timestamp != -1L) {
//            queryParams.put("sentAt", String.valueOf(timestamp));
//        }
//
//        if (messageId != -1) {
//            queryParams.put("id", String.valueOf(messageId));
//        }
//
//        Request getConversationsRequest = this.createGET(this.getApiUrl(String.format("/v1.3/groups/%s/messages", GUID)), this.getDefaultHeaders(), queryParams);
//        this.makeApiCall(getConversationsRequest, listener, false);
//    }
//
//    void getUserConversationsInGroup(String UID, String GUID, int limit, String affix, long timestamp, int messageId, ApiConnection.ConnectionListener listener) {
//        HashMap<String, String> queryParams = new HashMap();
//        queryParams.put("per_page", String.valueOf(limit));
//        queryParams.put("affix", affix);
//        queryParams.put("uid", UID);
//        if (timestamp != -1L) {
//            queryParams.put("sentAt", String.valueOf(timestamp));
//        }
//
//        if (messageId != -1) {
//            queryParams.put("id", String.valueOf(messageId));
//        }
//
//        Request getConversationsRequest = this.createGET(this.getApiUrl(String.format("/v1.3/groups/%s/messages", GUID)), this.getDefaultHeaders(), queryParams);
//        this.makeApiCall(getConversationsRequest, listener, false);
//    }
//
//    void getAllMessages(int limit, String affix, long timestamp, int messageId, ApiConnection.ConnectionListener listener) {
//        HashMap<String, String> queryParams = new HashMap();
//        queryParams.put("per_page", String.valueOf(limit));
//        queryParams.put("affix", affix);
//        if (timestamp != -1L) {
//            queryParams.put("sentAt", String.valueOf(timestamp));
//        }
//
//        if (messageId != -1) {
//            queryParams.put("id", String.valueOf(messageId));
//        }
//
//        Request getAllMessagesRequest = this.createGET(this.getApiUrl("/v1.3/messages"), this.getDefaultHeaders(), queryParams);
//        this.makeApiCall(getAllMessagesRequest, listener, false);
//    }
//
//    private RequestBody getRequestBodyFromMap(HashMap<String, String> params) {
//        try {
//            JSONObject jsonObject = new JSONObject();
//
//            Entry pair;
//            for(Iterator it = params.entrySet().iterator(); it.hasNext(); Logger.error("Value : " + pair.getValue())) {
//                pair = (Entry)it.next();
//                if (((String)pair.getKey()).equalsIgnoreCase("data")) {
//                    jsonObject.put((String)pair.getKey(), new JSONObject((String)pair.getValue()));
//                } else {
//                    jsonObject.put((String)pair.getKey(), pair.getValue());
//                }
//            }
//
//            return RequestBody.create(MediaType.parse("application/json"), jsonObject.toString());
//        } catch (JSONException var5) {
//            Logger.error("Error creating request body : " + var5.getMessage());
//            return null;
//        }
//    }
//
//    private RequestBody getRequestBodyFromMap(HashMap<String, String> params, File file) {
//        okhttp3.MultipartBody.Builder builder = new okhttp3.MultipartBody.Builder();
//        builder.setType(MultipartBody.FORM);
//        if (file.exists()) {
//            Logger.error("File Found : " + file.getAbsolutePath() + "file size : " + file.getName());
//        }
//
//        Iterator it = params.entrySet().iterator();
//
//        while(it.hasNext()) {
//            Entry pair = (Entry)it.next();
//            Logger.error("Value : " + pair.getValue());
//            builder.addFormDataPart((String)pair.getKey(), (String)pair.getValue());
//        }
//
//        builder.addFormDataPart("file", file.getName(), RequestBody.create(MediaType.parse("*/*"), file));
//        return builder.build();
//    }
//
//    private Headers getDefaultHeaders() {
//        Headers headers = null;
//        if (CurrentUserRepo.getCurrentUser() != null && CurrentUserRepo.getCurrentUser().getAuthToken() != null) {
//            headers = (new okhttp3.Headers.Builder()).add("appid", PreferenceHelper.getAppID()).add("authToken", CurrentUserRepo.getCurrentUser().getAuthToken()).add("Content-Type", "application/json").add("content-type", "multipart/form-data").build();
//        } else {
//            headers = (new okhttp3.Headers.Builder()).build();
//        }
//
//        return headers;
//    }
//
//    private String getApiUrl(String url) {
//        Settings settings = SettingsRepo.getSettings();
//        String urlPrefix;
//        if (settings != null && settings.getClientApiHost() != null) {
//            urlPrefix = "https://" + settings.getClientApiHost() + url;
//        } else {
//            urlPrefix = Logger.isDev() ? "https://kohoutek.cometchat-dev.com" + url : "https://kohoutek.cometchat.com" + url;
//        }
//
//        Logger.error(TAG, urlPrefix);
//        return urlPrefix;
//    }
//
//    private String getAdminUrl(String url) {
//        Settings settings = SettingsRepo.getSettings();
//        String urlPrefix;
//        if (settings != null && settings.getAdminApiHost() != null) {
//            urlPrefix = "https://" + settings.getAdminApiHost() + url;
//        } else {
//            urlPrefix = Logger.isDev() ? "https://api.cometchat-dev.com" + url : "https://api.cometchat.com" + url;
//        }
//
//        Logger.error(TAG, urlPrefix);
//        return urlPrefix;
//    }
//
//    private void makeApiCall(Request okHttpRequest, final ApiConnection.ConnectionListener connectionListener, boolean isMediaRequest) {
//        if (CometChatUtils.getConnectivityStatus(context) == CometChatUtils.TYPE_NOT_CONNECTED) {
//            connectionListener.onResponse((String)null, new CometChatException("ERROR_INTERNET_UNAVAILABLE", "No Internet Connection. Please try again later."));
//        } else {
//            Headers headers = okHttpRequest.headers();
//            if (headers.get("appid") != null) {
//                if (isMediaRequest) {
//                    okHttpFileClient.newCall(okHttpRequest).enqueue(new Callback() {
//                        public void onFailure(okhttp3.Call call, IOException e) {
//                            connectionListener.onResponse((String)null, new CometChatException("ERROR_IO_EXCEPTION", e.getMessage()));
//                        }
//
//                        public void onResponse(okhttp3.Call call, Response response) throws IOException {
//                            String responseBody = response.body().string();
//                            ApiConnection.this.handleApiResponse(response.code(), responseBody, connectionListener);
//                        }
//                    });
//                } else {
//                    okHttpClient.newCall(okHttpRequest).enqueue(new Callback() {
//                        public void onFailure(okhttp3.Call call, IOException e) {
//                            connectionListener.onResponse((String)null, new CometChatException("ERROR_IO_EXCEPTION", e.getMessage()));
//                        }
//
//                        public void onResponse(okhttp3.Call call, Response response) throws IOException {
//                            String responseBody = response.body().string();
//                            ApiConnection.this.handleApiResponse(response.code(), responseBody, connectionListener);
//                        }
//                    });
//                }
//            } else {
//                connectionListener.onResponse((String)null, new CometChatException("ERROR_USER_NOT_LOGGED_IN", "Please log in to CometChat before calling this method"));
//            }
//        }
//
//    }
//
//    private void handleApiResponse(int responseCode, String responseBody, ApiConnection.ConnectionListener listener) throws IOException {
//        try {
//            Logger.error("Response Code: " + responseCode + " Response : " + responseBody);
//            if (responseCode == 200) {
//                listener.onResponse(responseBody, (CometChatException)null);
//            } else {
//                JSONObject mainObject;
//                JSONObject errorObject;
//                if (responseCode == 400) {
//                    mainObject = new JSONObject(responseBody);
//                    errorObject = mainObject.getJSONObject("error");
//                    listener.onResponse((String)null, new CometChatException(errorObject.getString("code"), errorObject.getString("message"), errorObject.getJSONObject("details").toString()));
//                } else {
//                    mainObject = new JSONObject(responseBody);
//                    errorObject = mainObject.getJSONObject("error");
//                    listener.onResponse((String)null, new CometChatException(errorObject.getString("code"), errorObject.getString("message")));
//                }
//            }
//        } catch (JSONException var6) {
//            listener.onResponse((String)null, new CometChatException("ERROR_JSON_EXCEPTION", var6.getMessage()));
//        }
//
//    }

//    interface ConnectionListener {
//        void onResponse(String var1, OrionChatException var2);
//    }
//}
